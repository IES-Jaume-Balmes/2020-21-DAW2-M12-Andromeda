insert into usuario(nombre,apellido, mail, contrasena) VALUES ('Aaron','Yllanes','jaumebalmes@net','$2a$10$zT4AqPkycZe7wY..zUsRnORV7Vaca86MOm3OG5mA.OKL2poD0js/e');
insert into usuario(nombre,apellido, mail, contrasena) VALUES ('Adriana','Yllanes','jaumebalmes@net','admin');
insert into usuario(nombre,apellido, mail, contrasena) VALUES ('Dani','Garcia','jaumebalmes@net','admin');
insert into usuario(nombre,apellido, mail, contrasena) VALUES ('invitao','ole','regnum@net','$2a$10$RdSLoT3cMrJOy1dbeNY.xetM95ssLvI.kEt91D9gF8hTDcZJTuHaS');


insert into artista (artista)values('deftones');
insert into artista (artista)values('linkinpark');

insert into cancion(cancion,genero)values('change','rock');
insert into cancion(cancion,genero)values('bymyself','rock');

insert into lista_repro(nombre_lista)values('rock de los 2000');

insert into roles(rol,id_usuario)values('admin',1);
insert into roles(rol,id_usuario)values('admin',2);
insert into roles(rol,id_usuario)values('admin',3);
insert into roles(rol,id_usuario)values('user',4);