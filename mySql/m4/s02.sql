-- insert
use me;

select * from regions;

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

-- insert relying on column definition on table
insert into regions
values (13, null);
