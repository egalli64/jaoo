-- run it as root

create user me identified by 'password';
create schema me;
grant all privileges on me.* to me;
grant alter routine on me.* to me;
