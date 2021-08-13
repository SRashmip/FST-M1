REM   Script: Session 01
REM   Activity 1 to 3

select * from scott.dept;

CREATE DATABASE activities;

CREATE DATABASE activities;

CREATE TABLE Customers ( 
    CustomerID int, 
    CustomerName varchar(52), 
    ContactName varchar(32), 
    Address varchar(255), 
    City varchar(50), 
    PostalCode varchar(20), 
    Country varchar(20) 
);

CREATE TABLE Customers ( 
    CustomerID int, 
    CustomerName varchar(52), 
    ContactName varchar(32), 
    Address varchar(255), 
    City varchar(50), 
    PostalCode varchar(20), 
    Country varchar(20) 
);

INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) 
VALUES ('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway');

CREATE TABLE Customers ( 
    CustomerID int, 
    CustomerName varchar(52), 
    ContactName varchar(32), 
    Address varchar(255), 
    City varchar(50), 
    PostalCode varchar(20), 
    Country varchar(20) 
);

INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) 
VALUES ('Jane', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway');

INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) 
VALUES ('Jane', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway');

CREATE TABLE Salesman( 
salesman_id int, 
salesman_name,varchar2(32), 
salesman_city,varchar2(32), 
commission int);

CREATE TABLE Salesman( 
salesman_id int, 
salesman_name,varchar2(32), 
salesman_city,varchar2(32), 
commission int 
);

CREATE TABLE Salesman( 
salesman_id int, 
salesman_name archar2(32), 
salesman_city Varchar2(32), 
commission int 
);

CREATE TABLE Salesman( 
salesman_id int, 
salesman_name varchar(32), 
salesman_city varchar(32), 
commission int 
);

INSERT ALL 
INTO Salesman VALUES(2000,'ALex','London',10) 
INTO Salesman VALUES(3000,'Peter','US',20) 
INTO Salesman VALUES(4000,'Reema','India',30) 
SELECT 1 FROM DUAL;

INSERT ALL 
INTO Salesman VALUES(2000,'ALex','London',10) 
INTO Salesman VALUES(3000,'Peter','US',20) 
INTO Salesman VALUES(4000,'Reema','India',30) 
SELECT 1 FROM DUAL;

SELECT * FROM Salesman;

SELECT salesman_id,salesman_city FROM Salesman;

SELECT * FROM Salesman Where salesman_city='US';

SELECT * FROM Salesman WHERE salesman_city='US';

SELECT salesman_id, commission FROM Salesman WHERE salesman_name='Reema';

