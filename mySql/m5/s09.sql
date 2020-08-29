-- function

use me;

drop function if exists get_salary;

delimiter //

/*
 * Only superusers could say if function creators could be trusted!
 * 
 * 		SET GLOBAL log_bin_trust_function_creators = 1;
 * 
 * or specify that the function is
 * 
 * 		deterministic 
 */
create function get_salary(
	p_coder_id integer
) returns decimal(8, 2)
begin
	declare v_result decimal(8, 2);

	select salary
	into v_result
	from coders
	where coder_id = p_coder_id;
    
	return v_result;
end;

// delimiter ;

select get_salary(104) as salary;
