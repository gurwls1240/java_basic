-- DDL 요약
create table
alter table
drop table book
rename
---

테이블 생성
create table book(
	bookno number(5),
	title varchar2(12),
	author varchar2(12),
	pubdate date
);

select * from tab;

drop table book;

select * from book;

insert into book values(1, 'java','kim',sysdate);

rollback

commit

insert into book values(2,null,null,sysdate);
insert into book values(3, 'java','kim',sysdate);
insert into book values(4, 'java','kim',sysdate);

insert into book (bookno,title,author,pubdate)
				values (3,'sql','lee',null);
insert into book (bookno,author,title)
				values (4,'java01','db');
				

delete from book
where title is null;
delete from book
where author = 'kim';

commit

alter table book add(price number(7));

트랜젝션 업무의 단위 잡의 단위
적절한 곳에서 적절한 곳에서 커밋날리고 적절한 곳에서 롤백을 날려야 합니다.


insert into book values (5,default,default,default,default);


		
delete from book
where bookno =5;

update book set price = null;
update book set price =10 , title = 'jsp' where bookno =1;

alter table book modify(price number(7,2));

alter table book drop column price;        

rename book to book2;
rename book2 to book1;

truncate table book1;    -- <- 테이블을 최초 생성된 초기상태로 만듬.  Rollback 불가능. 

drop table book1;

select * from emp;
select * from dept;

create table emp2
as select * from emp;

create table emp3
as select * from emp where deptno = 10;

create table dept2
as select * from dept;


insert into dept2 values (50 , 'MARKETING' , 'SEOUL');
insert into dept2 values (10 , 'MARKETING' , 'SEOUL');

create table book(
	bookno number(5) constraint scott_book_pk primary key,
	title varchar2(12) constraint book_title_unique unique,
	author varchar2(12) constraint book_author_notnull not null,
	price number(5) constraint book_price_check check (price>0),
	pubdate date default sysdate
);

insert into book(bookno , title , author,price,pubdate)
			values(1,'java 1','kim' , 9000,sysdate);

insert into book(bookno , title , author,price,pubdate)
			values(2,'java 2','kim' , 9000,sysdate);
insert into book(bookno , title , author,price,pubdate)
			values(3,'java 3','lee' ,7500 ,sysdate);
insert into book(bookno , title , author,price,pubdate)
			values(3,'java 3','lee' ,7500 ,default);
insert into book(bookno , title ,price,author)
			values(5,'java 5',7000,'qwe');

select constraint_name from user_cons_columns; 
--user_cons_column 시스템에 있는애임
--스캇계정에 있는 제약조건을 알려줌
select constraint_name from user_cons_columns
where table_name = 'BOOK';			
		
drop table book;
--휴지통 비우기
purge recyclebin;
			
drop table book cascade constraint;
			
create table book(
	bookno number(5) primary key,
	title varchar2(12) unique,
	author varchar2(12),
	price number(5) check (price>0),
	pubdate date default sysdate
);


insert into book(bookno , title , author,price,pubdate)
			values(1,'java 1','kim' , 9000,sysdate);
select constraint_name from user_cons_columns
where table_name = 'BOOK';  -- 제약조건 이름 보기
drop table book

create table book(
	bookno number(5) ,
	title varchar2(12) unique,
	author varchar2(12),
	price number(5) check (price>0),
	pubdate date default sysdate
);
--테이블 제약조건 바꾸기
alter table book add constraint scott_book_pk primary key(bookno);




insert into book(bookno , title , author,price,pubdate)
			values(1,'java 1','kim' , 9000,sysdate);

insert into book(bookno , title , author,price,pubdate)
			values(1,'java 2','kim' , 9000,sysdate);
			
			
drop table dept2;

create table dept2
as select * from dept;

drop table emp2;
create table emp2
as select * from emp;

-- dept2 테이블에 pk설정  deptno컬럼에
alter table dept2 add constraint dept2_deptno primary key(deptno);

-- emp2 테이블에 empno 컬럼에 pk설정
alter table emp2 add constraint emp2_empno_pk primary key(empno);

-- emp2 테이블에 mgr 컬럼에 fk 설정
alter table emp2 add constraint emp2_mgr_fk foreign key(mgr) references dept2;
alter table emp2 add foreign key(deptno) references dept2;



select constraint_name from user_cons_columns
where table_name = 'emp2';  -- 제약조건 이름 보기

--제약조건 제거
alter table book drop constraint book_bookno_pk;



select *
from emp,dept,SALGRADE
where emp.deptno = DEPT.deptno and emp.sal between salgrade.losal and SALGRADE.hisal

create or replace view emp_detail
as
select ename,dname,sal,grade
from emp,dept,SALGRADE
where emp.deptno = DEPT.deptno and emp.sal between salgrade.losal and SALGRADE.hisal

