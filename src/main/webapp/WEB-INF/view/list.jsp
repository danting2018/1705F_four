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
	var orderMethod ='${movieVO.orderMethod=="asc"?"desc":"asc"}';
	function myOrder(orderColumn){
		location="list?orderColumn="+orderColumn+"&orderMethod="+orderMethod+"&"+$("#form1").serialize();
	}
</script>

</head>
<body>
<form action="list" method="post" id="form1">
	电影名称:<input type="text" name="mname" value="${movievo.mname}">
	导演:<input type="text" name="author" value="${movievo.author}">
	电影年代:<input type="text" name="year" value="${movievo.year}"><br>
	上映时间:<input type="text" name="uptimestart" value="${movievo.uptimestart}"> -- <input type="text" name="uptimeend" value="${movievo.uptimeend}">
	价格:<input type="text" name="price1" value="${movievo.price1}"> -- <input type="text" name="price2" value="${movievo.price2}"><br>
	价格:<input type="text" name="longtimestart" value="${movievo.longtimestart}"> -- <input type="text" name="longtimeend" value="${movievo.longtimeend}">
	<input type="submit" value="查询">
</form>
<table>
	<tr>
		<td>
			<input type="checkbox">
		</td>
		<td>电影名称</td>
		<td>导演</td>
		<td><a href="javascript:myOrder('price')">价格</a></td>
		<td><a href="javascript:myOrder('uptime')">上架时间</a></td>
		<td><a href="javascript:myOrder('longtime')">时长</a></td>
		<td>类型</td>
		<td>年代</td>
		<td>区域</td>
		<td>状态</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${list}" var="l">
		<tr>
			<td>
				<input type="checkbox">
			</td>
			<td>${l.mname}</td>
			<td>${l.author}</td>
			<td>${l.price}</td>
			<td>${l.uptime}</td>
			<td>${l.longtime}</td>
			<td>${l.type}</td>
			<td>${l.year}</td>
			<td>${l.area}</td>
			<td>
				<c:if test="${l.status==0 }">
					正在热映
				</c:if>
				<c:if test="${l.status==1 }">
					已经下架
				</c:if>
				<c:if test="${l.status==2 }">
					即将上映
				</c:if>
			</td>
			<td>
				<a href="xiangqin?id=${l.mid}">详情</a>&nbsp;&nbsp;|&nbsp;
				<a href="updatemovie?id=${l.mid}">编辑</a>&nbsp;&nbsp;|&nbsp;
				<a href="updatemovie?id=${l.mid}">下架</a>
			</td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="15">
			当前页${info.pageNum}/${info.pages},共${info.total }条数据
			<a href="list?pageNum=2">首页</a>
			<a href="list?pageNum=${info.prePage }">上一页</a>
			<a href="list?pageNum=${info.nextPage }">下一页</a>
			<a href="list?pageNum=${info.pages }">尾页</a>
		</td>
	</tr>
			
</table>
</body>
</html>