-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 22, 2020 at 08:00 AM
-- Server version: 5.7.21
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gradingdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `grades`
--

DROP TABLE IF EXISTS `grades`;
CREATE TABLE IF NOT EXISTS `grades` (
  `gradeID` int(11) NOT NULL AUTO_INCREMENT,
  `studentName` varchar(45) DEFAULT NULL,
  `gradeLevel` varchar(45) DEFAULT NULL,
  `finalGrade` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`gradeID`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `grades`
--

INSERT INTO `grades` (`gradeID`, `studentName`, `gradeLevel`, `finalGrade`, `status`) VALUES
(1, 'Pia Arak', '1', '99.0', 'PASSED'),
(2, 'Yen Gutierrez', '1', '100.0', 'PASSED'),
(3, 'Yen Gutierrez', '10', '76.0', 'PASSED'),
(4, 'James Lebron', '10', '70.0', 'FAILED'),
(5, 'Pia Arak', '6', '90.0', 'PASSED'),
(6, 'san tino', '8', '81.0', 'PASSED'),
(7, 'Agot Isidro', '7', '85.0', 'PASSED'),
(8, 'Agot Isidro', '7', '84.0', 'PASSED'),
(9, 'seth jhon bulahan', '8', '88.0', 'PASSED');

-- --------------------------------------------------------

--
-- Table structure for table `new_table`
--

DROP TABLE IF EXISTS `new_table`;
CREATE TABLE IF NOT EXISTS `new_table` (
  `idnew_table` int(11) NOT NULL,
  `new_tablecol` varchar(45) DEFAULT NULL,
  `new_tablecol1` varchar(45) DEFAULT NULL,
  `new_tablecol2` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idnew_table`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
CREATE TABLE IF NOT EXISTS `students` (
  `studentID` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `age` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `wholeName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`studentID`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`studentID`, `firstname`, `lastname`, `age`, `gender`, `address`, `wholeName`) VALUES
(1, 'Pia', 'Arak', '20', 'FEMALE', 'Baganga', 'Pia Arak'),
(2, 'Yen', 'Gutierrez', '20', 'FEMALE', 'Davao City', 'Yen Gutierrez'),
(3, 'Murean', 'Gutierrez', '20', 'FEMALE', 'DAVAO CITY', 'Murean Gutierrez'),
(4, 'James', 'Lebron', '21', 'MALE', 'Mati', 'James Lebron'),
(5, 'ako', 'ilaw', '21', 'MALE', 'lambajon', 'ako ilaw'),
(6, 'yow', 'hey', '21', 'MALE', 'baganga', 'yow hey'),
(7, 'yeah', 'yow', '22', 'MALE', 'Mati', 'yeah yow'),
(8, 'san', 'tino', '18', 'MALE', 'Manila', 'san tino'),
(9, 'Agot', 'Isidro', '21', 'MALE', 'San Isidro', 'Agot Isidro'),
(10, 'seth jhon', 'bulahan', '20', 'MALE', 'San Isidro', 'seth jhon bulahan');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `userID` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userID`, `username`, `password`) VALUES
(1, 'user', 'user');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
