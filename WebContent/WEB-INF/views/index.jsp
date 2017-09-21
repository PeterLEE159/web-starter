<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="ct" uri="http://www.jhta.co.kr/tags/ct" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link href="/css/style.css" rel="stylesheet">
</head>
<body>
<div class="container">
	<h1><ct:rating point="3.5" id="rating" click="starCheck"/></h1>
</div>
</body>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="/js/main.js"></script>
<script>

	var starCheck = function(next, pre) {
		
	}
</script>
</html>