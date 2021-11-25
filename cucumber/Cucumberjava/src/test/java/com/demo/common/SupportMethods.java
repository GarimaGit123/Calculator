package com.demo.common;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SupportMethods {

	public static String getPropertyValue(String propertyName) {
		String propertyValue = null;
		try {
			FileReader reader=new FileReader("application.properties");
			Properties properties = new Properties();
			properties.load(reader);
			//(String)properties.get(propertyName);
			propertyValue=(String) properties.get(propertyName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return propertyValue;
	}
}
