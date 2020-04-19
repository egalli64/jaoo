-- alter table
use me;

-- alter table
describe items;
-- add/drop column from table
alter table items add counter decimal(38, 0);
alter table items drop column counter;

-- add check
alter table items add constraint items_status_ck check(status in ('A', 'B', 'X'));
insert into items values(13, 'Y', 'ciao', 13);

describe coders;

select * from coders;
-- add unique
alter table coders add constraint coders_name_uq unique(first_name, last_name);

insert into coders values(1222, 'Bruce', 'Austin', '2007-05-21', 6000.00);

-- add pk
alter table coders add constraint primary key(coder_id);
alter table coders modify coder_id int primary key;

-- drop pk
alter table coders drop primary key;

-- add pk w/ autoincrement
alter table coders modify coder_id int primary key auto_increment;
alter table coders change coder_id coder_id int primary key auto_increment;
