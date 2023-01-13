select * from book;
desc category;
desc cart;
desc user;
desc book;
desc orders;
desc order_book;
insert into book(book_no,title,price) values(null, ?, ?);

set foreign_key_checks=0; -- 외래키를 무시하게 처리
set foreign_key_checks=1; -- 외래키 제약조건이 작동하도록 처리

show full columns from book ;

-- book

drop table cart;
drop table category;
drop table order_book;
drop table orders;
drop table user;
truncate table orders;

desc user;


-- book
select * from book;
select no, title, price from book b order by no desc;
insert into book(no, title, price) values(null, ?, ?);
select no, title, price, category_no from book;

-- user
select no,name,num,email,password,orders_no from user;
select no,name,num,email,password,orders_no from user;
insert into user(no,name,num,email,password,orders_no) values(null,?,?,?,?,?);

-- category
-- select b.title, c.cate from book b, category c;
select * from category;
select c.title, c.cate from category c;
delete from category;
insert into category(title,cate) values(?,?);

-- cart
select no,title,book_count,book_no,user_no from cart;
select title,book_count,price from cart order by title desc;
insert into cart(title,book_count) values(?,?);
update cart set book_count=?;

-- orders
select order_no, concat(u.name, '/' , u.email) as info ,b.price,  o.receive from orders o, order_book ob, book b, user u where o.order_no = ob.orders_order_no order by order_no desc;
select o.no, o.receive, o.user_no, ob.no, ob.title, ob.book_count, ob.book_no, ob.orders_no from order_book ob, orders o where o.no = ob.no;
select no, receive, user_no,price from orders

select * from cart;
select * from book;
select * from user;
select * from orders;
select * from category;

-- order_book


-- book
