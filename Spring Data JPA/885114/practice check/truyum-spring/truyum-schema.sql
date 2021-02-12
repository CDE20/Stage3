-- drop database truyum;
-- create database truyum;
-- use truyum;
drop database if exists lch_marketplace;

create database if not exists lch_marketplace;
use lch_marketplace;

create table menu_item (
	menu_item_id bigint primary key not null auto_increment,
    name varchar(20),
    price decimal(10, 2), 
    active boolean, 
    date_of_launch date,
    category varchar(20),
    free_delivery boolean
);

create table user (
	user_id bigint primary key not null auto_increment,
    name varchar(30),
	password varchar(30), 
    role varchar(10)	
);

create table cart (
	cart_id bigint primary key not null auto_increment,
    user_id bigint,
    menu_item_id bigint, 
    foreign key (menu_item_id) references menu_item(menu_item_id),
    foreign key (user_id) references user(user_id)
);

insert into menu_item 
	(name, price, active, date_of_launch, category, free_delivery) 
values 
	("Sandwich", 99.00, true, '2017-03-15', "Main Course", true), 
	("Burger", 129.00,true, '2017-12-23', "Main Course", false), 
	("Pizza", 149.00, true, '2017-08-21', "Main Course", false), 
	("French Fries", 57.00, false, '2017-07-02', "Starters", true), 
	("Chocolate Brownie",  32.00, true, '2022-11-02', "Dessert", true);

insert into user
	(name, password, role)
values 
	("Customer user", "customer123", "customer"),
    ("Admin user", "admin123", "admin");

desc menu_item;
desc user;
desc cart;

select * from menu_item;
select * from user;
select * from cart;

