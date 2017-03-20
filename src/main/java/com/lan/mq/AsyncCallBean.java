package com.lan.mq;

import java.io.Serializable;

public class AsyncCallBean implements Serializable{

	private static final long serialVersionUID = 8768018331093955910L;

	private Class<?> clazz;		//目标类类型
	
	private String methodName;	//要调用的方法名
	
	private Class<?>[] paramTypes;	//方法参数类型列表
	
	private Object[] paramList;	//方法参数列表
	
	private AsyncCallBean(){};
	
	public static AsyncCallBean of(){
		return new AsyncCallBean();
	}

	public Class<?> getClazz() {
		return clazz;
	}

	public AsyncCallBean setClazz(Class<?> clazz) {
		this.clazz = clazz;
		return this;
	}

	public String getMethodName() {
		return methodName;
	}

	public AsyncCallBean setMethodName(String methodName) {
		this.methodName = methodName;
		return this;
	}

	public Class<?>[] getParamTypes() {
		return paramTypes == null ? new Class<?>[]{} : paramTypes;
	}

	public AsyncCallBean setParamTypes(Class<?> ...paramTypes) {
		this.paramTypes = paramTypes;
		return this;
	}

	public Object[] getParamList() {
		return paramList == null ? new Object[]{} : paramList;
	}

	public AsyncCallBean setParamList(Object ...paramList) {
		this.paramList = paramList;
		return this;
	}
	
}
