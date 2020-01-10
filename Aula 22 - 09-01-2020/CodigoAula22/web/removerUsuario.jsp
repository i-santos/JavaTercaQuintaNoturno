<%-- 
    Document   : removerUsuario
    Created on : 09/01/2020, 21:58:42
    Author     : Professor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remover Usuário</title>
    </head>
    <body>
        <a href="index.jsp">Voltar</a>
        <h1>Remover Usuário</h1>
        <form method="POST" action="remover">
            <p>
                <label>E-mail:</label>
                <input type="email" name="email" />
            </p>
            <input type="submit" value="Remover" />
            <p>${msg}</p>
        </form>
    </body>
</html>
