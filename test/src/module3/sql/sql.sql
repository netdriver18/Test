CREATE TABLE book (
Id SERIAL PRIMARY KEY,
name varchar(120) not null,
description text,
date_publication date DEFAULT '2018-01-01',
category varchar(30) not null,
isbn varchar(20) UNIQUE not null,
count_page integer not null,
name_author varchar(45) not null,
family_author varchar(45) not null,
email varchar(50) not null,
age_author SMALLINT not null,
birthday_author date not null,
awards_author varchar(120))

//Query:
SELECT * FROM public.book
//////////////////////////
Select date_publication From public.book
//////////////////////////
