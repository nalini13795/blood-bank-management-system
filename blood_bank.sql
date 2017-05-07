-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 28, 2016 at 01:46 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `blood_bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `blood`
--

CREATE TABLE IF NOT EXISTS `blood` (
  `PACKET_ID` int(11) NOT NULL,
  `B_GRP` text NOT NULL,
  `B_PRICE` int(11) NOT NULL,
  `B_DATE` date NOT NULL,
  `BRANCH_ID` int(11) NOT NULL,
  `DONOR_ID` int(11) NOT NULL,
  PRIMARY KEY (`PACKET_ID`),
  KEY `BRANCH_ID` (`BRANCH_ID`),
  KEY `DONOR_ID` (`DONOR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `blood`
--

INSERT INTO `blood` (`PACKET_ID`, `B_GRP`, `B_PRICE`, `B_DATE`, `BRANCH_ID`, `DONOR_ID`) VALUES
(100, 'B+', 500, '2016-03-13', 1, 100),
(123, 'a+', 300, '2016-03-28', 5, 201),
(1001, 'B+', 200, '2016-08-03', 1, 100),
(1015, 'AB+', 150, '2016-07-26', 5, 101),
(2015, 'O+', 150, '2016-07-26', 5, 201);

--
-- Triggers `blood`
--
DROP TRIGGER IF EXISTS `HISTORY`;
DELIMITER //
CREATE TRIGGER `HISTORY` AFTER DELETE ON `blood`
 FOR EACH ROW insert into blood_history values(OLD.PACKET_ID,OLD.B_GRP,OLD.B_DATE,OLD.BRANCH_ID,OLD.DONOR_ID)
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `blood_history`
--

