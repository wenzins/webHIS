package com.wenzins.webhis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.wenzins.webhis.entity.types.AddressType;
import com.wenzins.webhis.entity.types.PhoneType;

@Entity
@Table(name = "PATIENT_ADDRESS")
public class PatientAddress {

	private String patientId;

	private String addrLine1;

	private String addrLine2;

	private String city;

	private String district;

	private String State;

	private String pincode;

	private PhoneType PhoneType;

	private String phoneNumber;

	private String email;

	private AddressType addressType;

	private Patient patient;

	public PatientAddress(String addrLine1, String addrLine2, String city,
			String district, String state, String pincode, PhoneType phoneType,
			String phoneNumber, String email, AddressType addressType) {
		super();
		this.addrLine1 = addrLine1;
		this.addrLine2 = addrLine2;
		this.city = city;
		this.district = district;
		State = state;
		this.pincode = pincode;
		PhoneType = phoneType;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.addressType = addressType;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Patient getPatient() {
		return patient;
	}

	@Id
	@Column(unique = true, nullable = false)
	@GeneratedValue(generator = "gen")
	@GenericGenerator(name = "gen", strategy = "foreign", parameters = @Parameter(name = "property", value = "patientAddr"))
	public String getPatientId() {
		return patientId;
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
		return State;
	}

	@Column(name = "PIN_CODE")
	public String getPincode() {
		return pincode;
	}

	@Column(name = "PHONE_NUMBER")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Column(name = "EMAIL_ADDRESS")
	public String getEmail() {
		return email;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "PHONE_TYPE")
	public PhoneType getPhoneType() {
		return PhoneType;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "ADDRESS_TYPE")
	public AddressType getAddressType() {
		return addressType;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
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
		State = state;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public void setPhoneType(PhoneType phoneType) {
		PhoneType = phoneType;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}
}
