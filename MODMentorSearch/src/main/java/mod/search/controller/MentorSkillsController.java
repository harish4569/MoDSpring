package mod.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mod.search.model.MentorSkills;
import mod.search.service.MentorSearchService;

@RestController
@RequestMapping("/skills")
public class MentorSkillsController {
	
	@Autowired MentorSearchService mentorSearchService;
	
	@GetMapping("/{mentorid}")
	public MentorSkills getSkillById(@PathVariable Long mentorid) {
		return mentorSearchService.getSkillByID(mentorid);
	}
	
	@PutMapping("")
	public MentorSkills updateSkill(@RequestBody MentorSkills skill) {
		return mentorSearchService.upadteSkill(skill);
	}
	
	@PostMapping("")
	public MentorSkills addSkills(@RequestBody MentorSkills skill) {
	 return mentorSearchService.addSkills(skill);
	}

	@GetMapping("")
	public List<MentorSkills> getAllSkills(){
		return mentorSearchService.getAllSkills();
	}
}
