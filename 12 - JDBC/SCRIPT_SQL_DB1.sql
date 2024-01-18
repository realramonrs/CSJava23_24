DROP DATABASE IF EXISTS JDBC;
GO
CREATE DATABASE JDBC;
GO
USE JDBC;
GO

CREATE TABLE alumnos (
  [id] int NOT NULL,
  [nombre] varchar(20) DEFAULT NULL,
  [apellidos] varchar(20) DEFAULT NULL,
  [telefono] varchar(20) DEFAULT NULL
) ;

INSERT INTO alumnos ([id], [nombre], [apellidos], [telefono]) VALUES
(1, 'Cristiano', 'Ronaldo', '987452154'),
(2, 'Iker', 'Casillas', '989654125'),
(3, 'Sergio', 'Ramos', '985321478');

CREATE TABLE empleados (
  [numemp] int NOT NULL,
  [nombre] varchar(100) NOT NULL,
  [apellidos] varchar(100) NOT NULL,
  [edad] int NOT NULL,
  [contrato] datetime NOT NULL
) ;

INSERT INTO empleados ([numemp], [nombre], [apellidos], [edad], [contrato]) VALUES
(1, 'Martin', 'Garcia', 29, '01/01/1990'),
(2, 'Ramon', 'Rios', 31, '01/01/1980'),
(3, 'Fran', 'Rocha', 32, '01/01/1970'),
(4, 'Enrique', 'Enrique', 33, '01/01/1960');

CREATE TABLE oficinas (
  [oficina] int NOT NULL,
  [region] varchar(100) NOT NULL,
  [ciudad] varchar(100) NOT NULL
) ;

INSERT INTO oficinas ([oficina], [region], [ciudad]) VALUES
(1, 'Galicia', 'Vigo'),
(2, 'Galicia', 'Santiago'),
(3, 'Madrid', 'Madrid'),
(4, 'Cataluña', 'Barcelona');

CREATE TABLE pedidos (
  [numpedido] int NOT NULL,
  [fab] int NOT NULL,
  [producto] varchar(100) NOT NULL,
  [cantidad] int NOT NULL,
  [importe] float NOT NULL
) ;

INSERT INTO pedidos ([numpedido], [fab], [producto], [cantidad], [importe]) VALUES
(1, 1, 'Cocacolas', 10, 3.5),
(2, 2, 'Pepsis', 10, 3),
(3, 1, 'Kases', 10, 2.8),
(4, 2, 'Fantas', 10, 2.7),
(5, 3, 'Aguas', 10, 1.5),
(5, 2, 'Fantas', 10, 2.7);

CREATE TABLE productos (
  [idfab] int NOT NULL,
  [idproducto] int NOT NULL,
  [descripcion] varchar(100) NOT NULL DEFAULT '',
  [precio] float NOT NULL
) ;

INSERT INTO productos ([idfab], [idproducto], [descripcion], [precio]) VALUES
(1, 1, 'Coca-Cola', 0.35),
(2, 2, 'Pepsi', 0.3),
(1, 3, 'Kas', 0.28),
(2, 4, 'Fanta', 0.27),
(3, 5, 'Agua de Mondariz', 0.15),
(4, 6, 'Agua', 0.55),
(4, 7, 'Agua', 0.55);

ALTER TABLE [alumnos]
  ADD PRIMARY KEY ([id]);