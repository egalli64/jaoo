-- a) subquery in where:
-- employees having Chen as manager
select first_name, last_name
from employees
where employee_id = (
	select manager_id
	from employees
	where last_name = 'Chen');

-- b) subquery in from:
-- get the top salary from the ones specified in the subquery
select max(e.salary)
from (
	select employee_id, salary
	from employees
	where employee_id between 112 and 115) e;

-- c) subquery in having
-- c.1) average salaries for each department
select avg(salary)
from employees
group by department_id
order by 1 desc;

-- c.2) highest salary among the average salary for each department
select max(tmp.avg_sal) from (
	select avg(salary) avg_sal
	from employees
	group by department_id) tmp;

-- average salaries for each department, excluding the topmost one
select department_id, round(avg(salary))
from employees
group by department_id having avg(salary) < (select max(x.sal) from (
	select avg(salary) sal
	from employees
	group by department_id) x)
order by 2 desc;
