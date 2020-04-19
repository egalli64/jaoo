-- comparison operators /1
use me;

-- that one
select *
from regions
where region_id = 1;

-- the other ones
select *
from regions
where region_id != 2;

-- strictly less than
select *
from regions
where region_id < 3;

-- less or equal to
select *
from regions
where region_id <= 3;
