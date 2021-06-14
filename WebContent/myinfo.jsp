<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	<div class="main">slide
		<h3>개인정보 수정을 위하여 비밀번호를 한번 더 입력해주세요</h3>
		<%
			String id =(String)session.getAttribute("id");
		%>
			회원 아이디 :<%=id %>
		<form action="myinfo.do" method="post">
			회원 비밀번호 : <input type="password" name="pwd">
			<input type="submit" value="확인">
		</form>
	</div>
</div>

<footer>
	<div id="line2"></div>
	<div class="footer"></div>
</footer>

</body>
</html>