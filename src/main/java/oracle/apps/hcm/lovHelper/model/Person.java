package oracle.apps.hcm.lovHelper.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="CUSTOM_PERSON")
public class Person {
	
	@Id
	@JsonProperty ("PersonId") 
	private Long PersonId;
	
	@JsonProperty ("PersonNumber") 
	private String PersonNumber;
	
	@JsonProperty ("AssignmentId")
	private Long AssignmentId;
	
	@JsonProperty ("DisplayName")
	private String DisplayName;
	
	@JsonProperty ("ListName")
	private String ListName;
	
	@JsonProperty ("AssignmentNumber")
	private String AssignmentNumber;
	
	@JsonProperty ("PersonIdAsString")
	private transient String personIdAsString;
	
	@JsonProperty ("AssignmentIdAsString")
	private transient String assignmentIdAsString;
	

	public Person() {
		
	}

	public Person(Long PersonId, String PersonNumber, Long AssignmentId, String DisplayName,
			String ListName, String AssignmentNumber, String personIdAsString) {
		super();
		this.PersonId = PersonId;
		this.PersonNumber = PersonNumber;
		this.AssignmentId = AssignmentId;
		this.DisplayName = DisplayName;
		this.ListName = ListName;
		this.AssignmentNumber = AssignmentNumber;
	}



	public Long getPersonId() {
		return PersonId;
	}
	public void setPersonId(Long PersonId) {
		this.PersonId = PersonId;
	}
	public String getPersonNumber() {
		return PersonNumber;
	}
	public void setPersonNumber(String PersonNumber) {
		this.PersonNumber = PersonNumber;
	}
	public Long getAssignmentId() {
		return AssignmentId;
	}
	public void setAssignmentId(Long AssignmentId) {
		this.AssignmentId = AssignmentId;
	}
	public String getDisplayName() {
		return DisplayName;
	}
	public void setDisplayName(String DisplayName) {
		this.DisplayName = DisplayName;
	}
	public String getListName() {
		return ListName;
	}
	public void setListName(String ListName) {
		this.ListName = ListName;
	}
	public String getAssignmentNumber() {
		return AssignmentNumber;
	}
	public void setAssignmentNumber(String AssignmentNumber) {
		this.AssignmentNumber = AssignmentNumber;
	}
	public String getPersonIdAsString() {
		return getPersonId().toString();
	}
	public void setPersonIdAsString(String personIdAsString) {
		this.personIdAsString = personIdAsString;
	}
	public String getAssignmentIdAsString() {
		return getAssignmentId().toString();
	}
	public void setAssignmentIdAsString(String assignmentIdAsString) {
		this.assignmentIdAsString = assignmentIdAsString;
	}	

}

