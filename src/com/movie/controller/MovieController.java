package com.movie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.service.MovieService;
import com.movie.vo.MovieVO;

public class MovieController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String job = request.getParameter("job");
		String path = null;
		
		if(job.equals("HP1")) 
			path = "/HP1.jsp";
		else if(job.equals("FF9"))
			path = "/FF9.jsp";
		else if(job.equals("host"))
			path = "/host.jsp";
		else if(job.equals("aladdin"))
			path = "/aladdin.jsp";
		
		MovieService service = MovieService.getInstance();
		MovieVO movie = service.movieSearch(job);
		
		request.setAttribute("movie", movie);
		HttpUtil.forward(request, response, path);

	}

}
