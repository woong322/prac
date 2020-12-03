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


----NULL REFERENCES
--SELECT * FROM employee WHERE reports_to = NULL; --will not work
--SELECT * FROM employee WHERE reports_to='NULL'; --will not work
SELECT * FROM employee WHERE reports_to IS NULL;
SELECT * FROM employee WHERE NOT reports_to IS NOT NULL;

SELECT * FROM employee WHERE reports_to IS NOT NULL;
SELECT * FROM employee WHERE NOT reports_to IS NULL;



--LIKE keyword, finds patterns in attributes
---'%' is a wildcard that is a stand-in for 0 or more characters
---'_' is a wildcard that is a stand-in for EXACTLY 1 character
SELECT * FROM album;
SELECT * FROM album WHERE title LIKE 'B%';
SELECT * FROM album WHERE title LIKE 'Bi%';
SELECT * FROM album WHERE title LIKE 'B% O%s';
SELECT * FROM album WHERE title LIKE '%ig%n%es%';
SELECT * FROM album WHERE title LIKE '%ig Ones';
SELECT * FROM album WHERE title LIKE '_ig Ones';
SELECT * FROM album WHERE title LIKE '%g Ones';
SELECT * FROM album WHERE title LIKE '_Big Ones';

SELECT * FROM album WHERE title LIKE '%%%%%%%%%%%%%%%%%%%%%%%%%%%ig O_es';
SELECT * FROM album WHERE title LIKE 'B_g_O_e_';



---ORDER BY -----aka sorting
----defaults to ascending order...BUT you can manually order by descending
SELECT * FROM employee;
SELECT * FROM employee ORDER BY first_name;
SELECT * FROM employee ORDER BY first_name ASC;
SELECT * FROM employee ORDER BY first_name DESC;
SELECT * FROM employee ORDER BY title;
SELECT * FROM employee ORDER BY title, first_name, last_name;

------BETWEEN, inclusive range
SELECT * FROM employee WHERE employee_id BETWEEN 5 AND 7; --inclusive range
SELECT * FROM employee WHERE employee_id BETWEEN 5 AND 7 AND title='IT Staff';
SELECT * FROM employee WHERE first_name BETWEEN 'A' AND 'R';

-----IN keyword
SELECT * FROM employee WHERE first_name ='Steve' OR first_name ='Margaret' OR first_name ='Robert';
SELECT * FROM employee WHERE first_name IN ('Steve', 'Margaret', 'Robert');
SELECT * FROM employee WHERE first_name NOT IN ('Steve', 'Margaret', 'Robert');


---------AGGREGATE FUNCTIONS
/*
 * What is an aggregate function?
 *  a calculation operating on a group of records/entrities, producing a single value (most of the time single)
 * 
 * There are different types of aggregates functions, for example:
 * 	COUNT, MAX, MIN, AVG, SUM, DISTINCT
 */

SELECT * FROM album a ;
SELECT count(*) FROM album;
----
SELECT * FROM employee;
SELECT count(*) FROM employee;
SELECT DISTINCT (title) FROM employee;
SELECT count(DISTINCT (title)) FROM employee;
---
SELECT * FROM invoice;
SELECT count(*) FROM invoice;
SELECT MAX(total) FROM invoice;
SELECT MIN(total) FROM invoice;
SELECT AVG(total) FROM invoice;
SELECT SUM(total) FROM invoice;
--YES, you can use max and min on strings
SELECT MAX(billing_city) FROM invoice;


-----GROUP BY 
---group by allows aggregate functions to work on smaller pockets of records
SELECT * FROM invoice;
SELECT billing_country ,sum(total) FROM invoice GROUP BY billing_country ;
SELECT billing_country ,count(*) FROM invoice GROUP BY billing_country ;

------HAVING keyword
--when group by is NOT used, HAVING behaves like WHERE
--WHERE filters BEFORE aggregate functions, HAVING filters after
SELECT billing_country, sum(total) AS spending FROM invoice GROUP BY billing_country ;
/*
 * btw, ORDER of keywords matter, "where" goes before "group by" goes before "having"
 */
---let's try it with "where"
--SELECT billing_country, sum(total) AS spending FROM invoice GROUP BY billing_country WHERE total>50;
SELECT billing_country, sum(total) AS spending FROM invoice WHERE sum(total)>50 GROUP BY billing_country; --will not work
SELECT billing_country, sum(total) AS spending FROM invoice WHERE total>50 GROUP BY billing_country;
---
SELECT billing_country, sum(total) AS spending FROM invoice GROUP BY billing_country HAVING sum(total)>50;
--where goes before group by goes before having
SELECT billing_country, sum(total) AS spending FROM invoice WHERE total>1 GROUP BY billing_country HAVING sum(total)>50;


--------------SCALAR FUNCTIONS-----------
/*
 * What is a scalar function?
 *  functions that work on individual records
 * 
 * There are TON of scalar functions. Some deal with numeric values, some with character values,
 * 	other with dates, and many more
 */

--FIRST, let's create a dummy table
--we'll use this like a System.out.println();
SELECT 5*7;
SELECT 'hello world';


----NUMERIC
--here are some examples, but there are MANY more:
SELECT abs(-99);
SELECT floor(88.77);
SELECT ceil(88.77);
SELECT trunc(8923.3489561, 4);
SELECT trunc(8923.3489561, 2);
SELECT trunc(8923.3489561, -2);

-----CHARACTER
----here are some examples, but there are MANY more:
SELECT 'HeLlo wOrlD';
SELECT upper('HeLlo wOrlD');
SELECT lower('HeLlo wOrlD');
SELECT length('HeLlo wOrlD');


---DATE
----here are some examples, but there are MANY more:
SELECT current_date;
SELECT current_timestamp;


SELECT * FROM invoice;
SELECT billing_country, billing_city FROM invoice;
SELECT billing_country, upper(billing_city) FROM invoice;



--------SUBQUERIES-------------
----------aka nested queries
SELECT * FROM customer c ;
SELECT * FROM invoice i ;

--
SELECT * FROM customer WHERE customer_id  IN(
	SELECT customer_id  FROM invoice B WHERE B.total>16
);

--another example of a subquery
SELECT B.customer_id, total, invoice_id FROM (SELECT * FROM invoice WHERE total>15) AS B WHERE invoice_id>200;




