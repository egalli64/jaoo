use me;

-- non-equi join

-- given an employee ...
select first_name, last_name, salary, job_title, min_salary, max_salary
from employees e join jobs j
using (job_id)
where employee_id = 107;

-- ... list of other jobs with a compatible  min/max salary
select j.job_title, j.min_salary, j.max_salary
from employees e join jobs j
on(e.salary between j.min_salary and j.max_salary and e.job_id != j.job_id)
where e.employee_id = 107;

-- "classic" version
select j.job_title, j.min_salary, j.max_salary
from employees e, jobs j
where e.salary between j.min_salary and j.max_salary
	and e.job_id != j.job_id and e.employee_id = 107;
