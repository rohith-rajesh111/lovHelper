package oracle.apps.hcm.lovHelper.controller;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import oracle.apps.hcm.lovHelper.model.Person;

public interface LovHelperRepository extends CrudRepository<Person,String>{
	
//	@Query(" select * from (\r\n" + 
//			"select p.person_id as PersonId,\r\n" + 
//			"pap.person_number as PersonNumber, \r\n" + 
//			"a.assignment_id as AssignmentId,\r\n" + 
//			"pn.display_name as DisplayName,\r\n" + 
//			"pn.list_name as ListName,\r\n" + 
//			"a.assignment_number as AssignmentNumber\r\n" + 
//			"from per_persons p, per_person_names_f_v pn, per_all_assignments_m a, per_all_people_f pap, per_users pu\r\n" + 
//			"where p.person_id = pn.person_id\r\n" + 
//			"and p.person_id = pap.person_id\r\n" + 
//			"and p.person_id = a.person_id\r\n" + 
//			"and p.person_id = pu.person_id\r\n" + 
//			"and a.primary_flag = 'Y'\r\n" + 
//			"and trunc(sysdate) between a.effective_start_date and a.effective_end_date\r\n" + 
//			"and trunc(sysdate) between pn.effective_start_date and pn.effective_end_date\r\n" + 
//			"and trunc(sysdate) between pap.effective_start_date and pap.effective_end_date\r\n" + 
//			"and pu.username like 'TM-%'\r\n" + 
//			"order by pap.person_number desc ) Person")
//	List<Person> findAllPersonsByList();

}

