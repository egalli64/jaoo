-- life of a Stored Procedure

use me;

drop procedure if exists hello;

delimiter //

create procedure hello()
begin
	select "Hello!" as greetings;
end;

// delimiter ;

call hello();
