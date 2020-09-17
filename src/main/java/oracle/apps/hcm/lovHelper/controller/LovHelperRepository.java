package oracle.apps.hcm.lovHelper.controller;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import oracle.apps.hcm.lovHelper.model.Person;

public interface LovHelperRepository extends CrudRepository<Person,String>{
	
}

