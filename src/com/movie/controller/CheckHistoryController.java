package com.movie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.movie.service.MovieService;
import com.movie.vo.MovieVO;

public class CheckHistoryController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String id =(String)session.getAttribute("id");
		String path = null;
		
		MovieService service = MovieService.getInstance();
		MovieVO movie = service.checkhistory(id);
		
		if(id != null) 
			path= "/result/checkHistoryOutput.jsp";
		else {
			JOptionPane.showMessageDialog(null, "확인 가능한 예매 정보가 없습니다.");
			response.sendRedirect("main.jsp");
		
		}
		request.setAttribute("movie", movie);
		HttpUtil.forward(request, response, path);

	}

}
