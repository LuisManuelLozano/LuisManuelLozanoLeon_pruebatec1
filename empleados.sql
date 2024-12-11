CREATE DATABASE  IF NOT EXISTS `empleados` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `empleados`;
-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: empleados
-- ------------------------------------------------------
-- Server version	9.1.0

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
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado` (
  `ID` bigint NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(225) DEFAULT NULL,
  `APELLIDO` varchar(255) DEFAULT NULL,
  `CARGO` varchar(255) DEFAULT NULL,
  `FECHAINI` date DEFAULT NULL,
  `SALARIO` double DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES (1,'Juan','Jiménez','Presidente','2019-11-23',1550),(4,'Joaquín','PEREZ','SECRETARIO','2024-11-17',1500),(6,'Angel','JIMENO','OFICIAL','2014-11-06',1150),(7,'Juan José','MESAS','PRESIDENTE','2022-03-09',1000),(10,'Miguel Angel','BERMUDEZ','OPERARIO','2020-08-11',1100),(13,'Luis Manuel','LOZANO','RECTOR','2018-12-23',8000),(14,'Fernando','RODRIGUEZ','OPERARIO','2011-12-07',1450),(15,'Jonathan','MOÑIGUEZ','OPERARIO','2011-12-17',1150),(16,'Silivio','fernandez','barrendero','2024-12-26',1000),(17,'Francisco','González','mecánico','0011-12-24',1500),(18,'Vicente','Aranda','Gestor','2012-12-23',1600),(19,'Javier','Riquelme','Secretario','2012-01-14',2450),(20,'Carmelo','Carmélez','operario','2010-11-23',1200),(21,'Bibiana','Fernández','Secretaria','2024-12-01',1550),(22,'Rodrigo','Riquelme','Operario','2024-11-07',1100);
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'empleados'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-11 18:34:24
