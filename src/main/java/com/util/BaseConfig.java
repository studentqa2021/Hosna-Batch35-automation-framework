package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import cucumber.api.cli.Main;

public class BaseConfig {
	
	public static String getConfig;
	public static String getConfig(String testData) throws Throwable {
		String filePath = "./Envieronment/dev.properties";
		FileInputStream fis = new FileInputStream(filePath);
		Properties pro = new Properties();
		pro.load(fis);
		
		String value =pro.get(testData).toString();
		
		
		return value;

	}
	public static void main(String[] args) throws Throwable  {
	
		System.out.println(BaseConfig.getConfig("URL"));
		System.out.println(BaseConfig.getConfig("Username"));
		System.out.println(BaseConfig.getConfig("Password"));
	}
	
}