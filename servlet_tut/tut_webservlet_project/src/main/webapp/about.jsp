<!DOCTYPE html>
<html lang="en">
<head>
<body>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Basic HTML Page">
    <title>About page</title>
    <link rel = "stylesheet" href =" <%= application.getContextPath() %>/css/style.css " />
</head>

<div class = "container">
<%@include file="menu.jsp" %>

<h1>
welcome to about page.
</h1>
<p>This is very information video about servlet </p>
 <!-- Link to the JavaScript file (corrected attribute name) -->
    <script src="<%= request.getContextPath() %>/js/script.js"></script>
</div>   
</body>
</html>