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
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiError;
import com.wordnik.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/patient")
@Api(value = "Patient Registration", listingClass = "PatientRegistrationController", basePath = "/api/v1/cars", description = "All operations for cars")
public class PatientRegistrationController {

	@Autowired
	PatientMgmtService patientMgmtService;
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public void registerPatient(@RequestBody Patient patient) {
		System.out.println("Came inside this method >>>>  ::::  " +patient);
		patientMgmtService.registerPatient(patient);
	}
	
	@ApiOperation(value = "Find all cars", notes = "Get all cars currently available", httpMethod = "GET", responseClass = "Car", multiValueResponse = true)
    @ApiError(code = 500, reason = "Process error")
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
