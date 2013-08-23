package webhis;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="T_CARE_PRV_ADDRESS")
public class CareProviderAddress {
	
	@Id
	@Column(unique=true, nullable=false)
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen", strategy="foreign", parameters=@Parameter(name="property", value="patientCPAddr"))
	private String regNumber;

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
	
	private InsuranceStatus insStatus;
	
	@OneToOne
    @PrimaryKeyJoinColumn
	private PatientDetails patientDetails;
	
	public CareProviderAddress(String addrLine1, String addrLine2, String city,
			String district, String state, String pincode,
			webhis.PhoneType phoneType, String phoneNumber, String email,
			AddressType addressType, InsuranceStatus insStatus) {
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
		this.insStatus = insStatus;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getAddrLine1() {
		return addrLine1;
	}

	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}

	public String getAddrLine2() {
		return addrLine2;
	}

	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public PhoneType getPhoneType() {
		return PhoneType;
	}

	public void setPhoneType(PhoneType phoneType) {
		PhoneType = phoneType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public InsuranceStatus getInsStatus() {
		return insStatus;
	}

	public void setInsStatus(InsuranceStatus insStatus) {
		this.insStatus = insStatus;
	}

}
