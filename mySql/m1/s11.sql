-- information on tables
use me;

-- tables in the current database
show tables;

-- all tables
select table_name
from information_schema.tables;

-- all tables for a give schema (aka database)
select table_name
from information_schema.tables
where table_schema='me';

-- table information
describe countries;
select * from information_schema.columns c
where c.table_schema='me' and c.table_name = 'countries';

-- user information
select *
from mysql.user;
