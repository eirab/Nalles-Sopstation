    INSERT INTO TRASHCATEGORY(name)
    VALUES
    ('Kompost'),
    ('Plast'),
    ('Pant'),
    ('Metall'),
    ('Pappersförpackningar');

INSERT INTO TRASH (trash_category_id, image) VALUES
(1, '/trashes/kompost/1-apple.png'),
(1, '/trashes/kompost/4-bread.png'),
(1, '/trashes/kompost/9-watermelon.png'),
(1, '/trashes/kompost/bananskal.png'),
(1, '/trashes/kompost/egg.png'),
(1, '/trashes/kompost/fisk.png'),
(1, '/trashes/kompost/paprika.png'),
(1, '/trashes/kompost/17-pear.png'),
(2, '/trashes/plast/7-plasticbag.png'),
(2, '/trashes/plast/8-toothpaste.png'),
(2, '/trashes/plast/15-soapbottle.png'),
(2, '/trashes/plast/18-plasticfork.png'),
(2, '/trashes/plast/chips.png'),
(2, '/trashes/plast/senap.png'),
(2, '/trashes/plast/spray.png'),
(2, '/trashes/plast/toa.png'),
(5, '/trashes/kartong/2-box.png'),
(5, '/trashes/kartong/14-carton.png'),
(5, '/trashes/kartong/16-paperbag.png'),
(5, '/trashes/kartong/milk.png'),
(5, '/trashes/kartong/pommes.png'),
(5, '/trashes/kartong/apelsin.png'),
(4, '/trashes/metall/3-tonfisk.png'),
(4, '/trashes/metall/10-tin.png'),
(4, '/trashes/metall/11-tomatocan.png'),
(4, '/trashes/metall/12-spraycan.png'),
(4, '/trashes/metall/kaviar.png'),
(4, '/trashes/metall/majs.png'),
(3, '/trashes/pant/20-cola.png'),
(3, '/trashes/pant/22-pant.png'),
(3, '/trashes/pant/23-cola.png'),
(3, '/trashes/pant/burk.png');





INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Kompost', 1, '/trashcans/kompost.png');
INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Plast', 2, '/trashcans/plast.png');
INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Pant', 3, '/trashcans/pant.png');
INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Metall', 4, '/trashcans/metall.png');
INSERT INTO TRASHCAN ( name, trash_category_id, image) VALUES ( 'Papperförpackningar',5, '/trashcans/kartong.png');
