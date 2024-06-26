example 简单案例 
实现一个已卖出的订单接口，把每个订单返回：
店铺名称，订单编号，商品明细（返回订单商品的全部信息），商品数量，买家名称
店铺名称：可筛选，可分组
商品数量：可排序，可筛选（a<=数量<=b）
支持分页

创建以下五张表sql:
-----------------------------------------------------------------------------------
create table user
(
id       bigint       not null comment '主键'
primary key,
nickname varchar(200) not null comment '昵称',
type     char(10)     not null comment '用户类型  SELLER 卖家    BUYER买家'
)
comment '用户表';

INSERT INTO example.user (id, nickname, type) VALUES (1, '小明', 'SELLER');
INSERT INTO example.user (id, nickname, type) VALUES (2, '小红', 'SELLER');
INSERT INTO example.user (id, nickname, type) VALUES (3, '小王', 'BUYER');

-----------------------------------------------------------------------------------
create table shop
(
id        bigint       not null comment '主键'
primary key,
name      varchar(100) not null comment '店铺名称',
plateform varchar(10)  not null comment '平台：TB->淘宝  DY->抖音'
)
comment '店铺';

INSERT INTO example.shop (id, name, plateform) VALUES (1, '丰城店', 'TB');
INSERT INTO example.shop (id, name, plateform) VALUES (2, '杂货店', 'DY');
-----------------------------------------------------------------------------------


create table item
(
id      bigint         not null comment '主键'
primary key,
title   varchar(200)   not null comment '商品名称',
color   varchar(100)   not null comment '颜色 RED GREEN BLUE',
size    char(10)       not null comment '尺码 S M L XL XXL XXXL',
sku     varchar(100)   not null comment '商品sku 例如：SKY-P0247M',
shop_id bigint         not null comment '店铺id',
price   decimal(20, 2) not null comment '单价'
)
comment '商品表';

INSERT INTO example.item (id, title, color, size, sku, shop_id, price) VALUES (1, '焦内防晒衣', 'PINK', 'S', 'SKU-JN-P001', 1, 100.00);
INSERT INTO example.item (id, title, color, size, sku, shop_id, price) VALUES (2, '朋克T恤', 'BLACK', 'L', 'SKU-PK-Z001', 1, 99.00);
INSERT INTO example.item (id, title, color, size, sku, shop_id, price) VALUES (3, '西服', 'BLACK', 'XL', 'SKU-XF-X001', 2, 800.00);
INSERT INTO example.item (id, title, color, size, sku, shop_id, price) VALUES (4, '耐克球衣', 'BLACK', 'L', 'SKU-NK-K001', 2, 500.00);

-----------------------------------------------------------------------------------


create table `order`
(
id           bigint         not null comment '主键'
primary key,
pay_amount   decimal(20, 2) not null comment '支付总金额',
total_num    int            not null comment '总数',
seller_id    bigint         not null comment '卖家id',
buyer_id     bigint         not null comment '买家id',
status       varchar(10)    not null comment '订单状态  NEW  CANCEL   PAY ',
shop_id      bigint         not null comment '店铺id',
out_trade_no varchar(100)   not null comment '订单编号',
create_time  datetime       null comment '创建时间'
)
comment '订单';

INSERT INTO example.`order` (id, pay_amount, total_num, seller_id, buyer_id, status, shop_id, out_trade_no, create_time) VALUES (1, 100.00, 1, 1, 3, 'PAY', 1, 'trade0000001', '2024-05-06 10:30:16');
INSERT INTO example.`order` (id, pay_amount, total_num, seller_id, buyer_id, status, shop_id, out_trade_no, create_time) VALUES (2, 1000.00, 10, 1, 3, 'PAY', 1, 'trade0000002', '2024-05-06 10:30:17');
INSERT INTO example.`order` (id, pay_amount, total_num, seller_id, buyer_id, status, shop_id, out_trade_no, create_time) VALUES (3, 100.00, 1, 1, 3, 'NEW', 1, 'trade0000003', '2024-05-06 10:30:18');
INSERT INTO example.`order` (id, pay_amount, total_num, seller_id, buyer_id, status, shop_id, out_trade_no, create_time) VALUES (4, 800.00, 1, 2, 3, 'PAY', 2, 'trade0000004', '2024-05-06 10:30:19');
INSERT INTO example.`order` (id, pay_amount, total_num, seller_id, buyer_id, status, shop_id, out_trade_no, create_time) VALUES (5, 1300.00, 2, 2, 3, 'PAY', 2, 'trade0000005', '2024-05-06 10:30:20');
INSERT INTO example.`order` (id, pay_amount, total_num, seller_id, buyer_id, status, shop_id, out_trade_no, create_time) VALUES (6, 500.00, 1, 2, 3, 'CANCEL', 2, 'trade0000006', '2024-05-06 10:30:21');
INSERT INTO example.`order` (id, pay_amount, total_num, seller_id, buyer_id, status, shop_id, out_trade_no, create_time) VALUES (7, 99.00, 1, 1, 3, 'PAY', 1, 'trade0000007', '2024-05-06 10:30:21');
INSERT INTO example.`order` (id, pay_amount, total_num, seller_id, buyer_id, status, shop_id, out_trade_no, create_time) VALUES (8, 199.00, 2, 1, 3, 'PAY', 1, 'trade0000008', '2024-05-06 10:30:23');

