package com.form.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.form.Datamodel.Form;
import com.form.repository.FormRepository;

@CrossOrigin
@RestController
public class FormController {
	
	@Autowired
	private FormRepository repo;
	
	@PostMapping("/add")
	public boolean Addform(@RequestBody Form f){
		try {
			if (f.Firstname == null){
				return false;
				
			} else if (f.number == null) {
				return false;	
			} else if (f.email == null) {
				return false;
			} else if (f.gender == null) {
				return false;
			} else if (f.Password == null) {
				return false;
			} else {
				repo.save(f);
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	@GetMapping("/get")
	public Form getdatausingid(@RequestParam String number) {
		if (repo != null) {
			return repo.findById(number).orElse(null);
		} else {
			return null;
		}
		}
	
	
	

	}
	
	


