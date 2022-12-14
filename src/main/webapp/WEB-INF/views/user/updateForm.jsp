<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp"%>
<div class="container">
	<form>
		<input type="hidden" id="id" value="${principal.user.id }">
 		<div class="form-group">
			<label for="username">Username</label> 
			<input type="text" class="form-control" placeholder="Enter username" id="username" value="${principal.user.username }" readonly>
		</div>
		<div class="form-group">
			<label for="password">Password</label> 
			<input type="password" class="form-control" placeholder="Enter password" id="password">
		</div>
		<div class="form-group">
			<label for="email">Email</label> 
			<input type="email" class="form-control" placeholder="Enter email" id="email" value="${principal.user.email }">
		</div>
	</form>
	<button type="button" class="btn btn-primary" id="btn-update">수정완료</button>
</div>
<script type="text/javascript" src="/js/user.js"></script>
<%@include file="../layout/footer.jsp"%>