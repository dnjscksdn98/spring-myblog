<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${detail_view.getTitle()}</title>
</head>
<body>

	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<form action="update" method="post">
			<input type="hidden" name="id" value="${detail_view.getId()}">
			<tr>
				<td>#</td>
				<td>${detail_view.getId()}</td>
			</tr>
			<tr>
				<td>Views</td>
				<td>${detail_view.getViews()}</td>
			</tr>
			<tr>
				<td>Writer</td>
				<td><input type="text" name="writer" value="${detail_view.getWriter()}"></td>
			</tr>
			<tr>
				<td>Title</td>
				<td><input type="text" name="title" value="${detail_view.getTitle()}"></td>
			</tr>
			<tr>
				<td>Content</td>
				<td><textarea rows="10" name="content" >${detail_view.getContent()}</textarea></td>
			</tr>
			<tr>
				<td colspan="2"> 
					<input type="submit" value="Update"> &nbsp;&nbsp; 
					<a href="list">Article List</a> &nbsp;&nbsp; 
					<a href="delete?id=${detail_view.getId()}">Delete</a> &nbsp;&nbsp; 
			</tr>
		</form>
	</table>
	
</body>
</html>