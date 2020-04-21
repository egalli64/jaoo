-- run it as root

drop user if exists me;
drop schema if exists me;

create user me identified by 'password';
create schema me;
grant all privileges on me.* to me;
grant alter routine on me.* to me;
