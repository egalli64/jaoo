-- join-on, more flexible
select region_name, country_name
from regions join countries
on(regions.region_id = countries.region_id);
