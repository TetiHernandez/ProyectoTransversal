-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 18, 2020 at 03:58 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `universidad`
--

-- --------------------------------------------------------

--
-- Table structure for table `alumno`
--

CREATE TABLE `alumno` (
  `ID` int(11) NOT NULL,
  `NOMBRE` varchar(30) DEFAULT NULL,
  `FECNAC` datetime DEFAULT NULL,
  `ACTIVO` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `alumno`
--

INSERT INTO `alumno` (`ID`, `NOMBRE`, `FECNAC`, `ACTIVO`) VALUES
(1, 'Marta Dominguez', '2000-05-10 00:00:00', 0),
(2, 'Martin Ferrara', '1999-05-09 00:00:00', 1),
(4, 'martin suarez', '1998-03-21 00:00:00', 0),
(5, 'Pepito', '2020-06-10 19:53:38', 1),
(6, 'Mario', '1983-04-12 00:00:00', 0),
(7, 'daniel lescano', '1983-01-21 00:00:00', 0),
(8, 'romina aguero', '2000-08-02 00:00:00', 0),
(9, 'Mario', '1983-04-12 00:00:00', 0),
(10, 'daniel lescano', '1983-01-21 00:00:00', 0),
(11, 'romina aguero', '2000-08-02 00:00:00', 0),
(12, 'Mario', '1983-04-12 00:00:00', 0),
(13, 'daniel lescano', '1983-01-21 00:00:00', 0),
(14, 'romina aguero', '2000-08-02 00:00:00', 0),
(15, 'Mario', '1983-04-12 00:00:00', 0),
(17, 'romina aguero', '2000-08-02 00:00:00', 0),
(18, 'Mario', '1983-04-12 00:00:00', 0),
(19, 'daniel lescano', '1983-01-21 00:00:00', 0),
(20, 'romina aguero', '2000-08-02 00:00:00', 0),
(21, 'Mario', '1983-04-12 00:00:00', 0),
(22, 'daniel lescano', '1983-01-21 00:00:00', 0),
(23, 'romina aguero', '2000-08-02 00:00:00', 0),
(24, 'Mario', '1983-04-12 00:00:00', 0),
(25, 'daniel lescano', '1983-01-21 00:00:00', 0),
(27, 'Maxi Gatica', '1983-01-21 00:00:00', 0),
(30, 'romina aguero', '2000-08-02 00:00:00', 0);

-- --------------------------------------------------------

--
-- Table structure for table `cursada`
--

CREATE TABLE `cursada` (
  `ID` int(11) NOT NULL,
  `IDALUMNO` int(11) NOT NULL,
  `IDMATERIA` int(11) NOT NULL,
  `NOTA` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cursada`
--

INSERT INTO `cursada` (`ID`, `IDALUMNO`, `IDMATERIA`, `NOTA`) VALUES
(2, 2, 1, 9),
(4, 8, 3, 7),
(5, 8, 4, 10),
(24, 19, 4, 7),
(28, 5, 20, 0);

-- --------------------------------------------------------

--
-- Table structure for table `materia`
--

CREATE TABLE `materia` (
  `ID` int(11) NOT NULL,
  `NOMBRE` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `materia`
--

INSERT INTO `materia` (`ID`, `NOMBRE`) VALUES
(1, 'Matematicas'),
(2, 'Ingles'),
(3, 'mate'),
(4, 'laboratorio1Cam'),
(20, 'Robotica');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `cursada`
--
ALTER TABLE `cursada`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `IDALUMNO` (`IDALUMNO`),
  ADD KEY `IDMATERIA` (`IDMATERIA`);

--
-- Indexes for table `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `alumno`
--
ALTER TABLE `alumno`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `cursada`
--
ALTER TABLE `cursada`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `materia`
--
ALTER TABLE `materia`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cursada`
--
ALTER TABLE `cursada`
  ADD CONSTRAINT `cursada_ibfk_1` FOREIGN KEY (`IDALUMNO`) REFERENCES `alumno` (`ID`),
  ADD CONSTRAINT `cursada_ibfk_2` FOREIGN KEY (`IDMATERIA`) REFERENCES `materia` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
