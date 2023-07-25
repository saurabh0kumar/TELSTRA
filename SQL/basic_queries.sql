create database toyshop;
use toyshop;	-- use database

create table toy(
toy_id int primary key,
toy_name varchar(40),
price int,
category varchar(30)
);

show tables;
select * from toy;	-- select entire table

desc toy;	-- table description

create table customer(
customer_id int primary key,
customer_name varchar(40),
phone bigint,
email varchar(40),
location varchar(30)
);

show tables;

create table cart(
cart_id int primary key,
customer_id int,
toy_id int,
expiry_date date,
foreign key (customer_id) references customer(customer_id),
foreign key (toy_id) references toy(toy_id)
);

insert into toy values (
100234,
'Teddy',
560,
'Fluffed');

insert into toy values (
100235,
'Car',
2560,
'Electronic');

insert into toy values (
100236,
'Legos',
1000,
'Construction');

insert into toy values (
100237,
'Helicopter',
3660,
'Electronic');

insert into toy values (
100238,
'Panda',
1060,
'Fluffed');

insert into toy values (
100239,
'Ludo',
3660,
'Board game');

select * from toy;

insert into customer values (200163,'Suraj', 9999999999, 'suraj@gmail.com', 'Karnataka');
insert into customer values (200164,'Khushagra', 9999999998, 'khushagra@gmail.com', 'Delhi');
insert into customer values (200165,'Mallikarjun', 9999999988, 'mallikarjun@gmail.com', 'Karnataka');
insert into customer values (200166,'Omprakash', 9999999888, 'op@gmail.com','Maharashtra');

select * from customer;

insert into cart values (1100,200165,100235,'2023-08-01');
insert into cart values (1101,200165,100237,'2023-08-05');
insert into cart values (1102,200163,100238,'2023-08-26');
insert into cart values (1103,200164,100239,'2023-12-31');
insert into cart values (1104,200166,100234,'2024-01-01');

select * from cart;

select toy_name, price from toy where price=(select min(price) from toy);
select toy_name, price from toy where price=(select max(price) from toy);

select toy_name, price from toy where price>(select avg(price) from toy);

select count(*) from cart;

select * from toy
order by price desc;

select * from toy
order by toy_name desc;

select sum(price) from cart c,toy t where c.customer_id=200165 and c.toy_id=t.toy_id;
select count(c.toy_id) from cart c,Toy t where t.category="Electronic" and c.toy_id=t.toy_id;

select cu.customer_name, ca.toy_id, ca.expiry_date
from customer cu,cart ca
where ca.expiry_date>='2023-08-01' and ca.expiry_date<='2023-08-10' and ca.customer_id=cu.customer_id;

select ca.toy_id, cu.location
from cart ca,customer cu
where cu.location='Karnataka' and cu.customer_id=ca.customer_id;

select count(ca.cart_id)
from cart ca,customer cu
where cu.customer_name='Mallikarjun' and cu.customer_id=ca.customer_id;

select t.toy_name, cu.customer_name
from toy t, customer cu, cart ca
where cu.customer_name='Mallikarjun' and t.toy_id=ca.toy_id and ca.customer_id=cu.customer_id;

select t.toy_name, cu.customer_name, ca.expiry_date
from toy t, customer cu, cart ca
where ca.expiry_date<='2023-08-01' and t.toy_id=ca.toy_id and ca.customer_id=cu.customer_id;

select cu.customer_name, t.price
from customer cu, toy t, cart ca
where t.price>(select avg(price) from toy) and t.toy_id=ca.toy_id and ca.customer_id=cu.customer_id;

select sum(t.price)
from toy t, customer cu, cart ca
where cu.customer_name='Mallikarjun' and t.toy_id=ca.toy_id and ca.customer_id=cu.customer_id;

select cu.customer_name, t.category
from toy t, customer cu, cart ca
where t.category='Fluffed' and t.toy_id=ca.toy_id and ca.customer_id=cu.customer_id;
