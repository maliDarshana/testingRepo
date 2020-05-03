package org.testing.test1.parameteres;

import javax.ws.rs.QueryParam;

public class ParamPOJO {

	private @QueryParam("param") String query;
	private @QueryParam("param1") String query1;
	private @QueryParam("param2") String query2;
	
	
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getQuery1() {
		return query1;
	}
	public void setQuery1(String query1) {
		this.query1 = query1;
	}
	public String getQuery2() {
		return query2;
	}
	public void setQuery2(String query2) {
		this.query2 = query2;
	}
	
	
}
