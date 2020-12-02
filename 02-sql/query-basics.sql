-----------Query Basics

--SELECT *   <-----------the '*' means all columns
SELECT * FROM employee;

--SELECT [column1, column2, column3, etc] FROM [table_name];
SELECT first_name, last_name FROM employee;

--ALIAS (using the "as" keyword) changes the title of the attributes in the result set
SELECT first_name AS muffin, last_name AS button FROM employee;
--aliasing for tables
SELECT employee.first_name, employee.last_name  FROM employee;
SELECT B.first_name, B.last_name  FROM employee B;

/*
 * What is a result set?
 *  The temporary table that you get back from a query.
 */


-------DIFFERENT SELECTS---------------------
SELECT * FROM employee;
--WHERE clause is....essentially a filter clause
SELECT * FROM employee WHERE title='Sales Support Agent';
SELECT * FROM employee WHERE title='Sales Support Agent' AND first_name ='Jane';
SELECT * FROM employee WHERE first_name ='Steve' OR first_name ='Margaret' OR first_name ='Robert';
--ALSO, you can use >, <, <=, >= in the where clause
SELECT * FROM employee WHERE reports_to >=(0+1);
--multiple ways to say "not equal"
SELECT * FROM employee WHERE first_name != 'Jane';
SELECT * FROM employee WHERE first_name <> 'Jane';
SELECT * FROM employee WHERE NOT first_name = 'Jane';












