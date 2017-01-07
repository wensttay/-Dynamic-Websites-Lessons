<%-- 
    Document   : index
    Created on : 26/04/2016, 03:10:15
    Author     : Wensttay de Sousa Alencar
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="Author" content="Wensttay de Sousa Alencar">
    </head>
    <body>
        <!--Testando SET e IF-->
        <c:set var="testi" value="true" />
        <c:if var="x" test="${testi == true}">
            <h1>${x}</h1>
            <%--<c:set var="passou" value="1"/>--%>
        </c:if>
        <!--Fim testando-->

        <!--Testando CATCH (capturadore de exeção)-->
        <c:catch var="erro">
            <% int c = 1 / 0;%>
        </c:catch>
        <p>${erro}</p>
        <!--Fim testando-->

        <!--Testando o Choose, When e Otherwise-->
        <c:choose>
            <c:when test="${passou == 1}">
                <h1>PASSOU == 1</h1>
            </c:when>
            <c:when test="${testi}">
                <h1>TESTI IS TRUE</h1>
            </c:when>
            <c:otherwise>
                <h1>QUALQUER OUTRA COISA</h1>
            </c:otherwise>
        </c:choose>
        <!--Fim testando-->

        <!--Testando import com parametro-->
        <c:import url="resposta.jsp">
            <c:param name="resposta" value="OIIIII"/>
        </c:import>
        <!--Fim testando-->

        <!--Testando set e remove-->
        <c:set var="testi" value="true" />
        <c:remove var="testi"/>
        <c:if var="x" test="${testi == true}">
            <h1>${x}</h1>
        </c:if>
        <!--Fim testando-->     

        <!--Testando forEach-->
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
        <c:forEach var="x" begin="0" 
                   items="${list}"
                   end="10">
            <p>${x}</p>
        </c:forEach>
        <!--Fim testando-->   

    </body>
</html>
