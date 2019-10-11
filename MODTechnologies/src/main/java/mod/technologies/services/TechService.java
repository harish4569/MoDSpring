package mod.technologies.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mod.technologies.model.Technology;
import mod.technologies.repository.TechRepository;

@Service
@Transactional
public class TechService {
		
	@Autowired
	TechRepository techRepository;
	
	public List<Technology> getAllTechnologies()
	{
		return (List<Technology>) techRepository.findAll();
	}
	
	public void saveTechnology(Technology technology)
	{
		techRepository.save(technology);
	}
	public void delete(Long id)
	{
		techRepository.deleteById(id);
		
	}
	public Optional<Technology> getById(Long id) {
		return techRepository.findById(id);
	}
	public void update(Technology technology)
	{
		techRepository.save(technology);
		
	}
}
