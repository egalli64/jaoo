-- loops

drop procedure if exists loop_example;

delimiter //

create procedure loop_example()
begin
	declare v_i integer;
	declare loop_message varchar(20) default "i: ";
	declare while_message varchar(20) default "i: ";
	declare repeat_message varchar(20) default "i: ";
	declare v_c varchar(20);

	-- plain loop
	set v_i = 1;
	my_loop : loop
		set loop_message = concat(loop_message, ' ', v_i);
        set v_i = v_i + 1;
        if v_i > 6 then
			leave my_loop;
		end if;
    end loop my_loop;

	-- loop while
	set v_i = 1;
	while v_i < 7 do
		set while_message = concat(while_message, ' ', v_i);
        set v_i = v_i + 1;
    end while;

	-- loop repeat until
	set v_i = 1;
	repeat
		set repeat_message = concat(repeat_message, ' ', v_i);
        set v_i = v_i + 1;
	until v_i > 6 end repeat;

	select loop_message as 'plain loop', while_message as 'loop while', repeat_message as 'repeat until';
end;

// delimiter ;

call loop_example();
