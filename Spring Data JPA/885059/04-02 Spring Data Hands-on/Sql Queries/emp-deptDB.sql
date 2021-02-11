use ormlearn;
show tables;
drop table employee;
create table department(
		dp_id int auto_increment,
        dp_name varchar(45),
        PRIMARY KEY (dp_id)
);
create table employee(
	em_id int auto_increment,
    em_name varchar(45),
    em_salary decimal(10,2),
    em_permanent boolean,
    em_date_of_birth date,
    em_dp_id int,
    PRIMARY KEY (em_id),
    FOREIGN KEY (em_dp_id) REFERENCES department(dp_id)
);


create table skill(
	sk_id int auto_increment,
    sk_name varchar(45),
    PRIMARY KEY (sk_id)
);

create table employee_skill(
	es_id int auto_increment,
    es_em_id int,
    es_sk_id int,
    PRIMARY KEY (es_id),
    FOREIGN KEY (es_em_id) REFERENCES employee(em_id),
    FOREIGN KEY (es_sk_id) REFERENCES skill(sk_id)
    
);

insert into department values(1,"CDE");
insert into department values(2,"ADM");
insert into department values(3,"CDB");

insert into employee values(101,"Meghana",25000.00,true,"1999-03-01",1);
insert into employee values(102,"Shashidhar",25000.00,true,"1999-02-03",1);
insert into employee values(103,"Rohith",25000.00,true,"1999-10-11",3);
insert into employee values(104,"Bhavitha",25000.00,true,"1999-05-07",2);


insert into skill values(11,"Python");
insert into skill values(12,"java");
insert into skill values(13,".net");

insert into employee_skill values(200,101,11);
insert into employee_skill values(201,101,12);
insert into employee_skill values(202,102,11);
insert into employee_skill values(203,102,12);
insert into employee_skill values(204,103,11);
insert into employee_skill values(205,104,12);

select * from employee_skill;