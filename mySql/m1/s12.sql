-- null
use me;

-- check null
select first_name, last_name
from employees
where commission_pct is null;

-- null in operations
select first_name, last_name, 12 * salary * commission_pct
from employees;

-- what if null
select employee_id, last_name, 12 * salary * ifnull(commission_pct, 0)
from employees
-- where employee_id > 140 and employee_id < 150;
where employee_id between 141 and 149;
