<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Tarefas Web</title>
    </head>
    <body>
        <h1>Entre na sua conta</h1>
        <form method="POST" action="login">
            <p>
                <label>E-mail:</label>
                <input type="email" name="email" />                
            </p>
            <p>
                <label>Senha: </label>
                <input type="password" name="senha" />                
            </p>
            <input type="submit" value="Entrar" />
        </form>
        <p>
            Não possui uma conta? <a href="cadastrar">Faça o cadastro</a>
        </p>
    </body>
</html>
