-- trigger

use me;

drop trigger if exists before_update_salary;

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
-- set salary = salary + 7;

select * from coders;
