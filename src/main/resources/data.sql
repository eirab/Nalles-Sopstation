INSERT INTO TRASHCATEGORY (name) VALUES ('Kompost');
INSERT INTO TRASHCATEGORY (name) VALUES ('Plast');
INSERT INTO TRASHCATEGORY (name) VALUES ('Glas');
INSERT INTO TRASHCATEGORY (name) VALUES ('Metall');
INSERT INTO TRASHCATEGORY (name) VALUES ('Pappersförpackningar');

INSERT INTO TRASH ( name, trash_category_id, image) VALUES ( 'apple', 1, '/applecore.png');
INSERT INTO TRASH ( name, trash_category_id, image) VALUES ( 'plastic bottle', 2, '/pastic.png');
INSERT INTO TRASH ( name, trash_category_id, image) VALUES ( 'bread', 1, '/mouldybread.png');
INSERT INTO TRASH ( name, trash_category_id ,image) VALUES ( 'metal jar', 4, '/metal-burk2.png');
INSERT INTO TRASH ( name, trash_category_id ,image) VALUES ( 'paper', 5, '/boxpng.png');

INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Kompost', 1, '/kompostkorg.png');
INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Plast', 2, '/plasttunna.png');
INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Glas', 3, '/trashcan-metall.png');
INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Metall', 4, '/trashcan-metall.png');
INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Papperförpackningar',5, '/kartongkorg.png');
