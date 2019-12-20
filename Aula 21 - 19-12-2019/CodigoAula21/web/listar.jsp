<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar | Aula 20</title>
    </head>
    <body>
        <a href="index.jsp">Voltar</a>
        <h1>Usuários Cadastrados</h1>
        <c:if test="${listaUsuarios.size() == 0}">
            <p>Nenhum usuário cadastrado</p>
        </c:if>
        <c:if test="${listaUsuarios.size() > 0}">
            <table>
                <thead>
                    <tr>
                        <td>ID</td>
                        <td>E-mail</td>
                        <td>Senha</td>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listaUsuarios}" var="u">
                        <tr>
                            <td>${u.id}</td>
                            <td>${u.email}</td>
                            <td>${u.senha}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>

    </body>
</html>
