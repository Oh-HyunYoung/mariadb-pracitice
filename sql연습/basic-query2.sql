select version(), current_date, now() from dual;

-- 수학함수, 사칙 연산도 된다.
select sin(pi()/4), 1 + 2 * 3 - 4 / 5 from dual;

-- 대소문자 구분 안한다.
select VERSION(), current_DAte, now() from dual;

-- table 생성: DML
create table pet (
	name varchar(100),
	owner varchar(20),
	species varchar(20),
	gender char(1),
	birth date,
	death date
);

-- schema 확인
describe pet;
desc pet;

-- table 삭제
drop table pet;
show tables;

select * from pet;

-- insert : DML(c)
insert into pet values('성탄이','hyun','dog','N',"2023-03-03",null);

-- delete : DML(D)
delete from pet where name='이름';

-- update: DML(U)
update pet set name='이름' where name = '성탄이';

-- select : DML(R)
select * from pet;

-- load data
load data local infile 'd:\pet.txt' into table pet;

-- select
select name, species from pet where name = 'bowser';
