package com.movie.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.movie.service.MovieService;
import com.movie.vo.MovieVO;


public class TicektingController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		HttpSession session = request.getSession();
	
		
		String id =(String)session.getAttribute("id");
		String job = request.getParameter("job");
		String date = request.getParameter("date");
		String location = request.getParameter("location");
		

		MovieVO movie = new MovieVO();
		movie.setId(id);
		movie.setMovie_title(job);
		movie.setDate(date);
		movie.setLocation(location);
		
		MovieService service = MovieService.getInstance();
		service.ticketing(movie);
		
		HttpUtil.forward(request, response, "/result/ticketingOutput.jsp");
		
	}

}
