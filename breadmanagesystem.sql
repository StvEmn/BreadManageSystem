/*
 Navicat Premium Data Transfer

 Source Server         : MYSQL80
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : breadmanagesystem

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 02/11/2020 19:51:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for purchase
-- ----------------------------
DROP TABLE IF EXISTS `purchase`;
CREATE TABLE `purchase`  (
  `Id` int NOT NULL AUTO_INCREMENT,
  `GoodsName` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `Quantity` int NULL DEFAULT 0,
  `UnitPrice` decimal(5, 2) NULL DEFAULT 0.00,
  `TotalPrice` decimal(9, 2) NULL DEFAULT 0.00,
  `Specification` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `ProductionTime` date NULL DEFAULT NULL,
  `PurchaseTime` date NULL DEFAULT NULL,
  `Supplier` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `Address` varchar(200) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `Tel` varchar(11) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `CertificateNumber` varchar(200) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of purchase
-- ----------------------------
INSERT INTO `purchase` VALUES (6, '苹果', 4, 10.00, 40.00, '斤', '2020-11-11', '2020-11-11', '内江师范学院', '内江市', '110', '10101010');

-- ----------------------------
-- Table structure for shipment
-- ----------------------------
DROP TABLE IF EXISTS `shipment`;
CREATE TABLE `shipment`  (
  `Id` int NOT NULL AUTO_INCREMENT,
  `GoodsName` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `Quantity` int NULL DEFAULT 0,
  `UnitPrice` decimal(5, 2) NULL DEFAULT 0.00,
  `TotalPrice` decimal(9, 2) NULL DEFAULT 0.00,
  `Specification` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `ProductionTime` date NULL DEFAULT NULL,
  `DeliveryTime` date NULL DEFAULT NULL,
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shipment
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `password` varchar(16) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '123456');

SET FOREIGN_KEY_CHECKS = 1;
