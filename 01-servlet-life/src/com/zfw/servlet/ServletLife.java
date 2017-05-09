package com.zfw.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletLife implements Servlet {

	
	public ServletLife() {
		System.out.println("ServletLife's constructor methed");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("ServletLife's init methed");

	}
	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ServletLife's service methed");
		System.out.println(toString());
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String toString() {
		return "ServletLife [getServletConfig()=" + getServletConfig()
				+ ", getServletInfo()=" + getServletInfo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("ServletLife's destroy methed");

	}

}
