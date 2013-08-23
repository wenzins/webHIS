package webhis;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import webhis.PatientGender;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Entity
@Table(name="T_PATIENT")
public class PatientDetails {	
	
	private String UHID;
	
	@Id
	@GeneratedValue
	private String regNumber;
	
	private String Name;
	
	private Date DOB;
	
	@Transient
	private int age;
	
	private PatientGender gender;
	
	private String occupation;
	
	private String emergencyContName;
	
	private RelationShip emergencyRelationShip ;
	
	private String careProviderName;
	
	private RelationShip careProviderRelationShip;
	
	@OneToOne(mappedBy="patientAddr", cascade=CascadeType.ALL)
	private PatientAddress patientAddress;
	
	@OneToOne(mappedBy="patientEMAddr", cascade=CascadeType.ALL)
	private EmergencyContAddress emergencyContAddress;
	
	@OneToOne(mappedBy="patientCPAddr", cascade=CascadeType.ALL)
	private CareProviderAddress careProviderAddress;

	public String getUHID() {
		return UHID;
	}

	public void setUHID(String uHID) {
		UHID = uHID;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public PatientGender getGender() {
		return gender;
	}

	public void setGender(PatientGender gender) {
		this.gender = gender;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getEmergencyContName() {
		return emergencyContName;
	}

	public void setEmergencyContName(String emergencyContName) {
		this.emergencyContName = emergencyContName;
	}

	public RelationShip getEmergencyRelationShip() {
		return emergencyRelationShip;
	}

	public void setEmergencyRelationShip(RelationShip emergencyRelationShip) {
		this.emergencyRelationShip = emergencyRelationShip;
	}

	public String getCareProviderName() {
		return careProviderName;
	}

	public void setCareProviderName(String careProviderName) {
		this.careProviderName = careProviderName;
	}

	public RelationShip getCareProviderRelationShip() {
		return careProviderRelationShip;
	}

	public void setCareProviderRelationShip(RelationShip careProviderRelationShip) {
		this.careProviderRelationShip = careProviderRelationShip;
	}

	public PatientAddress getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(PatientAddress patientAddress) {
		this.patientAddress = patientAddress;
	}

	public EmergencyContAddress getEmergencyContAddress() {
		return emergencyContAddress;
	}

	public void setEmergencyContAddress(EmergencyContAddress emergencyContAddress) {
		this.emergencyContAddress = emergencyContAddress;
	}

	public CareProviderAddress getCareProviderAddress() {
		return careProviderAddress;
	}

	public void setCareProviderAddress(CareProviderAddress careProviderAddress) {
		this.careProviderAddress = careProviderAddress;
	}
	

}
