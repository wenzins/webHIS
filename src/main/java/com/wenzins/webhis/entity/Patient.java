package com.wenzins.webhis.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import com.wenzins.webhis.entity.types.PatientGender;
import com.wenzins.webhis.entity.types.RelationShip;

@Entity
@Table(name = "PATIENT")
public class Patient implements java.io.Serializable {

	private static final long serialVersionUID = 926436474204511691L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "PATIENT_ID", unique = true, nullable = false)
	private Long patientId;

	@Column(name = "UHID", unique = true, nullable = false)
	private String uhid;

	@Column(name = "FIRSTNAME")
	private String firstName;
	
	@Column(name = "MIDDLENAME")
	private String middleName;

	
	@Column(name = "LASTNAME")
	private String lastName;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "MOBILE")
	private String mobile;
	
	@Column(name = "PHONE_RESIDENCE")
	private String phRes;
	
	@Column(name = "PHONE_OFFICE")
	private String phOff;

	@Column(name = "DOB")
	private Date dateOfBirth;

	@Transient
	private int age;

	@Enumerated(EnumType.STRING)
	@Column(name = "PATIENT_GENDER")
	private PatientGender gender;

	@Column(name = "OCCUPATION")
	private String occupation;

	@Column(name = "EMERGENCY_CONTACT_NAME")
	private String emergencyContName;

	@Enumerated(EnumType.STRING)
	@Column(name = "EMERGENCY_RELATIONSHIP")
	private RelationShip emergencyRelationShip;

	@OneToMany( fetch = FetchType.EAGER , cascade=CascadeType.ALL)
	@JoinColumn(name = "PATIENT_ID")
	private Set<PatientAddress> patientAddress;

	public String getUhid() {
		return uhid;
	}

	public Long getPatientId() {
		return patientId;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public String getPhRes() {
		return phRes;
	}
	
	public String getPhOff() {
		return phOff;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public PatientGender getGender() {
		return gender;
	}

	public String getOccupation() {
		return occupation;
	}

	public String getEmergencyContName() {
		return emergencyContName;
	}

	public RelationShip getEmergencyRelationShip() {
		return emergencyRelationShip;
	}

	public Set<PatientAddress> getPatientAddress() {
		return patientAddress;
	}

	public void setUhid(String uHID) {
		uhid = uHID;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void setPhRes(String phRes) {
		this.phRes = phRes;
	}
	
	public void setPhOff(String phOff) {
		this.phOff = phOff;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(PatientGender gender) {
		this.gender = gender;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public void setEmergencyContName(String emergencyContName) {
		this.emergencyContName = emergencyContName;
	}

	public void setEmergencyRelationShip(RelationShip emergencyRelationShip) {
		this.emergencyRelationShip = emergencyRelationShip;
	}

	public void setPatientAddress(Set<PatientAddress> patientAddress) {
		this.patientAddress = patientAddress;
	}

}
