package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
	private int empid;
	private String empname;
	@ManyToMany
	@JoinTable(name = "emp_learn ",joinColumns = {@JoinColumn(name="E_ID" )}, inverseJoinColumns = {@JoinColumn(name="pId")} )
	private List<Project> projects;
		
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Emp(int empid, String empname, List<Project> project) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.projects = project;
	}
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public List<Project> getProject() {
		return projects;
	}
	public void setProject(List<Project> project) {
		this.projects = project;
	}
	
	

}
