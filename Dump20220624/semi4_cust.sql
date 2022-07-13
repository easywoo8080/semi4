-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: ziuzi808.iptime.org    Database: semi4
-- ------------------------------------------------------
-- Server version	8.0.29-0ubuntu0.22.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cust`
--

DROP TABLE IF EXISTS `cust`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cust` (
  `uid` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `pwd` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `name` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `addr` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `phon` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `birth` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cust`
--

LOCK TABLES `cust` WRITE;
/*!40000 ALTER TABLE `cust` DISABLE KEYS */;
INSERT INTO `cust` VALUES ('id01','pwd01','kim','Seoul','tel1',2000),('id02','pwd02','lee','Incheon','tel2',2001),('id03','pwd03','park','Daegu','tel3',2003),('admin','1111','admin','Seoul','tela',1999),('id04','pwd04','jeong','Gyeonggi','tel4',1994),('id05','pwd05','woo','예산','tel5',1995),('111','123','111','1111','1111',1111),('id06','pwd06','kang','안동','tel6',1996),('id07','pwd07','hwang','울산','tel7',1987),('id08','pwd08','ahn','창원','tel8',1998),('id09','pwd09','min','김해','tel9',1989),('id10','pwd10','son','춘천','tel10',1980),('id11','pwd11','ji','의성','tel11',1971),('111441','1111','1111','1111','1111',1111),('1234','1234','1234','1234','1234',1234),('id12','pwd12','moon','나주','tel12',2012),('id13','pwd13','san','예산','tel13',2013),('id011','111','강주성','부산','010',1993);
/*!40000 ALTER TABLE `cust` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-24 17:54:19
