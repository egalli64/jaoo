-- trigger

use me;

drop function if exists before_update_salary;

delimiter //

create trigger before_update_salary
	before update on coders
    for each row
begin
	set new.salary = round(new.salary, -1);
end;

// delimiter ;

update coders
set salary = salary + 3;

select * from coders;
