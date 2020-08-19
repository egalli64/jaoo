-- checking exceptions

use me;

drop procedure if exists create_coder;

delimiter //

create procedure create_coder(
	in p_first_name varchar(20),
    in p_last_name varchar(25),
    in p_hire_date date,
    in p_salary decimal(8, 2)
) begin
	declare v_error boolean default false;
    
    begin
		declare exit handler for sqlexception
			set v_error = true;

        insert into coders (first_name, last_name, hire_date, salary)
		values (p_first_name, p_last_name, p_hire_date, p_salary);
	end;

	if v_error then
		select "can't add coder to database" as failure;
	else
		select "new coder added to database" as success;
	end if;
end;

// delimiter ;

-- call create_coder('Tim', 'Ice', curdate(), 2000);

