-- UNION example

-- two queries on two different tables...
select first_name, last_name, 'coder' as role
from coders
where first_name like 'Tim%';

select first_name, last_name, 'employee'
from employees
where first_name like 'Tim%';


-- ... could give a combined result set
	select first_name, last_name, 'coder' as role
	from coders
	where first_name like 'Tim%'
union
	select first_name, last_name, 'employee'
	from employees
	where first_name like 'Tim%'
order by last_name;

