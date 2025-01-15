<nav class="navbar navbar-expand-lg bg-dark navbar-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="<%= application.getContextPath() %>/index.jsp">Feedback Application</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="<%= application.getContextPath() %>/index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="<%= application.getContextPath() %>/about.jsp" aria-label="About Page">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="#" aria-disabled="true" aria-label="Services are currently unavailable">Services</a>
                </li>
            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-light" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>
