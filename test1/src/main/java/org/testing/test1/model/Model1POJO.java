package org.testing.test1.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Model1POJO {

	String name;
	String gender;
	
	public Model1POJO(){
		
	}
	
	public Model1POJO(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
