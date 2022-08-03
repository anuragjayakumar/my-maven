package com.logger.demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class log_basic {
	//factory  design pattern
	public static Logger log = Logger.getLogger(log_basic.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.debug("DEBUG");
		log.info("Information");
		log.warn("Warning");
		log.error("error");
		log.fatal("fatal");
	}

}
