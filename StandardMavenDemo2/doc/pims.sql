/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 60011
Source Host           : localhost:3306
Source Database       : pims

Target Server Type    : MYSQL
Target Server Version : 60011
File Encoding         : 65001

Date: 2019-04-30 17:49:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `ID` varchar(36) NOT NULL,
  `NAME` varchar(100) NOT NULL,
  `PWD` varchar(32) NOT NULL,
  `CREATEDATETIME` timestamp NULL DEFAULT NULL,
  `MODIFYDATETIME` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('fad9fda3-80d7-4cb9-8f4b-e63a73737cf5', '七星云-恒', 'Smile', '2019-04-30 17:48:47', null);
