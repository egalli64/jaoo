-- logical operators
use me;

-- both conditions should hold
select *
from employees
where salary < 3000 and employee_id > 195;

-- one or the other is ok
select *
from employees
where salary > 20000 or last_name = 'King';

-- the other way round
select *
from employees
where not department_id > 20;
