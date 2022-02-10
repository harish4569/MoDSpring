package mod.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mod.training.model.Trainings;
import mod.training.service.TrainingService;

@RestController
@RequestMapping
@CrossOrigin("*")
public class TrainingController {
	
	@Autowired
	TrainingService trainingService;
	@GetMapping(value="/training")
	public List<Trainings> getAll()
	{
		return trainingService.getAllTrainings();
	}
	@PostMapping(value="")
	public void saveTraining(@RequestBody Trainings trainings)
	{
		trainingService.saveTrainings(trainings);
	}
	@GetMapping(value="harish")
	public String hai()
	{
		return "haeellllllllllo";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Trainings> getlist(@PathVariable Long id) {
		return trainingService.getById(id);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String deleteTraining(@PathVariable Long id) {
		trainingService.delete(id);
		return "Deleted Successfully";
		
	}
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public String updatetraining(@RequestBody Trainings training) {
		 trainingService.update(training);
		 return "Updated Successfully";
	}
	
	@PostMapping(value="/search/{mentorId}")
	public List<Trainings> getAllTrainings(@PathVariable Long mentorId){
	return trainingService.getByMentorId(mentorId);
	}
}