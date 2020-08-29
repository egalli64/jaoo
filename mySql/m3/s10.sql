-- aggregate functions
use me;

-- count, count distinct
select count(*), count(manager_id), count(distinct manager_id)
from employees;

-- max, min
select max(salary), min(salary)
from employees;

-- sum
select sum(salary)
from employees
where department_id = 50;

-- average
select avg(salary)
from employees
where department_id = 50;

-- standard deviation, variance
select stddev(salary), variance(salary)
from employees;
