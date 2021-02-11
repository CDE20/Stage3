use ormlearn;
CREATE TABLE stock (

st_id INT NOT NULL AUTO_INCREMENT,

st_code varchar(10),

st_date date,

st_open numeric(10,2),

st_close numeric(10,2),

st_volume numeric,

PRIMARY KEY (st_id)

);

insert into stock(st_id,st_code,st_date,st_open,st_close,st_volume) values (1,"FB","2019-09-03",184.00,182.39,9779400);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("FB","2019-09-04",184.65,187.14,1308000);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("FB","2019-09-05",188.53,190.90,13876700);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("FB","2019-09-06",190.21,87.49,5226800);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("FB","2019-09-09",187.73,188.76,14722400);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("FB","2019-09-10",187.44,186.17,15455900);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("FB","2019-09-11",186.44,188.47,11761700);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("FB","2019-09-12",189.86,187.47,1419800);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("FB","2019-09-13",187.33,187.19,11441100);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("FB","2019-09-16",186.93,186.22,8444800);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("FB","2019-09-17",186.66,188.08,9671100);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("FB","2019-09-18",188.09,188.14,9681900);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("FB","2019-09-19",188.66,190.14,10392700);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("FB","2019-09-20",190.66,189.93,9934200);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("FB","2019-09-23",189.34,186.82,13327600);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("FB","2019-09-24",187.98,181.28,18546600);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("FB","2019-09-25",181.45 ,182.80,18068300);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("FB","2019-09-26",181.33 ,180.11,16083300);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("FB","2019-09-27",180.49 ,177.10,14656200);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("GOOGL","2019-04-22",1236.67 ,1253.76,954200);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("GOOGL","2019-04-23",1236.67 ,1270.59 ,1593400);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("GOOGL","2019-04-24",1270.59 ,1260.05,1169800);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("GOOGL","2019-04-25",1270.30 ,1267.34,1567200);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("GOOGL","2019-04-26",1273.38 ,1277.42,1361400);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("GOOGL","2019-04-29",1280.51 ,1296.20,3618400);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("GOOGL","2019-10-17",1251.40 ,1252.80,1047900);
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("NFLX","2018-12-24",242.00 ,233.88,9547600 );
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("NFLX","2018-12-21",263.83 ,246.39,21397600 );
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("NFLX","2018-12-26",233.92,253.67,14402700 );
insert into stock(st_code,st_date,st_open,st_close,st_volume) values ("NFLX","2018-12-29",231.92,251.67,1202700 );

select * from stock where st_volume = 77233600;
select * from stock where st_code = "FB" order by st_volume desc limit 3;