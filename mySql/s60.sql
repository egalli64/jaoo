-- create view
create or replace view odd_coders_view as
select * from coders
where mod(coder_id, 2) = 1;

-- get rid of a view
drop view odd_coders_view;
