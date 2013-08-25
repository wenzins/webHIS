package com.wenzins.webhis.dao;

import java.util.List;

import com.wenzins.webhis.entity.Patient;

public interface PatientDAO {
	public void registerPatient(Patient patient);

	public List<Patient> listAllPatients();

	public void deletePatientDetails(long patientId);
}
