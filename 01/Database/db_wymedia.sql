/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.0.51b-community-nt-log : Database - db_wymedia
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_wymedia` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `db_wymedia`;

/*Table structure for table `dtproperties` */

DROP TABLE IF EXISTS `dtproperties`;

CREATE TABLE `dtproperties` (
  `id` int(11) NOT NULL auto_increment,
  `objectid` int(11) default NULL,
  `property` varchar(64) collate utf8_unicode_ci default NULL,
  `value` varchar(255) collate utf8_unicode_ci default NULL,
  `uvalue` varchar(510) collate utf8_unicode_ci default NULL,
  `lvalue` text collate utf8_unicode_ci,
  `version` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `dtproperties` */

/*Table structure for table `tb_admin` */

DROP TABLE IF EXISTS `tb_admin`;

CREATE TABLE `tb_admin` (
  `id` int(11) NOT NULL auto_increment,
  `account` varchar(50) collate utf8_unicode_ci default NULL,
  `password` varchar(50) collate utf8_unicode_ci default NULL,
  `visit` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `tb_admin` */

/*Table structure for table `tb_info` */

DROP TABLE IF EXISTS `tb_info`;

CREATE TABLE `tb_info` (
  `id` int(11) NOT NULL auto_increment COMMENT 'ID自动编号',
  `info_type` smallint(2) default NULL COMMENT '信息类别',
  `info_title` varchar(80) collate utf8_unicode_ci default NULL COMMENT '信息标题',
  `info_content` varchar(1000) collate utf8_unicode_ci default NULL COMMENT '信息内容',
  `info_linkman` varchar(50) collate utf8_unicode_ci default NULL COMMENT '联系人',
  `info_phone` varchar(50) collate utf8_unicode_ci default NULL COMMENT '联系电话',
  `info_email` varchar(100) collate utf8_unicode_ci default NULL COMMENT 'E-mail地址',
  `info_date` datetime default NULL COMMENT '发布时间',
  `info_state` varchar(1) collate utf8_unicode_ci default '0' COMMENT '审核状态',
  `info_payfor` varchar(1) collate utf8_unicode_ci default '0' COMMENT '付费状态',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `tb_info` */

insert  into `tb_info`(`id`,`info_type`,`info_title`,`info_content`,`info_linkman`,`info_phone`,`info_email`,`info_date`,`info_state`,`info_payfor`) values (1,1,'test1','testessdfgdsfsd','zs','18758917700','2@qq.com','2015-06-18 00:10:51','0','1');

/*Table structure for table `tb_media` */

DROP TABLE IF EXISTS `tb_media`;

CREATE TABLE `tb_media` (
  `id` int(11) NOT NULL auto_increment,
  `media_title` varchar(100) collate utf8_unicode_ci default NULL,
  `media_type` varchar(100) collate utf8_unicode_ci default NULL,
  `media_src` varchar(100) collate utf8_unicode_ci default NULL,
  `media_pic` varchar(100) collate utf8_unicode_ci default NULL,
  `media_info` varchar(400) collate utf8_unicode_ci default NULL,
  `media_uptime` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `media_lookCount` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `tb_media` */

/*Table structure for table `tb_mediar` */

DROP TABLE IF EXISTS `tb_mediar`;

CREATE TABLE `tb_mediar` (
  `id` int(11) NOT NULL auto_increment,
  `mediaR_rootId` int(11) default NULL,
  `mediaR_author` varchar(50) collate utf8_unicode_ci default NULL,
  `mediaR_content` text collate utf8_unicode_ci,
  `mediaR_time` datetime default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `tb_mediar` */

/*Table structure for table `tb_type` */

DROP TABLE IF EXISTS `tb_type`;

CREATE TABLE `tb_type` (
  `id` int(11) NOT NULL auto_increment COMMENT 'ID自动编号',
  `type_sign` int(11) default NULL COMMENT '类别标识',
  `type_name` varchar(20) collate utf8_unicode_ci default NULL COMMENT '类别名称',
  `type_intro` varchar(20) collate utf8_unicode_ci default NULL COMMENT '类别介绍',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `tb_type` */

insert  into `tb_type`(`id`,`type_sign`,`type_name`,`type_intro`) values (1,1,'二手物品','卖你的二手');

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL auto_increment,
  `user_name` varchar(20) collate utf8_unicode_ci default NULL,
  `user_password` varchar(10) collate utf8_unicode_ci default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `tb_user` */

insert  into `tb_user`(`id`,`user_name`,`user_password`) values (1,'zs','123');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
