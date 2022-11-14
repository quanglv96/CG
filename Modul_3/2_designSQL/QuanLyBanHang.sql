create database QuanLyBanHang;
use QuanLyBanHang;
create table Customer(
customer_ID int(5) not null auto_increment primary key,
customer_Name varchar(50) not null,
customer_Age int check(customer_Age<100) not null
);
create table Orrder(
order_ID int (5) not null auto_increment primary key,
customer_ID int (5) not null,
order_Date datetime not null,
order_TotalPrice int not null,
foreign key(customer_ID) references Customer(customer_ID)
);
create table Product(
product_ID int(5) not null auto_increment primary key,
product_Name varchar(50) not null,
product_Price double not null
);
create table OrderDetail(
order_ID int (5),
product_ID int(5),
od_quantity int not null,
Primary key (order_ID, product_ID),
foreign key (order_ID) references Orrder (order_ID), 
foreign key (product_ID) references Product(product_ID)
);
