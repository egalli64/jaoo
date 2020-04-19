-- string function

use me;

-- char and its representation
select ascii('A') as A, convert(char(90) using utf8) as '90';

-- string concatenation
select concat(first_name, ' ', last_name) name from employees;

-- upper and lower case
select upper('upper') up, lower('LOWER') low;

-- find substring
select position('ba' in 'crab' ) as "not found", position('ra' in 'crab' ) as pos;
select locate('ab', 'crab abba rabid cab', 13) as pos;

-- string size (with implicit conversion)
select length('name'), length(42000);