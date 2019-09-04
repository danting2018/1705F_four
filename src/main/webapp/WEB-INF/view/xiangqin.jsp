<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/css.css" rel="stylesheet">
</head>
<body>
<table>
	<tr>
		<td>影片名</td>
		<td>
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
		<td>状态</td>
		<td>
			<input type="text" name="status" value="${movie.status==0?'正在热映':movie.status==1?'已经下架':'即将上映'}">
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<a href="list">返回</a>
		</td>
	</tr>
</table>
</body>
</html>