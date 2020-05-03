package org.test.soapTest.serviceImpl;

import java.util.ArrayList;
import java.util.List;

public class ServiceClass1 {

	List<String> Books=new ArrayList<String>();
	List<String> products=new ArrayList<String>();
	List<String> perfumes=new ArrayList<String>();
	
	public ServiceClass1(){
		Books.add("Java");
		Books.add("Pythan");
		Books.add("SQL");
		Books.add("Network");

		products.add("Shampoo");
		products.add("Oil");
		products.add("Soap");
		products.add("HandWash");	
		
		perfumes.add("Rose");
		perfumes.add("Pitch");
		perfumes.add("Orange");
		 
	}
	
	public List<String> getListMethod(String name){
		
		switch(name){
		case "perfume":
			return perfumes;
		case "book":
			return Books;
		case "products":
			return products;
		}
		
		return null;
	}
	
}