-----------------------------------------------------------------------------------

create table order_item
(
id           bigint         not null comment '主键'
primary key,
oid          bigint         not null comment '订单id',
item_id      bigint         not null comment '商品id',
num          int            not null comment '数量',
total_amount decimal(20, 2) not null comment '总价'
)
comment '订单明细';

INSERT INTO example.order_item (id, oid, item_id, num, total_amount) VALUES (1, 1, 1, 1, 100.00);
INSERT INTO example.order_item (id, oid, item_id, num, total_amount) VALUES (2, 2, 1, 10, 1000.00);
INSERT INTO example.order_item (id, oid, item_id, num, total_amount) VALUES (3, 3, 1, 1, 100.00);
INSERT INTO example.order_item (id, oid, item_id, num, total_amount) VALUES (4, 4, 3, 1, 800.00);
INSERT INTO example.order_item (id, oid, item_id, num, total_amount) VALUES (5, 5, 3, 1, 800.00);
INSERT INTO example.order_item (id, oid, item_id, num, total_amount) VALUES (6, 5, 4, 1, 500.00);
INSERT INTO example.order_item (id, oid, item_id, num, total_amount) VALUES (7, 6, 4, 1, 500.00);
INSERT INTO example.order_item (id, oid, item_id, num, total_amount) VALUES (8, 7, 2, 1, 99.00);
INSERT INTO example.order_item (id, oid, item_id, num, total_amount) VALUES (9, 8, 1, 1, 100.00);
INSERT INTO example.order_item (id, oid, item_id, num, total_amount) VALUES (10, 8, 2, 1, 99.00);


项目采用jdk11,maven3.9.6环境
去到pom文件点击maven刷新导包，maven插件 clean+install
去到application.properties文件，修改数据库配置，然后运行Application.java

post请求  地址：localhost:8080/api/v1/order/query 

json参数：{
"orderStatus": "PAY",
"shopName": "店",
"itemNumStart": 10,
"itemNumEnd": 14,
"sortField": "totalNum",
"sortType": "desc",
"groupField": "name",
"page": 1,
"size": 10
}

参数说明：
orderStatus: 订单得状态 可传类型==》"PAY"、"NEW"、"CANCEL"  不传代表全查
shopName: 店铺名称筛选 模糊匹配
itemNumStart: 商品总数查询界限开始值 包含在内 例如10 等价于  >=10
itemNumEnd: 商品总数查询界限结束值 包含在内  例如14  等价于  <=14
sortField: 排序字段 默认不排序，可指定商品数量排序   传 "totalNum" 字符串， 支持扩展其他字段排序，但要和后端规定好字段
sortType: 排序方式  默认升序  可传  "asc"  "desc"  控制升降序
groupField: 分组字段 默认订单分组  客传  "name" 进行店铺名称分组，支持扩展其他字段分组，但要和后端规定好字段
page: 页码 默认1
size: 每页展示条数 默认10


可拷贝curl快速调用:
curl --location 'localhost:8080/api/v1/order/query' \
--header 'Content-Type: application/json' \
--data '{
"orderStatus": "PAY",
"shopName": "店",
"itemNumStart": 1,
"itemNumEnd": 14,
"sortField": "totalNum",
"sortType": "desc",
"groupField": "name",
"page": 1,
"size": 10
}'