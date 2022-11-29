let index = {
	init:function() {
		$("#btn-board-save").on("click", ()=> {
			this.save();
		});
	},
	
	save:function() {
		let data = {
			title:$("#title").val(),
			content:$("#content").val(),
		};
		
		$.ajax({
			//글쓰기 수행 요청
			type:"POST",
			url:"/api/board",
			data:JSON.stringify(data), //http body 데이터
			contentType:"application/json; charset=utf-8", //body 데이터가 어떤 타입인지
			dataType:"json"
		}).done(function() {
			alert("글쓰기 완료");
			location.href="/";
		}).fail(function(error) {
			alert(JSON.stringify(error));
		}); 
	}
}

index.init();