CREATE TABLE Person (
    id int NOT NULL,
    name varchar(255) NOT NULL,
    location varchar(255),
    birth_date timestamp ,
    PRIMARY KEY (id)
);

insert into Person values (1000 , 'Amer' , 'Minya' , sysDate());
insert into Person values (1001 , 'Ahmed' , 'Minya' , sysDate());
insert into Person values (1002 , 'Mahmoud' , 'Minya' , sysDate());
insert into Person values (1003 , 'Wahsh' , 'Minya' , sysDate());