-- table alias
select r.region_name, c.country_name
from regions r, countries c
where r.region_id = c.region_id;
