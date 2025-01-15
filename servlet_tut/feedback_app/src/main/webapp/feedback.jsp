<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Feedback Form</title>

    <%@ include file="links.jsp" %>
</head>
<body>
    <%@ include file="header.jsp" %>

    <div class="content_container py-4 d-flex flex-column justify-content-center align-items-center">

        <h3 class="text-white">Fill the Feedback Form</h3>

        <form action="<%= application.getContextPath() %>/feedback" method="post" class="mt-3 text-white">
            <!-- Email Field -->
            <div class="mb-3">
                <label for="email" class="form-label">Email address</label>
                <input name="email" type="email" class="form-control" id="email" placeholder="Enter your email" required>
                <div id="emailHelp" class="form-text text-white">We'll never share your email with anyone else.</div>
            </div>

            <!-- Phone Number Field -->
            <div class="mb-3">
                <label for="phone" class="form-label">Phone number</label>
                <input name="phone" type="tel" class="form-control" id="phone" placeholder="Enter your phone number" required>
            </div>

            <!-- Feedback Message -->
            <div class="mb-3">
                <label for="feedback_message" class="form-label">Your Feedback Message</label>
                <textarea name="feedback_message" rows="5" placeholder="Enter your feedback here" class="form-control" id="feedback_message" required></textarea>
            </div>

            <!-- Submit and Reset Buttons -->
            <div class="container text-center">
                <button type="submit" class="btn btn-warning">Submit</button>
                <button type="reset" class="btn btn-light">Clear Form</button>
            </div>
        </form>

    </div>

    <%@ include file="script.jsp" %>
</body>
</html>
