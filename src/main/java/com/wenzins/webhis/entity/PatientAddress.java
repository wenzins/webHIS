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
public class PatientAddress implements java.io.Serializable {

	private static final long serialVersionUID = -8158361737220282015L;

	private String patientId;

	private String addrLine1;

	private String addrLine2;

	private String city;

	private String district;

	private String state;

	private String pincode;

	private PhoneType phoneType;

	private String phoneNumber;

	private String email;

	private AddressType addressType;

	private Patient patient;

	//Default Constructor
	public PatientAddress(){
		
	}
	public PatientAddress(String addrLine1, String addrLine2, String city,
			String district, String state, String pincode, PhoneType phoneType,
			String phoneNumber, String email, AddressType addressType) {
		super();
		this.addrLine1 = addrLine1;
		this.addrLine2 = addrLine2;
		this.city = city;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.addressType = addressType;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Patient getPatient() {
		return this.patient;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "patient"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "PATIENT_ID", unique = true, nullable = false)
	public String getPatientId() {
		return this.patientId;
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
		this.state = state;
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
}
