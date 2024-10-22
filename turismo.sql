-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-10-2024 a las 02:02:35
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `turismo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `destino`
--

CREATE TABLE `destino` (
  `codigo_destino` int(11) NOT NULL,
  `nombre_ciudad` varchar(100) NOT NULL,
  `fecha_inicio_temporada_alta` date NOT NULL,
  `fecha_fin_temporada_alta` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estadia`
--

CREATE TABLE `estadia` (
  `codigo_estadia` int(11) NOT NULL,
  `codigo_hotel` int(11) DEFAULT NULL,
  `fecha_checkin` date NOT NULL,
  `fecha_checkout` date NOT NULL,
  `monto` decimal(10,2) NOT NULL,
  `vigente` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hotel`
--

CREATE TABLE `hotel` (
  `codigo_hotel` int(11) NOT NULL,
  `nombre_hotel` varchar(100) NOT NULL,
  `domicilio_hotel` varchar(200) NOT NULL,
  `precio_por_noche` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `origen`
--

CREATE TABLE `origen` (
  `codigo_origen` int(11) NOT NULL,
  `nombre_ciudad` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paquete`
--

CREATE TABLE `paquete` (
  `codigo_paquete` int(11) NOT NULL,
  `codigo_destino` int(11) DEFAULT NULL,
  `codigo_estadia` int(11) DEFAULT NULL,
  `codigo_vuelo` int(11) DEFAULT NULL,
  `tipo_menu` enum('Sin Pensión','Desayuno','Media Pensión','Pensión Completa') NOT NULL,
  `precio_paquete` decimal(10,2) NOT NULL,
  `cantidad_personas` int(11) NOT NULL,
  `precio_total` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vuelo`
--

CREATE TABLE `vuelo` (
  `codigo_vuelo` int(11) NOT NULL,
  `codigo_origen` int(11) DEFAULT NULL,
  `codigo_destino` int(11) DEFAULT NULL,
  `precio` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `destino`
--
ALTER TABLE `destino`
  ADD PRIMARY KEY (`codigo_destino`);

--
-- Indices de la tabla `estadia`
--
ALTER TABLE `estadia`
  ADD PRIMARY KEY (`codigo_estadia`),
  ADD KEY `codigo_hotel` (`codigo_hotel`);

--
-- Indices de la tabla `hotel`
--
ALTER TABLE `hotel`
  ADD PRIMARY KEY (`codigo_hotel`);

--
-- Indices de la tabla `origen`
--
ALTER TABLE `origen`
  ADD PRIMARY KEY (`codigo_origen`);

--
-- Indices de la tabla `paquete`
--
ALTER TABLE `paquete`
  ADD PRIMARY KEY (`codigo_paquete`),
  ADD KEY `codigo_destino` (`codigo_destino`),
  ADD KEY `codigo_estadia` (`codigo_estadia`),
  ADD KEY `codigo_vuelo` (`codigo_vuelo`);

--
-- Indices de la tabla `vuelo`
--
ALTER TABLE `vuelo`
  ADD PRIMARY KEY (`codigo_vuelo`),
  ADD KEY `codigo_origen` (`codigo_origen`),
  ADD KEY `codigo_destino` (`codigo_destino`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `destino`
--
ALTER TABLE `destino`
  MODIFY `codigo_destino` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `estadia`
--
ALTER TABLE `estadia`
  MODIFY `codigo_estadia` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `hotel`
--
ALTER TABLE `hotel`
  MODIFY `codigo_hotel` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `origen`
--
ALTER TABLE `origen`
  MODIFY `codigo_origen` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `paquete`
--
ALTER TABLE `paquete`
  MODIFY `codigo_paquete` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `vuelo`
--
ALTER TABLE `vuelo`
  MODIFY `codigo_vuelo` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `estadia`
--
ALTER TABLE `estadia`
  ADD CONSTRAINT `estadia_ibfk_1` FOREIGN KEY (`codigo_hotel`) REFERENCES `hotel` (`codigo_hotel`);

--
-- Filtros para la tabla `paquete`
--
ALTER TABLE `paquete`
  ADD CONSTRAINT `paquete_ibfk_1` FOREIGN KEY (`codigo_destino`) REFERENCES `destino` (`codigo_destino`),
  ADD CONSTRAINT `paquete_ibfk_2` FOREIGN KEY (`codigo_estadia`) REFERENCES `estadia` (`codigo_estadia`),
  ADD CONSTRAINT `paquete_ibfk_3` FOREIGN KEY (`codigo_vuelo`) REFERENCES `vuelo` (`codigo_vuelo`);

--
-- Filtros para la tabla `vuelo`
--
ALTER TABLE `vuelo`
  ADD CONSTRAINT `vuelo_ibfk_1` FOREIGN KEY (`codigo_origen`) REFERENCES `origen` (`codigo_origen`),
  ADD CONSTRAINT `vuelo_ibfk_2` FOREIGN KEY (`codigo_destino`) REFERENCES `destino` (`codigo_destino`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
