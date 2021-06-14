package com.movie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.movie.service.MovieService;

public class MyinfoController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String id =(String)session.getAttribute("id");
		String pwd = request.getParameter("pwd");
		String path = null;
		Boolean user = null;
		
		MovieService service = MovieService.getInstance();
		user = service.login_check(id, pwd);

		
		if(user == true)
			path="update.jsp";
			else {
				JOptionPane.showMessageDialog(null, "비밀번호를 확인해주세요");
				response.sendRedirect("myinfo.jsp");
			}
		HttpUtil.forward(request, response, path);
		
	}

}
