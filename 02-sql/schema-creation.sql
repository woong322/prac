--THIS IS a COMMENT IN SQL
/*This IS a block COMMENT IN SQL*/

/*
 * SQL is not case sensitive
 * BUT the convention is to captilize keywords for readability sake
 * 
 * HOWEVER, data entries ARE case sensitive. For example Strings: 'helloworld' is
 * 	different from 'HelloWorld'
 */
SELECT * FROM pokemon;
select * from pokemon;

--DDL: CREATE
CREATE TABLE pokemon(
	pokemon_id INTEGER PRIMARY KEY
	, pokemon_name VARCHAR(100) UNIQUE
	, pokemon_type VARCHAR(50) NOT NULL
);

--DDL: ALTER
ALTER TABLE pokemon ADD pokemon_secondtype VARCHAR(50);