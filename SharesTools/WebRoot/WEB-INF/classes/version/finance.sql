/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 60011
Source Host           : localhost:3306
Source Database       : finance

Target Server Type    : MYSQL
Target Server Version : 60011
File Encoding         : 65001

Date: 2019-09-04 16:19:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `companys`
-- ----------------------------
DROP TABLE IF EXISTS `companys`;
CREATE TABLE `companys` (
  `code` varchar(50) NOT NULL DEFAULT '' COMMENT '公司股票代码',
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '公司名称',
  `commissionRate` varchar(50) NOT NULL COMMENT '佣金费率',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='证券公司信息表';

-- ----------------------------
-- Records of companys
-- ----------------------------
INSERT INTO `companys` VALUES ('600030', '中信证券', '0.0005');
INSERT INTO `companys` VALUES ('6000302', '中信证券2', '0.0005');
INSERT INTO `companys` VALUES ('600030243', '中信证券243', '0.0005');
INSERT INTO `companys` VALUES ('60003027', '中信证券1', '0.0005');

-- ----------------------------
-- Table structure for `lucres`
-- ----------------------------
DROP TABLE IF EXISTS `lucres`;
CREATE TABLE `lucres` (
  `sharesCode` bigint(20) NOT NULL COMMENT '股票代码',
  `costMoney` varchar(50) NOT NULL COMMENT '买入总额',
  `incomeMoney` varchar(50) NOT NULL COMMENT '卖出总额',
  `lestMoney` varchar(50) NOT NULL COMMENT '剩余市值',
  PRIMARY KEY (`sharesCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='股票盈亏统计表';

-- ----------------------------
-- Records of lucres
-- ----------------------------

-- ----------------------------
-- Table structure for `rate`
-- ----------------------------
DROP TABLE IF EXISTS `rate`;
CREATE TABLE `rate` (
  `rateId` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  `rate` varchar(50) NOT NULL,
  PRIMARY KEY (`rateId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='费率表';

-- ----------------------------
-- Records of rate
-- ----------------------------
INSERT INTO `rate` VALUES ('1001', '印花税', '0.001');

-- ----------------------------
-- Table structure for `shares`
-- ----------------------------
DROP TABLE IF EXISTS `shares`;
CREATE TABLE `shares` (
  `code` varchar(50) NOT NULL COMMENT '公司股票代码',
  `name` varchar(255) NOT NULL COMMENT '公司股票名称',
  `price` varchar(50) NOT NULL COMMENT '股票单价',
  `quantity` bigint(20) NOT NULL COMMENT '股票股数',
  `transTypeId` bigint(20) NOT NULL COMMENT '交易类型ID，买入或卖出',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='股票信息表';

-- ----------------------------
-- Records of shares
-- ----------------------------

-- ----------------------------
-- Table structure for `transactiontypes`
-- ----------------------------
DROP TABLE IF EXISTS `transactiontypes`;
CREATE TABLE `transactiontypes` (
  `transTypeId` bigint(20) NOT NULL COMMENT '交易类型ID',
  `name` varchar(255) NOT NULL COMMENT '交易类型名称',
  PRIMARY KEY (`transTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='交易类型分类表';

-- ----------------------------
-- Records of transactiontypes
-- ----------------------------
INSERT INTO `transactiontypes` VALUES ('1001', '买入');
INSERT INTO `transactiontypes` VALUES ('1002', '卖出');
