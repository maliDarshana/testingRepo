package org.testing.test1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jvnet.hk2.annotations.Service;
import org.testing.test1.database.DatabaseConnection;
import org.testing.test1.model.Model1POJO;

@Service
public class ServiceClass1 {

	private Map<Long,Model1POJO> modelMap=DatabaseConnection.getModel1();
	 	
	public ServiceClass1(){
		modelMap.put(1L, new Model1POJO("Darshana","female"));
	}
	
	public List<Model1POJO> getNames(){
		
		return new ArrayList<Model1POJO>(modelMap.values());
	}
	
	public Model1POJO addName(Model1POJO modelObj){
		System.out.println("Inside add method");
		Long id=Long.valueOf(modelMap.size()+1);
		modelMap.put(id, modelObj);
		return modelObj;
	}
	
	public void deleteName(String name){
		System.out.println("Inside delete method");
		Model1POJO m=new Model1POJO();
//		finalList.remove(finalList.indexOf(m.getName().equalsIgnoreCase(name)));
	}
	
}
