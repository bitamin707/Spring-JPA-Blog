let index = {
	init:function() {
		$("#btn-save").on("click", ()=> {
			this.save();
		});
		
		$("#btn-update").on("click", ()=> {
			this.update();
		});
	},
	
	save:function() {
		//alert('user의 save함수 호출');
		let data = {
			username:$("#username").val(),
			password:$("#password").val(),
			email:$("#email").val()
		};
		
		$.ajax({
			//회원가입 수행 요청
			type:"POST",
			url:"/auth/joinProc",
			data:JSON.stringify(data), //http body 데이터
			contentType:"application/json; charset=utf-8", //body 데이터가 어떤 타입인지
			dataType:"json"
		}).done(function(resp) {
			console.log(resp);
			alert("회원가입 완료");
			location.href="/";
		}).fail(function(error) {
			alert(JSON.stringify(error));
		}); 
	},
	
	update:function() {
		//alert('user의 save함수 호출');
		let data = {
			id:$("#id").val(),
			username:$("#username").val(),
			password:$("#password").val(),
			email:$("#email").val()
		};
		
		$.ajax({
			//회원정보 수정 수행 요청
			type:"PUT",
			url:"/user",
			data:JSON.stringify(data), //http body 데이터
			contentType:"application/json; charset=utf-8", //body 데이터가 어떤 타입인지
			dataType:"json"
		}).done(function(resp) {
			console.log(resp);
			alert("회원 수정 완료");
			location.href="/";
		}).fail(function(error) {
			alert(JSON.stringify(error));
		}); 
	}
}

index.init();