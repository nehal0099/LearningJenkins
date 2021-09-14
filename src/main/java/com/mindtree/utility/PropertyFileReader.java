package com.mindtree.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileReader {
	public static Properties loadFile()  {
		Properties prop = new Properties();
		try {
		FileInputStream fs = new FileInputStream(".//config.properties");
		prop.load(fs);}
		catch(Exception e){
			System.out.println("Properties file could not be loaded");
		}
		return prop;
	
	}
	
	
	
}
