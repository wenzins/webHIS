package com.wenzins.webhis.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import com.wenzins.webhis.entity.types.PatientGender;
import com.wenzins.webhis.entity.types.RelationShip;

@Entity
@Table(name = "PATIENT")
public class Patient implements java.io.Serializable {

	private static final long serialVersionUID = 926436474204511691L;

	private String UHID;

	private Long patientId;

	private String firstName;

	private String lastName;

	private Date dateOfBirth;

	private int age;

	private PatientGender gender;

	private String occupation;

	private String emergencyContName;

	private RelationShip emergencyRelationShip;

	private String careProviderName;

	private RelationShip careProviderRelationShip;

	private PatientAddress patientAddress;

	private EmergencyContAddress emergencyContAddress;

	private CareProviderAddress careProviderAddress;

	public String getUHID() {
		return UHID;
	}

	public void setUHID(String uHID) {
		UHID = uHID;
	}

	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	@Column(name = "PATIENT_ID", unique = true, nullable = false)
	public Long getPatientId() {
		return patientId;
	}

	@Column(name = "FIRSTNAME")
	public String getFirstName() {
		return firstName;
	}

	@Column(name = "LASTNAME")
	public String getLastName() {
		return lastName;
	}

	@Column(name = "DOB")
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	@Transient
	public int getAge() {
		return age;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "PATIENT_GENDER")
	public PatientGender getGender() {
		return gender;
	}

	@Column(name = "OCCUPATION")
	public String getOccupation() {
		return occupation;
	}

	@Column(name = "EMERGENCY_CONTACT_NUMBER")
	public String getEmergencyContName() {
		return emergencyContName;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "EMERGENCY_RELATIONSHIP")
	public RelationShip getEmergencyRelationShip() {
		return emergencyRelationShip;
	}

	@Column(name = "CARE_PROVIDER_NAME")
	public String getCareProviderName() {
		return careProviderName;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "CARE_PROVIDER_RELATIONSHIP")
	public RelationShip getCareProviderRelationShip() {
		return careProviderRelationShip;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "patient", cascade = CascadeType.ALL)
	public PatientAddress getPatientAddress() {
		return patientAddress;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "patient", cascade = CascadeType.ALL)
	public EmergencyContAddress getEmergencyContAddress() {
		return emergencyContAddress;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "patient", cascade = CascadeType.ALL)
	public CareProviderAddress getCareProviderAddress() {
		return careProviderAddress;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public void setCareProviderName(String careProviderName) {
		this.careProviderName = careProviderName;
	}

	public void setCareProviderRelationShip(
			RelationShip careProviderRelationShip) {
		this.careProviderRelationShip = careProviderRelationShip;
	}

	public void setPatientAddress(PatientAddress patientAddress) {
		this.patientAddress = patientAddress;
	}

	public void setEmergencyContAddress(
			EmergencyContAddress emergencyContAddress) {
		this.emergencyContAddress = emergencyContAddress;
	}

	public void setCareProviderAddress(CareProviderAddress careProviderAddress) {
		this.careProviderAddress = careProviderAddress;
	}
}
