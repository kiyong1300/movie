package com.movie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.movie.service.MovieService;
import com.movie.vo.UserVO;

public class UpdateController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String id =(String)session.getAttribute("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		UserVO user = new UserVO();
		user.setId(id);
		user.setPwd(pwd);
		user.setName(name);
		user.setEmail(email);
		
		MovieService service = MovieService.getInstance();
		service.update(user);
		
		request.setAttribute("id", id);
		HttpUtil.forward(request, response, "/result/updateOutput.jsp");

	}

}
