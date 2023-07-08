
CREATE TABLE classmates (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  age INT NOT NULL,
  address varchar(255) NOT NULL
);


INSERT INTO classmates (name, age, address) VALUES ('Clark', 23, 'Moscow');
INSERT INTO classmates (name, age, address) VALUES ('Dave', 33, 'St.Petersburg');
INSERT INTO classmates (name, age, address) VALUES ('Ava', 18, 'Moscow');
INSERT INTO classmates (name, age, address) VALUES ('Max', 47, 'London');
INSERT INTO classmates (name, age, address) VALUES ('Leo', 28, 'Minsk');
INSERT INTO classmates (name, age, address) VALUES ('Eva', 25, 'Moscow');
INSERT INTO classmates (name, age, address) VALUES ('Peter', 52, 'Samara');
INSERT INTO classmates (name, age, address) VALUES ('May', 30, 'Moscow');


SELECT name FROM classmates WHERE ((address = 'Moscow') AND (age >= 18 AND age <30));
