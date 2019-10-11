package mod.search.model;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentorcalendar")
public class MentorCalendar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String starttime;
	private String endtime;
	private Long mentorid;
	public MentorCalendar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MentorCalendar(Long id, String starttime, String endtime,Long mentorid) {
		super();
		this.id = id;
		this.starttime = starttime;
		this.endtime = endtime;
		this.mentorid = mentorid;
		
	}
	public Long getMentorid() {
		return mentorid;
	}
	public void setMentorid(Long mentorid) {
		this.mentorid = mentorid;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStart_time(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEnd_time(String endtime) {
		this.endtime = endtime;
	}

	
}

