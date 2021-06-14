package com.movie.controller;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class FrontController extends HttpServlet {
	HashMap<String, Controller> list = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		list = new HashMap<String, Controller>();
		list.put("/register.do", new RegisterController());
		list.put("/login.do", new LoginController());
		list.put("/myinfo.do", new MyinfoController());
		list.put("/update.do", new UpdateController());
		list.put("/movie.do", new MovieController());
		list.put("/ticketing.do", new TicektingController());
		list.put("/checkhistory.do", new CheckHistoryController());
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String contextP = req.getContextPath();
		String url = req.getRequestURI();
		String path = url.substring(contextP.length());
		Controller subController = list.get(path);
		subController.execute(req, resp);
	}

}