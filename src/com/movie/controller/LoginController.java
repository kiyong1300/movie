package com.movie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.movie.service.MovieService;



public class LoginController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {

		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String path = null;
		Boolean user = null;
		
		MovieService service = MovieService.getInstance();
		user = service.login_check(id, pwd);

		if(user == true)
			path="/result/loginSuccess.jsp";
		else {
			JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 확인해주세요");
			response.sendRedirect("login.jsp");
		}
		HttpSession session = request.getSession();	
		session.setAttribute("id", id);
		HttpUtil.forward(request, response, path);
		

	}			
}
		



