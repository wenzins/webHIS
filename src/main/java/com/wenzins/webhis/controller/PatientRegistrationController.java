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
import com.wenzins.webhis.service.PatientMgmtService;

@Controller
public class PatientRegistrationController {

	@Autowired
	PatientMgmtService patientMgmtService;

	@RequestMapping(value = "/patient", method = RequestMethod.POST, headers = { "content-type=application/json" })
	@ResponseBody
	public void registerPatient(@RequestBody Patient patient) {
		patientMgmtService.registerPatient(patient);
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody
	List<Patient> getPatients(ModelMap map) {
		map.addAttribute("patient", new Patient());
		map.addAttribute("patientList", patientMgmtService.getAllPatients());
		return null;
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
