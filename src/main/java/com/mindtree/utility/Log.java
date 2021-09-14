package com.mindtree.utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log {
	
	public static Logger logger(String classname) {
		Logger log = LogManager.getLogger(classname);
		return log;
	}
}
