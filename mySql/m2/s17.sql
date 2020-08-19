-- UNION example

	select first_name, last_name, 'coder' as role
	from coders
	where first_name like 'Tim%'
union
	select first_name, last_name, 'employee'
	from employees
	where first_name like 'Tim%'
order by last_name;