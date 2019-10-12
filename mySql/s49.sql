-- updating regions
update regions
set region_name = concat('Region ', region_id)
where region_id > 10;