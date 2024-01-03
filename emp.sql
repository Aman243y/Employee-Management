create database employee_directory;
use employee_directory;
Create Table employee(
id int auto_increment,
first_name varchar(100),
last_name varchar(100),
email varchar(100),
primary key(id)
);

Insert into employee(first_name,last_name,email) values ("aman","yadav","ama@gmail.com");
Insert into employee(first_name,last_name,email) values ("vinay","yadav","vinay@gmail.com");

select * from employee;