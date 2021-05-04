DROP DATABASE IF EXISTS andromeda;
CREATE DATABASE andromeda;
USE andromeda;
CREATE TABLE usuarios(
                      id_user           int     NOT NULL UNIQUE AUTO_INCREMENT,
                      nombre       VARCHAR(50) NOT NULL,
                        apellido       VARCHAR(50) NOT NULL,
                        mail       VARCHAR(50) NOT NULL,
                     contrasena       CHAR(60) NOT NULL,
                      PRIMARY KEY (id_user)
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
