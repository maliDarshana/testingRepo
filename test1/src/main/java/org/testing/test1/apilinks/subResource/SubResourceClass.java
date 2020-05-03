package org.testing.test1.apilinks.subResource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class SubResourceClass {

	@GET
	public String test(){
		
		return "Test Successfully";
	}
	
	@GET
	@Path("/{id}")
	public String test1(@PathParam("id")int id){
		
		return "Test Successfully";
	}
}
