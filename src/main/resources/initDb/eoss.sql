/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.15 : Database - eoss
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`eoss` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `eoss`;

/*Table structure for table `admin_filter_definition` */

DROP TABLE IF EXISTS `admin_filter_definition`;

CREATE TABLE `admin_filter_definition` (
  `id` int(11) NOT NULL,
  `rule` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_filter_definition` */

insert  into `admin_filter_definition`(`id`,`rule`) values (1,'[main]\r\nloginUrl = /toLogin\r\n\r\n#the [urls] section must config\r\n[urls]\r\n/ = anon\r\n/static/** = anon\r\n/toLogin = anon\r\n/login = anon\r\n\r\n/system/**/*list* = authc, roles[系统查看员,系统管理员]\r\n/system/**/*query* = authc, roles[系统查看员,系统管理员]\r\n/system/**/*select* = authc, roles[系统查看员,系统管理员]\r\n/system/**/*find* = authc, roles[系统查看员,系统管理员]\r\n\r\n/system/**/*add* = authc, roles[系统管理员]\r\n/system/**/*update* = authc, roles[系统管理员]\r\n/system/**/*delete* = authc, roles[系统管理员]\r\n\r\n/system/** = authc\r\n\r\n/** = authc\r\n\r\n#/system/** = roles[系统管理员,系统管理员2]; perms[user:add,user:delete,user:list,user*]\r\n#the above lineRule, mean that user must has any roles, ***OR*** has any perms\r\n\r\n#------------------- notice -------------------#\r\n#--when an request coming\r\n#--request url will match(ant-path-matcher) the rule from first lineRule to last lineRule\r\n#--if match any lineRule, break\r\n#------------------- notice -------------------#');

/*Table structure for table `admin_menu` */

DROP TABLE IF EXISTS `admin_menu`;

CREATE TABLE `admin_menu` (
  `ID` int(32) NOT NULL,
  `PID` int(32) DEFAULT NULL,
  `NAME` varchar(100) NOT NULL,
  `LEAF` int(11) NOT NULL,
  `PATH` varchar(1000) DEFAULT NULL,
  `LEV` int(11) DEFAULT NULL,
  `URL` varchar(1000) DEFAULT NULL,
  `TARGET` varchar(100) DEFAULT NULL,
  `CREATE_DATETIME` varchar(19) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_menu` */

insert  into `admin_menu`(`ID`,`PID`,`NAME`,`LEAF`,`PATH`,`LEV`,`URL`,`TARGET`,`CREATE_DATETIME`) values (1,-1,'菜单根目录',0,'--',0,NULL,NULL,'2012-12-15 18:08:07'),(2,1,'系统管理',0,'1#2',1,NULL,NULL,'2012-12-13 13:46:00'),(3,1,'业务管理',0,'1#3',1,NULL,NULL,'2012-12-13 13:53:10'),(4,2,'菜单管理',0,'1#2#4',2,NULL,NULL,'2012-12-13 16:00:02'),(5,2,'用户管理',0,'1#2#5',2,NULL,NULL,'2012-12-13 16:00:02'),(6,2,'角色管理',0,'1#2#6',2,NULL,NULL,'2012-12-13 16:00:02'),(7,4,'菜单添加',1,'1#2#4#7',3,'/system/menu/toAdd','centerFrame','2012-12-13 16:00:02'),(8,2,'权限管理',0,'1#2#8',2,NULL,NULL,'2012-12-16 13:59:33'),(9,4,'菜单查询',1,'1#2#4#9',3,'/system/menu/toList','centerFrame','2012-12-16 14:15:20'),(10,8,'权限添加',1,'1#2#8#10',3,'/system/permission/toAdd','centerFrame','2012-12-20 14:58:29'),(13,8,'权限查询',1,'1#2#8#13',3,'/system/permission/toList','centerFrame','2012-12-20 16:28:03'),(14,6,'角色添加',1,'1#2#6#14',3,'/system/role/toAdd','centerFrame','2012-12-22 12:36:14'),(15,6,'角色查询',1,'1#2#6#15',3,'/system/role/toList','centerFrame','2012-12-22 14:29:28'),(16,5,'用户添加',1,'1#2#5#16',3,'/system/user/toAdd','centerFrame','2012-12-22 18:34:26'),(17,5,'用户查询',1,'1#2#5#17',3,'/system/user/toList','centerFrame','2012-12-22 19:56:13'),(18,2,'资源管理',0,'1#2#18',2,NULL,NULL,'2016-10-21 11:43:59'),(19,18,'资源添加',1,'1#2#18#19',3,'/system/resource/toAdd','centerFrame','2016-10-21 11:46:46'),(20,18,'资源查询',1,'1#2#18#20',3,'/system/resource/toList','centerFrame','2016-10-21 11:47:05'),(21,2,'安全规则',0,'1#2#21',2,NULL,NULL,'2016-10-25 12:27:00'),(22,21,'规则更新',1,'1#2#21#22',3,'/system/filterDefinition/toUpdate','centerFrame','2016-10-25 12:28:26');

/*Table structure for table `admin_permission` */

DROP TABLE IF EXISTS `admin_permission`;

CREATE TABLE `admin_permission` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(128) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_permission` */

insert  into `admin_permission`(`ID`,`NAME`) values (1,'add'),(2,'update'),(3,'delete'),(4,'list'),(5,'query'),(6,'select'),(7,'find');

/*Table structure for table `admin_role` */

DROP TABLE IF EXISTS `admin_role`;

CREATE TABLE `admin_role` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(100) NOT NULL,
  `CREATE_DATETIME` varchar(19) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_role` */

insert  into `admin_role`(`ID`,`NAME`,`CREATE_DATETIME`) values (1,'系统管理员','2012-12-22 16:27:04'),(2,'系统查看员','2016-10-26 19:01:45');

/*Table structure for table `admin_role_permission` */

DROP TABLE IF EXISTS `admin_role_permission`;

CREATE TABLE `admin_role_permission` (
  `PERMISSION_ID` int(11) NOT NULL,
  `ROLE_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_role_permission` */

insert  into `admin_role_permission`(`PERMISSION_ID`,`ROLE_ID`) values (4,2),(5,2),(6,2),(7,2),(1,1),(2,1),(3,1),(4,1),(5,1),(6,1),(7,1);

/*Table structure for table `admin_user` */

DROP TABLE IF EXISTS `admin_user`;

CREATE TABLE `admin_user` (
  `ID` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(32) NOT NULL,
  `salt` varchar(32) DEFAULT NULL,
  `CREATE_DATETIME` varchar(19) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_user` */

insert  into `admin_user`(`ID`,`username`,`password`,`salt`,`CREATE_DATETIME`) values (1,'admin','ba2327146bd2cc4636441392519c517c','952','2012-12-22 19:25:48'),(2,'admin2','11ea1c5dce9cff05b068091972ed396b','71','2018-04-22 19:31:31');

/*Table structure for table `admin_user_menu` */

DROP TABLE IF EXISTS `admin_user_menu`;

CREATE TABLE `admin_user_menu` (
  `MENU_ID` int(11) NOT NULL,
  `USER_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_user_menu` */

insert  into `admin_user_menu`(`MENU_ID`,`USER_ID`) values (7,1),(9,1),(16,1),(17,1),(14,1),(15,1),(10,1),(13,1),(19,1),(20,1),(22,1);

/*Table structure for table `admin_user_role` */

DROP TABLE IF EXISTS `admin_user_role`;

CREATE TABLE `admin_user_role` (
  `USER_ID` int(11) NOT NULL,
  `ROLE_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_user_role` */

insert  into `admin_user_role`(`USER_ID`,`ROLE_ID`) values (2,2),(1,1),(1,2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
