<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import ="com.movie.vo.UserVO" %>
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
			String id =(String)session.getAttribute("id");
		%>
			<h3>로그인중인 아이디 : <%=id %></h3>
			<h2><b>정보 변경을 원하시는 부분을 기재하신 후에 변경 버튼을 눌러주세요</b></h2><br>
	<form action="update.do" method="post">
		<input class="login" type="password" name="pwd" placeholder="비밀번호">
		<input class="login" type="text" name="name" placeholder="이름">
		<input class="login" type="email" name="email" placeholder="홍길동@example.com">
		<input class="submit" type="submit" value="변경">
	</form>
	</div>
</div>

<footer>
	<div id="line2"></div>
	<div class="footer"></div>
</footer>
</body>
</html>