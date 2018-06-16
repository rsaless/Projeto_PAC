<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String current = new java.io.File( "." ).getCanonicalPath(); %>
        <p>Current dir: <%= current %></p>       
    </body>
</html>
