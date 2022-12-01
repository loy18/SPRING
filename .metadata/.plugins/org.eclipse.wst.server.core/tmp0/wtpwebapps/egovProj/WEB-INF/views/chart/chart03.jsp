<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="/resources/js/jquery-3.6.0.js"></script>
<!DOCTYPE html>
<html>
<head>
<title>제이쿼리로 동적으로 생성된 버튼에 이벤트를 달아보자</title>
<script type="text/javascript">
$(function(){
	$("#firstButton").on("click",function(e){
		let bodyHtml = "<button type='button' id='secondButton'>두 번째 버튼(동적생성)</button>";		
		//mainDiv 마지막 요소로 추가
		$("#mainDiv").append(bodyHtml);
	});
	
	//두 번째 버튼 이벤트
	//두 번째 버튼을 클릭하면 alert("개똥이"); 를 처리해보자
// 	$("#secondButton").on("click",function(){
// 		alert("개똥이");
// 	})
		$(document).on("click","#secondButton",function(){
			alert("개똥이");
		});
});
</script>
</head>
<body>
	<div id="mainDiv">
		<button type="button" id="firstButton">첫 번째 버튼</button>
	</div>
</body>
</html>