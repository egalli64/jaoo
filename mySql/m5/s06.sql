-- a procedure with local variable, select into, if-else

use me;

drop procedure if exists total_salaries_coders;

delimiter //

create procedure total_salaries_coders()
begin
	declare v_total decimal(8, 2);
    
	select sum(salary)
	into v_total
	from coders;
    
	if v_total > 0 then
		select v_total as "total salaries";
	else
		select "no salary information available for coders!" as warning;
	end if;
end;

// delimiter ;

-- call total_salaries_coders();
