DROP TABLE IF EXISTS `laptop`;
create table laptop (id int(5) AUTO_INCREMENT PRIMARY KEY,
 model varchar(255) NOT NULL,
color varchar(255) NOT NULL,
price int(6) NOT NULL) DEFAULT CHARSET=utf8;