CREATE TABLE TRASHCATEGORY (
    id int AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50)
);


CREATE TABLE TRASH(
    id int  AUTO_INCREMENT PRIMARY KEY,
    trash_category_id int REFERENCES TRASHCATEGORY(id),
    image VARCHAR(50)
);

  CREATE TABLE TRASHCAN(
    id int AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    trash_category_id int REFERENCES TRASHCATEGORY(id),
    image VARCHAR(50)

   );