select * from emp_detail

-- pk삭제 할떄 외부 fk로 되어 있으면 cascade사용해야함


---
drop table emp3
create table emp3
as select *
from emp
where deptno=10;
select * from emp3
-- 
insert into emp3
select * from emp where deptno =20

update emp set sal = sal*1.1 where deptno = 10;

select * from book;

create sequence bookno;

insert into book(bookno,title,price)
values (bookno.nextval , 'SQL11',7000);

---
create table book(
	bookno number(5) primary key,
	title varchar2(12),
	author varchar2(12),
	price number(5) check (price>0),
	pubdate date default sysdate
);

insert into book(bookno,title,price)
values((select nvl(max(bookno),0)+1 from book) , 'SQL',7000);


select nvl(max(bookno),0)+1 from book;


-----
select * from book  where bookno=3;
select * from book where lower(title)= lower('sql');


set autotrace on;
select * from book where lower(title)= lower('sql');

create index book_title on book(title);
drop index book_title;

commit






select * from book;	
commit
rollback


--------------------------------------------------------------------------------
drop table users;
drop table board;
create table users(
	id number(7),
	password varchar2(12),
	name varchar2(12),
	role varchar2(12)
);

create table board (
	seq number(3),       
     title varchar2(12),
     content varchar2(12),   
     regdate date,
     cnt number(3), 
     userid number(7)
)
      
alter table board add constraint board_pk primary key(seq);
alter table users add constraint users_pk primary key(id);
alter table board add constraint board_fk foreign key(userid) references users;


--회원등록

insert into users(id,password,name,role)
values((select nvl(max(id),0)+1 from users) ,'1234','kim','사원');
insert into users(id,password,name,role)
values((select nvl(max(id),0)+1 from users) ,'1234','lee','대리');
insert into users(id,password,name,role)
values((select nvl(max(id),0)+1 from users) ,'1234','park','과장');
insert into users(id,password,name,role)
values((select nvl(max(id),0)+1 from users) ,'1234','choi','차장');

select * from users;

-- 회원정보수정
update users
set password = '4321'
where id= 1;

--로그인

select rownum
from users
where id = '1' and password = '4321';

--게시판 글 등록
insert into board(seq,title,content,regdate,cnt,userid)
values((select nvl(max(seq),0)+1 from board) ,'제목','내용',sysdate,null,1);
insert into board(seq,title,content,regdate,cnt,userid)
values((select nvl(max(seq),0)+1 from board) ,'제목2','내용2',sysdate,null,2);

--글수정
update board
set title='바뀐제목',
	content='바뀐내용'
where userid= 2;

--게시판 글 삭제
delete 
from board
where title = '제목';

--데이터검색(Query)

select seq,title,content
from board
where content like '%내%';

--전체 등록글 수
select count(*) as 전체_등록글_수 
from board

--사용자별 등록글수 
select userid,count(*) as 전체_등록글_수
from board
group by userid;
--월별개시글수
select to_char(regdate , 'mm') 월,count(*) as 월별_등록글_수
from board
group by to_char(regdate , 'mm');

--사용자별 게시글 검색
select name,title,content
from board,users
where board.userid = users.id
and users.name = 'kim';

--제목으로 게시글 검색
select seq , title , content
from board
where title = '제목';


-----------------------------------------------------------
select * from board
create table users(
	id varchar2(20) primary key,
	password varchar2(20) not null,
	name varchar2(20) not null,
	role varchar2(20) default 'user'
);

create table board (
	 seq     number(5)  primary key,       
     title   varchar2(20) not null,
     content varchar2(800) not null,   
     regdate date default sysdate,
     cnt     number(3) default 0, 
     id      varchar2(20) references users
);
회원등록

insert into users(id,password,name)
values('java01','1234','홍길동');
insert into users(id,password,name)
values('java02','1234','변사또');
insert into users(id,password,name,role)
values('admin','7321','관리자','admin');

select * from users
select * from board
commit
게시판 등록

insert into board (seq,title,content,regdate,cnt,id)
values();

insert into board (seq,title,content,id)
values((select nvl(max(seq),0)+1 from board),'공지','쉽니다','admin');

insert into board (seq,title,content,id)
values((select nvl(max(seq),0)+1 from board),'제목','내용','java01');

--내가 쓴글 보기

select * from board 
where id = 'java01';

select * from board
where seq = 1;

--월별 쓴글 보기

select to_char(regdate , 'mm') as 월 , count(*) 수
from board
group by to_char(regdate , 'mm');

---로그인
select *
from users
where id = '' and password = '';

select rownum
from users
where id = 'java01' and password = '1233';

update book set price =10 , title = 'jsp' where bookno =2;













