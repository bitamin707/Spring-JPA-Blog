<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp"%>
<div class="container">
	<form action="/auth/loginProc" method="POST">
		<div class="form-group">
			<label for="username">Username</label> <input type="text" class="form-control" placeholder="Enter username" id="username" name="username">
		</div>
		<div class="form-group">
			<label for="password">Password</label> <input type="password" class="form-control" placeholder="Enter password" id="password" name="password">
		</div>
		<button type="submit" class="btn btn-primary" id="btn-login">로그인</button>
		<a href="https://kauth.kakao.com/oauth/authorize?client_id=3e03ab97768954c9b62b3807def2ef55&redirect_uri=http://localhost:8000/auth/kakao/callback&response_type=code">
			<img src="/image/kakao_login_button.png" height="38px">
		</a>
	</form>
</div>
<%@include file="../layout/footer.jsp"%>