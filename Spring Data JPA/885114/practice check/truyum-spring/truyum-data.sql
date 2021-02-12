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
    
    
 insert into cart 
 values (1, 1, 1), (2, 1, 3);