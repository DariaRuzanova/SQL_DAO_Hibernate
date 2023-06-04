CREATE TABLE if not EXISTS PERSONS
(
    name varchar(15) not null,
    surname varchar(25) not null,
    age int not null,
    phone_number varchar(20) not null,
    city_of_living varchar(15) not null,
    PRIMARY KEY(name, surname, age)
    );

INSERT INTO PERSONS(name,surname,age,phone_number, city_of_living)
VALUES ('Olga', 'Sidorova', 38, '89603443434','Moscow'),
       ('Ivan', 'Ivanov', 17, '89601111111','Kirov'),
       ('Alexey', 'Petrov', 48, '89112222222','Belgorod'),
       ('Anna', 'Perova', 15, '89455645656','Moscow'),
       ('Pavel', 'Smirnov', 38, '8964554748','Belgorod'),
       ('Alexey', 'Kovrov', 78, '89672362527','Moscow');

