package com.xworkz.CommonModulesApp.utility;

import org.apache.log4j.Logger;

public class Loggers {
	static Logger logger;
	
	static {
		logger = Logger.getLogger(Loggers.class);
	}
	
	public static void main(String[] args) {
		logger.debug("Hello");
	}
}
