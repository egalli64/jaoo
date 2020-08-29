-- delete
use me;

-- check the current status
select * from regions;

-- create a test row
insert into regions (region_id, region_name) values (42, 'Z');

-- delete a single row
delete from regions
where region_id = 42;

-- multiline delete - be careful with it!
delete from regions
where region_id > 10;
