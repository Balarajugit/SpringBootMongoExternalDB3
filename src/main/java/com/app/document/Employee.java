package com.app.document;

import java.util.List;
import java.util.Properties;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	@Id
	private String id;
	private Integer eId;
	private String eName;
	private String eDepartment;
	private String eProject;
	private List<String> eSpecification;
	private Properties eAdress;
	public Employee() {
		super();
	}
	public Employee(Integer eId, String eName, String eDepartment, String eProject, List<String> eSpecification,
			Properties eAdress) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eDepartment = eDepartment;
		this.eProject = eProject;
		this.eSpecification = eSpecification;
		this.eAdress = eAdress;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDepartment() {
		return eDepartment;
	}
	public void seteDepartment(String eDepartment) {
		this.eDepartment = eDepartment;
	}
	public String geteProject() {
		return eProject;
	}
	public void seteProject(String eProject) {
		this.eProject = eProject;
	}
	public List<String> geteSpecification() {
		return eSpecification;
	}
	public void seteSpecification(List<String> eSpecification) {
		this.eSpecification = eSpecification;
	}
	public Properties geteAdress() {
		return eAdress;
	}
	public void seteAdress(Properties eAdress) {
		this.eAdress = eAdress;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", eId=" + eId + ", eName=" + eName + ", eDepartment=" + eDepartment
				+ ", eProject=" + eProject + ", eSpecification=" + eSpecification + ", eAdress=" + eAdress + "]";
	}
	

}
