BEGIN BATCH

INSERT INTO citizix.dog (id, breed, color)
VALUES(2, 'Blue Tick', 'Grey');

INSERT INTO citizix.dog (id, breed, color)
VALUES(3, 'Labrador', 'Black');

INSERT INTO citizix.dog (id, breed, color)
VALUES(4, 'Gr Shepard', 'Brown');

DELETE color FROM citizix.dog WHERE id = 2;

UPDATE citizix.dog SET breed='Pero' WHERE id = 2;

APPLY BATCH;
