package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {
@Id
private int projectid;
private String ProjectName;
@ManyToMany(mappedBy = "projects")

private List<Emp> emp;
public Project() {
	super();
	// TODO Auto-generated constructor stub
}
public Project(int projectid, String projectName, List<Emp> emp) {
	super();
	this.projectid = projectid;
	ProjectName = projectName;
	this.emp = emp;
}
public int getProjectid() {
	return projectid;
}
public void setProjectid(int projectid) {
	this.projectid = projectid;
}
public String getProjectName() {
	return ProjectName;
}
public void setProjectName(String projectName) {
	ProjectName = projectName;
}
public List<Emp> getEmp() {
	return emp;
}
public void setEmp(List<Emp> emp) {
	this.emp = emp;
}

}
