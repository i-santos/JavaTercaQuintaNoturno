<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuário</title>
    </head>
    <body>
        <a href="index.jsp">Voltar</a>
        <h1>Procurar um usuário</h1>
        <form method="POST" action="procurar">
            <p>
                <label>E-mail:</label>
                <input type="email" name="email" />
            </p>
            <input type="submit" value="Procurar" />
            <p>${erro}</p>
        </form>
    </body>
</html>
