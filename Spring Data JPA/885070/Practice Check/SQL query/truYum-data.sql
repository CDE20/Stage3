-- Include table data insertion, updation, deletion and select scripts
use truyum;
drop table menu_item;
insert into menu_item (me_name, me_price, me_active, me_date_of_launch, me_category, me_free_delivery)
values
("Sandwich", 99, "Yes", "2017-03-15", "Main Course", "Yes"),
("Burger", 129, "Yes", "2017-12-23", "Main Course", "No"),
("Pizza", 149, "Yes", "2018-08-21", "Main Course", "No"),
("French Fries", 57, "No", "2017-07-02", "Starters", "Yes"),
("Chocolate Brownie", 32, "Yes", "2022-11-02", "Dessert", "Yes");

select * from menu_Item;