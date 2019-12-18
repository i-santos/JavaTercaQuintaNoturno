<%@page import="model.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<Usuario> usuarios = (ArrayList<Usuario>) request.getAttribute("listaUsuarios");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar | Aula 20</title>
    </head>
    <body>
        <a href="index.jsp">Voltar</a>
        <h1>Usuários Cadastrados</h1>
        <table>
            <thead>
                <tr>
                    <td>ID</td>
                    <td>E-mail</td>
                    <td>Senha</td>
                </tr>
            </thead>
            <tbody>
                <% for (int i = 0; i < usuarios.size(); i++) {
                    Usuario u = usuarios.get(i);
                %>
                <tr>
                    <td><%= u.getId() %></td>
                    <td><%= u.getEmail() %></td>
                    <td><%= u.getSenha() %></td>
                </tr>
                <% }%>
            </tbody>
        </table>

    </body>
</html>
