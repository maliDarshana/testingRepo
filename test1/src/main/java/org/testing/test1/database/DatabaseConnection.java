package org.testing.test1.database;

import java.util.HashMap;
import java.util.Map;

import org.testing.test1.model.Model1POJO;

public class DatabaseConnection {
	
	private static Map<Long,Model1POJO> model1=new HashMap<>();

	public static Map<Long, Model1POJO> getModel1() {
		return model1;
	}

}
