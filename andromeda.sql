-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-05-2021 a las 19:53:20
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.3

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
(1, 'deftones'),
(2, 'linkinpark');

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
(1, 'Feiticeira', 'Rock', '/music/01-Feiticeira.mp3'),
(2, 'Digital Bath', 'Rock', '/music/02-DigitalBath.mp3'),
(3, 'Elite', 'Rock', '/music/03-Elite.mp3'),
(4, 'RX Queen', 'Rock', '/music/04-RXQueen.mp3'),
(5, 'Street Carp', 'Rock', '/music/05-StreetCarp.mp3'),
(6, 'Teenager', 'Rock', '/music/06-Teenager.mp3'),
(7, 'Knife Party', 'Rock', '/music/07-KnifeParty.mp3'),
(8, 'Korea', 'Rock', '/music/08-Korea.mp3'),
(9, 'Passenger', 'Rock', '/music/09-Passenger.mp3'),
(10, 'Change', 'Rock', '/music/10-Change.mp3'),
(11, 'Pink Maggit', 'Rock', '/music/11-PinkMaggit.mp3'),
(12, 'The Boys Republic', 'Rock', '/music/12-TheBoysRepublic.mp3'),
(13, 'Beware', 'Rock', '/music/Beware.mp3'),
(14, 'Cherry Waves', 'Rock', '/music/CherryWaves.mp3'),
(15, 'Combat', 'Rock', '/music/Combat.mp3'),
(16, 'HoleInTheEarth', 'Rock', '/music/HoleInTheEarth.mp3'),
(17, 'Kimdracula', 'Rock', '/music/Kimdracula.mp3'),
(18, 'Mein', 'Rock', '/music/Mein.mp3'),
(19, 'Pink Cellphone', 'Rock', '/music/PinkCellphone.mp3'),
(20, 'Rarture', 'Rock', '/music/Rarture.mp3'),
(21, 'RatsRatsRats', 'Rock', '/music/RatsRatsRats.mp3'),
(22, 'Riviere', 'Rock', '/music/Riviere.mp3'),
(23, 'Select Start', 'Rock', '/music/SelectStart.mp3'),
(24, 'Xerces', 'Rock', '/music/Xerces.mp3');

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
(2, 1);

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
  `data_creacion_date` datetime DEFAULT NULL,
  `nombre_lista` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `lista_repro`
--

INSERT INTO `lista_repro` (`id_lista`, `data_creacion_date`, `nombre_lista`) VALUES
(1, NULL, 'rock de los 2000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `role`
--

CREATE TABLE `role` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `role`
--

INSERT INTO `role` (`id`, `name`) VALUES
(1, 'ROLE_USER');

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

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`id`, `email`, `first_name`, `last_name`, `password`) VALUES
(1, 'a', 'a', 'a', '$2a$10$L58n0ZK/suQVhMc.DoFiD.TLgAVzxedO/euuVGdq.wy.53zqSmZFm');

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
(1, 1);

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
  MODIFY `id_artista` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `cancion`
--
ALTER TABLE `cancion`
  MODIFY `id_cancion` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `lista_repro`
--
ALTER TABLE `lista_repro`
  MODIFY `id_lista` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `role`
--
ALTER TABLE `role`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

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
