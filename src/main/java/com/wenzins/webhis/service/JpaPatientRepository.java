package com.wenzins.webhis.service;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.wenzins.webhis.entity.PatientDetails;

@Repository
public class JpaPatientRepository implements PatientRepository {
	
	private EntityManager entityManager;
	

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public PatientDetails findPatientByRegID(String RegID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientDetails findPatientByUHID(String UHID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPatient(PatientDetails patientDetails) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePatient(PatientDetails patientDetails) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean deletePatient(String UHID, String regID) {
		// TODO Auto-generated method stub
		return false;
	}

}
