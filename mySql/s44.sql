-- join with a subquery
-- how many countries for each region
select region_name, c.country_count
from regions natural join (
    select region_id, count(*) country_count
    from countries
    group by region_id) c;