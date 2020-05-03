package org.test.soapTest;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.test.soapTest.serviceImpl.ServiceClass1;

@WebService
public class Test1 {
	
	ServiceClass1 serv=new ServiceClass1();
	
	@WebMethod
	public List<String> getProducts(String name){
		
		return serv.getListMethod(name);
		
	}

}
