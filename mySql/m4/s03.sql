-- update
use me;

-- updating regions
update regions
set region_name = concat('Region ', region_id)
where region_id > 10;

-- updating an employee
update employees
set first_name = 'Jennifer', last_name = 'Whalen'
where employee_id = 200;
