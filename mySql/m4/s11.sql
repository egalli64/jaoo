-- create table w/ constraints
use me;

drop table if exists details;

create table details (
--    detail_id integer primary key
--        constraint detail_id_ck check (mod(detail_id, 2) = 1),
    detail_id integer primary key auto_increment,
    status char default 'A'
        constraint detail_status_ck check (status in ('A', 'B', 'X')),
--	status enum('A', 'B', 'X') default 'A',
--	name varchar(20),
--	name varchar(20) not null,
	name varchar(20) unique,

    coder_id integer,

--    constraint details_coder_fk foreign key(coder_id) references coders(coder_id),
--    constraint details_coder_fk foreign key(coder_id) references coders(coder_id) on delete cascade,
    constraint details_coder_fk foreign key(coder_id) references coders(coder_id) on delete set null,
        
    constraint details_name_status_uq unique(name, status)
);

select * from coders where coder_id = 412;

insert into coders values(412, 'Bill', 'Mates', curdate(), 1950);

insert into details(coder_id) values(412);
select * from details;

commit;

delete from coders where coder_id = 412;

rollback;
