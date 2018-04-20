SET NAMES utf8mb4;
CREATE DATABASE bole;

SET NAMES utf8mb4;
CREATE TABLE test (
  id bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  content varchar(50) NOT NULL DEFAULT '' COMMENT '测试内容',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='test表';

SET NAMES utf8mb4;
CREATE TABLE account (
  id bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  nickName varchar(20) NOT NULL DEFAULT '' COMMENT '昵称',
  phoneNumer varchar(11) NOT NULL DEFAULT '' COMMENT '手机号',
  passWord varchar(30) NOT NULL DEFAULT '' COMMENT '密码',
  accountType tinyint unsigned NOT NULL DEFAULT 1 COMMENT '账号类型',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='test表';