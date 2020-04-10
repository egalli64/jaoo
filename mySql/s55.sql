drop table if exists details;
drop table if exists coders;

select employee_id as coder_id, first_name, last_name, hire_date, salary
from employees
where department_id = 60;

-- create table by select
create table coders
as
    select employee_id as coder_id, first_name, last_name, hire_date, salary
    from employees
    where department_id = 60;

select * from coders;