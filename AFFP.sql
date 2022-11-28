-- AF Fábrica de Projetos Database.

DROP DATABASE IF EXISTS AFFP;
CREATE DATABASE AFFP;
USE AFFP;

CREATE TABLE usuario(
id				int						primary key			auto_increment			not null,
cpf				varchar(50)			    unique				not null,
nome			varchar(60)				not null,		
email			varchar(100)			unique				not null,
senha			varchar(60)				not null,
nascimento		varchar(10)				not null,
valor			int						not null
);

SELECT * FROM usuario