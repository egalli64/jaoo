-- procedure with parameters

use me;

drop procedure if exists get_coder_salary;

delimiter //

create procedure get_coder_salary(
	in p_coder_id integer,
    out p_salary decimal(8, 2)
) begin
	select salary
	into p_salary
	from coders
	where coder_id = p_coder_id;
end;

// delimiter ;

-- call get_coder_salary(104, @result);
-- select @result;
