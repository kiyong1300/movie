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
		<h3>${id }님, 회원가입을 환영합니다.</h3><br>
		<h2><a href="main.jsp">홈 화면으로 돌아가기</a><br></h2>
	</div>
</div>

<footer>
	<div id="line2"></div>
	<div class="footer"></div>
</footer>

</body>
</html>