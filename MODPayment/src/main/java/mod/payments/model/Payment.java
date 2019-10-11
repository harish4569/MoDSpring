package mod.payments.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String transctype;
	private float amount;
	
	private Long mentorid;
	private String mentorname;
	private Long trainingid;
	private String skillname;
	private float amountToMentor;
	public Payment(Long payment_id, String txntype, float amount, Long mentorid, String mentorname,
			Long trainingid, String skillname, float amountToMentor) {
	super();
	this.id = payment_id;
	this.transctype = txntype;
	this.amount = amount;
	
	this.mentorid = mentorid;
	this.mentorname = mentorname;
	this.trainingid = trainingid;
	this.skillname = skillname;
	this.amountToMentor = amountToMentor;
}

public Payment()
{
	super();
}

public Long getId() {
	return id;
}

public void setId(Long payment_id) {
	this.id = payment_id;
}

public String getTxntype() {
	return transctype;
}

public void setTxntype(String txntype) {
	this.transctype = txntype;
}

public float getAmount() {
	return amount;
}

public void setAmount(float amount) {
	this.amount = amount;
}



public Long getMentor_id() {
	return mentorid;
}

public void setMentor_id(Long mentor_id) {
	this.mentorid = mentor_id;
}

public String getMentorname() {
	return mentorname;
}

public void setMentorname(String mentorname) {
	this.mentorname = mentorname;
}

public Long getTraining_id() {
	return trainingid;
}

public void setTraining_id(Long training_id) {
	this.trainingid = training_id;
}

public String getSkillname() {
	return skillname;
}

public void setSkillname(String skillname) {
	this.skillname = skillname;
}

public float getTotalAmountToMentor() {
	return amountToMentor;
}

public void setamountToMentor(float amountToMentor) {
	this.amountToMentor = amountToMentor;
}

}