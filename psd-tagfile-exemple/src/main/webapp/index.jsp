<%-- 
    Document   : index
    Created on : 26/04/2016, 03:10:15
    Author     : Wensttay de Sousa Alencar
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="tf" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="tld" uri="MyFunctions" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
        <!--Testando printar conteudo sem tag-->
        <tf:tagfile begin="1" end="10">
            Circo de soled
        </tf:tagfile>
        <!--Fim testando-->    

        <!--Testando import com SkipPage-->
        <c:import url="newjsp.jsp"/>
        <!--Fim testando-->


        <!--Testando Ordenar lista Salvando Valores MAX e MIN-->
        <%
            List<Integer> list = new ArrayList<Integer>() {
                {
                    add(13);
                    add(12);
                    add(11);
                    add(10);
                    add(9);
                    add(1);
                    add(2);
                    add(3);
                    add(4);
                    add(5);
                    add(6);
                    add(7);
                    add(8);
                }
            };
            pageContext.setAttribute("list", list);
        %>
        <tld:Ordene max="max" min="min" listToSort="${list}" outPutList="minha"/>
        <c:forEach var="x" items="${minha}">
            <p>${x}</p>
        </c:forEach>
        <h1>${max}</h1>
        <h1>${min}</h1>
        <!--Fim testando-->

        <!--Testando printar conteudo do Body da tag-->
        <tld:OrdenePrintBody currectElement="xxx" listToSort="${list}">
            <p>number: ${xxx}</p>
        </tld:OrdenePrintBody>
        <!--Fim testando-->

        <!--Testando printar variaveis internas da tag-->
        <tld:ClassicTag>
            <p>Cidade: ${Cidade}</p>
            <p>Estado: ${Estado}</p>
            <p>Pais: ${Pais}</p>
        </tld:ClassicTag>
        <p>Cidade: ${Cidade}</p>
        <p>Estado: ${Estado}</p>
        <p>Pais: ${Pais}</p>
        <!--Fim testando-->

    </body>
</html>