CREATE TABLE IF NOT EXISTS `blood_history` (
  `ID` int(11) NOT NULL,
  `B_GRP` int(11) NOT NULL,
  `B_DATE` date NOT NULL,
  `BRANCH_ID` int(11) NOT NULL,
  `DONOR_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `blood_history`
--

INSERT INTO `blood_history` (`ID`, `B_GRP`, `B_DATE`, `BRANCH_ID`, `DONOR_ID`) VALUES
(2001, 0, '2016-08-25', 200, 1),
(5001, 0, '2016-08-03', 1, 500),
(6029, 0, '2016-08-17', 602, 9),
(7029, 0, '2016-08-17', 702, 9);

-- --------------------------------------------------------

--
-- Table structure for table `blood_request`
--

CREATE TABLE IF NOT EXISTS `blood_request` (
  `P_NAME` varchar(11) NOT NULL,
  `P_GRP` text NOT NULL,
  `QUANTITIY` int(11) NOT NULL,
  `H_ID` int(11) NOT NULL,
  `BRANCH_ID` int(11) NOT NULL,
  `ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `H_ID` (`H_ID`),
  KEY `BRANCH_ID` (`BRANCH_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `branch`
--

CREATE TABLE IF NOT EXISTS `branch` (
  `BRANCH_ID` int(11) NOT NULL,
  `B_LOCATION` varchar(20) NOT NULL,
  `B_EMAIL` text NOT NULL,
  `B_PHONE` int(11) NOT NULL,
  `B_HEAD` varchar(15) NOT NULL,
  `LICENSE` int(11) NOT NULL,
  PRIMARY KEY (`BRANCH_ID`),
  KEY `LICENSE` (`LICENSE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `branch`
--

INSERT INTO `branch` (`BRANCH_ID`, `B_LOCATION`, `B_EMAIL`, `B_PHONE`, `B_HEAD`, `LICENSE`) VALUES
(1, 'KURLA', 'kurla123@gmail.com', 12367795, 'PANKAJ', 159629),
(2, 'KALYAN', 'KALYAN@gmail.com', 56445341, 'MAYURI', 159629),
(3, 'nerul', 'nerul@gmail.com', 54445423, 'mukta', 159629),
(5, 'BHANDUP', 'bhandup123@gmail.com', 56223378, 'TANVI', 159629),
(123, 'fhfh', 'ffddf@fhf.qwewq', 233, 'dfr', 159629);

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE IF NOT EXISTS `company` (
  `NAME` varchar(15) NOT NULL,
  `LICENCE` int(11) NOT NULL,
  `OWNER` varchar(15) NOT NULL,
  PRIMARY KEY (`LICENCE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `company`
--

INSERT INTO `company` (`NAME`, `LICENCE`, `OWNER`) VALUES
('THE BLOOD BANK', 159629, 'KANIKA KAUR');

-- --------------------------------------------------------

--
-- Table structure for table `donor`
--

CREATE TABLE IF NOT EXISTS `donor` (
  `DONOR_ID` int(11) NOT NULL,
  `ADDRESS` varchar(25) NOT NULL,
  `BLOOD_GRP` varchar(5) NOT NULL,
  `EMAIL` text NOT NULL,
  `MOBILE_NO` int(15) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `PACKET_ID` int(11) NOT NULL,
  `BRANCH_ID` int(11) NOT NULL,
  `AGE` int(11) DEFAULT NULL,
  PRIMARY KEY (`DONOR_ID`),
  KEY `BRANCH_ID` (`BRANCH_ID`),
  KEY `PACKET_ID` (`PACKET_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donor`
--

INSERT INTO `donor` (`DONOR_ID`, `ADDRESS`, `BLOOD_GRP`, `EMAIL`, `MOBILE_NO`, `NAME`, `PACKET_ID`, `BRANCH_ID`, `AGE`) VALUES
(100, 'KALYAN', 'B+', 'nalini@gmail.com', 2147483647, 'NALINI', 1001, 1, 22),
(101, 'THANE', 'AB+', 'mouni@gmal.com', 2147483647, 'MOUNI', 1015, 5, 35),
(201, 'PUNE', 'O+', 'tanu@gmail.com', 12345625, 'TANU', 2015, 5, 24);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE IF NOT EXISTS `employee` (
  `E_ID` int(11) NOT NULL,
  `E_SALARY` int(11) NOT NULL,
  `E_ADDRESS` varchar(20) NOT NULL,
  `E_DESIG` varchar(15) NOT NULL,
  `E_NAME` varchar(15) NOT NULL,
  `E_MOBILE_NO` int(11) NOT NULL,
  `E_EMAIL` text NOT NULL,
  `BRANCH_ID` int(11) NOT NULL,
  PRIMARY KEY (`E_ID`),
  KEY `BRANCH_ID` (`BRANCH_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`E_ID`, `E_SALARY`, `E_ADDRESS`, `E_DESIG`, `E_NAME`, `E_MOBILE_NO`, `E_EMAIL`, `BRANCH_ID`) VALUES
(1, 50000, 'GHATKOPAR', 'BRANCH HEAD', 'POOJA', 1632046652, 'pooja@gmail.com', 5),
(2, 5600, 'MAHIM', 'PEON', 'PREETAM', 236592004, 'preetam@gmail.com', 1),
(3, 5000, 'ANDHERI', 'PEON', 'PAYAL', 156301789, 'payal@gmail.com', 5),
(4, 50000, 'BHANDUP', 'BRANCH HEAD', 'MUKTA', 964589623, 'mukta@gmail.com', 1),
(5, 9000, 'habibganj', 'doctor', 'yash', 45663755, 'yash@gmail.com', 5),
(123, 345, 'hmhggh', 'fhhjh', 'ffgfjhj', 2435, 'fgfggf@ghg.gdh', 3);

-- --------------------------------------------------------

--
-- Table structure for table `hospital`
--

CREATE TABLE IF NOT EXISTS `hospital` (
  `H_ID` int(11) NOT NULL,
  `H_EMAIL` text NOT NULL,
  `H_LOCATION` varchar(20) NOT NULL,
  `H_CONTACT_NO` int(11) NOT NULL,
  `H_NAME` varchar(15) NOT NULL,
  PRIMARY KEY (`H_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hospital`
--

INSERT INTO `hospital` (`H_ID`, `H_EMAIL`, `H_LOCATION`, `H_CONTACT_NO`, `H_NAME`) VALUES
(111, 'kohinoor@gmail.com', 'KURLA', 25667815, 'KOHINOOR'),
(112, 'wakhart@gmail.com', 'MULUND', 56331247, 'WAKHART'),
(113, 'lilavati@gmail.com', 'kurla', 25663255, 'LILAVATI'),
(114, 'SANJ@GMAIL.COM', 'MAROL', 25661210, 'SANJIVNI'),
(115, 'palavi@gmail.com', 'kalyan', 25663254, 'palavi'),
(116, 'parvati@gmail.com', 'kalyan', 98778965, 'palavi'),
(1001, 'b@gmail.com', 'bhandup', 5644564, 'bhandup');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `blood`
--
ALTER TABLE `blood`
  ADD CONSTRAINT `blood_ibfk_1` FOREIGN KEY (`BRANCH_ID`) REFERENCES `branch` (`BRANCH_ID`),
  ADD CONSTRAINT `blood_ibfk_2` FOREIGN KEY (`DONOR_ID`) REFERENCES `donor` (`DONOR_ID`);

--
-- Constraints for table `blood_request`
--
ALTER TABLE `blood_request`
  ADD CONSTRAINT `blood_request_ibfk_1` FOREIGN KEY (`H_ID`) REFERENCES `hospital` (`H_ID`),
  ADD CONSTRAINT `blood_request_ibfk_2` FOREIGN KEY (`BRANCH_ID`) REFERENCES `branch` (`BRANCH_ID`);

--
-- Constraints for table `branch`
--
ALTER TABLE `branch`
  ADD CONSTRAINT `branch_ibfk_1` FOREIGN KEY (`LICENSE`) REFERENCES `company` (`LICENCE`);

--
-- Constraints for table `donor`
--
ALTER TABLE `donor`
  ADD CONSTRAINT `donor_ibfk_1` FOREIGN KEY (`BRANCH_ID`) REFERENCES `branch` (`BRANCH_ID`),
  ADD CONSTRAINT `donor_ibfk_2` FOREIGN KEY (`PACKET_ID`) REFERENCES `blood` (`PACKET_ID`);

--
-- Constraints for table `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`BRANCH_ID`) REFERENCES `branch` (`BRANCH_ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
