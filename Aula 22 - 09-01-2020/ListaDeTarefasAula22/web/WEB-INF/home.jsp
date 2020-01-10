<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HomePage</title>
    </head>
    <body>
        <a href="logout">Logout</a>
        <h1>HomePage</h1>
        <p>Id: ${usuarioLogado.id}</p>
        <p>E-mail: ${usuarioLogado.email}</p>
        <p>Senha: ${usuarioLogado.senha}</p>
    </body>
</html>
