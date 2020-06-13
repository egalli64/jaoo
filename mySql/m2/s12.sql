use me;

-- left outer join
select first_name, department_name
from employees left outer join departments
using(department_id)
where last_name = 'Grant';

-- rewritten as right outer join
select first_name, department_name
from departments right outer join employees 
using(department_id)
where last_name = 'Grant';
