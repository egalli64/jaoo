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

    coder_id integer references coders(coder_id),
--    coder_id integer references coders(coder_id) on delete cascade,
--    coder_id integer references coders(coder_id) on delete set null,
        
    constraint detail_name_status_uq unique(name, status)
);

-- when in doubt, do not run the next line
drop table details;

insert into details values();

select * from details;