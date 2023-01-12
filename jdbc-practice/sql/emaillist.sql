-- emaillist

-- insert
insert into emaillist values(null, '둘','리','dooly@gmail.com');

-- delete
delete from emaillist where email = 'dooly@gmail.com';
delete from author;
delete from book;
-- list
select no, first_name, last_name, email from emaillist order by no desc;
select no, title,author_no,rent from book order by no desc;
select * from author order by no desc;
select * from book order by no desc;

select * from author order by no desc;
insert into author values(null, '둘리');
insert into book(no,title,author_no) values(null,?,?);