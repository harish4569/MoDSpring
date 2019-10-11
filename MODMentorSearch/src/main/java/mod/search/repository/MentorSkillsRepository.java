package mod.search.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import mod.search.model.MentorSkills;

public interface MentorSkillsRepository extends CrudRepository<MentorSkills,Long>{
	
	@Query("select s.mentorid from MentorSkills s where name LIKE %?1%")
	public List<Long> getMentorIdsByName(String name);
	
	public MentorSkills findByMentorid(Long id);

}