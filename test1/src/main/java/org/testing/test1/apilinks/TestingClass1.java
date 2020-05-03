package org.testing.test1.apilinks;


import java.util.List;

import javax.print.attribute.standard.Media;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
//import javax.websocket.server.PathParam;
//import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import org.testing.test1.apilinks.subResource.SubResourceClass;
import org.testing.test1.model.Model1POJO;
import org.testing.test1.parameteres.ParamPOJO;
import org.testing.test1.service.ServiceClass1;

@Path("/MyText")
public class TestingClass1 {

	ServiceClass1 serv=new ServiceClass1();

	@GET
	@Produces(MediaType.APPLICATION_JSON)	
	public List<Model1POJO> getMessage(){		
		
		return serv.getNames();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)	
	public Model1POJO addPerson(Model1POJO modelObj){		
		
		return serv.addName(modelObj);
	}
	
	public Response getText(Model1POJO model1){
		
//		Model1POJO m2=serv.getNames();
		return Response.status(Status.CREATED).entity(model1).build();
	}
	
//	SubResources
	
//	@Path("/subResources")
//	public SubResourceClass getContent(){
//		
//		return new SubResourceClass();
//	}
	
//	Different Annotations
	
//	Context AND BEANParam
	
//	@GET
//	@Path("context")
//	public String testPart1(@Context UriInfo uriInfo,
//							@Context HttpHeaders header,
//							@BeanParam ParamPOJO beanParamValue
//							){
//		beanParamValue.getQuery1();
//		uriInfo.getQueryParameters();
//		header.getCookies();
//		return "Test Successfull";
//	}
	
//	
//	@POST
//	@Path("/MyText1")
//	@Consumes(MediaType.TEXT_PLAIN)
//	@Produces(MediaType.TEXT_PLAIN)	
//	public String getDataAll(@MatrixParam("param") String param,
//							@HeaderParam("name") String name,
//							@CookieParam("cookie") String cookie
//							@QueryParam("") String query){		
//		
//		return param+","+name+","+cookie;
//	}
//	
	
	
//	@GET
//	@Produces(MediaType.APPLICATION_XML)
//	@Path("/getName")
//	public List<Model1POJO> getMessage(){		
//		
//		return serv.getNames();
//	}
	
//	@POST
//	@Path("/addName/{name}/{gender}")
//	public List<Model1POJO> addInData(@PathParam("name") String name,@PathParam("gender") String gender){
//		serv.addName(name, gender);	
//		return serv.getNames();
//	}
			
	 
}
