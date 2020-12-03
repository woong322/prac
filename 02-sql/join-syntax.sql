SELECT * FROM album;
SELECT * FROM artist;



------INNER JOIN
SELECT * FROM artist INNER JOIN album ON artist.artist_id =album.artist_id ;
--now let's do it with aliasing
SELECT * FROM artist A INNER JOIN album B ON A.artist_id =B.artist_id ;
--
SELECT count(*) FROM artist A INNER JOIN album B ON A.artist_id =B.artist_id ;
--we can still use the wheere clause
SELECT * FROM artist A INNER JOIN album B ON A.artist_id =B.artist_id WHERE A.artist_id =1;


-------LEFT OUTER JOIN
SELECT * FROM artist LEFT OUTER JOIN album ON artist.artist_id =album.artist_id ;
--
SELECT count(*) FROM artist LEFT OUTER JOIN album ON artist.artist_id =album.artist_id ;

--------RIGHT OUTER JOIN
SELECT * FROM artist RIGHT OUTER JOIN album ON artist.artist_id =album.artist_id ;
--the right outer join has 347 record JUST LIKE the inner join because BY COINCIDENCE there are
--no albums that don't have artists
SELECT COUNT(*) FROM artist RIGHT OUTER JOIN album ON artist.artist_id =album.artist_id ;
--the word "outer" is syntactical sugar, it doesn't do anything functionally, just makes it nicer to read (potentially)
SELECT * FROM artist RIGHT JOIN album ON artist.artist_id =album.artist_id ;


------FULL OUTER JOIN
SELECT * FROM artist FULL OUTER JOIN album ON artist.artist_id =album.artist_id ;
--
SELECT count(*) FROM artist FULL OUTER JOIN album ON artist.artist_id =album.artist_id ;





------------------EXCLUSIVE OUTER JOINS-------------------------------------------
---(aka strictlyy outer joins     aka   distinct outer joins)

---exclusive left outer join
/*
 * this is basically a GIANT subtraction problem.
 * leftOuterJoin = left + middleOfVendiagram
 * 
 * leftOuterJoin - innerJoin = exclusiveLeftOuterJoin
 */
SELECT * FROM artist a LEFT OUTER JOIN album b ON a.artist_id  = b.artist_id 
WHERE a.artist_id  NOT IN(
	SELECT c.artist_id FROM artist c INNER JOIN album  d ON c.artist_id =d.artist_id
) ORDER BY name;
--another way to do exclusive left outer join
SELECT * FROM artist a LEFT OUTER JOIN album b ON a.artist_id =b.artist_id 
	WHERE b.artist_id  IS NULL ORDER BY name;


--another way to do exclusive right outer join
SELECT * FROM artist a RIGHT OUTER JOIN album b ON a.artist_id =b.artist_id 
	WHERE a.artist_id  IS NULL;



--another way to do exclusive full outer join
SELECT * FROM artist a FULL OUTER JOIN album b ON a.artist_id =b.artist_id 
	WHERE a.artist_id  IS NULL OR b.artist_id  IS NULL;






-----------SELF JOIN
------SELECT * FROM table01  A   INNER JOIN table01 B   ON A._id=B.foreign_id;

-------CROSS JOIN
--------SELECT * FROM table01 CROSS JOIN table02;



