package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "Employees id")
	private String Employe_id;
	
	@Column(name = "Department")
	private String Department;
	
	@Column(name = "Status")
	private String Status;
	
	@Column(name = "DOB")
	private String DOB;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "blood group")
	private String bloodgroup;
	
	public long getId() 
	{
		return id;
	}
	public void setId(long id) 
	{
		this.id = id;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public String getDepartment()
	{
		return Department;
	}
	
	public void setDepartment(String Department) 
	{
		this.Department = Department;
	}
	public String getStatus()
	{
		return Status;
	}
	public void setStatus(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setemploye_id(String employes_id) 
	{
		this.Employe_id = employes_id;
	}
}
