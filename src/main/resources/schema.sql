CREATE TABLE TRASH-CATEGORY(
    id int PRIMARY KEY,
    name VARCHAR(50)

);


CREATE TABLE TRASH(
    id int PRIMARY KEY,
    name VARCHAR(50),
    trash-category references trash-category(id)

);

CREATE TABLE TRASH-CAN(
    id int PRIMARY KEY,
    name VARCHAR(50),
    trash-category references trash-category(id)
);