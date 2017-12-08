-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: sa45grp13ca
-- ------------------------------------------------------
-- Server version	5.5.58

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car` (
  `licenseplateno` varchar(45) NOT NULL,
  `custname` varchar(45) DEFAULT NULL,
  `custcontact` int(11) DEFAULT NULL,
  PRIMARY KEY (`licenseplateno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='				';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `localinventorylist`
--

DROP TABLE IF EXISTS `localinventorylist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `localinventorylist` (
  `partnumber` int(11) NOT NULL,
  `storeqty` int(11) DEFAULT NULL,
  PRIMARY KEY (`partnumber`),
  CONSTRAINT `partnumber` FOREIGN KEY (`partnumber`) REFERENCES `productdata` (`partnumber`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `localinventorylist`
--

LOCK TABLES `localinventorylist` WRITE;
/*!40000 ALTER TABLE `localinventorylist` DISABLE KEYS */;
/*!40000 ALTER TABLE `localinventorylist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productdata`
--

DROP TABLE IF EXISTS `productdata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productdata` (
  `partnumber` int(11) NOT NULL AUTO_INCREMENT,
  `partname` varchar(45) DEFAULT NULL,
  `unitprice` double DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `color` varchar(45) DEFAULT NULL,
  `dimension` double DEFAULT NULL,
  `supplierid` int(11) DEFAULT NULL,
  `reorderpoint` int(11) DEFAULT NULL,
  `minorder` int(11) DEFAULT NULL,
  `shelflocation` varchar(45) DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`partnumber`),
  KEY `supplierid_idx` (`supplierid`),
  CONSTRAINT `supplierid` FOREIGN KEY (`supplierid`) REFERENCES `suppliers` (`supplierid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10001 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productdata`
--

LOCK TABLES `productdata` WRITE;
/*!40000 ALTER TABLE `productdata` DISABLE KEYS */;
/*!40000 ALTER TABLE `productdata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staffdetails`
--

DROP TABLE IF EXISTS `staffdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staffdetails` (
  `staffid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`staffid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staffdetails`
--

LOCK TABLES `staffdetails` WRITE;
/*!40000 ALTER TABLE `staffdetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `staffdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suppliers`
--

DROP TABLE IF EXISTS `suppliers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `suppliers` (
  `supplierid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `contact` int(11) DEFAULT NULL,
  PRIMARY KEY (`supplierid`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suppliers`
--

LOCK TABLES `suppliers` WRITE;
/*!40000 ALTER TABLE `suppliers` DISABLE KEYS */;
/*!40000 ALTER TABLE `suppliers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transaction` (
  `transid` int(11) NOT NULL AUTO_INCREMENT,
  `staffid` int(11) DEFAULT NULL,
  `datetime` datetime DEFAULT NULL,
  `licenseplateno` varchar(45) DEFAULT NULL,
  `remarks` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`transid`),
  KEY `licenseplateno_idx` (`licenseplateno`),
  KEY `staffid_idx` (`staffid`),
  CONSTRAINT `staffidconstraint` FOREIGN KEY (`staffid`) REFERENCES `staffdetails` (`staffid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `licenseplateno` FOREIGN KEY (`licenseplateno`) REFERENCES `car` (`licenseplateno`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=100001 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction`
--

LOCK TABLES `transaction` WRITE;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transactiondetails`
--

DROP TABLE IF EXISTS `transactiondetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transactiondetails` (
  `transid` int(11) DEFAULT NULL,
  `partnumber` int(11) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  KEY `transid_idx` (`transid`),
  KEY `partnumber_idx` (`partnumber`),
  CONSTRAINT `partnumberconstraint` FOREIGN KEY (`partnumber`) REFERENCES `productdata` (`partnumber`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `transid` FOREIGN KEY (`transid`) REFERENCES `transaction` (`transid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transactiondetails`
--

LOCK TABLES `transactiondetails` WRITE;
/*!40000 ALTER TABLE `transactiondetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `transactiondetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userlogin`
--

DROP TABLE IF EXISTS `userlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userlogin` (
  `userid` varchar(45) NOT NULL,
  `staffid` int(11) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userid`),
  KEY `staffid_idx` (`staffid`),
  CONSTRAINT `staffid` FOREIGN KEY (`staffid`) REFERENCES `staffdetails` (`staffid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userlogin`
--

LOCK TABLES `userlogin` WRITE;
/*!40000 ALTER TABLE `userlogin` DISABLE KEYS */;
/*!40000 ALTER TABLE `userlogin` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-07 20:03:31
