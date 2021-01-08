

------------DROP TABLES
DROP TABLE shuman_spower_junction;
DROP TABLE superhumans;
DROP TABLE superpowers;


----------TABLE CREATION
/*
 * SERIAL will auto increment that value, the datatype will be INTEGER 
 * BIGSERIAL >> the datatype will be BIGINT
 * SMALLSERIAL >>the datatype will be SMALLINT
 */
CREATE TABLE superhumans(
	shuman_id SERIAL PRIMARY KEY
	, shuman_name VARCHAR(100) NOT NULL UNIQUE
	, bounty NUMERIC(30) NOT NULL
);

CREATE TABLE superpowers(
	spower_id SERIAL PRIMARY KEY
	, spower_name VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE shuman_spower_junction(
	my_shuman_id INTEGER NOT NULL
	, my_spower_id INTEGER NOT NULL
	, CONSTRAINT my_combo_key PRIMARY KEY (my_shuman_id, my_spower_id)
	, FOREIGN KEY (my_shuman_id) REFERENCES superhumans (shuman_id)
	, FOREIGN KEY (my_spower_id) REFERENCES superpowers (spower_id)
);


------------INSERTS
INSERT INTO superhumans (shuman_name, bounty) values('Danny Boy', 250000);
INSERT INTO superhumans (shuman_name, bounty) values('Abyss', 240000);
INSERT INTO superhumans (shuman_name, bounty) values('Aster', 120000);
INSERT INTO superhumans (shuman_name, bounty) values('Asura', 250000);
INSERT INTO superhumans (shuman_name, bounty) values('Rain Man', 225000);

INSERT INTO superpowers (spower_name) VALUES ('Flying');
INSERT INTO superpowers (spower_name) VALUES ('Toy Chest');
INSERT INTO superpowers (spower_name) VALUES ('Fire Breathing');
INSERT INTO superpowers (spower_name) VALUES ('Hair Needles');
INSERT INTO superpowers (spower_name) VALUES ('Regen');
INSERT INTO superpowers (spower_name) VALUES ('unknown');
INSERT INTO superpowers (spower_name) VALUES ('super speed');
INSERT INTO superpowers (spower_name) VALUES ('fog');

INSERT INTO shuman_spower_junction VALUES ( 1,1 );
INSERT INTO shuman_spower_junction VALUES ( 1,2 );
INSERT INTO shuman_spower_junction VALUES ( 1,5 );
INSERT INTO shuman_spower_junction VALUES ( 2,6 );
INSERT INTO shuman_spower_junction VALUES ( 3,3 );
INSERT INTO shuman_spower_junction VALUES ( 3,5 );
INSERT INTO shuman_spower_junction VALUES ( 4,4 );
INSERT INTO shuman_spower_junction VALUES ( 4,6 );
INSERT INTO shuman_spower_junction VALUES ( 5,7 );
INSERT INTO shuman_spower_junction VALUES ( 5,8 );


SELECT * FROM superhumans;
SELECT * FROM superpowers;
SELECT * FROM shuman_spower_junction;

-------------EXAMPLE OF A JOIN THAT INCLUDES A MANY TO MANY RELATIONSHIP
-------------------(aka including a junction table)
--STEP 1: join superhumans table and the junction table
SELECT *
FROM superhumans A
INNER JOIN shuman_spower_junction B
ON A.shuman_id = B.my_shuman_id;
--STEP 2: join the result above with the superpowers table
SELECT *
FROM superhumans A
INNER JOIN shuman_spower_junction B
ON A.shuman_id = B.my_shuman_id
INNER JOIN superpowers C
ON C.spower_id = B.my_spower_id;
--STEP 3: you can add any other select concepts to your join
SELECT A.shuman_name, C.spower_name, A.bounty
FROM superhumans A
INNER JOIN shuman_spower_junction B
ON A.shuman_id = B.my_shuman_id
INNER JOIN superpowers C
ON C.spower_id = B.my_spower_id
WHERE A.shuman_name='Danny Boy';




----------------------------------------
/*
 * WHAT IS A VIEW?
 *   the view is essentially a projection of 1 or more ACTUAL tables
 * the view itself is just a virtual table, it doesn't store data, it just references
 * data from other tables.
 * 
 * In other words, a view stores a query so you can access massive queries easier
 */
DROP VIEW get_rid_of_annoyance_view;

CREATE VIEW get_rid_of_annoyance_view AS
SELECT *
FROM superhumans A
INNER JOIN shuman_spower_junction B
ON A.shuman_id = B.my_shuman_id
INNER JOIN superpowers C
ON C.spower_id = B.my_spower_id;


SELECT * FROM get_rid_of_annoyance_view;


/*
 * What is a Materialized View?
 *    It's a view that DOES store data.
 * 
 * Normally with a view the data is updated EVERYTIME you select the view. With a materialized view
 * the data is store so you could possibly be getting outdated data. Materialized views are updated
 * periodically. They are used to speed up computations in SQL, because views need to recompiled while
 * materialized views do not.
 * 
 * view syntax:
 *      CREATE VIEW get_rid_of_annoyance_view AS
 * 
 * materialized view syntax:
 * 		CREATE MATERIALIZED VIEW get_rid_of_annoyance_view AS
 * 
 * 
 * to refresh materialized views syntax:
 * 		REFRESH MATERIALIZED VIEW get_rid_of_annoyance_view;
*/


DROP VIEW super_human_power_join ;

CREATE VIEW super_human_power_join AS
SELECT *
FROM superhumans A
INNER JOIN shuman_spower_junction B
ON A.shuman_id = B.my_shuman_id
INNER JOIN superpowers C
ON C.spower_id = B.my_spower_id;


SELECT * FROM super_human_power_join shpj ;
SELECT * FROM super_human_power_join shpj WHERE shuman_id =1;
