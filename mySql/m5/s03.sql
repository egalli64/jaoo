-- variables

use me;

drop procedure if exists variable_example;
drop procedure if exists min_max_example;

delimiter //

create procedure variable_example()
begin
	declare v_a varchar(20);
	declare v_b integer default 42;
    declare v_c decimal(8, 2);

	set v_a = "hello";

    select salary
    into v_c
    from employees
    where employee_id = 103;

	select concat(v_a, ", ", v_b, ", ", v_c) as result;
end;

create procedure min_max_example()
begin
    declare v_min decimal(8, 2);
    declare v_max decimal(8, 2);

    select min(salary), max(salary)
    into v_min, v_max
    from employees;

	select concat(v_min, " -> ", v_max) as "Salary range";
end;

// delimiter ;

-- call variable_example();

-- call min_max_example();