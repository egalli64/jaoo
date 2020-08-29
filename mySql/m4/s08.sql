-- create table
use me;

create table items (
    item_id integer primary key,
    status char,
    name varchar(20),
    coder_id integer);

select * from items;

insert into items (item_id) values (12);

update items
set status = 'x'
where item_id = 12;

savepoint sp;

delete from items;

rollback to sp;

rollback;

