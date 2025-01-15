<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Feedback Application</title>

    <!-- Including the links.jsp file for CSS and other links -->
    <%@ include file="links.jsp" %>
</head>
<body>
    <!-- Including the header.jsp file for the header -->
    <%@ include file="header.jsp" %>

    <!-- Main Content Section -->
    <div class="content_container py-4 d-flex flex-column justify-content-center align-items-center" style="min-height: 80vh;">

        <!-- Dynamic Title -->
        <div class="text-center mb-4">
            <h2>Feedback Application Navigation</h2>
        </div>

        <!-- Button to navigate to the feedback page -->
        <a href="<%= application.getContextPath() %>/feedback.jsp"
           class="btn btn-light mb-3" aria-label="Navigate to the feedback page">
            Give Us Feedback
        </a>

        <!-- Button to navigate to Servlet 1 -->
        <a href="<%= application.getContextPath() %>/servlet1"
           class="btn btn-light mb-3" aria-label="Navigate to Servlet 1">
            Go to Servlet 1
        </a>

        <!-- Button to navigate to Servlet 2 -->
        <a href="<%= application.getContextPath() %>/servlet2"
           class="btn btn-light" aria-label="Navigate to Servlet 2">
            Go to Servlet 2
        </a>
    </div>

    <!-- Including the script.jsp file for JS and other scripts -->
    <%@ include file="script.jsp" %>
</body>
</html>
