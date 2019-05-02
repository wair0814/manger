/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : manger

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 30/04/2019 19:52:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for customer_info
-- ----------------------------
DROP TABLE IF EXISTS `customer_info`;
CREATE TABLE `customer_info`  (
  `customer_id` int(50) NOT NULL AUTO_INCREMENT COMMENT '客户信息表里面的编号',
  `customer_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '客户名',
  `customer_stopMark` int(11) NULL DEFAULT 0 COMMENT '客户状态 0表示在用 1表示不在用',
  `customer_createTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '客户信息添加时间',
  PRIMARY KEY (`customer_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1059 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '医院列表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customer_info
-- ----------------------------
INSERT INTO `customer_info` VALUES (1000, '测试数据1', 0, '2019-04-08 12:49:54');
INSERT INTO `customer_info` VALUES (1001, '测试数据2', 0, '2019-04-08 12:49:54');
INSERT INTO `customer_info` VALUES (1002, '测试数据3', 0, '2019-04-08 12:49:54');
INSERT INTO `customer_info` VALUES (1003, '测试数据4', 1, '2019-01-07 12:49:54');
INSERT INTO `customer_info` VALUES (1018, '测试数据11', 0, '2009-10-16 12:49:54');
INSERT INTO `customer_info` VALUES (1047, '前台测试1', 0, '2019-02-07 12:49:54');
INSERT INTO `customer_info` VALUES (1048, '1131', 0, '2019-04-07 12:49:54');
INSERT INTO `customer_info` VALUES (1049, 'pppp', 0, '2019-04-07 12:49:54');
INSERT INTO `customer_info` VALUES (1052, 'ppppp', 1, '2019-04-07 12:49:54');
INSERT INTO `customer_info` VALUES (1053, '测试', 0, '2019-04-07 12:49:54');
INSERT INTO `customer_info` VALUES (1054, 'pppppp', 0, '2019-04-08 12:49:54');
INSERT INTO `customer_info` VALUES (1055, 'pppppp', 0, '2019-04-07 12:49:54');
INSERT INTO `customer_info` VALUES (1056, '123123', 1, '2019-04-07 12:49:54');
INSERT INTO `customer_info` VALUES (1057, '输入客户名哦', 0, '2019-04-07 12:49:54');
INSERT INTO `customer_info` VALUES (1058, '111', 0, '2019-04-07 12:50:13');

-- ----------------------------
-- Table structure for hospital_modular
-- ----------------------------
DROP TABLE IF EXISTS `hospital_modular`;
CREATE TABLE `hospital_modular`  (
  `modular_id` int(100) NOT NULL AUTO_INCREMENT COMMENT '模快编号',
  `modular_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '模快名称',
  `modular_type_no` int(20) NULL DEFAULT NULL COMMENT '模快分类（his、lis、packs）',
  PRIMARY KEY (`modular_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 134 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '医院系统的所有模块' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hospital_modular
-- ----------------------------
INSERT INTO `hospital_modular` VALUES (100, '住院护士', NULL);
INSERT INTO `hospital_modular` VALUES (101, '住院医生', NULL);
INSERT INTO `hospital_modular` VALUES (102, '门诊挂号', NULL);
INSERT INTO `hospital_modular` VALUES (103, '门诊收费', NULL);
INSERT INTO `hospital_modular` VALUES (104, '门诊医师', NULL);
INSERT INTO `hospital_modular` VALUES (105, '门诊输液', NULL);
INSERT INTO `hospital_modular` VALUES (106, '住院结算', NULL);
INSERT INTO `hospital_modular` VALUES (107, '医保管理', NULL);
INSERT INTO `hospital_modular` VALUES (108, '临床路径', NULL);
INSERT INTO `hospital_modular` VALUES (109, '病案统计', NULL);
INSERT INTO `hospital_modular` VALUES (110, '药库管理', NULL);
INSERT INTO `hospital_modular` VALUES (111, '药房管理', NULL);
INSERT INTO `hospital_modular` VALUES (112, '材料管理', NULL);
INSERT INTO `hospital_modular` VALUES (113, '手术管理', NULL);
INSERT INTO `hospital_modular` VALUES (114, '血库管理', NULL);
INSERT INTO `hospital_modular` VALUES (115, '经管核算', NULL);
INSERT INTO `hospital_modular` VALUES (116, '领导查询', NULL);
INSERT INTO `hospital_modular` VALUES (117, '财务报表查询', NULL);
INSERT INTO `hospital_modular` VALUES (118, '电子病历', NULL);
INSERT INTO `hospital_modular` VALUES (119, '固定资产管理', NULL);
INSERT INTO `hospital_modular` VALUES (120, '实验室信息系统', NULL);
INSERT INTO `hospital_modular` VALUES (121, '影像信息管理', NULL);
INSERT INTO `hospital_modular` VALUES (122, '医院感染', NULL);
INSERT INTO `hospital_modular` VALUES (123, '叫号管理', NULL);
INSERT INTO `hospital_modular` VALUES (124, '费用管理', NULL);
INSERT INTO `hospital_modular` VALUES (125, '综合查询', NULL);
INSERT INTO `hospital_modular` VALUES (126, '经管核算（新）', NULL);
INSERT INTO `hospital_modular` VALUES (127, '药品管理', NULL);
INSERT INTO `hospital_modular` VALUES (128, '健康检查', NULL);
INSERT INTO `hospital_modular` VALUES (129, '阳光医药', NULL);
INSERT INTO `hospital_modular` VALUES (130, '消毒供应系统', NULL);
INSERT INTO `hospital_modular` VALUES (131, '不良事件', NULL);
INSERT INTO `hospital_modular` VALUES (132, '人事管理', NULL);
INSERT INTO `hospital_modular` VALUES (133, '工资管理', NULL);

-- ----------------------------
-- Table structure for hospital_modular_type
-- ----------------------------
DROP TABLE IF EXISTS `hospital_modular_type`;
CREATE TABLE `hospital_modular_type`  (
  `hospital_modular_type_no` int(10) NOT NULL AUTO_INCREMENT COMMENT '模块类型分类',
  `hospital_modular_type_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '模块类型分类名称',
  PRIMARY KEY (`hospital_modular_type_no`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 41 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '医院模块分类表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hospital_modular_type
-- ----------------------------
INSERT INTO `hospital_modular_type` VALUES (10, '门诊');
INSERT INTO `hospital_modular_type` VALUES (20, '住院');
INSERT INTO `hospital_modular_type` VALUES (30, '检验');
INSERT INTO `hospital_modular_type` VALUES (40, '影像');

-- ----------------------------
-- Table structure for hospital_room
-- ----------------------------
DROP TABLE IF EXISTS `hospital_room`;
CREATE TABLE `hospital_room`  (
  `room_no` int(100) NOT NULL AUTO_INCREMENT COMMENT '科室编号',
  `room_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '科室名称',
  `room_type` int(20) NOT NULL COMMENT '类型（0是住院部,1是门诊部，3是检查科室，4是其他）',
  `hospital_info` int(20) NOT NULL COMMENT '医院编号',
  PRIMARY KEY (`room_no`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2001 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '医院科室表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hospital_room
-- ----------------------------
INSERT INTO `hospital_room` VALUES (1000, '信息科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1001, '总务科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1002, '医务科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1003, '护理部', 0, 1000);
INSERT INTO `hospital_room` VALUES (1004, '财务科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1005, '内一科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1006, '内二科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1007, '内三科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1008, '内四科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1009, '儿科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1010, '外科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1011, '骨科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1012, '五官科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1013, 'ICU', 0, 1000);
INSERT INTO `hospital_room` VALUES (1014, '感染科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1015, '血液净化室', 0, 1000);
INSERT INTO `hospital_room` VALUES (1016, '康复医学科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1017, '中医科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1018, '急诊科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1019, '急救中心120', 0, 1000);
INSERT INTO `hospital_room` VALUES (1020, '输血科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1021, '电子膀胱室', 3, 1000);
INSERT INTO `hospital_room` VALUES (1022, '病理科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1023, '医学影像科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1024, '磁共振室', 3, 1000);
INSERT INTO `hospital_room` VALUES (1025, 'CT室', 3, 1000);
INSERT INTO `hospital_room` VALUES (1026, '放射科', 3, 1000);
INSERT INTO `hospital_room` VALUES (1027, '超声诊断科', 3, 1000);
INSERT INTO `hospital_room` VALUES (1028, '经络多普勒室', 0, 1000);
INSERT INTO `hospital_room` VALUES (1029, '心电图室', 3, 1000);
INSERT INTO `hospital_room` VALUES (1030, '脑电图室', 3, 1000);
INSERT INTO `hospital_room` VALUES (1031, '内窥镜室', 3, 1000);
INSERT INTO `hospital_room` VALUES (1032, '检验科', 3, 1000);
INSERT INTO `hospital_room` VALUES (1033, '电子支气管室', 3, 1000);
INSERT INTO `hospital_room` VALUES (1034, '电子喉镜室', 3, 1000);
INSERT INTO `hospital_room` VALUES (1035, '肺功能检查室', 3, 1000);
INSERT INTO `hospital_room` VALUES (1036, '纤维支气管室', 0, 1000);
INSERT INTO `hospital_room` VALUES (1037, '妇产科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1038, '碎石中心', 0, 1000);
INSERT INTO `hospital_room` VALUES (1039, '电子肠胃镜室', 0, 1000);
INSERT INTO `hospital_room` VALUES (1040, '妇科臭氧治疗室', 0, 1000);
INSERT INTO `hospital_room` VALUES (1041, '病案资料室', 0, 1000);
INSERT INTO `hospital_room` VALUES (1042, '口腔科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1043, '手术麻醉科', 0, 1000);
INSERT INTO `hospital_room` VALUES (1080, '门诊外科', 1, 1000);
INSERT INTO `hospital_room` VALUES (1081, '门诊儿科', 1, 1000);
INSERT INTO `hospital_room` VALUES (1082, '门诊五官科', 1, 1000);
INSERT INTO `hospital_room` VALUES (1083, '门诊中医科', 1, 1000);
INSERT INTO `hospital_room` VALUES (1084, '门诊中医康复科', 1, 1000);
INSERT INTO `hospital_room` VALUES (1085, '门诊中医针灸科', 1, 1000);
INSERT INTO `hospital_room` VALUES (1086, '门诊伤科', 1, 1000);
INSERT INTO `hospital_room` VALUES (1087, '门诊妇产科', 1, 1000);
INSERT INTO `hospital_room` VALUES (1088, '门诊中医科', 1, 1000);
INSERT INTO `hospital_room` VALUES (1089, '门诊内科', 1, 1000);
INSERT INTO `hospital_room` VALUES (2000, '门诊内科', 1, 2000);

-- ----------------------------
-- Table structure for hospital_user
-- ----------------------------
DROP TABLE IF EXISTS `hospital_user`;
CREATE TABLE `hospital_user`  (
  `hospital_user_id` bigint(100) NOT NULL AUTO_INCREMENT COMMENT '当前医院的联系人id',
  `hospital_user_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '当前医院的联系人姓名',
  `hospital_user_phone` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '当前医院的联系人的联系方式',
  `hospital_user_stopMark` int(3) NOT NULL DEFAULT 0 COMMENT '医院维护人状态0表示再用 1表示不再使用',
  `hospital_info` int(20) NOT NULL COMMENT '联系人对应的医院',
  PRIMARY KEY (`hospital_user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 109 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '医院用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hospital_user
-- ----------------------------
INSERT INTO `hospital_user` VALUES (100, '测试联系人1', '12345678910', 0, 1000);
INSERT INTO `hospital_user` VALUES (101, '测试联系人2', '10987654321', 0, 1003);
INSERT INTO `hospital_user` VALUES (102, '测试联系人3', '45612378992', 0, 1001);
INSERT INTO `hospital_user` VALUES (103, '测试4', '1111', 0, 1001);
INSERT INTO `hospital_user` VALUES (104, '测试5', '222', 0, 1005);
INSERT INTO `hospital_user` VALUES (105, '测试6', '2333', 0, 1005);
INSERT INTO `hospital_user` VALUES (106, '测试7', '344', 0, 1006);
INSERT INTO `hospital_user` VALUES (107, '测试', '444', 0, 1007);
INSERT INTO `hospital_user` VALUES (108, '测试', '555', 0, 1006);

-- ----------------------------
-- Table structure for sys_detail
-- ----------------------------
DROP TABLE IF EXISTS `sys_detail`;
CREATE TABLE `sys_detail`  (
  `detail_no` bigint(100) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `hospital_info` int(100) NOT NULL COMMENT '报告单所属医院信息',
  `hospital_room_info` int(100) NOT NULL COMMENT '报告单所属科室',
  `level_info` int(100) NOT NULL DEFAULT 120 COMMENT '紧急状态编号（急，加急，可缓），对应sys_level',
  `detail_type_info` int(100) NOT NULL COMMENT '业务类型（bug、加东西等）对应sys_type表',
  `detail_user_info` int(100) NOT NULL COMMENT '报告人编号，对应sys_user表',
  `detail_info` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容详细信息',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`detail_no`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1007 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '问题上报表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_detail
-- ----------------------------
INSERT INTO `sys_detail` VALUES (1000, 1000, 1001, 100, 200, 1000, '测试测试测试测试2', '2018-08-23 10:48:27', '2018-08-23 10:49:34');
INSERT INTO `sys_detail` VALUES (1001, 1001, 1042, 110, 200, 1000, '测试测试测试测试8999', '2018-08-23 10:48:27', '2018-08-23 10:49:45');
INSERT INTO `sys_detail` VALUES (1002, 1002, 1000, 110, 120, 1000, '测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试', '2018-08-23 10:48:27', '2018-08-23 11:02:44');
INSERT INTO `sys_detail` VALUES (1003, 1000, 1003, 110, 120, 1000, '测试测试测试测试测试', '2018-08-23 10:48:27', '2018-08-23 11:10:49');
INSERT INTO `sys_detail` VALUES (1004, 1000, 1005, 110, 110, 1000, '测试测试测试测试', '2018-08-23 10:48:27', '2018-11-07 16:03:43');
INSERT INTO `sys_detail` VALUES (1005, 1002, 2000, 110, 200, 1000, '121345345666', '2018-08-23 10:48:27', '2018-11-07 16:03:48');
INSERT INTO `sys_detail` VALUES (1006, 1000, 1001, 120, 120, 1000, '测试哦3', '2018-08-23 11:07:29', '2018-08-23 11:07:35');

-- ----------------------------
-- Table structure for sys_module
-- ----------------------------
DROP TABLE IF EXISTS `sys_module`;
CREATE TABLE `sys_module`  (
  `module_no` int(100) NOT NULL AUTO_INCREMENT COMMENT '模块编号',
  `module_father_no` int(30) NULL DEFAULT NULL COMMENT '父级编号',
  `module_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '模块名称',
  `module_path` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '模块地址',
  PRIMARY KEY (`module_no`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 100004 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '售后系统模块表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_module
-- ----------------------------
INSERT INTO `sys_module` VALUES (100, 0, '系统管理', NULL);
INSERT INTO `sys_module` VALUES (101, 0, '业务管理', NULL);
INSERT INTO `sys_module` VALUES (100001, 100, '角色管理', NULL);
INSERT INTO `sys_module` VALUES (100002, 100, '科室分类设置', NULL);
INSERT INTO `sys_module` VALUES (100003, 100, '医院信息管理', NULL);

-- ----------------------------
-- Table structure for sys_report_level
-- ----------------------------
DROP TABLE IF EXISTS `sys_report_level`;
CREATE TABLE `sys_report_level`  (
  `level_id` int(100) NOT NULL AUTO_INCREMENT COMMENT '报告的问题级别编号',
  `level_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '报告问题的级别名（加急，急，一般，延后）',
  PRIMARY KEY (`level_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 201 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '事件报告级别表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_report_level
-- ----------------------------
INSERT INTO `sys_report_level` VALUES (100, '急');
INSERT INTO `sys_report_level` VALUES (110, '加急');
INSERT INTO `sys_report_level` VALUES (120, '一般');
INSERT INTO `sys_report_level` VALUES (130, '延后');
INSERT INTO `sys_report_level` VALUES (200, '不处理');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `role_id` int(100) NOT NULL AUTO_INCREMENT COMMENT '角色编号',
  `role_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名称',
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统角色表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES (10, '项目经理');
INSERT INTO `sys_role` VALUES (20, '项目组长');
INSERT INTO `sys_role` VALUES (30, '组员');

-- ----------------------------
-- Table structure for sys_role_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_user`;
CREATE TABLE `sys_role_user`  (
  `role_user_no` int(100) NOT NULL AUTO_INCREMENT COMMENT '角色用户编号',
  `role_id` int(100) NULL DEFAULT NULL COMMENT '角色编号(对应sys_role)',
  `user_id` int(100) NULL DEFAULT NULL COMMENT '用户编号（对应sys_user）',
  PRIMARY KEY (`role_user_no`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1001 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统是角色用户关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role_user
-- ----------------------------
INSERT INTO `sys_role_user` VALUES (1000, 10, 1000);

-- ----------------------------
-- Table structure for sys_type
-- ----------------------------
DROP TABLE IF EXISTS `sys_type`;
CREATE TABLE `sys_type`  (
  `type_id` int(100) NOT NULL AUTO_INCREMENT COMMENT '类型编号',
  `type_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '类型名称(BUG、操作问题等)',
  PRIMARY KEY (`type_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 203 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统类型编号表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_type
-- ----------------------------
INSERT INTO `sys_type` VALUES (100, '操作出错');
INSERT INTO `sys_type` VALUES (110, '系统漏洞');
INSERT INTO `sys_type` VALUES (120, '业务需求');
INSERT INTO `sys_type` VALUES (200, '其他问题');
INSERT INTO `sys_type` VALUES (201, '2');
INSERT INTO `sys_type` VALUES (202, '2');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `user_id` bigint(100) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `user_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '用户登录名',
  `user_RealName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户真实姓名',
  `user_sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户性别（可为空）',
  `user_age` int(10) NULL DEFAULT NULL COMMENT '用户年龄',
  `user_cpwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '加密后密码',
  `user_email` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户邮箱',
  `user_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'UUID',
  `user_stopMark` int(3) NULL DEFAULT 0 COMMENT '用户的状态',
  `user_qq` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户的qq号码，用来在线联系',
  `user_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '00000000000' COMMENT '用户的手机号码',
  `user_ip` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户注册IP地址',
  `user_createtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '用户注册日期',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 80306 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (10001, 'admin', '管理员', '1', 23, 'MDgxNA==370bf776ee914ad5a1d44f47003bb8d9', 'admin@lw.com', '370bf776ee914ad5a1d44f47003bb8d9', 0, '987206786', '13147155727', NULL, '2017-10-10 10:10:10');
INSERT INTO `sys_user` VALUES (80001, 'LiWei', '李威', '1', 23, 'ZGVuZ2x1LmNvbQ==69860302fb384b61a6d57955c3a2449b', 'a@1.com', '69860302fb384b61a6d57955c3a2449b', 0, NULL, NULL, NULL, '2018-12-22 17:32:20');
INSERT INTO `sys_user` VALUES (80272, 'Aa1231o', NULL, '2', NULL, 'QWExMjMx5141cfc7e2d54452bbd5cbd43a4fbdf3', 'a@1.com', '5141cfc7e2d54452bbd5cbd43a4fbdf3', 0, NULL, NULL, NULL, '2019-01-15 13:40:13');
INSERT INTO `sys_user` VALUES (80273, 'admin1234', NULL, NULL, NULL, 'QWExMjM06ab249ffc84d4499bea475bd4612fa96', '1@qq.com', '6ab249ffc84d4499bea475bd4612fa96', 0, NULL, NULL, NULL, '2019-01-15 18:42:47');
INSERT INTO `sys_user` VALUES (80274, 'ojbk2018', NULL, NULL, NULL, 'UXExMjM0975596fda3684ec68b006a238f7887f1', 'qq@163.com', '975596fda3684ec68b006a238f7887f1', 0, NULL, NULL, NULL, '2019-01-17 15:42:11');
INSERT INTO `sys_user` VALUES (80275, 'zhangsan', NULL, '2', NULL, 'MTIzMTIzMTIze9b0a232c6f44086ada961c7ee83cc2a', '1@qq.com', 'e9b0a232c6f44086ada961c7ee83cc2a', 0, NULL, NULL, NULL, '2019-01-18 16:20:34');
INSERT INTO `sys_user` VALUES (80276, 'admin1234222', NULL, NULL, NULL, 'QWExMjM050f7f55c8f9b47e98ca130f4dc7ce05b', 'wair0814@11.com', '50f7f55c8f9b47e98ca130f4dc7ce05b', 0, NULL, NULL, NULL, '2019-01-19 20:31:15');
INSERT INTO `sys_user` VALUES (80277, 'adminwert', NULL, '2', NULL, 'MTIzNFFx34f38801f4e04866896710d40d01e91e', '1@163.com', '34f38801f4e04866896710d40d01e91e', 0, NULL, NULL, NULL, '2019-01-21 08:09:15');
INSERT INTO `sys_user` VALUES (80278, 'admin12341', NULL, NULL, NULL, 'QWExMjM0ad349d27afbf433da3b891d624a32feb', 'wair0814@11.com', 'ad349d27afbf433da3b891d624a32feb', 0, NULL, NULL, NULL, '2019-01-21 17:55:40');
INSERT INTO `sys_user` VALUES (80279, 'qwertyuiop', NULL, NULL, NULL, 'cTEyMzRR8e346fd8380f4445b71d39aca5efef12', '1@qq.com', '8e346fd8380f4445b71d39aca5efef12', 0, NULL, NULL, NULL, '2019-01-21 17:57:20');
INSERT INTO `sys_user` VALUES (80280, '1234567', NULL, NULL, NULL, 'MTIzNDU2QWE=9143ee084e094cbfb305dbec97b7e2fb', '1@qq.com', '9143ee084e094cbfb305dbec97b7e2fb', 0, NULL, NULL, NULL, '2019-01-22 14:57:13');
INSERT INTO `sys_user` VALUES (80281, '1234Qq', NULL, NULL, NULL, 'MTIzNFFxa364cbf4c7b9465a9c38561618657de7', 'wair0814@11.com', 'a364cbf4c7b9465a9c38561618657de7', 0, NULL, NULL, NULL, '2019-01-23 13:53:56');
INSERT INTO `sys_user` VALUES (80282, 'zhangsan1', NULL, NULL, NULL, 'UXExMjM0NQ==212da2198c2b4933ad585aa8ec60744d', '1@qq.com', '212da2198c2b4933ad585aa8ec60744d', 0, NULL, NULL, NULL, '2019-01-31 23:54:15');
INSERT INTO `sys_user` VALUES (80283, 'oppopo', NULL, NULL, NULL, 'UXExMjM0f257a544a7314834a0150a2ce2815fa4', '1@163.com', 'f257a544a7314834a0150a2ce2815fa4', 0, NULL, NULL, NULL, '2019-02-08 13:29:49');
INSERT INTO `sys_user` VALUES (80284, '1234123', NULL, NULL, NULL, 'MTIzNFFx2b18cc7f5d1b4c7f82a908b14c4b7ce7', '1@qq.com', '2b18cc7f5d1b4c7f82a908b14c4b7ce7', 0, NULL, NULL, NULL, '2019-02-11 11:33:21');
INSERT INTO `sys_user` VALUES (80285, 'wangzihengyuan', '朱雷', '1', 22, 'UXE3NDE4NTI5NjM=99f8e7b099e2476692411dcaa5eee019', '819191996@qq.com', '99f8e7b099e2476692411dcaa5eee019', 0, NULL, NULL, NULL, '2019-02-11 15:02:34');
INSERT INTO `sys_user` VALUES (80286, 'nihao', NULL, NULL, NULL, 'TmloYW8xMjM=411e85bfe562477aa9c14f93ebc90f57', '1@qq.com', '411e85bfe562477aa9c14f93ebc90f57', 0, NULL, NULL, NULL, '2019-02-15 17:00:45');
INSERT INTO `sys_user` VALUES (80287, 'administrator', NULL, NULL, NULL, 'UXExMjM09844101341ae4a6081c7ef5ef0881187', 'wai@163.com', '9844101341ae4a6081c7ef5ef0881187', 0, NULL, NULL, NULL, '2019-03-12 15:11:47');
INSERT INTO `sys_user` VALUES (80288, '2', '测试用账户', '男', 22, 'MTIzNDU2de414054c4924f12bca2e1ad9c6d2c96', 'test@163.com', 'de414054c4924f12bca2e1ad9c6d2c96', 0, NULL, '00000000000', NULL, '2019-03-19 13:10:11');
INSERT INTO `sys_user` VALUES (80289, '21', '测试用账户', '男', 22, 'MTIzNDU2a98462bcbffc41fdb8d6be16d700c287', 'test@163.com', 'a98462bcbffc41fdb8d6be16d700c287', 0, NULL, '00000000000', NULL, '2019-03-19 13:10:11');
INSERT INTO `sys_user` VALUES (80290, '21k', '测试用账户', '男', 22, 'MTIzNDU2fdd84bf0a2964b2d91aa67c315227f20', 'test@163.com', 'fdd84bf0a2964b2d91aa67c315227f20', 0, NULL, '00000000000', NULL, '2019-03-19 13:10:11');
INSERT INTO `sys_user` VALUES (80291, '21kl', '测试用账户', '男', 22, 'MTIzNDU22fc257d9fedc4d58b489c95e14ec46ff', 'test@163.com', '2fc257d9fedc4d58b489c95e14ec46ff', 0, NULL, '00000000000', NULL, '2019-03-19 13:10:11');
INSERT INTO `sys_user` VALUES (80292, '21klY', '测试用账户', '男', 22, 'MTIzNDU234d90c9706034de1a2a702ef37fd6b2b', 'test@163.com', '34d90c9706034de1a2a702ef37fd6b2b', 0, NULL, '00000000000', NULL, '2019-03-19 13:10:11');
INSERT INTO `sys_user` VALUES (80293, '0', '测试用账户', '男', 22, 'MTIzNDU2067dd2ace1c3485bb2b022b910cf453d', 'test@163.com', '067dd2ace1c3485bb2b022b910cf453d', 0, NULL, '00000000000', NULL, '2019-03-19 13:11:25');
INSERT INTO `sys_user` VALUES (80294, '0H', '测试用账户', '男', 22, 'MTIzNDU2047d50a62c4c444f994d12fb08240fd7', 'test@163.com', '047d50a62c4c444f994d12fb08240fd7', 0, NULL, '00000000000', NULL, '2019-03-19 13:11:25');
INSERT INTO `sys_user` VALUES (80295, '0Hn', '测试用账户', '男', 22, 'MTIzNDU2dc73aa3ac13d4eaea3ae6c71308938f4', 'test@163.com', 'dc73aa3ac13d4eaea3ae6c71308938f4', 0, NULL, '00000000000', NULL, '2019-03-19 13:11:25');
INSERT INTO `sys_user` VALUES (80296, '0HnU', '测试用账户', '男', 22, 'MTIzNDU298f2850842344da6b18eeb605f93e758', 'test@163.com', '98f2850842344da6b18eeb605f93e758', 0, NULL, '00000000000', NULL, '2019-03-19 13:11:25');
INSERT INTO `sys_user` VALUES (80297, '0HnUc', '测试用账户', '男', 22, 'MTIzNDU21ac72ede27c541f4a6628d98cc1c4222', 'test@163.com', '1ac72ede27c541f4a6628d98cc1c4222', 0, NULL, '00000000000', '183.95.62.66', '2019-03-19 13:11:25');
INSERT INTO `sys_user` VALUES (80298, NULL, NULL, NULL, NULL, 'UXExMjM06068d03769824d49b0069fd8b2348cb0', '12@qq.com', '6068d03769824d49b0069fd8b2348cb0', 0, NULL, NULL, NULL, '2019-03-19 13:14:57');
INSERT INTO `sys_user` VALUES (80299, NULL, NULL, NULL, NULL, 'cVExMjM081e3e391af5949c4ae583e5603895921', '22222@qq.com', '81e3e391af5949c4ae583e5603895921', 0, NULL, NULL, NULL, '2019-03-19 13:32:36');
INSERT INTO `sys_user` VALUES (80300, NULL, NULL, NULL, NULL, 'UXExMjM03495f7ec306944ef8193bebb98fef9d1', '9999@admin.com', '3495f7ec306944ef8193bebb98fef9d1', 0, NULL, NULL, NULL, '2019-03-19 14:10:41');
INSERT INTO `sys_user` VALUES (80301, NULL, NULL, NULL, NULL, 'UXExMjM05f1a52774d6b43f18f975460733da833', '000@qq.com', '5f1a52774d6b43f18f975460733da833', 0, NULL, NULL, NULL, '2019-03-19 14:46:17');
INSERT INTO `sys_user` VALUES (80302, NULL, NULL, NULL, NULL, 'UXExMjM0fb91f36e924b46bbbb6afea2dc5f194f', 'admin2@lw.com', 'fb91f36e924b46bbbb6afea2dc5f194f', 0, NULL, NULL, NULL, '2019-04-02 14:49:42');
INSERT INTO `sys_user` VALUES (80303, NULL, NULL, NULL, NULL, 'UXExMjM001a3a1d595d546229acbd881cc6ed35e', 'ad@lw.com', '01a3a1d595d546229acbd881cc6ed35e', 0, NULL, NULL, NULL, '2019-04-02 14:58:02');
INSERT INTO `sys_user` VALUES (80304, NULL, NULL, NULL, NULL, 'UXExMjM0855f1f8afb2e4a5f8790303d102c1efc', 'q@q.com', '855f1f8afb2e4a5f8790303d102c1efc', 0, NULL, NULL, '183.95.62.66', '2019-04-07 12:41:06');
INSERT INTO `sys_user` VALUES (80305, NULL, NULL, NULL, NULL, 'UXExMjM06dcaade52a17442fa4f44b860c8e19b0', '1111@qq.com', '6dcaade52a17442fa4f44b860c8e19b0', 0, NULL, NULL, '219.136.205.65', '2019-04-08 22:03:53');

-- ----------------------------
-- Table structure for sys_user_copy1
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_copy1`;
CREATE TABLE `sys_user_copy1`  (
  `user_id` bigint(100) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `user_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '用户登录名',
  `user_RealName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户真实姓名',
  `user_sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户性别（可为空）',
  `user_age` int(10) NULL DEFAULT NULL COMMENT '用户年龄',
  `user_cpwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '加密后密码',
  `user_email` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户邮箱',
  `user_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'UUID',
  `user_stopMark` int(3) NULL DEFAULT 0 COMMENT '用户的状态',
  `user_qq` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户的qq号码，用来在线联系',
  `user_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '00000000000' COMMENT '用户的手机号码',
  `user_ip` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户注册IP地址',
  `user_createtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '用户注册日期',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 80305 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user_copy1
-- ----------------------------
INSERT INTO `sys_user_copy1` VALUES (10001, 'admin', '管理员', '1', 23, 'MDgxNA==370bf776ee914ad5a1d44f47003bb8d9', 'admin@lw.com', '370bf776ee914ad5a1d44f47003bb8d9', 0, '987206786', '13147155727', NULL, '2017-10-10 10:10:10');
INSERT INTO `sys_user_copy1` VALUES (80001, 'LiWei', '李威', '1', 23, 'ZGVuZ2x1LmNvbQ==69860302fb384b61a6d57955c3a2449b', 'a@1.com', '69860302fb384b61a6d57955c3a2449b', 0, NULL, NULL, NULL, '2018-12-22 17:32:20');
INSERT INTO `sys_user_copy1` VALUES (80272, 'Aa1231o', NULL, '2', NULL, 'QWExMjMx5141cfc7e2d54452bbd5cbd43a4fbdf3', 'a@1.com', '5141cfc7e2d54452bbd5cbd43a4fbdf3', 0, NULL, NULL, NULL, '2019-01-15 13:40:13');
INSERT INTO `sys_user_copy1` VALUES (80273, 'admin1234', NULL, NULL, NULL, 'QWExMjM06ab249ffc84d4499bea475bd4612fa96', '1@qq.com', '6ab249ffc84d4499bea475bd4612fa96', 0, NULL, NULL, NULL, '2019-01-15 18:42:47');
INSERT INTO `sys_user_copy1` VALUES (80274, 'ojbk2018', NULL, NULL, NULL, 'UXExMjM0975596fda3684ec68b006a238f7887f1', 'qq@163.com', '975596fda3684ec68b006a238f7887f1', 0, NULL, NULL, NULL, '2019-01-17 15:42:11');
INSERT INTO `sys_user_copy1` VALUES (80275, 'zhangsan', NULL, '2', NULL, 'MTIzMTIzMTIze9b0a232c6f44086ada961c7ee83cc2a', '1@qq.com', 'e9b0a232c6f44086ada961c7ee83cc2a', 0, NULL, NULL, NULL, '2019-01-18 16:20:34');
INSERT INTO `sys_user_copy1` VALUES (80276, 'admin1234222', NULL, NULL, NULL, 'QWExMjM050f7f55c8f9b47e98ca130f4dc7ce05b', 'wair0814@11.com', '50f7f55c8f9b47e98ca130f4dc7ce05b', 0, NULL, NULL, NULL, '2019-01-19 20:31:15');
INSERT INTO `sys_user_copy1` VALUES (80277, 'adminwert', NULL, '2', NULL, 'MTIzNFFx34f38801f4e04866896710d40d01e91e', '1@163.com', '34f38801f4e04866896710d40d01e91e', 0, NULL, NULL, NULL, '2019-01-21 08:09:15');
INSERT INTO `sys_user_copy1` VALUES (80278, 'admin12341', NULL, NULL, NULL, 'QWExMjM0ad349d27afbf433da3b891d624a32feb', 'wair0814@11.com', 'ad349d27afbf433da3b891d624a32feb', 0, NULL, NULL, NULL, '2019-01-21 17:55:40');
INSERT INTO `sys_user_copy1` VALUES (80279, 'qwertyuiop', NULL, NULL, NULL, 'cTEyMzRR8e346fd8380f4445b71d39aca5efef12', '1@qq.com', '8e346fd8380f4445b71d39aca5efef12', 0, NULL, NULL, NULL, '2019-01-21 17:57:20');
INSERT INTO `sys_user_copy1` VALUES (80280, '1234567', NULL, NULL, NULL, 'MTIzNDU2QWE=9143ee084e094cbfb305dbec97b7e2fb', '1@qq.com', '9143ee084e094cbfb305dbec97b7e2fb', 0, NULL, NULL, NULL, '2019-01-22 14:57:13');
INSERT INTO `sys_user_copy1` VALUES (80281, '1234Qq', NULL, NULL, NULL, 'MTIzNFFxa364cbf4c7b9465a9c38561618657de7', 'wair0814@11.com', 'a364cbf4c7b9465a9c38561618657de7', 0, NULL, NULL, NULL, '2019-01-23 13:53:56');
INSERT INTO `sys_user_copy1` VALUES (80282, 'zhangsan1', NULL, NULL, NULL, 'UXExMjM0NQ==212da2198c2b4933ad585aa8ec60744d', '1@qq.com', '212da2198c2b4933ad585aa8ec60744d', 0, NULL, NULL, NULL, '2019-01-31 23:54:15');
INSERT INTO `sys_user_copy1` VALUES (80283, 'oppopo', NULL, NULL, NULL, 'UXExMjM0f257a544a7314834a0150a2ce2815fa4', '1@163.com', 'f257a544a7314834a0150a2ce2815fa4', 0, NULL, NULL, NULL, '2019-02-08 13:29:49');
INSERT INTO `sys_user_copy1` VALUES (80284, '1234123', NULL, NULL, NULL, 'MTIzNFFx2b18cc7f5d1b4c7f82a908b14c4b7ce7', '1@qq.com', '2b18cc7f5d1b4c7f82a908b14c4b7ce7', 0, NULL, NULL, NULL, '2019-02-11 11:33:21');
INSERT INTO `sys_user_copy1` VALUES (80285, 'wangzihengyuan', '朱雷', '1', 22, 'UXE3NDE4NTI5NjM=99f8e7b099e2476692411dcaa5eee019', '819191996@qq.com', '99f8e7b099e2476692411dcaa5eee019', 0, NULL, NULL, NULL, '2019-02-11 15:02:34');
INSERT INTO `sys_user_copy1` VALUES (80286, 'nihao', NULL, NULL, NULL, 'TmloYW8xMjM=411e85bfe562477aa9c14f93ebc90f57', '1@qq.com', '411e85bfe562477aa9c14f93ebc90f57', 0, NULL, NULL, NULL, '2019-02-15 17:00:45');
INSERT INTO `sys_user_copy1` VALUES (80287, 'administrator', NULL, NULL, NULL, 'UXExMjM09844101341ae4a6081c7ef5ef0881187', 'wai@163.com', '9844101341ae4a6081c7ef5ef0881187', 0, NULL, NULL, NULL, '2019-03-12 15:11:47');
INSERT INTO `sys_user_copy1` VALUES (80288, '2', '测试用账户', '男', 22, 'MTIzNDU2de414054c4924f12bca2e1ad9c6d2c96', 'test@163.com', 'de414054c4924f12bca2e1ad9c6d2c96', 0, NULL, '00000000000', NULL, '2019-03-19 13:10:11');
INSERT INTO `sys_user_copy1` VALUES (80289, '21', '测试用账户', '男', 22, 'MTIzNDU2a98462bcbffc41fdb8d6be16d700c287', 'test@163.com', 'a98462bcbffc41fdb8d6be16d700c287', 0, NULL, '00000000000', NULL, '2019-03-19 13:10:11');
INSERT INTO `sys_user_copy1` VALUES (80290, '21k', '测试用账户', '男', 22, 'MTIzNDU2fdd84bf0a2964b2d91aa67c315227f20', 'test@163.com', 'fdd84bf0a2964b2d91aa67c315227f20', 0, NULL, '00000000000', NULL, '2019-03-19 13:10:11');
INSERT INTO `sys_user_copy1` VALUES (80291, '21kl', '测试用账户', '男', 22, 'MTIzNDU22fc257d9fedc4d58b489c95e14ec46ff', 'test@163.com', '2fc257d9fedc4d58b489c95e14ec46ff', 0, NULL, '00000000000', NULL, '2019-03-19 13:10:11');
INSERT INTO `sys_user_copy1` VALUES (80292, '21klY', '测试用账户', '男', 22, 'MTIzNDU234d90c9706034de1a2a702ef37fd6b2b', 'test@163.com', '34d90c9706034de1a2a702ef37fd6b2b', 0, NULL, '00000000000', NULL, '2019-03-19 13:10:11');
INSERT INTO `sys_user_copy1` VALUES (80293, '0', '测试用账户', '男', 22, 'MTIzNDU2067dd2ace1c3485bb2b022b910cf453d', 'test@163.com', '067dd2ace1c3485bb2b022b910cf453d', 0, NULL, '00000000000', NULL, '2019-03-19 13:11:25');
INSERT INTO `sys_user_copy1` VALUES (80294, '0H', '测试用账户', '男', 22, 'MTIzNDU2047d50a62c4c444f994d12fb08240fd7', 'test@163.com', '047d50a62c4c444f994d12fb08240fd7', 0, NULL, '00000000000', NULL, '2019-03-19 13:11:25');
INSERT INTO `sys_user_copy1` VALUES (80295, '0Hn', '测试用账户', '男', 22, 'MTIzNDU2dc73aa3ac13d4eaea3ae6c71308938f4', 'test@163.com', 'dc73aa3ac13d4eaea3ae6c71308938f4', 0, NULL, '00000000000', NULL, '2019-03-19 13:11:25');
INSERT INTO `sys_user_copy1` VALUES (80296, '0HnU', '测试用账户', '男', 22, 'MTIzNDU298f2850842344da6b18eeb605f93e758', 'test@163.com', '98f2850842344da6b18eeb605f93e758', 0, NULL, '00000000000', NULL, '2019-03-19 13:11:25');
INSERT INTO `sys_user_copy1` VALUES (80297, '0HnUc', '测试用账户', '男', 22, 'MTIzNDU21ac72ede27c541f4a6628d98cc1c4222', 'test@163.com', '1ac72ede27c541f4a6628d98cc1c4222', 0, NULL, '00000000000', '183.95.62.66', '2019-03-19 13:11:25');
INSERT INTO `sys_user_copy1` VALUES (80298, NULL, NULL, NULL, NULL, 'UXExMjM06068d03769824d49b0069fd8b2348cb0', '12@qq.com', '6068d03769824d49b0069fd8b2348cb0', 0, NULL, NULL, NULL, '2019-03-19 13:14:57');
INSERT INTO `sys_user_copy1` VALUES (80299, NULL, NULL, NULL, NULL, 'cVExMjM081e3e391af5949c4ae583e5603895921', '22222@qq.com', '81e3e391af5949c4ae583e5603895921', 0, NULL, NULL, NULL, '2019-03-19 13:32:36');
INSERT INTO `sys_user_copy1` VALUES (80300, NULL, NULL, NULL, NULL, 'UXExMjM03495f7ec306944ef8193bebb98fef9d1', '9999@admin.com', '3495f7ec306944ef8193bebb98fef9d1', 0, NULL, NULL, NULL, '2019-03-19 14:10:41');
INSERT INTO `sys_user_copy1` VALUES (80301, NULL, NULL, NULL, NULL, 'UXExMjM05f1a52774d6b43f18f975460733da833', '000@qq.com', '5f1a52774d6b43f18f975460733da833', 0, NULL, NULL, NULL, '2019-03-19 14:46:17');
INSERT INTO `sys_user_copy1` VALUES (80302, NULL, NULL, NULL, NULL, 'UXExMjM0fb91f36e924b46bbbb6afea2dc5f194f', 'admin2@lw.com', 'fb91f36e924b46bbbb6afea2dc5f194f', 0, NULL, NULL, NULL, '2019-04-02 14:49:42');
INSERT INTO `sys_user_copy1` VALUES (80303, NULL, NULL, NULL, NULL, 'UXExMjM001a3a1d595d546229acbd881cc6ed35e', 'ad@lw.com', '01a3a1d595d546229acbd881cc6ed35e', 0, NULL, NULL, NULL, '2019-04-02 14:58:02');
INSERT INTO `sys_user_copy1` VALUES (80304, NULL, NULL, NULL, NULL, 'UXExMjM0855f1f8afb2e4a5f8790303d102c1efc', 'q@q.com', '855f1f8afb2e4a5f8790303d102c1efc', 0, NULL, NULL, '183.95.62.66', '2019-04-07 12:41:06');

-- ----------------------------
-- Table structure for video_api
-- ----------------------------
DROP TABLE IF EXISTS `video_api`;
CREATE TABLE `video_api`  (
  `api_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '视频解析API编号',
  `api_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '视频解析API名称',
  `api_state` int(10) NOT NULL COMMENT '视频解析API状态',
  `api_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '视频解析API地址',
  `api_type` int(10) NULL DEFAULT NULL COMMENT '解析清晰度',
  PRIMARY KEY (`api_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '视频解析表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of video_api
-- ----------------------------
INSERT INTO `video_api` VALUES (1, '我爱解析', 0, 'http://jx.52a.ink/?url=', 1);
INSERT INTO `video_api` VALUES (2, '阿卡丽vip解析', 0, 'http://jx.ledboke.com/?url=', 1);
INSERT INTO `video_api` VALUES (3, '飞鸟解析', 0, 'http://jx.98a.ink/vip/?url=', 1);
INSERT INTO `video_api` VALUES (4, '接口4', 0, 'http://api.ledboke.com/?url=', 1);
INSERT INTO `video_api` VALUES (5, '18云解析', 1, 'http://api.nobij.top/jx/?url=', 1);
INSERT INTO `video_api` VALUES (6, '强强云解析', 1, 'http://014670.cn/jx/ty.php?url=', 1);
INSERT INTO `video_api` VALUES (7, '盘古', 1, 'http://api.pangujiexi.com/player.php?url=', 1);
INSERT INTO `video_api` VALUES (8, '新决起TV', 1, 'http://api.zuilingxian.com/jiexi.php?url=', 1);
INSERT INTO `video_api` VALUES (9, '七彩云端', 1, 'http://7cyd.com/vip/?url=', 1);
INSERT INTO `video_api` VALUES (10, '六六云解析', 1, 'http://qtv.soshane.com/ko.php?url=', 1);
INSERT INTO `video_api` VALUES (11, '47KS(AD)', 1, 'http://aty.pw/jx.php?id=1&url=', 1);
INSERT INTO `video_api` VALUES (12, '思古', 1, 'http://api.bbbbbb.me/jiexi/?url=', 1);
INSERT INTO `video_api` VALUES (13, 'OK解析', 0, 'http://okjx.cc/?url=', 1);
INSERT INTO `video_api` VALUES (14, '星梦解析', 0, 'https://api.52xmw.com/?url=', 1);
INSERT INTO `video_api` VALUES (15, '紫云解析', 0, 'http://api.smq1.com/?url=  ', 1);
INSERT INTO `video_api` VALUES (16, 'parsevideo', 0, 'https://www.parsevideo.com/#', 1);

SET FOREIGN_KEY_CHECKS = 1;
