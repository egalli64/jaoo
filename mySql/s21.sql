-- join is inner by default
select region_name, country_name
from regions join countries
using(region_id)
order by 1, 2;

-- natural join
select region_name, country_name
from regions natural join countries
order by 1, 2;