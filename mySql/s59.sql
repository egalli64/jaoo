-- index on a column
create index coders_last_name_ix on coders(last_name);

-- index on more columns
create index coders_name_ix on coders(first_name, last_name);

-- get rid of indices
drop index coders_last_name_ix on coders;
drop index coders_name_ix on coders;
