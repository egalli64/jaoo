use me;

-- join on 3 tables

-- all employees w/ city
select e.first_name, e.last_name, l.city
from employees e join departments d using(department_id)
				 join locations l using(location_id);


-- join filtered
select e.employee_id, e.first_name, e.last_name, l.city, d.department_name
from employees e join departments d using(department_id)
				 join locations l using(location_id)
where d.department_name = 'Executive';

-- "classic" 3-way join
select employee_id, city, department_name
from employees e, departments d, locations l
where d.department_id = e.department_id and
	d.location_id = l.location_id and
    DEPARTMENT_NAME = 'Executive';
