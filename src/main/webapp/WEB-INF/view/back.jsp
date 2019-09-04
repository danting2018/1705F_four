<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/css.css" rel="stylesheet">
<script type="text/javascript" src="css/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	function aa() {
		$("form").submit();
	
	}
</script>
</head>
<body>
<form action="xiugaimovie" method="post">
<table>
	<tr>
		<td>影片名</td>
		<td>
			<input type="hidden" name="mid" value="${movie.mid }">
			<input type="text" name="mname" value="${movie.mname }">
		</td>
	</tr>
	<tr>
		<td>导演</td>
		<td>
			<input type="text" name="author" value="${movie.author }">
		</td>
	</tr>
	<tr>
		<td>票价</td>
		<td>
			<input type="text" name="price" value="${movie.price }">
		</td>
	</tr>
	<tr>
		<td>上映时间</td>
		<td>
			<input type="text" name="uptime" value="${movie.uptime }">
		</td>
	</tr>
	<tr>
		<td>时长</td>
		<td>
			<input type="text" name="longtime" value="${movie.longtime }">
		</td>
	</tr>
	<tr>
		<td>类型</td>
		<td>
			<input type="text" name="type" value="${movie.type }">
		</td>
	</tr>
	<tr>
		<td>年代</td>
		<td>
			<input type="text" name="year" value="${movie.year }">
		</td>
	</tr>
	<tr>
		<td>区域</td>
		<td>
			<input type="text" name="area" value="${movie.area }">
		</td>
	</tr>
	
	<tr>
		<td colspan="2">
			<input type="button" value="修改" onclick="aa()">
		</td>
	</tr>
</table>
</form>
</body>
</html>