/*
 Navicat Premium Data Transfer

 Source Server         : GNYD
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : Company_PMS

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 03/12/2021 10:03:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for att_manage
-- ----------------------------
DROP TABLE IF EXISTS `att_manage`;
CREATE TABLE `att_manage` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '考勤编号',
  `staffId` int NOT NULL COMMENT '员工编号',
  `status` tinyint NOT NULL DEFAULT '0' COMMENT '员工考勤状态 0表示签到 1表示缺勤 2表示迟到 3表示请假',
  `attTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '员工考勤时间',
  PRIMARY KEY (`id`),
  KEY `fk_manage_statuses` (`status`),
  KEY `fk_attendance_employment` (`staffId`),
  CONSTRAINT `fk_attendance_employment` FOREIGN KEY (`staffId`) REFERENCES `staff_employment` (`staffId`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk_manage_statuses` FOREIGN KEY (`status`) REFERENCES `att_statuses` (`statusId`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of att_manage
-- ----------------------------
BEGIN;
INSERT INTO `att_manage` VALUES (1, 1001, 0, '2021-12-01 13:31:18');
INSERT INTO `att_manage` VALUES (2, 1002, 1, '2021-12-01 13:32:07');
INSERT INTO `att_manage` VALUES (3, 1003, 2, '2021-12-01 13:32:14');
INSERT INTO `att_manage` VALUES (4, 1004, 3, '2021-12-01 13:32:22');
INSERT INTO `att_manage` VALUES (5, 1005, 0, '2021-12-01 13:32:31');
INSERT INTO `att_manage` VALUES (6, 1006, 1, '2021-12-01 13:32:37');
INSERT INTO `att_manage` VALUES (7, 1007, 2, '2021-12-01 13:32:45');
INSERT INTO `att_manage` VALUES (8, 1008, 3, '2021-12-01 13:32:52');
INSERT INTO `att_manage` VALUES (9, 1008, 0, '2021-12-03 00:00:00');
COMMIT;

-- ----------------------------
-- Table structure for att_statistics
-- ----------------------------
DROP TABLE IF EXISTS `att_statistics`;
CREATE TABLE `att_statistics` (
  `staffId` int NOT NULL COMMENT '员工编号',
  `attCount` int NOT NULL COMMENT '签到次数',
  `absCount` int NOT NULL COMMENT '缺勤次数',
  `lateCount` int NOT NULL COMMENT '迟到次数',
  `leaCount` int NOT NULL COMMENT '请假次数',
  `remark` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`staffId`) USING BTREE,
  CONSTRAINT `fk_statistics_manage` FOREIGN KEY (`staffId`) REFERENCES `att_manage` (`staffId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of att_statistics
-- ----------------------------
BEGIN;
INSERT INTO `att_statistics` VALUES (1001, 5, 4, 3, 2, '');
INSERT INTO `att_statistics` VALUES (1002, 7, 6, 5, 4, NULL);
INSERT INTO `att_statistics` VALUES (1003, 3, 2, 4, 6, NULL);
INSERT INTO `att_statistics` VALUES (1004, 8, 6, 2, 1, NULL);
INSERT INTO `att_statistics` VALUES (1005, 9, 6, 0, 0, NULL);
INSERT INTO `att_statistics` VALUES (1006, 3, 4, 2, 0, NULL);
INSERT INTO `att_statistics` VALUES (1007, 5, 5, 5, 5, NULL);
INSERT INTO `att_statistics` VALUES (1008, 4, 0, 3, 0, NULL);
COMMIT;

-- ----------------------------
-- Table structure for att_statuses
-- ----------------------------
DROP TABLE IF EXISTS `att_statuses`;
CREATE TABLE `att_statuses` (
  `statusId` tinyint NOT NULL DEFAULT '0' COMMENT '员工考勤状态',
  `name` varchar(50) NOT NULL COMMENT '状态名称',
  PRIMARY KEY (`statusId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of att_statuses
-- ----------------------------
BEGIN;
INSERT INTO `att_statuses` VALUES (0, '签到');
INSERT INTO `att_statuses` VALUES (1, '缺勤');
INSERT INTO `att_statuses` VALUES (2, '迟到');
INSERT INTO `att_statuses` VALUES (3, '请假');
COMMIT;

-- ----------------------------
-- Table structure for dep_manage
-- ----------------------------
DROP TABLE IF EXISTS `dep_manage`;
CREATE TABLE `dep_manage` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '部门编号',
  `name` varchar(50) NOT NULL COMMENT '部门名称',
  `principal` varchar(20) NOT NULL COMMENT '部门负责人',
  `officeId` int DEFAULT NULL COMMENT '上级部门编号',
  PRIMARY KEY (`id`),
  KEY `fk_department_managers` (`officeId`),
  CONSTRAINT `fk_department_managers` FOREIGN KEY (`officeId`) REFERENCES `dep_manage` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of dep_manage
-- ----------------------------
BEGIN;
INSERT INTO `dep_manage` VALUES (1, '营业处', '宋爱梅', NULL);
INSERT INTO `dep_manage` VALUES (2, '联络处', '王志芳', 10);
INSERT INTO `dep_manage` VALUES (3, '秘书科', '于光', 1);
INSERT INTO `dep_manage` VALUES (4, '总务部', '贾均仙', NULL);
INSERT INTO `dep_manage` VALUES (5, '会计部', '刘振杰', 2);
INSERT INTO `dep_manage` VALUES (6, '财务部', '郭卫东', NULL);
INSERT INTO `dep_manage` VALUES (7, '业务部', '崔洪宇', 3);
INSERT INTO `dep_manage` VALUES (8, '人事部', '马福平', NULL);
INSERT INTO `dep_manage` VALUES (9, '劳务部', '冯红', NULL);
INSERT INTO `dep_manage` VALUES (10, '法律部', '穆增志', NULL);
INSERT INTO `dep_manage` VALUES (11, '审核部', '谢志伟', 4);
INSERT INTO `dep_manage` VALUES (21, '技术部', '张三', 7);
COMMIT;

-- ----------------------------
-- Table structure for ent_events
-- ----------------------------
DROP TABLE IF EXISTS `ent_events`;
CREATE TABLE `ent_events` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '事件序号',
  `staffId` int NOT NULL COMMENT '员工编号',
  `removeDate` date NOT NULL COMMENT '调动日期',
  `removeTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '调动时间',
  `transferIn` varchar(50) CHARACTER SET utf8mb4 NOT NULL COMMENT '调入部门',
  `transferOut` varchar(50) CHARACTER SET utf8mb4 NOT NULL COMMENT '调出部门',
  `transCause` varchar(200) CHARACTER SET utf8mb4 NOT NULL COMMENT '调动原因',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of ent_events
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for rewards
-- ----------------------------
DROP TABLE IF EXISTS `rewards`;
CREATE TABLE `rewards` (
  `rewardId` int NOT NULL AUTO_INCREMENT COMMENT '薪资编号',
  `staffId` int NOT NULL COMMENT '员工工作证号',
  `salary` decimal(9,2) NOT NULL COMMENT '员工工资',
  `reward` decimal(9,2) NOT NULL COMMENT '员工奖金',
  PRIMARY KEY (`rewardId`) USING BTREE,
  KEY `fk_rewards_employment` (`staffId`),
  CONSTRAINT `fk_rewards_employment` FOREIGN KEY (`staffId`) REFERENCES `staff_employment` (`staffId`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of rewards
-- ----------------------------
BEGIN;
INSERT INTO `rewards` VALUES (1, 1001, 63996.00, 2000.00);
INSERT INTO `rewards` VALUES (2, 1002, 62781.00, 0.00);
INSERT INTO `rewards` VALUES (3, 1003, 98926.00, 3000.00);
INSERT INTO `rewards` VALUES (4, 1004, 94860.00, 1430.00);
INSERT INTO `rewards` VALUES (5, 1005, 110150.00, 3300.00);
INSERT INTO `rewards` VALUES (6, 1006, 32179.00, 450.00);
INSERT INTO `rewards` VALUES (7, 1007, 114257.00, 2100.00);
INSERT INTO `rewards` VALUES (8, 1008, 37270.00, 0.00);
COMMIT;

-- ----------------------------
-- Table structure for staff_archives
-- ----------------------------
DROP TABLE IF EXISTS `staff_archives`;
CREATE TABLE `staff_archives` (
  `staffId` int NOT NULL AUTO_INCREMENT COMMENT '员工编号',
  `name` varchar(50) NOT NULL COMMENT '员工姓名',
  `sex` varchar(10) NOT NULL COMMENT '员工性别',
  `nation` varchar(10) NOT NULL COMMENT '员工民族',
  `birthday` date NOT NULL COMMENT '员工生日',
  `polStatus` varchar(10) CHARACTER SET utf8mb4 NOT NULL COMMENT '员工政治面貌',
  `education` varchar(10) NOT NULL COMMENT '员工文化程度',
  `marStatus` varchar(10) CHARACTER SET utf8mb4 NOT NULL COMMENT '员工婚姻状况',
  `address` varchar(50) CHARACTER SET utf8mb4 NOT NULL COMMENT '员工籍贯',
  `Sid` varchar(50) NOT NULL COMMENT '员工身份证号',
  `phone` varchar(50) NOT NULL COMMENT '员工电话号码',
  `file` varchar(50) NOT NULL COMMENT '员工档案存放地',
  `residence` varchar(50) NOT NULL COMMENT '员工户口所在地',
  PRIMARY KEY (`staffId`) USING BTREE,
  UNIQUE KEY `Sid` (`Sid`),
  UNIQUE KEY `phone` (`phone`),
  CONSTRAINT `fk_archives_employment` FOREIGN KEY (`staffId`) REFERENCES `staff_employment` (`staffId`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1009 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of staff_archives
-- ----------------------------
BEGIN;
INSERT INTO `staff_archives` VALUES (1001, '吕金起', '男', '汉族', '2001-01-01', '中共党员', '硕士', '未婚', '龙津路', '413412', '13723225674', '广东省珠海市', '广东省珠海市');
INSERT INTO `staff_archives` VALUES (1002, '韩芸晴', '女', '汉族', '2001-01-01', '中共党员', '博士', '已婚', '南门街', '123412', '13723769845', '广东省深圳市', '广东省深圳市');
INSERT INTO `staff_archives` VALUES (1003, '鲁全福', '男', '维吾尔族', '2001-01-01', '中共党员', '本科', '已婚', '黑桥', '123123', '137321341232', '广东省广州市', '广东省广州市');
INSERT INTO `staff_archives` VALUES (1004, '郭建立', '男', '汉族', '2001-01-01', '共青团员', '本科', '未婚', '体育路', '312313', '13432183728', '广东省湛江市', '广东省湛江市');
INSERT INTO `staff_archives` VALUES (1005, '郝连水', '男', '汉族', '2001-01-01', '中共党员', '硕士', '已婚', '二环路', '313123', '13373123329', '广东省东莞市', '广东省东莞市');
INSERT INTO `staff_archives` VALUES (1006, '闫志胜', '男', '汉族', '2001-01-01', '共青团员', '大专', '未婚', '三环路', '947218', '136897932781', '广东省佛山市', '广东省佛山市');
INSERT INTO `staff_archives` VALUES (1007, '黎小霞', '女', '汉族', '2001-01-01', '中共党员', '本科', '已婚', '石湾路', '318931', '13739210231', '广东省阳江市', '广东省阳江市');
INSERT INTO `staff_archives` VALUES (1008, '李俊', '男', '汉族', '2001-01-01', '中共党员', '硕士', '未婚', '南恩路', '312373', '13732389210', '广东省中山市', '广东省中山市');
COMMIT;

-- ----------------------------
-- Table structure for staff_employment
-- ----------------------------
DROP TABLE IF EXISTS `staff_employment`;
CREATE TABLE `staff_employment` (
  `staffId` int NOT NULL AUTO_INCREMENT COMMENT '员工工作证号',
  `staffName` varchar(50) NOT NULL COMMENT '员工姓名',
  `entryDate` date NOT NULL COMMENT '员工入职日期',
  `jobPos` varchar(20) CHARACTER SET utf8mb4 NOT NULL COMMENT '员工工作职位',
  `capacity` varchar(50) CHARACTER SET utf8mb4 NOT NULL COMMENT '员工工作职能',
  `employeeId` int DEFAULT NULL COMMENT '上级员工编号',
  `status` tinyint NOT NULL DEFAULT '0' COMMENT '员工状态 0表示在职 1表示兼职 2表示试用 3表示离职 4表示返聘 5表示退休',
  `departmentId` int NOT NULL COMMENT '员工所在部门编号',
  PRIMARY KEY (`staffId`) USING BTREE,
  KEY `fk_archives_employment_idx` (`staffId`),
  KEY `fk_employment_statuses` (`status`),
  KEY `fk_employment_offices` (`departmentId`),
  KEY `fk_employment_managers` (`employeeId`),
  CONSTRAINT `fk_employment_managers` FOREIGN KEY (`employeeId`) REFERENCES `staff_employment` (`staffId`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk_employment_offices` FOREIGN KEY (`departmentId`) REFERENCES `dep_manage` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `fk_employment_statuses` FOREIGN KEY (`status`) REFERENCES `staff_statuses` (`statusId`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1019 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of staff_employment
-- ----------------------------
BEGIN;
INSERT INTO `staff_employment` VALUES (1001, '吕金起', '2001-01-01', '行政主管', '监管', NULL, 0, 10);
INSERT INTO `staff_employment` VALUES (1002, '韩芸晴', '2001-01-01', '后勤主管', '后勤', 1001, 0, 1);
INSERT INTO `staff_employment` VALUES (1003, '鲁全福', '2001-01-01', '行政总监', '主管', NULL, 5, 1);
INSERT INTO `staff_employment` VALUES (1004, '郭建立', '2001-01-01', '办公室主任', '主任', 1001, 0, 2);
INSERT INTO `staff_employment` VALUES (1005, '郝连水', '2001-01-01', '行政专员', '助理', 1001, 0, 2);
INSERT INTO `staff_employment` VALUES (1006, '闫志胜', '2001-01-01', '统计员', '统计', 1001, 4, 3);
INSERT INTO `staff_employment` VALUES (1007, '黎小霞', '2001-01-01', '税务经理', '税务', 1001, 3, 3);
INSERT INTO `staff_employment` VALUES (1008, '李俊', '2001-01-01', '销售经理', '销售', NULL, 2, 5);
COMMIT;

-- ----------------------------
-- Table structure for staff_statuses
-- ----------------------------
DROP TABLE IF EXISTS `staff_statuses`;
CREATE TABLE `staff_statuses` (
  `statusId` tinyint NOT NULL DEFAULT '0' COMMENT '员工状态',
  `name` varchar(50) NOT NULL COMMENT '状态名称',
  PRIMARY KEY (`statusId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of staff_statuses
-- ----------------------------
BEGIN;
INSERT INTO `staff_statuses` VALUES (0, '在职');
INSERT INTO `staff_statuses` VALUES (1, '兼职');
INSERT INTO `staff_statuses` VALUES (2, '试用');
INSERT INTO `staff_statuses` VALUES (3, '离职');
INSERT INTO `staff_statuses` VALUES (4, '返聘');
INSERT INTO `staff_statuses` VALUES (5, '退休');
COMMIT;

-- ----------------------------
-- Table structure for sys_manage
-- ----------------------------
DROP TABLE IF EXISTS `sys_manage`;
CREATE TABLE `sys_manage` (
  `userId` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `loginAccount` varchar(50) CHARACTER SET utf8mb4 NOT NULL COMMENT '用户登录账号',
  `loginPassword` varchar(50) CHARACTER SET utf8mb4 NOT NULL COMMENT '用户登录密码',
  `userName` varchar(50) CHARACTER SET utf8mb4 NOT NULL COMMENT '用户名',
  `userType` tinyint DEFAULT '0' COMMENT '用户类型 0表示系统管理员 1表示普通用户',
  PRIMARY KEY (`userId`) USING BTREE,
  KEY `fk_manage_type` (`userType`),
  CONSTRAINT `fk_manage_type` FOREIGN KEY (`userType`) REFERENCES `sys_type` (`typeId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_manage
-- ----------------------------
BEGIN;
INSERT INTO `sys_manage` VALUES (1, 'admin', '123456', 'Admin', 0);
INSERT INTO `sys_manage` VALUES (2, 'gnydsummer', '123456', 'GNYD', 1);
COMMIT;

-- ----------------------------
-- Table structure for sys_type
-- ----------------------------
DROP TABLE IF EXISTS `sys_type`;
CREATE TABLE `sys_type` (
  `typeId` tinyint NOT NULL DEFAULT '0' COMMENT '用户类型',
  `name` varchar(50) NOT NULL COMMENT '类型名称',
  PRIMARY KEY (`typeId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_type
-- ----------------------------
BEGIN;
INSERT INTO `sys_type` VALUES (0, '管理员');
INSERT INTO `sys_type` VALUES (1, '普通用户');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
