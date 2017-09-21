<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/tag" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link href="/css/style.css" rel="stylesheet">
</head>
<body>
<div class="container">
	<h1><tag:rating value="3" click="checkStar" name="ratingName" hover="hoverStar"/></h1>
</div>
</body>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="/js/main.js"></script>
<script>

	var checkStar = function(next) {
		console.log('클릭된거', next);
		console.log('인풋으로부터 읽기', $("input[name='ratingName']").val());
	}
	
	var hoverStar = function(starNum) {
		console.log('hover', starNum);
	}
	
</script>
</html>