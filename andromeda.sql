-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-06-2021 a las 04:08:19
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `andromeda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `artista`
--

CREATE TABLE `artista` (
  `id_artista` bigint(20) NOT NULL,
  `artista` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `artista`
--

INSERT INTO `artista` (`id_artista`, `artista`) VALUES
(1, 'Deftones'),
(2, 'Louis Armstrong'),
(3, 'Eminem'),
(4, 'Bejo'),
(5, 'Rels B'),
(6, 'Alice in Chains'),
(7, 'Arctic Monkeys'),
(8, 'Chico Blanco'),
(9, 'Dutch Nazari'),
(10, 'Eric Clapton'),
(11, 'Future Prophecies'),
(12, 'Heroes del Silencio'),
(13, 'High Contrast'),
(14, 'Hora Zulu'),
(15, 'Laila al Habash'),
(16, 'LP'),
(17, 'Mandragora'),
(18, 'Non Servium'),
(19, 'Sharif'),
(20, 'Spor'),
(21, 'The Police'),
(22, 'Yvette');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cancion`
--

CREATE TABLE `cancion` (
  `id_cancion` bigint(20) NOT NULL,
  `cancion` varchar(255) DEFAULT NULL,
  `genero` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cancion`
--

INSERT INTO `cancion` (`id_cancion`, `cancion`, `genero`, `url`) VALUES
(1, 'Feiticeira', 'Rock', '/media/Feiticeira - Deftones.mp3'),
(2, 'Digital Bath', 'Rock', '/media/Digital Bath - Deftones.mp3'),
(3, 'Elite', 'Rock', '/media/Elite - Deftones.mp3'),
(4, 'RX Queen', 'Rock', '/media/RXQUEEN - Deftones.mp3'),
(5, 'Street Carp', 'Rock', '/media/Street Carp - Deftones.mp3'),
(6, 'Teenager', 'Rock', '/media/Teenager - Deftones.mp3'),
(7, 'Knife Party', 'Rock', '/media/KnifeParty - Deftones.mp3'),
(8, 'Korea', 'Rock', '/media/Korea - Deftones.mp3'),
(9, 'Passenger', 'Rock', '/media/Passenger - Deftones.mp3'),
(10, 'Change', 'Rock', '/media/Change - Deftones.mp3'),
(11, 'Pink Maggit', 'Rock', '/media/PinkMaggit - Deftones.mp3'),
(12, 'The Boys Republic', 'Rock', '/media/TheBoysRepublic - Deftones.mp3'),
(13, 'Beware', 'Rock', '/media/Beware - Deftones.mp3'),
(14, 'Cherry Waves', 'Rock', '/media/CherryWaves - Deftones.mp3'),
(15, 'Combat', 'Rock', '/media/Combat - Deftones.mp3'),
(16, 'HoleInTheEarth', 'Rock', '/media/HoleInTheEarth - Deftones.mp3'),
(17, 'Kimdracula', 'Rock', '/media/Kimdracula - Deftones.mp3'),
(18, 'Mein', 'Rock', '/media/Mein - Deftones.mp3'),
(19, 'Pink Cellphone', 'Rock', '/media/PinkCellphone - Deftones.mp3'),
(20, 'Rarture', 'Rock', '/media/Rarture - Deftones.mp3'),
(21, 'RatsRatsRats', 'Rock', '/media/RatsRatsRats - Deftones.mp3'),
(22, 'Riviere', 'Rock', '/media/Riviere - Deftones.mp3'),
(23, 'Select Start', 'Rock', '/media/SelectStart - Deftones.mp3'),
(24, 'Xerces', 'Rock', '/media/Xerces - Deftones.mp3'),
(25, 'Heebie Jeebies', 'Jazz', '/media/Heebie Jeebies - Louis Armstrong.mp3'),
(26, 'Alligator Crawl', 'Jazz', '/media/Alligator Crawl - Louis Armstrong.mp3'),
(27, 'Big Butter and Egg', 'Jazz', '/media/Big Butter And Egg Man - Louis Armstrong.mp3'),
(28, 'Cornet Chop Suey', 'Jazz', '/media/Cornet Chop Suey - Louis Armstrong.mp3'),
(29, 'Jazz Lips', 'Jazz', '/media/Jazz Lips - Louis Armstrong.mp3'),
(30, 'Melancholy Blues', 'Jazz', '/media/Melancholy Blues - Louis Armstrong.mp3'),
(31, 'Muskrat Ramble', 'Jazz', '/media/Muskrat Ramble - Louis Armstrong.mp3'),
(32, 'Potato Head Blues', 'Jazz', '/media/Potato Head Blues - Louis Armstrong.mp3'),
(33, 'SKid-Dat-De-Dat', 'Jazz', '/media/SKid-Dat-De-Dat - Louis Armstrong.mp3'),
(34, 'Weary Blues', 'Jazz', '/media/Weary Blues - Louis Armstrong.mp3'),
(35, 'Wild Man Blues', 'Jazz', '/media/Wild Man Blues - Louis Armstrong.mp3'),
(36, 'Willie The Weeper', 'Jazz', '/media/Willie The Weeper - Louis Armstrong.mp3'),
(37, 'Intro', 'Hip-Hop', '/media/Intro - Eminem.mp3'),
(38, 'Low Down, Dirty', 'Hip-Hop', '/media/Low Down Dirty - Eminem.mp3'),
(39, 'If I Had...', 'Hip-Hop', '/media/If I Had - Eminem.mp3'),
(40, 'Just Dont Give a Fuck', 'Hip-Hop', '/media/Just Dont Give a Fuck - Eminem.mp3'),
(41, 'Mommy', 'Hip-Hop', '/media/Mommy - Eminem.mp3'),
(42, 'Just the two of us', 'Hip-Hop', '/media/Just the two of us - Eminem.mp3'),
(43, 'No ones Iller', 'Hip-Hop', '/media/No ones Iller - Eminem.mp3'),
(44, 'Murder, Murder', 'Hip-Hop', '/media/Murder Murder - Eminem.mp3'),
(45, '8 Misisipi', 'Hip-Hop', '/media/8 Misisipi - BEJO.mp3'),
(46, 'El Ventilador', 'Hip-Hop', '/media/El Ventilador - BEJO.mp3'),
(47, 'Metamorfosis', 'Hip-Hop', '/media/Metamorfosis - BEJO.mp3'),
(48, 'Skit Loba', 'Hip-Hop', '/media/Skit Loba - BEJO.mp3'),
(49, 'Vete ya de aquí', 'Hip-Hop', '/media/Vete ya de aquí - BEJO.mp3'),
(50, 'La Prisión', 'Pop', '/media/La Prisión - Rels B.mp3'),
(51, 'Yo tengo un ángel', 'Pop', '/media/Yo Tengo Un Ángel - Rels B.mp3'),
(52, 'Una cumbia triste', 'Pop', '/media/Una Cumbia Triste - Rels B.mp3'),
(53, 'Un verano en mallorca', 'Pop', '/media/Un Verano En Mallorca - Rels B.mp3'),
(54, 'Me olvidé de los 2', 'Pop', '/media/Me Olvidé De Los 2 - Rels B.mp3'),
(55, 'No te imaginas', 'Pop', '/media/No Te Imaginas - Rels B.mp3'),
(56, 'Lágrimas de cocodrilo', 'Pop', '/media/Lágrimas De Cocodrilo - Rels B.mp3'),
(57, 'Libre sin dinero', 'Pop', '/media/Libre Sin Dinero - Rels B.mp3'),
(58, 'Culpable', 'Pop', '/media/Culpable - Rels B.mp3'),
(59, 'La última canción', 'Pop', '/media/La Última Canción - Rels B.mp3'),
(60, 'Would', 'Grunge', '/media/Would - Alice in Chains.mp3'),
(61, 'No buses', 'Rock', '/media/No buses - Arctic Monkeys.mp3'),
(62, 'Snap out of it', 'Rock', '/media/Snap out of it - Arctic Monkeys.mp3'),
(63, 'Positif siempre', 'Pop', '/media/Positif siempre - Chico Blanco.mp3'),
(64, 'Islandia Freestyle', 'Hip-Hop', '/media/Islanda Freestyle - Dutch Nazari.mp3'),
(65, 'Cocaine', 'Blues', '/media/Cocaine - Eric Clapton.mp3'),
(66, 'Magnetic', 'Neurofunk', '/media/Magnetic - Future Prophecies.mp3'),
(67, 'Entre dos tierras', 'Rock Nacional', '/media/Entre dos tierras - Heroes del Silencio.mp3'),
(68, 'Kiss kiss bang bang', 'Drum and Bass', '/media/kiss_kiss_bang_bang - High Contrast.mp3'),
(69, 'Brodo', 'Hip-Hop', '/media/brodo - laila al habash.mp3'),
(70, 'Andaluz de nacimiento', 'Rock nacional', '/media/Andaluz de nacimiento - Hora Zulu.mp3'),
(71, 'Lost on you', 'Indie', '/media/Lost on you - LP.mp3'),
(72, 'Slytherin', 'Trance', '/media/Slytherin - Mandragora.mp3'),
(73, 'La maldición', 'Punk', '/media/La maldición - Non Servium.mp3'),
(74, 'Talismán', 'Hip-Hop', '/media/Talismán - Sharif.mp3'),
(75, 'Levitate', 'Drum and Bass', '/media/Levitate - Spor.mp3'),
(76, 'Every breath you take', 'Rock', '/media/Every_Breath_You_Take - The Police.mp3'),
(77, 'Uplifting chorus', 'Post Rock', '/media/Uplifting - Yvette.mp3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cancion_artista`
--

CREATE TABLE `cancion_artista` (
  `id_cancion` bigint(20) NOT NULL,
  `id_artista` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cancion_artista`
--

INSERT INTO `cancion_artista` (`id_cancion`, `id_artista`) VALUES
(1, 1),
(2, 1),
(3, 1),
(4, 1),
(5, 1),
(6, 1),
(7, 1),
(8, 1),
(9, 1),
(10, 1),
(11, 1),
(12, 1),
(13, 1),
(14, 1),
(15, 1),
(16, 1),
(17, 1),
(18, 1),
(19, 1),
(20, 1),
(21, 1),
(22, 1),
(23, 1),
(24, 1),
(25, 2),
(26, 2),
(27, 2),
(28, 2),
(29, 2),
(30, 2),
(31, 2),
(32, 2),
(33, 2),
(34, 2),
(35, 2),
(36, 2),
(37, 3),
(38, 3),
(39, 3),
(40, 3),
(41, 3),
(42, 3),
(43, 3),
(44, 3),
(45, 4),
(46, 4),
(47, 4),
(48, 4),
(49, 4),
(50, 5),
(51, 5),
(52, 5),
(53, 5),
(54, 5),
(55, 5),
(56, 5),
(57, 5),
(58, 5),
(59, 5),
(60, 6),
(61, 7),
(62, 7),
(63, 8),
(64, 9),
(65, 10),
(66, 11),
(67, 12),
(68, 13),
(69, 15),
(70, 14),
(71, 16),
(72, 17),
(73, 18),
(74, 19),
(75, 20),
(76, 21),
(77, 22);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lista_cancion`
--

CREATE TABLE `lista_cancion` (
  `id_lista` bigint(20) NOT NULL,
  `id_cancion` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `lista_cancion`
--

INSERT INTO `lista_cancion` (`id_lista`, `id_cancion`) VALUES
(1, 5),
(5, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lista_detalle`
--

CREATE TABLE `lista_detalle` (
  `id_lista` bigint(20) NOT NULL,
  `id_usuario` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lista_repro`
--

CREATE TABLE `lista_repro` (
  `id_lista` bigint(20) NOT NULL,
  `nombre_lista` varchar(255) DEFAULT NULL,
  `data_creacion_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `role`
--

CREATE TABLE `role` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users_roles`
--

CREATE TABLE `users_roles` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `users_roles`
--

INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES
(1, 1),
(3, 2),
(4, 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `artista`
--
ALTER TABLE `artista`
  ADD PRIMARY KEY (`id_artista`);

--
-- Indices de la tabla `cancion`
--
ALTER TABLE `cancion`
  ADD PRIMARY KEY (`id_cancion`);

--
-- Indices de la tabla `cancion_artista`
--
ALTER TABLE `cancion_artista`
  ADD KEY `FKd8n5h767ga1reug1nyho15w66` (`id_artista`),
  ADD KEY `FKn2aakjw2ll05dwyluiji64nfd` (`id_cancion`);

--
-- Indices de la tabla `lista_cancion`
--
ALTER TABLE `lista_cancion`
  ADD KEY `FK94u0vmv83p9slug0lok0dgr3s` (`id_cancion`),
  ADD KEY `FKsllkfe7wajacvxrfil5p7kqib` (`id_lista`);

--
-- Indices de la tabla `lista_detalle`
--
ALTER TABLE `lista_detalle`
  ADD KEY `FKawyh55wmkep6862ays6owpan` (`id_usuario`),
  ADD KEY `FK3eyf72trdkpsxvc2aom85hr67` (`id_lista`);

--
-- Indices de la tabla `lista_repro`
--
ALTER TABLE `lista_repro`
  ADD PRIMARY KEY (`id_lista`);

--
-- Indices de la tabla `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UKob8kqyqqgmefl0aco34akdtpe` (`email`);

--
-- Indices de la tabla `users_roles`
--
ALTER TABLE `users_roles`
  ADD KEY `FKt4v0rrweyk393bdgt107vdx0x` (`role_id`),
  ADD KEY `FKgd3iendaoyh04b95ykqise6qh` (`user_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `artista`
--
ALTER TABLE `artista`
  MODIFY `id_artista` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `cancion`
--
ALTER TABLE `cancion`
  MODIFY `id_cancion` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=78;

--
-- AUTO_INCREMENT de la tabla `lista_repro`
--
ALTER TABLE `lista_repro`
  MODIFY `id_lista` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `role`
--
ALTER TABLE `role`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cancion_artista`
--
ALTER TABLE `cancion_artista`
  ADD CONSTRAINT `FKd8n5h767ga1reug1nyho15w66` FOREIGN KEY (`id_artista`) REFERENCES `artista` (`id_artista`),
  ADD CONSTRAINT `FKn2aakjw2ll05dwyluiji64nfd` FOREIGN KEY (`id_cancion`) REFERENCES `cancion` (`id_cancion`);

--
-- Filtros para la tabla `lista_cancion`
--
ALTER TABLE `lista_cancion`
  ADD CONSTRAINT `FK94u0vmv83p9slug0lok0dgr3s` FOREIGN KEY (`id_cancion`) REFERENCES `cancion` (`id_cancion`),
  ADD CONSTRAINT `FKsllkfe7wajacvxrfil5p7kqib` FOREIGN KEY (`id_lista`) REFERENCES `lista_repro` (`id_lista`);

--
-- Filtros para la tabla `lista_detalle`
--
ALTER TABLE `lista_detalle`
  ADD CONSTRAINT `FK3eyf72trdkpsxvc2aom85hr67` FOREIGN KEY (`id_lista`) REFERENCES `lista_repro` (`id_lista`),
  ADD CONSTRAINT `FKawyh55wmkep6862ays6owpan` FOREIGN KEY (`id_usuario`) REFERENCES `user` (`id`);

--
-- Filtros para la tabla `users_roles`
--
ALTER TABLE `users_roles`
  ADD CONSTRAINT `FKgd3iendaoyh04b95ykqise6qh` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `FKt4v0rrweyk393bdgt107vdx0x` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
