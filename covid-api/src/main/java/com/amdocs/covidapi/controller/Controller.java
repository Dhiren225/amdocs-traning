package com.amdocs.covidapi.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.covidapi.pojo.CovidCareCentres;
import com.amdocs.covidapi.util.Tester;

@RestController
public class Controller {
	
	Tester t=new Tester();
	List<CovidCareCentres> list=t.getCentres();
	
	@GetMapping("/get/allCentres")
	public ResponseEntity<?> fetchAllCentres()
	{
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@GetMapping("/get/allCentres/{pin}")
	public ResponseEntity<?> getCentreByPin(@PathVariable long pin)
	{
		CovidCareCentres c=t.getCentreByPin(pin);
		if(c!=null)
		{
		return ResponseEntity.ok(c);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Invalid PinCode");
	}
	
	@PostMapping("/post/covidCenter")
	public ResponseEntity<?> addNewCentre(@RequestBody CovidCareCentres centre)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(t.addCentre(centre));
	}
}
