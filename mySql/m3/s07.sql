-- regex
use me;

-- LIKE with regular expression
select last_name
from employees
where regexp_like(last_name, '^[ae].*');

select last_name
from employees
where regexp_like(last_name, '.*[nt]$');

select last_name
from employees
where last_name regexp '^[ae].*';

select last_name
from employees
where last_name regexp '.*[nt]$';

select last_name
from employees
where last_name rlike '.*[nt]$';
