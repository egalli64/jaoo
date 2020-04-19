-- date functions
use me;

-- current date (and time)
select curdate(), now();

-- day of week name, month name for the current locale
select dayname(curdate()), monthname(curdate());

-- format date using the specified format (here: weekday day MMM YYYY) for the current locale
select date_format(curdate(), '%a %e %b %Y');

-- format a string to date using the specified format, but always for en_US
select str_to_date('sun 15 sep 2019', '%a %e %b %Y');

-- add an interval to date
select date_add(curdate(), interval 7 day);

-- subtract an interval to date
select date_sub(curdate(), interval 7 day);

-- extract a component from a date(-time)
select extract(day from curdate()), extract(year from now());

-- distance in days between two dates
select datediff('2020-12-31', now());

-- last day for the current month
select last_day(now());