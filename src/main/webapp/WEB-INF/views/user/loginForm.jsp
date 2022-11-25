<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp"%>
<div class="container">
	<form>
		<div class="form-group">
			<label for="username">Username address</label> <input type="text" class="form-control" placeholder="Enter username" id="username">
		</div>
		<div class="form-group">
			<label for="password">Password</label> <input type="password" class="form-control" placeholder="Enter password" id="password">
		</div>
		<div class="form-group form-check">
			<label class="form-check-label"> <input class="form-check-input" type="checkbox"> Remember me
			</label>
		</div>
	</form>
	<button type="button" class="btn btn-primary" id="btn-login">로그인</button>
</div>
<script type="text/javascript" src="/blog/js/user.js"></script>
<%@include file="../layout/footer.jsp"%>