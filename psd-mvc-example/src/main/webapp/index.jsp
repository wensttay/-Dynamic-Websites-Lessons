<%-- 
    Document   : index
    Created on : 26/04/2016, 03:10:15
    Author     : Wensttay de Sousa Alencar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="Author" content="Wensttay de Sousa Alencar">
    </head>
    <body>
        <h1>TestApllicationControll</h1>
        <form action="front?command=TestApllicationControll" method="post">
            <label>Seu nome:</label> <input name="nome" type="text">
            <input type="submit" value="Enviar">
        </form>
        
        <h1>OtherApllicationControll</h1>
        <form action="front?command=OtherApllicationControll" method="post">
            <label>Seu nome:</label> <input name="nome" type="text">
            <input type="submit" value="Enviar">
        </form>
    </body> 
</html>
