package com.wenzins.webhis.controller;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.google.gson.Gson;
import com.wenzins.webhis.entity.EmergencyContAddress;
import com.wenzins.webhis.entity.Patient;
import com.wenzins.webhis.entity.PatientAddress;
import com.wenzins.webhis.entity.types.AddressType;
import com.wenzins.webhis.entity.types.PatientGender;
import com.wenzins.webhis.entity.types.PhoneType;
import com.wenzins.webhis.entity.types.RelationShip;

public class TestPatientAssociation
{
	
	public static void main(String[] args) 
	{
       
		PatientAddress address1 = new PatientAddress();
		address1.setAddressType(AddressType.Permannent);
		address1.setAddrLine1("sfsdfdsfds");
		address1.setAddrLine2("dfdsfdsfdsfdsf");
		address1.setCity("Bangalore");
		address1.setDistrict("sfsdfdsfdsf");
		address1.setEmail("sfdsfds@sdfdsf.com");
		address1.setPhoneNumber("24234324324");
		address1.setPhoneType(PhoneType.LandLine);
		address1.setPincode("45555");
		address1.setState("Karnataka");
		address1.setCountry("India");
		
		EmergencyContAddress emrgencyContAddress = new EmergencyContAddress();
		emrgencyContAddress.setAddrLine1("sfsdfsdf");
		emrgencyContAddress.setAddrLine2("asdsadasd");
		emrgencyContAddress.setCity("Banalore");
		emrgencyContAddress.setCountry("India");
		emrgencyContAddress.setDistrict("Bangalore");
		emrgencyContAddress.setFirstName("Ramesh");
		emrgencyContAddress.setLastName("sadasd");
		emrgencyContAddress.setMiddleName("asdasdasd");
		emrgencyContAddress.setMobile("345345435435");
		emrgencyContAddress.setPhoneOff("234234234");
		emrgencyContAddress.setPhoneRes("123123213");
		emrgencyContAddress.setPincode("324234234");
		emrgencyContAddress.setRelationshipType(RelationShip.Friend);
		emrgencyContAddress.setState("Namma Karnataka");
		
	
		
		
		
		//Add new Employee object
		Patient patient = new Patient();
		patient.setDateOfBirth(new Date(System.currentTimeMillis()));
		patient.setFirstName("demo-one");
		patient.setMiddleName("middleName");
		patient.setEmail("sdfsdf@ff.com");
		patient.setMobile("9988834324234");
		patient.setPhRes("08023423432");
		patient.setPhOff("080-23423432");
		patient.setLastName("user-one");
		patient.setAge(20);
		patient.setEmergencyContName("24324324324");
		patient.setEmergencyRelationShip(RelationShip.Friend);
		patient.setGender(PatientGender.Female);
		patient.setOccupation("Engineer");
		patient.setUhid("1233123");
		
		
		
		Set<PatientAddress> patientAddressSet = new HashSet<PatientAddress>();
		Set<EmergencyContAddress> emergencyContAddressSet = new HashSet<EmergencyContAddress>();
		patientAddressSet.add(address1);
		emergencyContAddressSet.add(emrgencyContAddress);
		
		
		patient.setEmergencyContactAddress(emergencyContAddressSet);
		patient.setPatientAddress(patientAddressSet);
		//Save Employee
		Gson gson = new Gson();
		System.out.println(gson.toJson(patient));
		
	}

}
