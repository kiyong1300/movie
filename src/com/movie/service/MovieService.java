package com.movie.service;

import com.movie.dao.UserDAO;
import com.movie.vo.MovieVO;
import com.movie.vo.UserVO;

public class MovieService {
	private static MovieService service = new MovieService();
	public UserDAO dao = UserDAO.getInstance();
	private MovieService() {}
	
	public static MovieService getInstance() {
		return service;	
	}
	
	public void register(UserVO user) {
		dao.register(user);
	}
	
	public UserVO login(String id, String pwd) {
		UserVO user = dao.login(id, pwd);
		return user;
	}

	public boolean login_check(String id, String pwd) {

		UserVO user = dao.login(id, pwd);
		try {
			user.getId();
			user.getPwd();
			user.getName();
			user.getEmail();
		}catch(NullPointerException e) {
			return false;
		}
		if(user.getId().equals(id) && user.getPwd().equals(pwd)) {
			return true;
			}else{
			return false;
		}
	}

	public void update(UserVO user) {
		dao.update(user);
		
	}

	public MovieVO movieSearch(String id) {
		MovieVO movie = dao.movieSearch(id);
			return movie;
	}

	public void ticketing(MovieVO movie) {
		dao.ticketing(movie);
		
	}

	public MovieVO checkhistory(String id) {
		MovieVO movie = dao.checkhistory(id);
		return movie;
	}

		
}		




