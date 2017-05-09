package com.zfw.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AServlet implements Servlet {

	private ServletConfig config = null;

	@Override
	public void init(ServletConfig config) throws ServletException {

		this.config = config;
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();

		ServletConfig config = getServletConfig();
		out.print("<h1>测试getInitParameter(String string)</h1>");
		String Driver = config.getInitParameter("Driver");
		String url = config.getInitParameter("url");
		String user = config.getInitParameter("user");
		String password = config.getInitParameter("password");
		out.print(Driver+"<br>");
		out.print(url+"<br>");
		out.print(user+"<br>");
		out.print(password+"<br>");

		
		Enumeration<String> names = config.getInitParameterNames();
		out.print("<h1>测试getInitParameterNames()</h1>");
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			String value = config.getInitParameter(name);
			out.print(name+"="+value);
			out.print("<br>");
		}
		
		
		out.print("<h1>测试getServletName()</h1>");
		String ServletName = config.getServletName().toString();
		out.print(ServletName);
		
		
		out.print("<h1>测试getServletContext()</h1>");
		ServletContext servletContext = config.getServletContext();
		out.print(servletContext);
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
