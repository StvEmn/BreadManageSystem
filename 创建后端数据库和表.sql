-- set global time_zone = '+8:00'; -- 设置时区为东八区

-- 面包仓库管理系统

-- create database BreadManageSystem; -- 创建数据库
-- USE BreadManageSystem; -- 切换数据库

CREATE TABLE purchase
(                                                                   -- 进货表
    id                 INT(11) NOT NULL PRIMARY KEY auto_increment, -- id
    goods_name         VARCHAR(100)  DEFAULT NULL,                  -- 商品名
    quantity           INT(11)       DEFAULT 0,                     -- 数量
    unit_price         DECIMAL(5, 2) DEFAULT 0.00,                  -- 单价
    total_price        DECIMAL(9, 2) DEFAULT 0.00,                  -- 总价
    specification      VARCHAR(100)  DEFAULT NULL,                  -- 规格
    production_time    date          default null,                  -- 生产时间
    purchase_time      date          default null,                  -- 进货时间
    supplier           varchar(100)  default null,                  -- 供应商
    address            varchar(200)  DEFAULT NULL,                  -- 地址
    tel                VARCHAR(11)   DEFAULT NULL,                  -- 电话
    certificate_number VARCHAR(200)  DEFAULT NULL                   -- 合格证号
);

-- 出货表
CREATE TABLE shipment
(                                                                -- 出货表
    id              int(11) not null primary key auto_increment, -- id
    goods_name      varchar(100)  default null,                  -- 商品名
    quantity        int(11)       default 0,                     -- 数量
    unit_price      DECIMAL(5, 2) DEFAULT 0.00,                  -- 单价
    total_price     DECIMAL(9, 2) DEFAULT 0.00,                  -- 总价
    specification   varchar(100)  default NULL,                  -- 规格
    production_time date          default null,                  -- 生产时间
    delivery_time   date          DEFAULT null                   -- 出货时间
);

CREATE TABLE user
(                                                             -- 客户账号表
    id       int(11)     not null primary key auto_increment, -- id
    username VARCHAR(20) NOT NULL,                            -- 账号
    password VARCHAR(16) NOT NULL                             -- 密码
);
