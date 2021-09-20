<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page language ="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
    <title>Servlet</title>
    </head>
    <body>
        <%
            String frase = (String)request.getAttribute("chave");
        %>
        <h2><%= frase %></h2>

    </body>
</html>
