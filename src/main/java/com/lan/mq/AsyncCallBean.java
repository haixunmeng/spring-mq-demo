package com.lan.mq;

import java.io.Serializable;
import java.util.Arrays;

public class AsyncCallBean implements Serializable{

	private static final long serialVersionUID = 8768018331093955910L;

	private Class<?> clazz;		//鐩爣绫荤被鍨�
	
	private String methodName;	//瑕佽皟鐢ㄧ殑鏂规硶鍚�
	
	private Class<?>[] paramTypes;	//鏂规硶鍙傛暟绫诲瀷鍒楄〃
	
	private Object[] paramList;	//鏂规硶鍙傛暟鍒楄〃
	
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

	@Override
	public String toString() {
		return "AsyncCallBean [clazz=" + clazz + ", methodName=" + methodName + ", paramTypes="
				+ Arrays.toString(paramTypes) + ", paramList=" + Arrays.toString(paramList) + "]";
	}
	
}
