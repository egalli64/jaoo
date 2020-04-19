use me;

insert into regions(region_id, region_name) values (11, 'Antarctica');
savepoint sp;

insert into regions(region_id, region_name) values (12, 'Oceania');

rollback to sp; -- keep Antarctica, rollback Oceania

commit; -- persist Antarctica

select *
from regions;