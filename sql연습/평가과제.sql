select * from book;
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
select * from book;
select book_no, title, price from book b where b.title = b.cart_title order by book_no desc;
insert into book(book_no,title,price) values(null, ?, ?);

-- user
select u.name,u.num,u.email,u.password from user u;
insert into user(name,num,email,password) values(?,?,?,?);

-- category
-- select b.title, c.cate from book b, category c;
select c.title, c.cate from category c;
delete from category;
insert into category(title,cate) values(?,?);

-- cart
select * from cart order by title desc;
insert into cart(title,book_count) values(?,?);
update cart set book_count=?;

-- orders
select order_no, concat(u.name, '/' , u.email) as info ,b.price,  o.receive from orders o, order_book ob, book b, user u where o.order_no = ob.orders_order_no order by order_no desc;




-- order_book


-- book
