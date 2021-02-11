create database truyum_practice;
use truyum_practice;

CREATE TABLE `menu_item` (
  `id` int NOT NULL,
  `active` bit(1) NOT NULL,
  `category` varchar(255) DEFAULT NULL,
  `date_of_launch` datetime(6) DEFAULT NULL,
  `free_delivery` bit(1) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`id`)
) ;

INSERT INTO `menu_item` VALUES (1,_binary '','Main Course','2017-03-15 00:00:00.000000',_binary '','Sandwich',99),
(2,_binary '','Main Course','2017-12-23 00:00:00.000000',_binary '\0','Burger',129),
(3,_binary '','Main Course','2018-08-21 00:00:00.000000',_binary '\0','Pizza',149),
(4,_binary '\0','Starters','2017-07-02 00:00:00.000000',_binary '','French Fries',57),
(5,_binary '','Dessert','2022-11-02 00:00:00.000000',_binary '','Chocolate Brownie',32);

select * from menu_item;
