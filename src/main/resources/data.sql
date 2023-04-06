INSERT INTO TRASHCATEGORY (name) VALUES ('Kompost');
INSERT INTO TRASHCATEGORY (name) VALUES ('Plast');
INSERT INTO TRASHCATEGORY (name) VALUES ('Glas');
INSERT INTO TRASHCATEGORY (name) VALUES ('Metall');
INSERT INTO TRASHCATEGORY (name) VALUES ('Pappersförpackningar');

INSERT INTO TRASH (trash_category_id, image) VALUES
(1, '/trashes/1-apple.png'),
(1, 'trashes/4-bread.png'),
(1, 'trashes/9-watermelon.png'),
(1, 'trashes/17-pear.png'),
(2, 'trashes/6-plasticbottle.png'),
(2, 'trashes/7-plasticbag.png'),
(2, 'trashes/8-toothpaste.png'),
(2, 'trashes/15-soapbottle.png'),
(2, 'trashes/18-plasticfork.png'),
(5, 'trashes/2-box.png'),
(5, 'trashes/14-carton.png'),
(5, 'trashes/16-paperbag.png');




INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Kompost', 1, '/trashcans/kompostkorg.png');
INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Plast', 2, '/trashcans/trashcan-plastic.png');
INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Glas', 3, '/trashcans/trashcan-glas.png');
INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Metall', 4, '/trashcans/trashcan-metall.png');
INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Papperförpackningar',5, '/trashcans/trashcan-cartons.png');
