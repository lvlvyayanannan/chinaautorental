package com.chinaautorental.filter;

import com.chinaautorental.util.Constants;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter{

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest)servletRequest;
		Object user = request.getSession().getAttribute(Constants.USER_LOGIN_KEY);
		if(user != null){
			chain.doFilter(servletRequest, servletResponse);
		}else{
			HttpServletResponse response = (HttpServletResponse)servletResponse;
			String contextPath = request.getSession().getServletContext().getContextPath();
			response.sendRedirect(contextPath+"/login.html");
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}
	
}
