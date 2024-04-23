
use levitica;
create table testers
(id int,
name varchar(60),
gmail varchar(60));
select * from testers;
insert into testers
values 
(1,"naveen","naveen123@gmail.com"),
(2,"srujan","srujan03@gmail.com"),
(3,"saikiran","saikiran04@gmail.com"),
(4,"hanuman","hanuman01@gmail.com"),
(5,"jaisreeram","jaisreeram@gmail.com"),
(6,"shiva","shiva@gmail.com"),
(7,"saibaba","saibaba@gmail.com");
use levitica;
use levitica5;
create table ipl
(id int,
name varchar(40),
gmail varchar(40));
select* from ipl;
insert into ipl
values
(1,"csk","dhoni@gmail.com"),
(2,"rcb","virat@gmail.com");
select* from ipl;
insert into ipl
values
(3,"rr","samson@gmail.com");
insert into ipl
values
(4,"mi","hardik@gmail.com"),
(5,"srh","cummins@gmail.com"),
(6,"dc","pant@gmail.com"),
(7,"lsg","rahul@gmail.com"),
(8,"gt","gill@gmail.com"),
(9,"kkr","shreyas@gmail.com"),
(10,"pbks","shikar@gmail.com");
select* from ipl;
use levitica5;
select* from ipl;
use levitica;
set sql_safe_updates=0;
update testers
set name = "SAI"
where name = "saibaba";
select * from testers;
update testers
set gmail = "sai@gmail.com"
where gmail = "saibaba@gmail.com";
select * from testers;
update testers
set name = "jai hanuman"
where name = "hanuman";
update testers
set gmail = "jai hanuman@gmail.com"
where gmail = "hanuman01@gmail.com";
select * from testers;
alter table testers
add column address varchar(60);
select * from testers;
update testers
set address = "Shiridi"
where id = 7;
select * from testers;























