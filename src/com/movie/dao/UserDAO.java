package com.movie.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.movie.vo.MovieVO;
import com.movie.vo.UserVO;

public class UserDAO {
	private static UserDAO dao = new UserDAO();
	private UserDAO() {}
	public static UserDAO getInstance() {
		return dao;
	}
	
	private Connection connect() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/movie?serverTimezone=UTC";
			conn = DriverManager.getConnection(url,"root","Kidragon!13");
		}catch(Exception e) {
			System.out.print("connect error" + e);
		}
		return conn;
	}  
	
	public void close(Connection conn, PreparedStatement pstmt) {
		if(pstmt != null) {
			try {
			pstmt.close();	
			}catch(Exception e) {
				System.out.print("pstmt close error"+e);
			}
		}
		if(conn != null) {
			try {
				conn.close();
			}catch(Exception e) {
				System.out.print("conn close error"+e);
			}
		}
	}
	
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			}catch(Exception e){
				System.out.print("rs close error" + e);
			}
		}
		close(conn,pstmt);
	}
	
	public void register(UserVO user) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = connect();
			pstmt = conn.prepareStatement("insert into user values(?,?,?,?);");
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPwd());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getEmail());
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			System.out.print("register error" + e);
		}finally {
			close(conn,pstmt);                         
		}
		
	}
	
	public UserVO login(String id, String pwd) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserVO user = null;
		try {
			conn = connect();
			pstmt=conn.prepareStatement("select * from user where id=? and pwd=?;");
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				user = new UserVO();
				user.setId(rs.getString(1));
				user.setPwd(rs.getString(2));
			}			
		}catch(Exception e){
			System.out.print("login error" + e);
		}finally{
			close(conn,pstmt,rs);
		}
		return user;
	}
	
	public void update(UserVO user) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("update user set pwd=?, name=?, email=? where id=?;");
			pstmt.setString(1, user.getPwd());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getId());
			pstmt.executeUpdate();
		}catch(Exception e)
		{
			System.out.print("update error"+e);
		}finally {
			close(conn,pstmt);}
		
	}
	
	public MovieVO movieSearch(String job) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MovieVO movie = null;
		try {
			conn = connect();
			pstmt=conn.prepareStatement("select * from movie where id=?;");
			pstmt.setString(1, job);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				movie = new MovieVO();
				movie.setMovie_title(rs.getString(2));
				movie.setMovie_grade(rs.getString(3));
				movie.setMovie_genre(rs.getString(4));
				movie.setMovie_runningtime(rs.getString(5));
				movie.setMovie_info(rs.getString(6));
			}			
		}catch(Exception e){
			System.out.print("movieSearch error" + e);
		}finally{
			close(conn,pstmt,rs);
		}
		return movie;
	}
	
	public void ticketing(MovieVO movie) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = connect();
			pstmt = conn.prepareStatement("insert into history values(?,?,?,?);");
			pstmt.setString(1, movie.getId());
			pstmt.setString(2, movie.getMovie_title());
			pstmt.setString(3, movie.getDate());
			pstmt.setString(4, movie.getLocation());
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			System.out.print("ticketing error" + e);
		}finally {
			close(conn,pstmt);                         
		}
		
	}
	public MovieVO checkhistory(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MovieVO movie = null;
		try {
			conn = connect();
			pstmt=conn.prepareStatement("select * from history where id=?;");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				movie = new MovieVO();
				movie.setId(rs.getString(1));
				movie.setMovie_title(rs.getString(2));
				movie.setDate(rs.getString(3));
				movie.setLocation(rs.getString(4));
			}			
		}catch(Exception e){
			System.out.print("checkhistory error" + e);
		}finally{
			close(conn,pstmt,rs);
		}
		return movie;
	}
	
}
	
	
