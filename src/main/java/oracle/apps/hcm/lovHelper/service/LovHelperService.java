package oracle.apps.hcm.lovHelper.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import oracle.apps.hcm.lovHelper.controller.LovHelperRepository;
import oracle.apps.hcm.lovHelper.model.*;

@Service
public class LovHelperService {
	
	@Autowired
	LovHelperRepository repo;
	
	@Autowired
	private Environment env;
	
	public List<Person> getAllPersons(){
		
		List<Person> personList = new ArrayList<>();
		
		System.out.println("*****************************************************************");
		System.out.println("\n\nLOADING DATA FROM FILE : "+env.getProperty("personlist.filepath")+"\n\n");
		System.out.println("*****************************************************************");
		
		File file = new File(env.getProperty("personlist.filepath")); 
	    Scanner sc = null;
		try {
			sc = new Scanner(file);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("\n \n File personList.txt not found at location :"+ env.getProperty("personlist.filepath"));
			
			System.out.println(">> ATTEMPTING to read file personList.txt from C:\\");
			
			File file2 = new File("C:\\personList.txt");
			
			try {
				sc = new Scanner(file2);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
				System.out.println("\n \n File personList.txt not found at location : C:\\");
			}
		}
		
		if(sc!=null) {		
			 while (sc.hasNextLine()) { 
				 String personAttrList = sc.nextLine();
				 System.out.println(personAttrList);
				 
				 if(personAttrList!=null && personAttrList.length()>0 && ! (personAttrList.charAt(0)=='#')) {
				 
					 String[] attrs = personAttrList.split(":");
					 
					 if(attrs.length==7) {
						 
						 try {
					 
						 Long personId =Long.parseLong(attrs[0]);
						 String personNumber = attrs[1];
						 Long assignmentId = Long.parseLong(attrs[2]);
						 String displayName = attrs[3];
						 String listName = attrs[4];
						 String assignmentNumber = attrs[5];
						 String personIdAsString = attrs[6];
					 
						 Person p = new Person(personId,personNumber,assignmentId,displayName,listName,assignmentNumber,personIdAsString);
						 personList.add(p);
						 
						 }
						 catch (Exception e) {
							// TODO: handle exception
							 e.printStackTrace();
							 System.out.println("\n\n\n!!! ERROR !! While parsing row :"+personAttrList);
							 System.out.println("Skipping..."); 
						}
						 
					 }
				 }
			 }
		
		}	
		return personList;	
	}
	
	
	public List<Person> getAllPersons2(){
		
		System.out.println(">>>>>> CONNECTING TO DB TO FETCH RESULTS");
		
		List<Person> personList = new ArrayList<>();
		
		repo.findAll().forEach(personList::add);
		
		return personList;
	}

}
