DROP DATABASE IF EXISTS andromeda;
CREATE DATABASE andromeda;
USE andromeda;
CREATE TABLE usuario(
                      id_usuario           int     NOT NULL UNIQUE AUTO_INCREMENT,
                      nombre       VARCHAR(50) NOT NULL,
                        apellido       VARCHAR(50) NOT NULL,
                        mail       VARCHAR(50) NOT NULL,
                     contrasena       CHAR(60) NOT NULL,
                      PRIMARY KEY (id_usuario)
);
CREATE TABLE artista(
                     id_artista          int     NOT NULL UNIQUE AUTO_INCREMENT ,
                     artista      VARCHAR(50) NOT NULL,
                     genero      VARCHAR(50) NOT NULL,
                     PRIMARY KEY (id_artista)
);
CREATE TABLE cancion(
                     id_cancion        int     NOT NULL UNIQUE AUTO_INCREMENT ,
                     cancion      VARCHAR(50) NOT NULL,
                     id_artista      int NOT NULL,
                     genero      VARCHAR(50) NOT NULL,
                     PRIMARY KEY (id_cancion),
                     FOREIGN KEY (id_artista) REFERENCES artista(id_artista)
);
CREATE TABLE genero(
                     id_genero        int     NOT NULL UNIQUE AUTO_INCREMENT ,
                     genero      VARCHAR(50) NOT NULL,
                     PRIMARY KEY (id_genero)
);
CREATE TABLE lista_repro(
    id_llista int     NOT NULL UNIQUE AUTO_INCREMENT,
nom_llista VARCHAR(50) NOT NULL,
id_usuario  int NOT NULL,
data_creacio DATE NOT NULL,
FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);
insert into usuario(id_usuario, nombre, apellido, mail, contrasena) VALUES (null,'xavi','castellon','xav@gmail.com','456635ss');
insert into usuario(id_usuario, nombre, apellido, mail, contrasena) VALUES (null,'david','marcos','dav@gmail.com','jjjj5ss');