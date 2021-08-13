REM   Script: SQL  activities
REM   Activity 1 to Activity 5

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT ALL 
    INTO salesman VALUES(2000, 'Brad pitt', 'London', 11) 
    INTO salesman VALUES(3000, 'Alex', 'Paris', 14) 
    INTO salesman VALUES(4000, 'rose', 'Rome', 13) 
    INTO salesman VALUES(5000, 'Lauran', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Lauran';

ALTER TABLE salesman ADD    grade int;

UPDATE salesman SET grade=100;

SELECT *FROM salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

UPDATE salesman SET grade=300 WHERE salesman_name='Alex';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='Lauran';

SELECT * FROM salesman;

