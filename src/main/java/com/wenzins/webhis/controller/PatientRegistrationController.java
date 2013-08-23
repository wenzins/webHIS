package com.wenzins.webhis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.wenzins.webhis.entity.Patient;
import com.wenzins.webhis.service.PatientMgmtService;

@Controller
public class PatientRegistrationController {
	
	@Autowired
	PatientMgmtService patientMgmtService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String registerPatient(@ModelAttribute(value="patient") Patient patient, BindingResult result) {
		patientMgmtService.registerPatient(patient);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listAllPatients(ModelMap map) 
	{
		map.addAttribute("patient", new Patient());
		map.addAttribute("patientList", patientMgmtService.getAllPatients());
		
		return "editPatientList";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updatePatient(@ModelAttribute(value="patient") Patient patient, BindingResult result) {
		patientMgmtService.updatePatientDetails(patient);
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{patientId}")
    public String deletePatientRecord(@PathVariable("patientId") Integer patientId) {
    	patientMgmtService.deletePatientDetails(patientId);
    	return "redirect:/";
    }
    
    public void setPatientMgmtService(PatientMgmtService patientMgmtService) {
		this.patientMgmtService = patientMgmtService;
	}
}
