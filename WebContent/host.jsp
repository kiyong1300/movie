<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
		<form action="ticketing.do" method="post">
			<img class="movieinfo" src="/movie/image/The Host.jpg" width=350px height=450px><br>
			<h4>제목 : ${movie.movie_title}</h4>
			<h4>등급 : ${movie.movie_grade}</h4>
			<h4>장르 : ${movie.movie_genre}</h4>
			<h4>러닝타임 : ${movie.movie_runningtime}</h4>
			<h4>줄거리 : ${movie.movie_info}</h4>
			<input type="date" name="date" value="2021-06-15" min="2021-06-15" max="2021-07-16">
			<select name="location" size="1">
				<option value="Yong-San" selected>YCGV 용산점</option>
				<option value="Ori">YCGV 오리점</option>
				<option value="Myeong-Dong">YCGV 명동점</option>
				<option value="Gang-Nam">YCGV 강남점</option>
			</select>
			<input type="hidden" name="job" value="The Host">
			<input type="submit" value="예매하기">
		</form>
	</div>

</div>
<footer>
	<div id="line2"></div>
	<div class="footer"></div>
</footer>
</body>
</html>