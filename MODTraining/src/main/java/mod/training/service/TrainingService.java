package mod.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mod.training.model.Trainings;
import mod.training.repository.TrainingRepository;

@Service
@Transactional
public class TrainingService {
		
	@Autowired
	TrainingRepository trainingRepository;
	
	public List<Trainings> getAllTrainings()
	{
		return (List<Trainings>) trainingRepository.findAll();
	}
	public List<Trainings> getByMentorId(Long mentorId)
	{
		return trainingRepository.findByMentorIdIn(mentorId);
	}
	public void saveTrainings(Trainings trainings)
	{
		trainingRepository.save(trainings);
	}

	public void delete(Long id)
	{
		trainingRepository.deleteById(id);
		
	}
	public Optional<Trainings> getById(Long id) {
		return trainingRepository.findById(id);
	}
	public void update(Trainings training)
	{
		trainingRepository.save(training);
		
	}
	
	

}
