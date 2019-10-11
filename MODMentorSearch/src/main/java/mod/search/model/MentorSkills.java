package mod.search.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentorskills")
public class MentorSkills {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String skillname;
	private String toc;
	private String starttime;
	private String endtime;
	private Long contactNumber;
	private double yearsOfExperience;
	private String prerequisites;
	private Long mentorid;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSkillname() {
		return skillname;
	}
	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public double getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(double yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public MentorSkills() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MentorSkills(Long id, String skillname, String toc, String prerequisites,Long mentorid) {
		super();
		this.id = id;
		this.skillname = skillname;
		this.toc = toc;
		this.prerequisites = prerequisites;
		this.mentorid = mentorid;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return skillname;
	}
	public void setName(String name) {
		this.skillname = name;
	}
	public String getToc() {
		return toc;
	}
	public void setToc(String toc) {
		this.toc = toc;
	}
	public String getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}
	public Long getMentorid() {
		return mentorid;
	}
	public void setMentorid(Long mentorid) {
		this.mentorid = mentorid;
	}
	
	
	

}

