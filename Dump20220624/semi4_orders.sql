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
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `oid` int NOT NULL AUTO_INCREMENT,
  `uid` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `odate` date DEFAULT NULL,
  `oname` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `oaddr` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ophon` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ostatus` int DEFAULT NULL,
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'id01','2022-06-20','jung','Seoul','ophon1',0),(2,'id02','2022-06-20','lee','Seoul','ophon2',0),(3,'id02','2022-06-20','choi','Seoul','ophon2',0),(4,'id02','2022-06-23','choi','Seoul','ophon2',0),(5,'id02','2022-06-23','choi','Seoul','ophon2',0),(6,'id02','2022-06-23','choi','Seoul','ophon2',0),(7,'id02','2022-06-24','choi','Seoul','ophon2',0),(8,'id02','2022-06-24','choi','Seoul','ophon2',0),(9,'order01','2022-06-24','인설트테스트','대한민국','010',0),(10,'order44','2022-06-24','인설트테스트','대한민국','010',0),(11,'order44','2022-06-24','인설트테스트','대한민국','010',0),(12,'order44','2022-06-24','인설트테스트','대한민국','010',0),(13,'111','2022-06-24','111','1111','1111',0),(14,'111','2022-06-24','111','1111','1111',0),(15,'111','2022-06-24','111','1111','1111',0),(16,'111','2022-06-24','111','1111','1111',0),(17,'111','2022-06-24','111','1111','1111',0),(18,'111','2022-06-24','111','1111','1111',0),(19,'111','2022-06-24','111','1111','1111',0),(20,'111','2022-06-24','111','1111','1111',0),(21,'111','2022-06-24','111','1111','1111',0),(22,'111','2022-06-24','111','1111','1111',0),(23,'111','2022-06-24','111','1111','1111',0),(24,'id02','2022-06-24','choi','Seoul','ophon2',0),(25,'111','2022-06-24','111','1111','1111',0),(26,'111','2022-06-24','111','1111','1111',0),(27,'111','2022-06-24','111','1111','1111',0),(28,'id04','2022-06-24','jeong','Gyeonggi','tel4',0),(29,'id04','2022-06-24','jeong','Gyeonggi','tel4',0),(30,'id04','2022-06-24','jeong','Gyeonggi','tel4',0),(31,'id04','2022-06-24','jeong','Gyeonggi','tel4',0),(32,'id01','2022-06-24','kim','Seoul','tel1',0),(33,'id01','2022-06-24','kim','Seoul','tel1',0),(34,'id01','2022-06-24','kim','Seoul','tel1',0),(35,'id01','2022-06-24','kim','Seoul','tel1',0),(36,'id011','2022-06-24','강주성','부산','010',0);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-24 17:54:20
