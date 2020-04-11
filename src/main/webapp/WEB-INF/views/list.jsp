<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Myblog</title>
	</head>
	<body>
		
		<table width="500" cellpadding="0" cellspacing="0" border="1">
			<tr>
				<td>#</td>
				<td>Writer</td>
				<td>Title</td>
				<td>Registered date</td>
				<td>Views</td>
			</tr>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.getId()}</td>
					<td>${dto.getWriter()}</td>
					<td>
						<a href="detail_view.jsp?id=${dto.getId()}">
							${dto.getTitle()}
						</a>
					</td>
					<td>${dto.getRdate()}</td>
					<td>${dto.getViews()}</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="5">
					<a href="write_view">write a new article</a>
				</td>
			</tr>
		</table>
		
	</body>
</html>