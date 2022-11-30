-- DROP the characters table
DROP TABLE IF EXISTS lightsabers;
DROP TABLE IF EXISTS characters;


-- create the table characters
CREATE TABLE characters ( -- commands written in Caps, my own words in lowercase
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    darkside BOOLEAN,
    age INT NOT NULL
); -- remeber the semi colon to close it of~


CREATE TABLE lightsabers (
    id SERIAL PRIMARY KEY,
    colour VARCHAR(255) NOT NULL,
    hilt_metal VARCHAR(255) NOT NULL,
    character_id INT REFERENCES characters(id) -- characters(id) is the Foreign Key here
);


-- TO RUN THIS: go to terminal and type "psql -d star_wars -f star_wars.sql"


INSERT INTO characters (name, darkside, age) --this is essentially the C of CRUD
VALUES ('Obi-Wan Kenobi', False, 32); --note single quote marks from a String or ARCHAR
INSERT INTO characters (name, darkside, age) --this is essentially the C of CRUD
VALUES ('Anakin', False, 19); --note single quote marks from a String or ARCHAR
INSERT INTO characters (name, darkside, age) --this is essentially the C of CRUD
VALUES ('Darth Maul', True, 332); --note single quote marks from a String or ARCHAR
INSERT INTO lightsabers (colour, hilt_metal, character_id) VALUES ('grey', 'silver', 2);
INSERT INTO lightsabers (colour, hilt_metal, character_id) VALUES ('red', 'copper', 3);
INSERT INTO lightsabers (colour, hilt_metal, character_id) VALUES ('blue', 'paladium', 1);


SELECT * FROM characters;
SELECT * FROM lightsabers;


-- SELECT colour, age, name
-- FROM lightsabers, characters
-- WHERE character_id = 3
-- AND characters.id = lightsabers.character_id

-- same as above but with using an alias
-- SELECT colour AS lightsaber_colour, age, name
-- FROM lightsabers, characters
-- WHERE character_id = 3
-- AND characters.id = lightsabers.character_id



-- some examples of commands we can run either in Postico or in sql:
-- SELECT name, age, id FROM characters

-- ORDER BY age DESC;

-- SELECT COUNT(*) FROM characters;

-- UPDATE characters SET darkside = true WHERE id=2;

-- UPDATE characters SET darkside = true, name = 'Anakin' WHERE id = 2;

-- DELETE FROM characters WHERE id = 3;