CREATE DATABASE  IF NOT EXISTS `atividade`;
USE `atividade`;

create table cad (
	id  int auto_increment NOT NULL PRIMARY KEY,
    nome varchar(50),
    dat varchar(10),
    materia varchar(50),
    concluido boolean
);
