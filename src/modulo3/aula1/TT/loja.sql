-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: loja
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `id_clientes` int NOT NULL,
  `name` varchar(80) NOT NULL,
  `birth` date DEFAULT NULL,
  `cpf` varchar(11) NOT NULL,
  `sexo` char(1) DEFAULT NULL,
  PRIMARY KEY (`id_clientes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (123,'Luiza Luna Ester Rodrigues','1983-07-06','26445688110','F'),(148,'Heitor Gabriel Souza','1942-03-24','07520922197','M'),(214,'Juan Thomas Carvalho','1984-01-05','94699534872','M'),(321,'Betina Louise Nina da Mota','1975-02-14','19096521641','F'),(875,'Iago Theo Anderson Barbosa','1971-02-14','64289917305','M');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enderecos`
--

DROP TABLE IF EXISTS `enderecos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `enderecos` (
  `id_enderecos` int NOT NULL,
  `cidade` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL,
  `bairro` varchar(45) NOT NULL,
  `logradouro` varchar(45) NOT NULL,
  `numero` varchar(45) NOT NULL,
  `fk_cliente` int DEFAULT NULL,
  PRIMARY KEY (`id_enderecos`),
  KEY `fk_cliente_idx` (`fk_cliente`),
  CONSTRAINT `fk_cliente` FOREIGN KEY (`fk_cliente`) REFERENCES `clientes` (`id_clientes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enderecos`
--

LOCK TABLES `enderecos` WRITE;
/*!40000 ALTER TABLE `enderecos` DISABLE KEYS */;
INSERT INTO `enderecos` VALUES (1,'Boa Vista','RR','Cauamé','Rua Iuguslávia','172',123),(2,'Campos dos Goytacazes','RJ','Parque Boa Vista','Rua Florianópolis','110',148),(3,'Palmeira dos Índios','AL','Palmeira de Fora','Rua Antônio Pau Ferro','422',214),(4,'Blumenau','SC','Do Salto','Rua Presidente Andrade Pinto','513',321),(5,'Brasília','DF','Vila São José (Brazlândia)','Quadra Quadra 45 Conjunto J','988',875);
/*!40000 ALTER TABLE `enderecos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itens_pedido`
--

DROP TABLE IF EXISTS `itens_pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itens_pedido` (
  `id_itens_pedido` int NOT NULL,
  `fk_pedido` int NOT NULL,
  `fk_produto` int NOT NULL,
  `quantidade` int NOT NULL,
  PRIMARY KEY (`id_itens_pedido`),
  KEY `fk_pedido_idx` (`fk_pedido`),
  KEY `fk_produto_idx` (`fk_produto`),
  CONSTRAINT `fk_pedido` FOREIGN KEY (`fk_pedido`) REFERENCES `pedidos` (`id_pedido`),
  CONSTRAINT `fk_produto` FOREIGN KEY (`fk_produto`) REFERENCES `produtos` (`id_produto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itens_pedido`
--

LOCK TABLES `itens_pedido` WRITE;
/*!40000 ALTER TABLE `itens_pedido` DISABLE KEYS */;
INSERT INTO `itens_pedido` VALUES (1,367,189,1),(2,367,219,1),(3,891,604,1),(4,891,219,1),(5,367,762,1);
/*!40000 ALTER TABLE `itens_pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidos` (
  `id_pedido` int NOT NULL,
  `valor_total` decimal(6,2) NOT NULL,
  `fk_cliente` int NOT NULL,
  PRIMARY KEY (`id_pedido`),
  KEY `fk_cliente_idx` (`fk_cliente`),
  CONSTRAINT `fk_cliente_pedidos` FOREIGN KEY (`fk_cliente`) REFERENCES `clientes` (`id_clientes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
INSERT INTO `pedidos` VALUES (367,5000.00,321),(891,3526.00,148),(894,465.00,123);
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produtos`
--

DROP TABLE IF EXISTS `produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produtos` (
  `id_produto` int NOT NULL,
  `nome` varchar(45) NOT NULL,
  `preco` decimal(6,2) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `quantidade` int NOT NULL,
  PRIMARY KEY (`id_produto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produtos`
--

LOCK TABLES `produtos` WRITE;
/*!40000 ALTER TABLE `produtos` DISABLE KEYS */;
INSERT INTO `produtos` VALUES (189,'T-Dagger Corvette, LED Rainbow',180.00,'Teclado Mecânico',28),(219,'HyperX Cloud Stinger',285.00,'Headset Gamer',84),(306,'AMD Ryzen 5 1600, Cache 19MB, 3.2GHz',875.00,'Processador',30),(604,'Monitor UltraWide Curvo',3241.00,'Monitor Gamer',16),(762,'GeForce RTX 2060',5000.00,'Placa de video',12);
/*!40000 ALTER TABLE `produtos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-15 14:29:31
