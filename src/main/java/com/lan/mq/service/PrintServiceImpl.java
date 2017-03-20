package com.lan.mq.service;

import org.springframework.stereotype.Service;

@Service
public class PrintServiceImpl implements PrintService {

	public int x;
	
	@Override
	public void hello() {
		System.out.println("hello");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public void x(Integer x) {
		setX(x);
	}

	@Override
	public String toString() {
		return "PrintServiceImpl [x=" + x + ", getX()=" + getX() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
