<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="genTarefas.css">
    <link rel="stylesheet" href="genTarefas.css" charset="UTF-8">
    <title>Gerenciador de Tarefas</title>
</head>
<body>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <header>
        <div class="menu">
            <div class="logo-menu">
                <img src="img/logo.png" alt="">
                <h2>Gerenciador de Tarefas</h2>
            </div><!--logo-menu-->
            <div class="items-menu">
                <a href="index.jsp">Login</a>
                <a class="contact-btn" href="">Entre em contato</a>
            </div><!--items-menu-->
        </div><!--menu-->
    </header>

    <section class="area-login">
        <div class="login">
            <div>
                
            </div>
            <form name="frmTarefa" action="insertTarefa">
                <label for="">Tarefa:</label>
                <input type="text" name="tarefa" placeholder="Nome da tarefa" autofocus>
                <label for="">Descrição:</label>
                <textarea name="descricao" placeholder="Descrição da tarefa" rows="4"></textarea>
                <label for="">Data:</label>
                <input type="date" name="data" placeholder="dd / mm / aaaa">
                <label for="">Imagem:</label>
                <input type="file" name="imagem" id="imagem-input">
                <img id="imagem-preview" src="#" alt="Preview da Imagem" style="display: none;">
                <input type="submit" value="cadastrar">
                <div class="list-task">
                    <ul>
                        <li>Tarefa 1</li>
                        <li>Tarefa 2</li>
                        <li>Tarefa 3</li>
                    </ul>
                </div>
            </form>
        </div>

        
    </section>

    <footer>
        <p>&copy; 2024 Gerenciador de Tarefas. Todos os direitos reservados.</p>
    </footer>
</body>
</html>