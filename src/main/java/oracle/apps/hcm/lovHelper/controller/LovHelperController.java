package oracle.apps.hcm.lovHelper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import oracle.apps.hcm.lovHelper.model.ContentItem;
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
	
	@RequestMapping("/contentItems/{contentTypeId}")
	@CrossOrigin
	@Cacheable("contentItems")
	public List<ContentItem> getContentItems(@PathVariable Long contentTypeId){
		
		return service.getContentItems(contentTypeId);
	}
	
	@RequestMapping("/contentItemsPaged/{contentTypeId}")
	@CrossOrigin
	@Cacheable("contentItemsPaged")
	public Page<ContentItem> getContentItemsPaged(@PathVariable Long contentTypeId, @PageableDefault(page = 0, size = 50)Pageable pageable){
		
		return service.getContentItemsPaged(contentTypeId,pageable);
	}
	
}
