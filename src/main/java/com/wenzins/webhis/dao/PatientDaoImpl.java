package com.wenzins.webhis.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wenzins.webhis.entity.Patient;

@Repository
public class PatientDaoImpl implements PatientDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Long registerPatient(Patient patient) {
		return (Long)this.sessionFactory.getCurrentSession().save(patient);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Patient> listAllPatients() {
		List<Patient> patientList = this.sessionFactory.getCurrentSession()
		.createQuery("from Patient").list();
		return patientList;
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
