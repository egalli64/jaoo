-- inner join
use me;

-- name of a region and name of countries for that region
select region_name
from regions
where region_id = 1;

select country_name
from countries
where region_id = 1;

-- ...
select region_name
from regions
where region_id = 4;

select country_name
from countries
where region_id = 4;

-- join the two tables and see the full result in a single shot
select region_name, country_name
from regions, countries
where regions.region_id = countries.region_id
order by 1, 2;
