DROP DATABASE IF EXISTS andromeda;
CREATE DATABASE andromeda;
USE andromeda;
CREATE TABLE usuarios(
                      id_user           int     NOT NULL UNIQUE AUTO_INCREMENT,
                      nombre       VARCHAR(50) NOT NULL,
                        apellido       VARCHAR(50) NOT NULL,
                        mail       VARCHAR(50) NOT NULL,
                     contraseña       CHAR(60) NOT NULL,
                      PRIMARY KEY (id_user)
);
CREATE TABLE artista(
                     id_art          int     NOT NULL UNIQUE AUTO_INCREMENT ,
                     artista      VARCHAR(50) NOT NULL,
                     genero      VARCHAR(50) NOT NULL,
                     PRIMARY KEY (id_art)
);
CREATE TABLE cancion(
                     id_cancion        int     NOT NULL UNIQUE AUTO_INCREMENT ,
                     artista      VARCHAR(50) NOT NULL,
                     genero      VARCHAR(50) NOT NULL,
                     cancion      VARCHAR(50) NOT NULL,
                     año      DATE NOT NULL,
                     url        varchar(60) not null,
                     PRIMARY KEY (id_cancion)
);
CREATE TABLE genero(
                     id_genero        int     NOT NULL UNIQUE AUTO_INCREMENT ,
                     genero      VARCHAR(50) NOT NULL,
                     PRIMARY KEY (id_genero)
);

/*CREATE TABLE info(
                     id           int      NOT NULL UNIQUE AUTO_INCREMENT ,
                     modelo       VARCHAR(50) NOT NULL,
                     anyo        YEAR NOT NULL,
                     precio DECIMAL NOT NULL,
                     id_marca int NOT NULL,
                     id_tipo    int NOT NULL,
                     PRIMARY KEY (id),
                     FOREIGN KEY (id_marca) REFERENCES marca(id_marca),
                     FOREIGN KEY (id_tipo) REFERENCES tipo(id_tipo)
);
 */