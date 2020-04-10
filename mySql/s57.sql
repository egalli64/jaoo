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
--	name varchar(20) not null,
--	name varchar(20) unique,

    coder_id integer,

--    constraint details_coder_fk foreign key(coder_id) references coders(coder_id),
--    constraint details_coder_fk foreign key(coder_id) references coders(coder_id) on delete cascade,
    constraint details_coder_fk foreign key(coder_id) references coders(coder_id) on delete set null,
        
    constraint details_name_status_uq unique(name, status)
);

insert into details(detail_id, coder_id) values(11, 106);

select * from details;

select * from coders;

-- auto-commit assumed off!
delete from coders where coder_id = 106;

rollback;
