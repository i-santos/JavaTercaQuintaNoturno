<%-- 
    Document   : editarUsuario
    Created on : 09/01/2020, 21:03:30
    Author     : Professor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuário</title>
    </head>
    <body>
        <a href="index.jsp">Voltar</a>
        <h1>Editar Usuário</h1>
        <form method="POST" action="editar">
            <input type="hidden" name="id" value="${usuario.id}"/>
            <p>
                <label>E-mail:</label>
                <input type="email" name="email" value="${usuario.email}" />
            </p>
            <p>
                <label>Senha:</label>
                <input type="password" name="senha" value="${usuario.senha}" />
            </p>
            <input type="submit" value="Salvar"/>
            <p>${msg}</p>
        </form>
    </body>
</html>
