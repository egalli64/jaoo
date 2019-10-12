-- get employees with a salary less than 8000
-- group them by manager id
-- keep the groups with an average salary above 6000
-- and order the result by the the second column, descending
select manager_id, round(avg(salary))
from employees
where salary < 8000
group by manager_id
having avg(salary) > 6000
order by 2 desc;