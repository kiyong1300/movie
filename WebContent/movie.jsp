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
			<form id="m1" action="movie.do" method="post">
			<img class="mainmovie" src="/movie/image/Harry Potter And The Sorcerer's Stone.jpg" width=250px height=350px><br>
			<b>해리포터와 마법사의 돌</b>
			<input type="submit" value="예매하기">
			<input type="hidden" name="job" value="HP1">
			</form>
			
			<form id="m2" action="movie.do" method="post">
			<img class="mainmovie" src="/movie/image/Fast & Furious 9 THE FAST SAGA.jpg" width=250px height=350px><br>
			<b>분노의질주 더 얼티메이트</b>
			<input type="hidden" name="job" value="FF9">
			<input type="submit" value="예매하기">
			</form>
			
			<form id="m1" action="movie.do" method="post">
			<img class="mainmovie" src="/movie/image/The Host.jpg" width=250px height=350px><br>
			<b>괴물</b>
			<input type="hidden" name="job" value="host">
			<input type="submit" value="예매하기">
			</form>
			
			<form id="m2" action="movie.do" method="post">
			<img class="mainmovie" src="/movie/image/Aladdin.jpg" width=250px height=350px><br>
			<b>알라딘</b>
			<input type="hidden" name="job" value="aladdin">
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