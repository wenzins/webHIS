package com.wenzins.webhis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.wenzins.webhis.entity.types.RelationShip;

@Entity
@Table(name = "EMERGENCY_CONTACT_ADDRESS")
public class EmergencyContAddress implements java.io.Serializable {

	private static final long serialVersionUID = 4136173737730879320L;

	private Integer emergencyContId;

	private String firstName;

	private String middleName;

	private String lastName;

	private RelationShip relationshipType;

	private String addrLine1;

	private String addrLine2;

	private String city;

	private String district;

	private String state;

	private String country;

	private String pincode;

	private String mobile;

	private String phoneOff;

	private String phoneRes;

	private String email;

	private Patient patient;

	// default constructor
	public EmergencyContAddress() {

	}

	public EmergencyContAddress(String firstName, String middleName,
			String lastName, RelationShip relationshipType, String addrLine1,
			String addrLine2, String city, String district, String state,
			String country, String pincode, String mobile, String phoneOff,
			String phoneRes, String email) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.relationshipType = relationshipType;
		this.addrLine1 = addrLine1;
		this.addrLine2 = addrLine2;
		this.city = city;
		this.district = district;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.mobile = mobile;
		this.phoneOff = phoneOff;
		this.phoneRes = phoneRes;
		this.email = email;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ERMERGENCY_CONT_ID", unique = true, nullable = false)
	public Integer getEmergencyConId() {
		return emergencyContId;
	}

	@ManyToOne
	public Patient getPatient() {
		return this.patient;
	}

	@Column(name = "FIRSTNAME")
	public String getFirstName() {
		return firstName;
	}

	@Column(name = "MIDDLENAME")
	public String getMiddleName() {
		return middleName;
	}

	@Column(name = "LASTNAME")
	public String getLastName() {
		return lastName;
	}

	@Column(name = "ADDRESS_LINE1")
	public String getAddrLine1() {
		return addrLine1;
	}

	@Column(name = "ADDRESS_LINE2")
	public String getAddrLine2() {
		return addrLine2;
	}

	@Column(name = "CITY")
	public String getCity() {
		return city;
	}

	@Column(name = "DISTRICT")
	public String getDistrict() {
		return district;
	}

	@Column(name = "STATE")
	public String getState() {
		return this.state;
	}

	@Column(name = "COUNTRY")
	public String getCountry() {
		return this.country;
	}

	@Column(name = "PIN_CODE")
	public String getPincode() {
		return pincode;
	}

	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "RELATIONSHIP_TYPE")
	public RelationShip getRelationshipType() {
		return relationshipType;
	}

	@Column(name = "CELL_PHONE_NUMBER")
	public String getMobile() {
		return mobile;
	}

	@Column(name = "PHONE_OFFICE")
	public String getPhoneOff() {
		return phoneOff;
	}

	@Column(name = "PHONE_RESIDENCE")
	public String getPhoneRes() {
		return phoneRes;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}

	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
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

	public void setRelationshipType(RelationShip relationshipType) {
		this.relationshipType = relationshipType;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneOff(String phoneOff) {
		this.phoneOff = phoneOff;
	}

	public void setPhoneRes(String phoneRes) {
		this.phoneRes = phoneRes;
	}

	public void setEmergencyConId(Integer emergencyContId) {
		this.emergencyContId = emergencyContId;
	}

	@Override
	public String toString() {
		return "EmergencyContAddress [firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", relationshipType="
				+ relationshipType + ", addrLine1=" + addrLine1
				+ ", addrLine2=" + addrLine2 + ", city=" + city + ", district="
				+ district + ", state=" + state + ", country=" + country
				+ ", pincode=" + pincode + ", mobile=" + mobile + ", phoneOff="
				+ phoneOff + ", phoneRes=" + phoneRes + ", email=" + email
				+ "]";
	}

}
