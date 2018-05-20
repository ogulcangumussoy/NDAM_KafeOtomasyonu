-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.21-MariaDB


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema ndam_proje
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ ndam_proje;
USE ndam_proje;

--
-- Table structure for table `ndam_proje`.`kullanici`
--

DROP TABLE IF EXISTS `kullanici`;
CREATE TABLE `kullanici` (
  `kullanici_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `kullanici_ad` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `kullanici_adsoyad` varchar(150) COLLATE utf8_turkish_ci NOT NULL,
  `kullanici_parola` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `kullanici_yetki` enum('0','1') COLLATE utf8_turkish_ci NOT NULL DEFAULT '0',
  PRIMARY KEY (`kullanici_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `ndam_proje`.`kullanici`
--

/*!40000 ALTER TABLE `kullanici` DISABLE KEYS */;
INSERT INTO `kullanici` (`kullanici_id`,`kullanici_ad`,`kullanici_adsoyad`,`kullanici_parola`,`kullanici_yetki`) VALUES 
 (1,'naime','Naime Yalçın','123456','1'),
 (2,'ogulcan','Oğulcan Gümüşsoy','123456','1'),
 (3,'kasiyer','Tamer Mever','123456','0'),
 (4,'kasiyer2','Ahmet Veli','123456','0');
/*!40000 ALTER TABLE `kullanici` ENABLE KEYS */;


--
-- Table structure for table `ndam_proje`.`siparis`
--

DROP TABLE IF EXISTS `siparis`;
CREATE TABLE `siparis` (
  `siparis_id` int(11) NOT NULL AUTO_INCREMENT,
  `siparis_zaman` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `kullanici_ad` varchar(150) COLLATE utf8_turkish_ci NOT NULL,
  `siparis_adsoyad` varchar(150) COLLATE utf8_turkish_ci NOT NULL,
  `siparis_tip` varchar(1) COLLATE utf8_turkish_ci NOT NULL DEFAULT '0',
  `siparis_toplam` float(9,2) NOT NULL,
  PRIMARY KEY (`siparis_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `ndam_proje`.`siparis`
--

/*!40000 ALTER TABLE `siparis` DISABLE KEYS */;
INSERT INTO `siparis` (`siparis_id`,`siparis_zaman`,`kullanici_ad`,`siparis_adsoyad`,`siparis_tip`,`siparis_toplam`) VALUES 
 (1,'2018-05-18 14:36:46','kasiyer','Ali Gümüşsoy','1',42.50),
 (2,'2018-05-18 14:36:58','kasiyer','Mehmet Sayar','0',45.00),
 (3,'2018-05-18 14:36:46','kasiyer','Murat Kayar','1',42.50),
 (4,'2018-05-18 14:36:58','kasiyer','Hasan Yeter','0',45.00),
 (5,'2018-05-18 14:54:26','kasiyer','Veysel Gümüşsoy','1',42.00),
 (6,'2018-05-18 14:55:21','kasiyer2','Naime Yalçın','0',84.25),
 (7,'2018-05-18 16:19:51','kasiyer','Ahmet','0',46.00),
 (8,'2018-05-20 13:59:03','kasiyer','Veli Sayar','0',47.75),
 (9,'2018-05-20 16:10:02','kasiyer','Tamer Tuna','1',78.75);
/*!40000 ALTER TABLE `siparis` ENABLE KEYS */;


--
-- Table structure for table `ndam_proje`.`urun`
--

DROP TABLE IF EXISTS `urun`;
CREATE TABLE `urun` (
  `urun_id` int(11) NOT NULL AUTO_INCREMENT,
  `urun_ad` varchar(150) COLLATE utf8_turkish_ci NOT NULL,
  `urun_fiyat` float(9,2) NOT NULL,
  PRIMARY KEY (`urun_id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `ndam_proje`.`urun`
--

/*!40000 ALTER TABLE `urun` DISABLE KEYS */;
INSERT INTO `urun` (`urun_id`,`urun_ad`,`urun_fiyat`) VALUES 
 (1,'Türk Kahvesi',8.00),
 (2,'Damla Sakızlı Kahve',11.50),
 (3,'Americano',13.25),
 (4,'Mocha',16.25),
 (5,'Espresso',12.50),
 (29,'Türk Kahvesi',8.00),
 (30,'Damla Sakızlı Kahve',11.50),
 (31,'Americano',13.25),
 (32,'Mocha',16.25),
 (33,'Espresso',12.50),
 (34,'Türk Kahvesi',8.00),
 (35,'Damla Sakızlı Kahve',11.50),
 (36,'Americano',13.25),
 (37,'Mocha',16.25),
 (38,'Espresso',12.50),
 (39,'Türk Kahvesi',8.00),
 (40,'Damla Sakızlı Kahve',11.50),
 (41,'Americano',13.25),
 (42,'Mocha',16.25),
 (43,'Espresso',12.50);
/*!40000 ALTER TABLE `urun` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
