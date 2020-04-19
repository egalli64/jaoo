-- string function /2
use me;

-- left and right padding
select lpad('tom', 30, '.') tom, rpad('tim', 30, '_- -_') tim;

-- left, right, both trim
select ltrim(' Hi!') "left", concat('[', rtrim('Hi! '), ']') "right", concat('[', trim('  Hi! '), ']') "both";

-- left, right, both trim
select trim(leading 'xy' from 'xy!xy') "left", trim(trailing 'xy' from 'xy!xy') "right", trim(both 'xy' from 'xy!xy') "both";

-- rightmost chars
select right('discardedXYZ', 3);

select hire_date, right(hire_date, 5)
from employees;

-- replace, substr
select replace('Begin here', 'Begin', 'End'), substr('ABCDEFG', 3, 4);