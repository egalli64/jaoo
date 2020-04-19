use me;

-- "modern" cartesian product
select region_name, country_name
from regions cross join countries;

-- "classic" cartesian product
select region_name, country_name
from regions, countries;
