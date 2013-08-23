package com.wenzins.webhis.service;

import com.wenzins.webhis.entity.PatientDetails;

public interface PatientRepository {
	
	PatientDetails findPatientByRegID(String RegID);
	PatientDetails findPatientByUHID(String UHID);
	void addPatient(PatientDetails patientDetails);
	void updatePatient(PatientDetails patientDetails);
	boolean deletePatient(String UHID, String regID);
}
