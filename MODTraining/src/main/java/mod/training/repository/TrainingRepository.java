package mod.training.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import mod.training.model.Trainings;

public interface TrainingRepository extends CrudRepository<Trainings, Long>{
	
	List<Trainings> findByStatus(String status);
	
	

	List<Trainings> findAll();
	List<Trainings> findByMentorIdIn(Long mentorId);



	

	
}
