<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <script src="scripts/script.js"></script>
    <title>Cadastro</title>
</head>
<header>
    <div class="tituloTopoCadastro">
        <h2>Comece a ser mais produtivo hoje: crie sua conta</h2>
    </div>
</header>
<body>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <section class="area-login">
        <div class="login">
            <div>
                <img src="img/logo.png">
            </div>
            <form name="frmCadastro" onsubmit="return validar()" action="insertUsuario">
                    <div class="mensagem-erro" id="erro-nome"></div>
                    <input type="text" name="nome" placeholder="Nome de usuário" class="campo">

                    <div class="mensagem-erro" id="erro-email"></div>
                    <input type="email" name="email" placeholder="Seu e-mail" class="campo">

                    <div class="mensagem-erro" id="erro-senha"></div>
                    <input type="password" name="senha" placeholder="Sua senha" class="campo">
                <input type="submit" value="cadastrar" class="submitCadastrar">
            </form>
        </div>
    </section>
</body>
</html>
