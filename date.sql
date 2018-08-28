/*
SQLyog Ultimate v12.2.6 (64 bit)
MySQL - 5.7.20-log : Database - date
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`date` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `date`;

/*Table structure for table `action` */

DROP TABLE IF EXISTS `action`;

CREATE TABLE `action` (
  `id` varchar(100) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `actiontime` varchar(100) DEFAULT NULL,
  `charge` varchar(10) DEFAULT NULL,
  `endtime` varchar(100) DEFAULT NULL,
  `detail` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `action` */

/*Table structure for table `action_image` */

DROP TABLE IF EXISTS `action_image`;

CREATE TABLE `action_image` (
  `actionid` varchar(100) DEFAULT NULL,
  `image` blob
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `action_image` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `openid` varchar(200) NOT NULL COMMENT '微信OPENID',
  `nickname` varchar(200) DEFAULT NULL COMMENT '名字',
  `sex` varchar(3) DEFAULT NULL COMMENT '性别',
  `birth` varchar(20) DEFAULT NULL COMMENT '生日',
  `city` varchar(100) DEFAULT NULL COMMENT '地址',
  `education` varchar(50) DEFAULT NULL COMMENT '受教育程度',
  `income` varchar(20) DEFAULT NULL COMMENT '收入',
  `ismarry` varchar(10) DEFAULT NULL COMMENT '婚姻状况',
  `haschild` varchar(10) DEFAULT NULL COMMENT '是否有小孩',
  `wantchild` int(4) DEFAULT NULL COMMENT '想要几个小孩',
  `work` varchar(20) DEFAULT NULL COMMENT '工作',
  `car` varchar(10) DEFAULT NULL COMMENT '车辆',
  `house` varchar(20) DEFAULT NULL COMMENT '房产',
  `weight` int(4) DEFAULT NULL COMMENT '体重',
  `bodysize` varchar(20) DEFAULT NULL COMMENT '体型',
  `smoke` varchar(4) DEFAULT NULL COMMENT '抽烟',
  `drink` varchar(4) DEFAULT NULL COMMENT '饮酒',
  `constellation` varchar(10) DEFAULT NULL COMMENT '星座',
  `ethnic` varchar(10) DEFAULT NULL COMMENT '民族',
  `marrytime` varchar(20) DEFAULT NULL COMMENT '结婚时间',
  `showinfo` tinyint(1) DEFAULT NULL COMMENT '是否公开',
  `height` int(4) DEFAULT NULL COMMENT '身高',
  `text` text COMMENT '爱情宣言',
  `isadmin` tinyint(1) DEFAULT '0' COMMENT '管理员标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`openid`,`nickname`,`sex`,`birth`,`city`,`education`,`income`,`ismarry`,`haschild`,`wantchild`,`work`,`car`,`house`,`weight`,`bodysize`,`smoke`,`drink`,`constellation`,`ethnic`,`marrytime`,`showinfo`,`height`,`text`,`isadmin`) values 
('0','张三','name','12','男',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('1','sadasd','1','0',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('2','sadasd','2','0',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('3','sadasd','3','0',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `user_condition` */

DROP TABLE IF EXISTS `user_condition`;

CREATE TABLE `user_condition` (
  `userid` varchar(32) NOT NULL COMMENT '主键',
  `openid` varchar(200) NOT NULL COMMENT '微信OPENID',
  `agerange` varchar(20) DEFAULT NULL COMMENT '年龄范围',
  `heightrange` varchar(20) DEFAULT NULL COMMENT '身高范围',
  `education` varchar(20) DEFAULT NULL COMMENT '教育程度',
  `ismarry` varchar(10) DEFAULT NULL COMMENT '婚姻状况',
  `income` varchar(20) DEFAULT NULL COMMENT '收入',
  `city` varchar(100) DEFAULT NULL COMMENT '地址',
  `haschild` varchar(10) DEFAULT NULL COMMENT '是否有小孩',
  `wantchild` int(4) DEFAULT NULL COMMENT '想要几个小孩',
  `bodysize` varchar(20) DEFAULT NULL COMMENT '体型',
  `smoke` varchar(4) DEFAULT NULL COMMENT '抽烟',
  `drink` varchar(4) DEFAULT NULL COMMENT '饮酒',
  `hasphoto` varchar(4) DEFAULT NULL COMMENT '是否有照片',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='择偶条件';

/*Data for the table `user_condition` */

/*Table structure for table `user_image` */

DROP TABLE IF EXISTS `user_image`;

CREATE TABLE `user_image` (
  `userid` varchar(100) DEFAULT NULL,
  `openid` varchar(100) DEFAULT NULL,
  `image` blob COMMENT '图片'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_image` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
