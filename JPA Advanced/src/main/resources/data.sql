insert into Cource(id , name , created_Date , last_Updated_Date) values (1001 , 'Hibernate' , SYSDATE , SYSDATE);
insert into Cource(id , name, created_Date , last_Updated_Date) values (1002 , 'Spring Core', SYSDATE , SYSDATE);
insert into Cource(id , name, created_Date , last_Updated_Date) values (1003 , 'Spring boot', SYSDATE , SYSDATE);
insert into Cource(id , name, created_Date , last_Updated_Date) values (1004 , 'Spring Remote', SYSDATE , SYSDATE);
insert into Cource(id , name, created_Date , last_Updated_Date) values (1005 , 'Software Engineering', SYSDATE , SYSDATE);
insert into Cource(id , name, created_Date , last_Updated_Date) values (1006 , 'Java Script', SYSDATE , SYSDATE);

insert into passport(id,number)
values(40001,'E123456');
insert into passport(id,number)
values(40002,'N123457');
insert into passport(id,number)
values(40003,'L123890');

insert into student(id,name,passport_id)
values(20001,'Amer',40001);
insert into student(id,name,passport_id)
values(20002,'Salah',40002);
insert into student(id,name,passport_id)
values(20003,'Al',40003);

insert into review(id,rating,description,cource_id)
values(50001,'FIVE', 'Great Course' , 1001);
insert into review(id,rating,description,cource_id)
values(50002,'FOUR', 'Wonderful Course', 1001);
insert into review(id,rating,description,cource_id)
values(50003,'FIVE', 'Awesome Course', 1003);


insert into student_cource(student_id , cource_id) values(20001 , 1001);
insert into student_cource(student_id , cource_id) values(20002 , 1001);
insert into student_cource(student_id , cource_id) values(20003 , 1001);
insert into student_cource(student_id , cource_id) values(20001 , 1003);

