-- table alias
use me;

select r.region_name as "Region Name", c.country_name as country
from regions r, countries c
where r.region_id = c.region_id;
