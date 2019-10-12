-- plain insert
insert into regions(region_id, region_name)
values (11, 'Antarctica');

-- nullable column could be skipped
insert into regions(region_id)
values (12);

-- insert relying on column definition on table
insert into regions
values (13, null);
