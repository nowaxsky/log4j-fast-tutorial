package org.cpm.zerowastelife.log4j;

import org.apache.log4j.Logger;

public class App{

	final static Logger logger = Logger.getLogger(App.class);
	
    public static void main(String[] args) {  
        logger.debug("should not show message");  
        logger.warn("should show some message"); 
        logger.fatal("should show some message");   
    }
}
