/*
Navicat MySQL Data Transfer

Source Server         : localhost_3307
Source Server Version : 50525
Source Host           : localhost:3307
Source Database       : ticketsellingsystem

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2019-03-27 17:06:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for pasenger
-- ----------------------------
DROP TABLE IF EXISTS `pasenger`;
CREATE TABLE `pasenger` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` char(1) NOT NULL COMMENT '姓名',
  `id_card` char(1) NOT NULL COMMENT '证件号',
  `id_card_type` char(1) NOT NULL COMMENT '证件号类型',
  `phone` int(11) NOT NULL COMMENT '电话',
  `type` char(1) NOT NULL COMMENT '乘客类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pasenger
-- ----------------------------
INSERT INTO `pasenger` VALUES ('1', '1', '1', '1', '1', '1');
INSERT INTO `pasenger` VALUES ('2', '3', '3', '3', '3', '3');

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int(11) NOT NULL,
  `username` char(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('1', '你好世界');
INSERT INTO `test` VALUES ('2', '123');

-- ----------------------------
-- Table structure for train
-- ----------------------------
DROP TABLE IF EXISTS `train`;
CREATE TABLE `train` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `train_card` char(250) NOT NULL COMMENT '火车型号 如 k996',
  `start_place` varchar(255) NOT NULL COMMENT '起点',
  `end_place` varchar(255) NOT NULL COMMENT '终点',
  `start_time` datetime NOT NULL COMMENT '开始时间',
  `end_time` datetime NOT NULL COMMENT '结束时间',
  `first_seat` varchar(255) NOT NULL COMMENT '一等座位数',
  `first_seat_price` int(11) NOT NULL COMMENT '一等座位价格',
  `second_seat` varchar(255) NOT NULL COMMENT '二等座位数',
  `second_seat_price` int(11) NOT NULL COMMENT '二等座位数价格',
  `business_seat` varchar(255) NOT NULL COMMENT '商务座数量',
  `business_price` int(11) NOT NULL COMMENT '商务座价格',
  `train_time` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of train
-- ----------------------------
INSERT INTO `train` VALUES ('1', 'k-747', '长沙', '北京', '2019-03-26 16:22:25', '2019-03-27 16:22:32', '100', '100', '100', '50', '100', '200', '2019-03-26');
INSERT INTO `train` VALUES ('2', 'k-777', '长沙', '北京', '2019-03-26 08:36:25', '2019-03-26 20:36:33', '200', '100', '200', '50', '50', '200', '2019-03-26');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `account` char(255) NOT NULL COMMENT '账号',
  `password` char(255) NOT NULL COMMENT '密码',
  `name` char(1) NOT NULL COMMENT '姓名',
  `age` char(1) DEFAULT NULL COMMENT '年龄',
  `sex` char(255) NOT NULL COMMENT '性别',
  `id_card` int(11) DEFAULT NULL COMMENT '身份证（证件号）',
  `id_card_type` char(1) NOT NULL COMMENT '证件类型',
  `phone` int(11) NOT NULL COMMENT '电话号码',
  `state` char(255) DEFAULT NULL COMMENT '认证状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', '1', '1', '1', '1', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for user_pasenger
-- ----------------------------
DROP TABLE IF EXISTS `user_pasenger`;
CREATE TABLE `user_pasenger` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `pasenger_id` int(11) NOT NULL COMMENT '旅客id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_pasenger
-- ----------------------------
INSERT INTO `user_pasenger` VALUES ('1', '1', '1');
INSERT INTO `user_pasenger` VALUES ('2', '1', '2');
INSERT INTO `user_pasenger` VALUES ('3', '1', '2');

-- ----------------------------
-- Table structure for user_train
-- ----------------------------
DROP TABLE IF EXISTS `user_train`;
CREATE TABLE `user_train` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `train_id` int(11) NOT NULL,
  `pasenger_id` int(11) NOT NULL,
  `order_time` datetime NOT NULL COMMENT '订单时间',
  `seat` varchar(255) NOT NULL COMMENT '座位级别，123',
  `price` char(10) NOT NULL COMMENT '价格',
  `state` varchar(255) NOT NULL COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_train
-- ----------------------------
