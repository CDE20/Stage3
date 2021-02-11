drop database if exists ormlearn;
create database if not exists ormlearn;

use ormlearn;
show tables;

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

insert into employee values(1,"ABCD",25000.00,true,"1999-03-01",1);
insert into employee values(2,"BCDE",25000.00,true,"1999-02-03",1);
insert into employee values(3,"CDEF",25000.00,true,"1999-10-11",3);
insert into employee values(4,"DEFG",25000.00,true,"1999-05-07",2);

insert into skill values(1,"Python");
insert into skill values(2,"java");
insert into skill values(3,".net");

insert into employee_skill values(1,1,1);
insert into employee_skill values(2,1,2);
insert into employee_skill values(3,2,1);
insert into employee_skill values(4,2,2);
insert into employee_skill values(5,3,1);
insert into employee_skill values(6,4,2);

select * from employee_skill;
select * from employee;
select * from skill;
select * from department;
