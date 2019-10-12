-- simple pattern matching
select last_name
from employees
where last_name like '_ul%';

-- interval check
select *
from regions
where region_id between 2 and 3;

select *
from countries
where country_name between 'a' and 'c';


-- check if (not) in a set
select *
from regions
where region_id not in (2, 3);

-- beware of null
select *
from regions
where region_id not in (2, 3, null);

-- can't compare a 'good' value with null
select *
from regions
where region_id not in (null) or region_id in (null);

-- this works fine
select *
from employees
where commission_pct in (0.10);

-- this does select anything!
select *
from employees
where commission_pct in (null);

-- "is null" is the only way to check it
select *
from employees
where commission_pct is null;
