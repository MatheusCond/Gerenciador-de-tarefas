
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Login</title>
</head>
<body>

<header>
    <div class="tituloTopo">
        <h2>Faça login para acessar o Gerenciador de Tarefas</h2>
    </div>
</header>
<section class="area-login">
    <div class="login">
        <div>
            <img src="img/logo.png">
        </div>
        <% if (request.getParameter("loginError") != null && request.getParameter("loginError").equals("true")) { %>
            <p style="color: red;">Nome ou senha inválidos</p>
        <% } %>
        <form name="frmLogin" action="conferirUsuario">
            <input type="text" name="nome" placeholder="nome de usuário" autofocus>
            <input type="password" name="senha" placeholder="sua senha">
            <input type="submit" value="entrar">
        </form>
        <!-- Corrigindo o caminho do link de cadastro -->
        <p>Ainda não tem uma conta?<a href="cadastro.jsp">Criar conta</a></p>
    </div>
</section>
</body>
</html>
