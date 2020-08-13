package com.infy.patient.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
@RequestMapping("/patientregistration")
public class PatientRegistrationController {
	@RequestMapping(value="/")
	public String home(){
		return "Patient Registration sevice is up";
	}
}
