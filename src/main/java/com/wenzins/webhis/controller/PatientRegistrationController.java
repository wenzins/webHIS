package com.wenzins.webhis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wenzins.webhis.entity.Patient;
import com.wenzins.webhis.entity.types.PatientGender;
import com.wenzins.webhis.service.PatientMgmtService;

@Controller
@RequestMapping("/patient")
public class PatientRegistrationController {

	@Autowired
	PatientMgmtService patientMgmtService;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public String registerPatient(@RequestBody Patient patient) {
		String salutation = "Mr/Sri";
		if (patient.getGender().equals(PatientGender.Female)) {
			salutation = "Mrs/Smt";
		}
		return "The MRD number of " + salutation + " " + patient.getFirstName()
				+ " " + patient.getLastName() + " is: "
				+ patientMgmtService.registerPatient(patient);
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	List<Patient> getPatients(ModelMap map) {
		System.out.println("Came inside this method >>>>  ::::  "
				+ patientMgmtService.getAllPatients());
		return patientMgmtService.getAllPatients();

	}

	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	@ResponseBody
	public void updatePatient(@PathVariable long patientId,
			@RequestBody Patient patient) {
		patient.setPatientId(patientId);
		patientMgmtService.updatePatientDetails(patient);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deletePatientRecord(@PathVariable long patientId) {
		patientMgmtService.deletePatientDetails(patientId);
	}

	public void setPatientMgmtService(PatientMgmtService patientMgmtService) {
		this.patientMgmtService = patientMgmtService;
	}
}
