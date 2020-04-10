
drop procedure if exists variable_example;

delimiter //

create procedure variable_example()
begin
	declare v_a varchar(20);
	declare v_b integer default 42;

	set v_a = "hello";

	select concat(v_a, ": ", v_b) as greetings;
end;

// delimiter ;

call variable_example();
