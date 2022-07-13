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
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `pid` int NOT NULL AUTO_INCREMENT,
  `cid` int NOT NULL,
  `title` varchar(400) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `writer` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `pub` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `price` int DEFAULT NULL,
  `status` int DEFAULT NULL,
  `date` date DEFAULT NULL,
  `adult` int DEFAULT NULL,
  `img0` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `img1` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `img2` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (4,11,'백범일지','김구','돌베게',10800,1,'2005-11-05',0,'백범1.png','백범2.png','백범3.png'),(5,11,'강남의 탄생','한종수','미지북스',13500,1,'2016-05-05',0,'강남1.png','강남2.png','강남3.png'),(6,11,'매디컬 조선','박영규','김영사',13500,1,'2021-05-24',0,'매조1.png','매조2.png','매조3.png'),(7,11,'한국 정원 기행','김종길','미래의창',15300,1,'2020-06-01',0,'정원1.png','정원2.png','정원3.png'),(8,11,'북학의','박제가','서해문집',10700,1,'2003-03-10',0,'북학의1.png','북학의2.png','북학의3.png'),(9,12,'실크로드 세계사','피터 프랭코판','책과함께',29700,1,'2017-05-17',0,'실크1.png','실크2.png','실크3.png'),(10,12,'독일은 왜 잘하는가','존 캠프너','열린책들',20700,1,'2022-05-15',0,'독일1.png','독일2.png','독일3.png'),(11,12,'롤랑의 노래','김준환','휴머니스트',19800,1,'2022-04-11',0,'롤랑1.png','롤랑2.png','롤랑3.png'),(12,12,'영국을 읽다','장정훈','SISO',16200,1,'2022-06-05',0,'영국1.png','영국2.png','영국3.png'),(13,12,'피에 젖은 땅','티머시 스나이더','글항아리',39600,1,'2021-03-05',0,'피1.png','피2.png','피3.png'),(14,21,'하루쯤 나 혼자 어디라도 가야겠다','장은정','북라이프',14220,1,'2019-04-05',0,'하루쯤1.jpg','하루쯤2.jpg','하루쯤3.jpg'),(15,21,'이국적인 국내여행지 64','이환수','책밥',15300,1,'2018-06-15',0,'이국적인1.jpg','이국적인2.jpg','이국적인3.jpg'),(16,21,'아이랑 제주 여행','송인희','디스커버리미디어',15300,1,'2018-04-19',0,'아이랑1.jpg','아이랑2.jpg','아이랑3.jpg'),(17,21,'주말이 기다려지는 행복한 걷기여행','김영록','터치아크',15300,1,'2009-06-12',0,'걷기여행1.jpg','걷기여행2.jpg','걷기여행3.jpg'),(18,21,'일상이 고고학, 나혼자 경주여행','황윤','책읽는 고양이',14310,1,'2012-05-26',0,'경주여행1.jpg','경주여행2.jpg','경주여행3.jpg'),(19,22,'제 마음대로 살아보겠습니다','이원지','상상출판',12780,1,'2014-11-04',0,'마음대로1.jpg','마음대로2.jpg','마음대로3.jpg'),(20,22,'무작정 따라하기 하와이','박재서','길벗',19800,1,'2015-12-27',0,'하와이1.jpg','하와이2.jpg','하와이3.jpg'),(21,22,'리얼 괌','민정아','한빛라이프',15300,1,'2016-08-17',0,'리얼괌1.jpg','리얼괌2.jpg','리얼괌3.jpg'),(22,22,'아이슬란드가 아니였다면','강은경','어떤책',14220,1,'2011-05-05',0,'아이슬란드1.jpg','아이슬란드2.jpg','아이슬란드3.jpg'),(23,22,'유럽 캠핑 30일','안수지','M31',16200,1,'2021-09-02',0,'유럽캠핑1.jpg','유럽캠핑2.jpg','유럽캠핑3.jpg'),(24,31,'납작하고 투명한 사람들','백세희','호밀밭',12600,1,'2022-10-16',0,'납작하고_투명한_사람들00.jpg','납작하고_투명한_사람들01.jpg','납작하고_투명한_사람들02.jpg'),(25,31,'역사의 갈림길에 선 대한민국','현무진','이른아침',13500,1,'2011-05-12',0,'역사의갈림길에선대한민국00.jpg','역사의갈림길에선대한민국01.jpg','역사의갈림길에선대한민국02.jpg'),(26,31,'생일 없는 아이들','김희진, 강정은, 마한얼, 이제호, 이진혜 외 1명','틈새의 시간',13500,1,'2020-01-11',0,'생일없는아이들00.jpg','생일없는아이들01.jpg','생일없는아이들02.jpg'),(27,31,'그래도나아간다는믿음','서창록','북스톤',14400,1,'2019-02-08',0,'그래도나아간다는믿음00.jpg','그래도나아간다는믿음01.jpg','그래도나아간다는믿음02.jpg'),(28,31,'시험능력주의','김동춘','창비',18000,1,'2018-11-18',0,'시험능력주의00.jpg','시험능력주의01.jpg','시험능력주의02.jpg'),(29,32,'탄소로운식탁','윤지로','세종서적',16200,1,'2016-07-25',0,'탄소로운식탁00.jpg','탄소로운식탁01.jpg','탄소로운식탁02.jpg'),(30,32,'식량위기 대한민국','남재작','웨일북',16650,1,'2013-01-23',0,'식량위기대한민국00.jpg','식량위기대한민국01.jpg','식량위기대한민국02.jpg'),(31,32,'지구를위하는마음','김명철','유영',15300,1,'2010-12-13',0,'지구를위하는마음00.jpg','지구를위하는마음01.jpg','지구를위하는마음02.jpg'),(32,32,'떡갈나무혁명을꿈꾸다','신슨철','한살림',15300,1,'2009-05-02',0,'떡갈나무혁명을꿈꾸다00.jpg','떡갈나무혁명을꿈꾸다01.jpg','떡갈나무혁명을꿈꾸다02.jpg'),(33,32,'파란하늘 빨간지구','조천호','동아시아',14400,1,'2018-05-19',0,'파란하늘빨간지구00.jpg','파란하늘빨간지구01.jpg','파란하늘빨간지구02.jpg'),(34,41,'간츠','오쿠 히로야','시공사/DCW',3500,1,'2010-06-22',19,'adult.jpg','간츠00.jpg','간츠01.jpg'),(35,41,'감옥학원','히라모토 아키라','대원',3000,1,'2009-08-13',19,'adult.jpg','감옥학원00.jpg','감옥학원01.jpg'),(36,42,'가정부 길들이기','레드핫','S로맨스',1500,1,'2018-04-01',19,'adult.jpg','가정부길들이기01.jpg','가정부길들이기02.jpg');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
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
