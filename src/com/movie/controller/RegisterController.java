package com.movie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.service.MovieService;
import com.movie.vo.UserVO;

public class RegisterController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		UserVO user = new UserVO();
		user.setId(id);
		user.setPwd(pwd);
		user.setName(name);
		user.setEmail(email);
		
		
		MovieService service = MovieService.getInstance();
		service.register(user);
		
		request.setAttribute("id", id);
		HttpUtil.forward(request, response, "/result/registerOutput.jsp");
		}
	}


