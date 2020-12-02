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


/*
 * CONSTRAINTS: they are restrictions on the data that can be entered into a column
 * 
 * >PRIMARY KEY (PK) it represents the official unique identifier for the record
 * 		>Primary  Key is a combination of *unique* and *not-null*
 * 		>additional note: you should probably NEVER change your POK, not because it isn't possible
 * 			but because it's dangerous
 * 		>example syntax:
 * 			PRIMARY KEY (refAttr from THIS table)
 * 
 * >FOREIGN KEY (FK) it's a reference pointer to *another* table's PK
 * 		>FK DOES NOT have to be not-null and unique in THIS table, but it does in its own table
 * 		>example syntax:
 * 			FOREIGN KEY (refAttr_from_THIS_table) REFERENCES other_table (PK_from_other_table)
 * 
 * >UNIQUE  ensures that any two records will NOT have the same value in this column
 * >NOT-NULL ensures that the record HAS a value in this column (can't be null)
 * >CHECK ensures that the record meets a cerrain condition
 * 		>example syntax:
 * 			CONSTRAINT constraint_name CHECK (column_amount >15)
 * 
 * 
 * 
 * 
 * DATATYPES IN POSTGRESQL:
 * 	Integer, varchar, timestamp, date, numeric, serial, bigserial, smallserial, bigint, smallint, text, etc
 * 	there are a TON of them
 *  https://www.postgresql.org/docs/9.5/datatype.html
 */
--DDL: CREATE
CREATE TABLE pokemon(
	pokemon_id INTEGER --PRIMARY KEY
	, pokemon_name VARCHAR(100) UNIQUE
	, pokemon_type VARCHAR(50) NOT NULL
	, PRIMARY KEY (pokemon_id)
);

--DDL: ALTER
ALTER TABLE pokemon ADD pokemon_secondtype VARCHAR(50);
--DDL: DROP
DROP TABLE pokemon;
--DDL: TRUNCATE
---i'll leave this TO your TO experiment WITH IF you desire

--LET'S VIEW THE TABLE'S STRUCTURE
SELECT * FROM information_schema.COLUMNS WHERE table_name='pokemon';





--DML: SELECT
SELECT * FROM pokemon;

--DML: INSERT
INSERT INTO pokemon values(1, 'bulbasaur', 'grass', 'ice');
INSERT INTO pokemon values(25, 'pikachu', 'eletric', null);
INSERT INTO pokemon values(121, 'starmie', 'water', 'psychic');
INSERT INTO pokemon values(150, 'mewtwo', 'psychic', null);
INSERT INTO pokemon values(149, 'dragonite', 'dragon', 'flying');

--DML: UPDATE
UPDATE pokemon SET pokemon_secondtype='poison';
UPDATE pokemon SET pokemon_secondtype='poison' WHERE pokemon_id =1;

COMMIT;
ROLLBACK;









