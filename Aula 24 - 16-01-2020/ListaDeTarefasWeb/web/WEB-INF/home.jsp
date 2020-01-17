<%-- 
    Document   : home
    Created on : 14/01/2020, 23:17:09
    Author     : Aluno
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Tarefa"%>
<%@page import="model.Usuario"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home | Lista de Tarefas</title>
    </head>
    <body>
        <a href="logout">Logout</a>
        <h1>HomePage</h1>
        <fieldset>
            <legend>Adicionar Tarefa</legend>
            <form method="POST" action="adicionar">
                <p>
                    <label>Título: </label>
                    <input type="text" name="titulo" />
                </p>
                <input type="submit" value="Adicionar" />
                <p>${msg}</p>
            </form>
        </fieldset>
        <h2>Suas Tarefas</h2>
        <c:forEach items="${usuarioLogado.tarefas}" var="t">
            <p>${t.titulo}</p>
        </c:forEach>
</body>
</html>
