DROP DATABASE IF EXISTS `supermercado`;
CREATE DATABASE `supermercado`;
USE `supermercado`;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `supermercado`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `apellidos` varchar(20) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`id`, `nombre`, `apellidos`, `telefono`) VALUES
(1, 'Cristiano', 'Ronaldo', '987452154'),
(2, 'Iker', 'Casillas', '989654125'),
(3, 'Sergio', 'Ramos', '985321478');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `numemp` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `edad` int(11) NOT NULL,
  `contrato` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`numemp`, `nombre`, `apellidos`, `edad`, `contrato`) VALUES
(1, 'Martin', 'Garcia', 29, '0000-00-00'),
(2, 'Ramon', 'Rios', 31, '0000-00-00'),
(3, 'Fran', 'Rocha', 32, '0000-00-00'),
(4, 'Enrique', 'Enrique', 33, '0000-00-00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `oficinas`
--

CREATE TABLE `oficinas` (
  `oficina` int(11) NOT NULL,
  `region` varchar(100) NOT NULL,
  `ciudad` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `oficinas`
--

INSERT INTO `oficinas` (`oficina`, `region`, `ciudad`) VALUES
(1, 'Galicia', 'Vigo'),
(2, 'Galicia', 'Santiago'),
(3, 'Madrid', 'Madrid'),
(4, 'Cataluña', 'Barcelona');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE `pedidos` (
  `numpedido` int(11) NOT NULL,
  `fab` int(11) NOT NULL,
  `producto` varchar(100) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `importe` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`numpedido`, `fab`, `producto`, `cantidad`, `importe`) VALUES
(1, 1, 'Cocacolas', 10, 3.5),
(2, 2, 'Pepsis', 10, 3),
(3, 1, 'Kases', 10, 2.8),
(4, 2, 'Fantas', 10, 2.7),
(5, 3, 'Aguas', 10, 1.5),
(5, 2, 'Fantas', 10, 2.7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `idfab` int(11) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `descripcion` varchar(100) NOT NULL DEFAULT '',
  `precio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`idfab`, `idproducto`, `descripcion`, `precio`) VALUES
(1, 1, 'Coca-Cola', 0.35),
(2, 2, 'Pepsi', 0.3),
(1, 3, 'Kas', 0.28),
(2, 4, 'Fanta', 0.27),
(3, 5, 'Agua de Mondariz', 0.15),
(4, 6, 'Agua', 0.55),
(4, 7, 'Agua', 0.55);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
