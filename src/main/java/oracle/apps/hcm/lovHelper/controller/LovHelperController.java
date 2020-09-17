package oracle.apps.hcm.lovHelper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import oracle.apps.hcm.lovHelper.model.Person;
import oracle.apps.hcm.lovHelper.service.LovHelperService;

@RestController
public class LovHelperController {
	
	@Autowired
	LovHelperService service;
		
	@RequestMapping("/persons")
	@CrossOrigin
	@Cacheable("personList")
	public List<Person> getAllPersons(){
		
		return service.getAllPersons();
	}
	
	@RequestMapping("/persons2")
	@CrossOrigin
	@Cacheable("personList2")
	public List<Person> getAllPersons2(){
		
		return service.getAllPersons2();
	}

}
