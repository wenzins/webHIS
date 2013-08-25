package com.wenzins.webhis.service;

import java.util.List;

import com.wenzins.webhis.entity.Patient;

public interface PatientMgmtService {

	public Patient findPatientByRegID(String RegID);

	public Patient findPatientByUHID(String UHID);

	public void registerPatient(Patient patient);
	
	public List<Patient> getAllPatients();

	public void updatePatientDetails(Patient patient);

	public void deletePatientDetails(long patientId);
}
