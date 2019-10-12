-- sorting in natural order
select *
from employees
order by last_name;

-- ascending, descending
select *
from employees
order by last_name desc, first_name asc;

-- positional notation
select first_name, last_name
from employees
order by 2;
