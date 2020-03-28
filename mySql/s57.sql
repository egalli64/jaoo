drop table if exists details;

-- create table with constraints
create table details (
    detail_id integer primary key
        constraint detail_id_ck check (mod(detail_id, 2) = 1),
--    detail_id integer primary key auto_increment,
    status char default 'A'
        constraint detail_status_ck check (status in ('A', 'B', 'X')),
--	status enum('A', 'B', 'X') default 'A',
    name varchar(20),
--   name varchar(20) not null,
--	 name varchar(20) unique,

    coder_id integer,

--    foreign key(coder_id) references coders(coder_id),
--    foreign key(coder_id) references coders(coder_id) on delete cascade,
    foreign key(coder_id) references coders(coder_id) on delete set null,
        
    constraint detail_name_status_uq unique(name, status)
);

insert into details(detail_id, coder_id) values(11, 107);

select * from details;

select * from coders;

-- auto-commit assumed off!
delete from coders where coder_id = 107;

rollback;