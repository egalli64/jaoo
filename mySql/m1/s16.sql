-- order by
use me;

-- sorting in natural order
select *
from employees
order by last_name;

-- descending
select first_name, last_name, salary
from employees
order by salary desc;

-- positional notation
select first_name, last_name
from employees
order by last_name;
