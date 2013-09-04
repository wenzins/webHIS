package com.wenzins.webhis.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wenzins.webhis.entity.Patient;

@Repository
@Transactional
public class PatientDaoImpl implements PatientDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void registerPatient(Patient patient) {
		this.sessionFactory.getCurrentSession().save(patient);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Patient> listAllPatients() {
		return this.sessionFactory.getCurrentSession().createQuery("from Patient").list();
		}

	@Override
	public void deletePatientDetails(long patientId) {
		Patient patient = (Patient) sessionFactory.getCurrentSession().load(
				Patient.class, patientId);
        if (null != patient) {
        	this.sessionFactory.getCurrentSession().delete(patient);
        }
	}
}
