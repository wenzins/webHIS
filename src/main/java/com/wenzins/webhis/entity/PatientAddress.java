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

import com.wenzins.webhis.entity.types.AddressType;
import com.wenzins.webhis.entity.types.PhoneType;

@Entity
@Table(name = "PATIENT_ADDRESS")
public class PatientAddress implements java.io.Serializable {

	private static final long serialVersionUID = -8158361737220282015L;

	private Integer addressId;
	
	private String addrLine1;

	private String addrLine2;

	private String city;

	private String district;

	private String state;
	
	private String country;

	private String pincode;

	private PhoneType phoneType;

	private String phoneNumber;

	private String email;

	private AddressType addressType;

	private Patient patient;

	// Default Constructor
	public PatientAddress() {

	}

	public PatientAddress(String addrLine1, String addrLine2, String city,
			String district, String state, String country, String pincode, PhoneType phoneType,
			String phoneNumber, String email, AddressType addressType) {
		super();
		this.addrLine1 = addrLine1;
		this.addrLine2 = addrLine2;
		this.city = city;
		this.district = district;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.addressType = addressType;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ADDRESS_ID", unique = true, nullable = false)
	public Integer getAddressId() {
		return this.addressId;
	}

	
	@ManyToOne
	public Patient getPatient() {
		return this.patient;
	}

	@Column(name = "ADDRESS_LINE1")
	public String getAddrLine1() {
		return addrLine1;
	}

	@Column(name = "ADDRESS_LINE2")
	public String getAddrLine2() {
		return this.addrLine2;
	}

	@Column(name = "CITY")
	public String getCity() {
		return this.city;
	}

	@Column(name = "DISTRICT")
	public String getDistrict() {
		return this.district;
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
		return this.pincode;
	}

	@Column(name = "PHONE_NUMBER")
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	@Column(name = "EMAIL_ADDRESS")
	public String getEmail() {
		return this.email;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "PHONE_TYPE")
	public PhoneType getPhoneType() {
		return this.phoneType;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "ADDRESS_TYPE")
	public AddressType getAddressType() {
		return this.addressType;
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

	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
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
	
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Override
	public String toString() {
		return "PatientAddress [addrLine1=" + addrLine1 + ", addrLine2="
				+ addrLine2 + ", city=" + city + ", district=" + district
				+ ", state=" + state + ", country=" + country + ", pincode="
				+ pincode + ", phoneType=" + phoneType + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", addressType="
				+ addressType + "]";
	}
}
