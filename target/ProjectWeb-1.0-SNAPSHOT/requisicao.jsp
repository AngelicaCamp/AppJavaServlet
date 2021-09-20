<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="app.Requisicao" %>
<%@ page language ="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Servlet</title>
</head>
<body>
    <h1>Informações da Requisição</h1>
    <%
        List<String> lista = (List<String>)request.getAttribute("lista-requisicao");
    %>

    <% for (String infoReq: lista){ %>
    <ul>
        <li><%=infoReq %></li>
    </ul>
    <% } %>

</body>
</html>
