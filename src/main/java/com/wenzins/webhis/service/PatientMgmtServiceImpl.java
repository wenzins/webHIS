package com.wenzins.webhis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wenzins.webhis.dao.PatientDAO;
import com.wenzins.webhis.entity.Patient;

@Repository
public class PatientMgmtServiceImpl implements PatientMgmtService {

	@Autowired
	private PatientDAO patientDAO;

	@Override
	@Transactional
	public void registerPatient(Patient patient) {
		patientDAO.registerPatient(patient);
	}

	@Override
	public Patient findPatientByRegID(String RegID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient findPatientByUHID(String UHID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePatientDetails(Patient patientDetails) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePatientDetails(long patientId) {
		patientDAO.deletePatientDetails(patientId);
	}

	@Override
	@Transactional
	public List<Patient> getAllPatients() {
		return patientDAO.listAllPatients();
	}
	
	public void setPatientDAO(PatientDAO patientDAO) {
        this.patientDAO = patientDAO;
    }

}
