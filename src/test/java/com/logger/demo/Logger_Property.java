package com.logger.demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logger_Property {
	public static Logger log = Logger.getLogger(Logger_Property.class);
    public static void main(String[] args) {
    	PropertyConfigurator.configure("log4j.properties");
    	
    	log.debug("DEBUG");
		log.info("Information");
		log.warn("Warning");
		log.error("error");
		log.fatal("fatal");
		
	}
	

}
