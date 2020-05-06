-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2020 at 01:38 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `recruitment_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `application`
--

CREATE TABLE `application` (
  `ID` int(11) NOT NULL,
  `jobSeekerID` int(11) NOT NULL,
  `jobID` int(11) NOT NULL,
  `Date` varchar(10) NOT NULL,
  `status` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE `company` (
  `ID` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `location` text NOT NULL,
  `email` varchar(25) NOT NULL,
  `U_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `job`
--

CREATE TABLE `job` (
  `ID` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `description` text NOT NULL,
  `qualification` text NOT NULL,
  `publishDate` text NOT NULL,
  `C_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `jobseeker`
--

CREATE TABLE `jobseeker` (
  `jobSeekerID` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `age` int(11) NOT NULL,
  `email` text NOT NULL,
  `education` text NOT NULL,
  `U_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `jobseekerexp`
--

CREATE TABLE `jobseekerexp` (
  `numOfYears` int(11) NOT NULL,
  `CompanyName` varchar(20) NOT NULL,
  `title` varchar(20) NOT NULL,
  `skills` int(11) NOT NULL,
  `JS_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `systemadministrator`
--

CREATE TABLE `systemadministrator` (
  `A_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `useraccount`
--

CREATE TABLE `useraccount` (
  `ID` int(11) NOT NULL,
  `Role` int(11) NOT NULL,
  `password` varchar(8) NOT NULL,
  `username` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `useraccount`
--

INSERT INTO `useraccount` (`ID`, `Role`, `password`, `username`) VALUES
(1, 1, '123456', 'EzzatMahmoud');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `application`
--
ALTER TABLE `application`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `JS_ID` (`jobSeekerID`),
  ADD KEY `J_ID` (`jobID`);

--
-- Indexes for table `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `U_ID` (`U_ID`);

--
-- Indexes for table `job`
--
ALTER TABLE `job`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `C_ID` (`C_ID`);

--
-- Indexes for table `jobseeker`
--
ALTER TABLE `jobseeker`
  ADD PRIMARY KEY (`jobSeekerID`),
  ADD KEY `U_ID` (`U_ID`);

--
-- Indexes for table `jobseekerexp`
--
ALTER TABLE `jobseekerexp`
  ADD KEY `JS_ID` (`JS_ID`);

--
-- Indexes for table `systemadministrator`
--
ALTER TABLE `systemadministrator`
  ADD PRIMARY KEY (`A_ID`);

--
-- Indexes for table `useraccount`
--
ALTER TABLE `useraccount`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `application`
--
ALTER TABLE `application`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `company`
--
ALTER TABLE `company`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `job`
--
ALTER TABLE `job`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `jobseeker`
--
ALTER TABLE `jobseeker`
  MODIFY `jobSeekerID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `systemadministrator`
--
ALTER TABLE `systemadministrator`
  MODIFY `A_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `useraccount`
--
ALTER TABLE `useraccount`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `application`
--
ALTER TABLE `application`
  ADD CONSTRAINT `application_ibfk_1` FOREIGN KEY (`jobSeekerID`) REFERENCES `jobseeker` (`jobSeekerID`),
  ADD CONSTRAINT `application_ibfk_2` FOREIGN KEY (`jobID`) REFERENCES `job` (`ID`);

--
-- Constraints for table `company`
--
ALTER TABLE `company`
  ADD CONSTRAINT `company_ibfk_1` FOREIGN KEY (`U_ID`) REFERENCES `useraccount` (`ID`);

--
-- Constraints for table `job`
--
ALTER TABLE `job`
  ADD CONSTRAINT `job_ibfk_1` FOREIGN KEY (`C_ID`) REFERENCES `company` (`ID`);

--
-- Constraints for table `jobseeker`
--
ALTER TABLE `jobseeker`
  ADD CONSTRAINT `jobseeker_ibfk_1` FOREIGN KEY (`U_ID`) REFERENCES `useraccount` (`ID`);

--
-- Constraints for table `jobseekerexp`
--
ALTER TABLE `jobseekerexp`
  ADD CONSTRAINT `jobseekerexp_ibfk_1` FOREIGN KEY (`JS_ID`) REFERENCES `jobseeker` (`jobSeekerID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
