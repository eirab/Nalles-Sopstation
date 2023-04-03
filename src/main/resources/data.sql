INSERT INTO TRASHCATEGORY (name) VALUES ('Kompost');
INSERT INTO TRASHCATEGORY (name) VALUES ('Plast');
INSERT INTO TRASHCATEGORY (name) VALUES ('Glas');
INSERT INTO TRASHCATEGORY (name) VALUES ('Metall');
INSERT INTO TRASHCATEGORY (name) VALUES ('Pappersförpackningar');

INSERT INTO TRASH ( name, trash_category_id, image) VALUES ( 'apple', 1, '/trashes/applecore.png');
INSERT INTO TRASH ( name, trash_category_id, image) VALUES ( 'plastic bottle', 2, '/trashes/pastic.png');
INSERT INTO TRASH ( name, trash_category_id, image) VALUES ( 'bread', 1, '/trashes/mouldybread.png');
INSERT INTO TRASH ( name, trash_category_id ,image) VALUES ( 'metal jar', 4, '/trashes/metal-burk2.png');
INSERT INTO TRASH ( name, trash_category_id ,image) VALUES ( 'paper', 5, '/trashes/boxpng.png');
INSERT INTO TRASH ( name, trash_category_id ,image) VALUES ( 'plastic bag', 2, '/trashes/plastic-bag.png');
INSERT INTO TRASH ( name, trash_category_id ,image) VALUES ( 'news paper', 5, '/trashes/news.png');

INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Kompost', 1, '/trashcans/kompostkorg.png');
INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Plast', 2, '/trashcans/trashcan-plast.png');
INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Glas', 3, '/trashcans/trashcan-glas1.png');
INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Metall', 4, '/trashcans/trashcan-metall.png');
INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Papperförpackningar',5, '/trashcans/kartongkorg.png');
