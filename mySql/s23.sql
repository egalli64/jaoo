-- join on
select region_name, country_name
from regions r join countries c
on(r.region_id = c.region_id)
where r.region_id = 1;

-- join using
select region_name, country_name
from regions join countries
using(region_id)
where region_id = 1;

-- natural join
select region_name, country_name
from regions natural join countries
where region_id = 1;

-- "classic" join
select region_name, country_name
  from regions r, countries c
 where r.region_id = c.region_id
   and r.region_id = 1;
