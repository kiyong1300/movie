<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "java.io.PrintWriter" %>
<!DOCTYPE html>
<%@page import="com.movie.vo.MovieVO" %>
<html>
<head>
<meta charset="UTF-8">
<title>YCGV</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<div id="sideground">
	<header>
	<div class="header">
		<div><a href="main.jsp"><img class="logo" src="image/logo.jpg"></a></div>
	</div>
</header>
</div>
<div id="side">
	<ul>
	  <li><a href="movie.jsp">상영중인 영화</a></li>
	  <li><a href="checkhistory.do">예매내역 확인</a></li>
	  <li class="dropdown">
	    <a class="dropbtn">내 정보</a>
	    <div class="dropdown-content">
	      <a href="login.jsp">로그인</a>
	      <a href="register.jsp">회원가입</a>
	      <a href="update.jsp">내 정보 변경</a>
	    </div>
	  </li>
	</ul>
	<div class="main">
		<%
			MovieVO movie = (MovieVO)request.getAttribute("movie");
			String id = movie.getId();
			String title = movie.getMovie_title();
			String date = movie.getDate();
			String location = movie.getLocation();
		%>
	
		
		<img class="movieinfo" src="/movie/image/<%=title %>.jpg">
		<h4><%= id %>님의 예매내역입니다.<br></h4>
		<h4>영화 제목 : <%= title %><br></h4>
		<h4>상영일자 : <%=date %><br></h4>
		<h4>극장 위치 : <%=location %><br></h4>
			
	</div>
</div>

<footer>
	<div id="line2"></div>
	<div class="footer"></div>
</footer>

</body>
</html>