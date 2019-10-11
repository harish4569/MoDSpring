package mod.technologies.controller;

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

import mod.technologies.model.Technology;
import mod.technologies.services.TechService;

@RestController
@RequestMapping
@CrossOrigin("*")
public class TechnologyController {
	
	@Autowired
	TechService techService;
	@GetMapping("")
	public List<Technology> getTechnology()
	{
		return techService.getAllTechnologies();
	}
	@PostMapping("")
	public List<Technology> saveTechnologies(@RequestBody Technology technology)
	{
		techService.saveTechnology(technology);
		return techService.getAllTechnologies();
	}
	@GetMapping(value="/hari")
	public String hai()
	{
		return "hellllooooooooo!!!!"; 
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Technology> getlist(@PathVariable Long id) {
		return techService.getById(id);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public List<Technology> deleteTech(@PathVariable Long id) {
		techService.delete(id);
		return techService.getAllTechnologies();
		
	}
	@RequestMapping(value = "/{id}/update", method = RequestMethod.PUT)
	public List<Technology> updatetechnology(@RequestBody Technology technology) {
		techService.update(technology);
		 return techService.getAllTechnologies();
	}
}
