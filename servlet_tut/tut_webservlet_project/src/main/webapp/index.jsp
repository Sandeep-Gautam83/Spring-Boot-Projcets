<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Index Page</title>
<!-- Link to the CSS file (adjust path if needed) -->
<link rel="stylesheet"
	href=" <%=application.getContextPath()%>/css/style.css " />
</head>
<body>
	<div class="container">
		<%@include file="menu.jsp"%>

		<h1>Welcome to the Servlet Crash Course</h1>
		<p>This is a very informative video about servlets.</p>


		<form action="<%=application.getContextPath()%>/third" method="post">
		
		<input name="message" type ="text " placeholder="enter text here"/>
			<button type="submit">Submit</button>
		</form>

	</div>

	<!-- Link to the JavaScript file (corrected attribute name) -->
	<script src="<%=request.getContextPath()%>/js/script.js"></script>

</body>
</html>
