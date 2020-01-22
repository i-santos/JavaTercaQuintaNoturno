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
        <script src="https://kit.fontawesome.com/a0805070d6.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
    <body class="container">
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
        <hr>
        <h2>Suas Tarefas <small>${msg}</small></h2>
<!--        <form method="POST" action="home">-->
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">Tarefa</th>
                        <th scope="col">Status</th>
                        <th scope="col"></th>
                        <th scope="col"></th>
                    </tr>
                </thead>
                <c:forEach items="${usuarioLogado.tarefas}" var="t">
                    <tr>
                        <td>
                            ${t.titulo}
                        </td>
                        <td>
                            <c:if test="${t.finalizada}">
                                <i class="fas fa-check ml-3"></i>
                            </c:if>
                            <c:if test="${!t.finalizada}">
                                <i class="far fa-clock ml-3"></i>
                            </c:if>
                        </td>
                        <td><a href="finalizar?id=${t.id}">
                                <button type="button" class="btn btn-success">Finalizar</button>
                            </a></td>
                        <td>
                            <a href="excluir?id=${t.id}">
                                <button type="button" class="btn btn-danger">Excluir</button>
                            </a></td>
                    </tr>
                </c:forEach>
            </table>

            <!--            <div class="form-group">
                            <label for="acao">Ação</label>
                            <select name="acao" class="form-control" id="acao">
                                <option value="finalizar">Finalizar</option>
                                <option value="excluir">Excluir</option>
                            </select>
                        </div>
                        <button type="submit" class="btn btn-primary">Executar</button>-->
        <!--</form>-->

        <footer class="m-5">
            <p>@ Lista de Tarefas | 2020</p>
        </footer>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

    </body>
</html>
