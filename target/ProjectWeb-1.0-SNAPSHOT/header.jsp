<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page language ="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Servlet</title>
</head>
<body>
    <h1>Informações do Header</h1>
    <%
        List<String> lista = (List<String>)request.getAttribute("lista-header");
    %>

    <% for (String infoHeader: lista){ %>
    <ul>
        <li><%= infoHeader %></li>
    </ul>
    <% } %>
</body>
</html>
