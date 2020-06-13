-- group by
use me;

-- average salary for each department
select department_id, truncate(avg(salary), 0) as 'avg salary'
from employees
group by department_id
order by 1;

select department_id, truncate(avg(salary), 0) as 'avg salary'
from employees
where department_id is not null
group by department_id
order by 2 desc;
