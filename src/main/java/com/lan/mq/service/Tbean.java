package com.lan.mq.service;

import java.io.Serializable;

public class Tbean implements Serializable{

	private static final long serialVersionUID = -812984013963362095L;

	private Class<?> c;
	
	private String method;
	
	public static Tbean of(){
		return new Tbean();
	}

	public Class<?> getC() {
		return c;
	}

	public Tbean setC(Class<?> c) {
		this.c = c;
		return this;
	}

	public String getMethod() {
		return method;
	}

	public Tbean setMethod(String method) {
		this.method = method;
		return this;
	}
	
}
