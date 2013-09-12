package com.wenzins.webhis.controller;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.google.gson.Gson;
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
	
		
		
		
		//Add new Employee object
		Patient patient = new Patient();
		patient.setDateOfBirth(new Date(System.currentTimeMillis()));
		patient.setFirstName("demo-one");
		patient.setLastName("user-one");
		patient.setAge(20);
		patient.setEmergencyContName("24324324324");
		patient.setEmergencyRelationShip(RelationShip.Friend);
		patient.setGender(PatientGender.Female);
		patient.setOccupation("Engineer");
		patient.setUhid("1233123");
		
		
		
		Set<PatientAddress> patientAddressSet = new HashSet<PatientAddress>();
		patientAddressSet.add(address1);
		
		
		
		patient.setPatientAddress(patientAddressSet);
		//Save Employee
		Gson gson = new Gson();
		System.out.println(gson.toJson(patient));
		
	}

}
