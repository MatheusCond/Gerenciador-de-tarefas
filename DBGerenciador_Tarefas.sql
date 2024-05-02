create database gerenciadortarefas;
show databases;
use gerenciadortarefas;

create table Usuarios(
	idUsuario int not null primary key auto_increment,
    nomeUsuario varchar(50) not null,
    emailUsuario varchar(100) not null,
    senhaUsuario varchar(100) not null
);

create table Tarefas(
	idTarefa int not null primary key auto_increment,
    nomeTarefa varchar(50) not null,
    descricaoTarefa text not null,
    dataTarefa date not null,
    imagem longblob,
    usuarioId int not null references Usuarios(idUsuario)
);
select * from Usuarios;
select * from Tarefas;

