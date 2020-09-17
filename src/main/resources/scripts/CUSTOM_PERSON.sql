  CREATE OR REPLACE FORCE EDITIONABLE VIEW "FUSION"."CUSTOM_PERSON" ("PERSON_ID", "PERSON_NUMBER", "ASSIGNMENT_ID", "DISPLAY_NAME", "LIST_NAME", "ASSIGNMENT_NUMBER", "PERSON_ID_AS_STRING") AS 
  select p.person_id ,
pap.person_number , 
a.assignment_id ,
pn.display_name,
pn.list_name ,
a.assignment_number,
to_char(p.person_id) as PERSON_ID_AS_STRING
from per_persons p, per_person_names_f_v pn, per_all_assignments_m a, per_all_people_f pap, per_users pu
where p.person_id = pn.person_id
and p.person_id = pap.person_id
and p.person_id = a.person_id
and p.person_id = pu.person_id
and a.primary_flag = 'Y'
and trunc(sysdate) between a.effective_start_date and a.effective_end_date
and trunc(sysdate) between pn.effective_start_date and pn.effective_end_date
and trunc(sysdate) between pap.effective_start_date and pap.effective_end_date
and pu.username like 'TM-%'
order by pap.person_number desc;