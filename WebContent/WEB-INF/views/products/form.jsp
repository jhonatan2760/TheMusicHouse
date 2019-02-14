<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="products/insert" method="POST">
		<div>
			<label>Title</label>
			<input type="text" name="title" />
		</div>
		<div>
			<label>Band</label>
			<input type="text" name="band" />
		</div>
		<div>
			<label>Year</label>
			<input type="text" name="year" />
		</div>
		<div>
			<input type="submit" />
		</div>
	</form>
</body>
</html>