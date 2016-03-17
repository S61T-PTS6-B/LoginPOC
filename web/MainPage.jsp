<%-- 
    Document   : MainPage
    Created on : 17-mrt-2016, 12:05:33
    Author     : Max
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello <% out.println(request.getAttribute("username")); %>!</h1>
    </body>
</html>
