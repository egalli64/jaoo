-- multirow subquery to get manager names
select first_name, last_name
from employees
where employee_id in (
    select distinct manager_id
    from employees
    where manager_id is not null)
order by 2;
