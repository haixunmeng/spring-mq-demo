package com.lan.mq.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CentralLogger{
	
    private static Logger debug = LoggerFactory.getLogger("debug");
    private static Logger info = LoggerFactory.getLogger("info");
    private static Logger error = LoggerFactory.getLogger("error");
    private static Logger exception = LoggerFactory.getLogger("exception");
	
	private static CentralLogger logger = null;
	
	private CentralLogger(){}
	
	public synchronized static CentralLogger getInstance(){
		return logger == null ? logger = new CentralLogger() : logger;
	}
	
	public void debug(String msg) {
		debug.debug(msg);
    }

    public void debug(String format, Object... argArray) {
    	debug.debug(format, argArray);
    }
    
    public void info(String msg) {
    	info.info(msg);
    }

    public void info(String format, Object... argArray) {
    	info.info(format, argArray);
    }
    
    public void error(String msg) {
    	error.error(msg);
    }
    
    public void error(String format, Object... argArray) {
    	error.error(format, argArray);
    }
    
    public void exception(Exception ex) {
    	exception.error(null, ex);
    }
    
    public void exception(String msg, Throwable t) {
    	exception.error(msg, t);
    }
    
    public void exception(String format, Object... argArray) {
    	exception.error(format, argArray);
    }
}