-- average salary for each department
select department_id, truncate(avg(salary), 0) as 'avg salary'
from employees
group by department_id
order by 1;