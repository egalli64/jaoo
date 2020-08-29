use me;

-- self join
select e.last_name as employee, e.first_name, m.last_name as manager
from employees e join employees m
on (e.manager_id = m.employee_id)
order by 1;

-- "classic" self join
select e.last_name as employee, e.first_name, m.last_name as manager
from employees e, employees m
where e.manager_id = m.employee_id
order by 1;
