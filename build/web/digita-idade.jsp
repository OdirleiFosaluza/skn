<%-- 
    Document   : digita-idade.jsp
    Created on : 15/11/2016, 12:21:20
    Author     : Odirlei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Digite sua idade e aperte o botão</h1>
        <form action="mostra-idade.jsp">
            <label for="idade">Idade:</label>
            <input type="text" class="form-control" name="idade" id="idade"  />
            <input type="submit" >
        </form>
    </body>
</html>
