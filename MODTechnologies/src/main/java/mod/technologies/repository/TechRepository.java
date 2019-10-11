package mod.technologies.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import mod.technologies.model.Technology;

public interface TechRepository extends CrudRepository<Technology, Long> {
	
	List<Technology> getByTechnology(String technology);

	List<Technology> findAll();
}
