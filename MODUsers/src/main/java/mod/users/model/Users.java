package mod.users.model;



//import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table(name="userInfo")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private Long contactNumber;
	private String role;
	private String starttime;
	private String endtime;
	private String technology;
	private String linkedinUrl;
	private double yearsOfExperience;
	private boolean active=true;
	private boolean confirmedSignUp;
	
	private boolean resetPassword;
	@JsonFormat(pattern="yyyy-mm-dd")
	private String resetPasswordDate;
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
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
	
	public Users() {
		super();
	}
	public Users(Long id, String firstName, String lastName, String userName, String password, Long contactNumber,
			String role, String linkedinUrl, double yearsOfExperience, boolean isActive, boolean confirmedSignUp,
			boolean resetPassword,String resetPasswordDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.contactNumber = contactNumber;
		this.role = role;
		this.linkedinUrl = linkedinUrl;
		this.yearsOfExperience = yearsOfExperience;
		this.active = isActive;
		this.confirmedSignUp = confirmedSignUp;
		this.resetPassword = resetPassword;
		this.resetPasswordDate=resetPasswordDate;
	}
	public String getResetPasswordDate() {
		return resetPasswordDate;
	}
	public void setResetPasswordDate(String resetPasswordDate) {
		this.resetPasswordDate = resetPasswordDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLinkedinUrl() {
		return linkedinUrl;
	}
	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}
	public double getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(double yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isConfirmedSignUp() {
		return confirmedSignUp;
	}
	public void setConfirmedSignUp(boolean confirmedSignUp) {
		this.confirmedSignUp = confirmedSignUp;
	}
	public boolean isResetPassword() {
		return resetPassword;
	}
	public void setResetPassword(boolean resetPassword) {
		this.resetPassword = resetPassword;
	}
	
}