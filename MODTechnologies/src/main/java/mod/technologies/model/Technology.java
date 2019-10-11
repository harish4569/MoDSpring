package mod.technologies.model;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "technologymod")
public class Technology {
	public Technology() {
		super();
	}
	public Technology(Long id, String technology, String mentorname, Long mentorid, Double fees, Double comm,
			Time starttime, Time endtime, String location, Long phoneno, String email) {
		super();
		this.id = id;
		this.technology = technology;
		this.mentorname = mentorname;
		this.mentorid = mentorid;
		this.fees = fees;
		this.comm = comm;
		this.starttime = starttime;
		this.endtime = endtime;
		this.location = location;
		this.phoneno = phoneno;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getMentorname() {
		return mentorname;
	}
	public void setMentorname(String mentorname) {
		this.mentorname = mentorname;
	}
	public Long getMentorid() {
		return mentorid;
	}
	public void setMentorid(Long mentorid) {
		this.mentorid = mentorid;
	}
	public Double getFees() {
		return fees;
	}
	public void setFees(Double fees) {
		this.fees = fees;
	}
	public Double getComm() {
		return comm;
	}
	public void setComm(Double comm) {
		this.comm = comm;
	}
	public Time getStarttime() {
		return starttime;
	}
	public void setStarttime(Time starttime) {
		this.starttime = starttime;
	}
	public Time getEndtime() {
		return endtime;
	}
	public void setEndtime(Time endtime) {
		this.endtime = endtime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String technology;
	private Long experience;
	public Long getExperience() {
		return experience;
	}
	public void setExperience(Long experience) {
		this.experience = experience;
	}
	private String mentorname;
	private Long mentorid;
	private Double fees;
	private Double comm;
	@DateTimeFormat(pattern = "hh:mm:ss")
	private Time starttime;
	@DateTimeFormat(pattern = "hh:mm:ss")
	private Time endtime;
	private String location;
	private Long phoneno;
	private String email;
}
