<%-- 
    Document   : index
    Created on : 17-mrt-2016, 11:40:33
    Author     : Max
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>

        <div>
            <form action="Login" method="POST">
                <div>Username:</div>
                <input type="text" name="username"> <br/>
                <div>Password:</div>
                <input type="text" name="password"> <br/>
        </div>
        <div>
            <input type="submit" value="Login">
        </div>
    </form>
</body>
</html>
