-- insert
use me;

select * from regions;

describe regions;

-- plain insert
insert into regions (region_id, region_name)
values (11, 'Antarctica');

-- multiline insert
insert into regions (region_id, region_name) values
	(21, 'Gondor'),
	(22, 'Rohan');

-- nullable column could be skipped
insert into regions (region_id)
values (12);

-- auto-incremented value for pk
insert into regions (region_name)
values ('Oz');

-- insert relying on column definition on table
insert into regions
values (13, null);
