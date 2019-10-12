-- absolute value
select abs(10), abs(-10);

-- ceiling
select ceil(5.8), ceil(-5.2);

-- floor
select floor(5.8), floor(-5.2);

-- module
select mod(8, 3), mod(8, 4);

-- power
select power(2, 1), power(2, 3);
select pow(2, 1), pow(2, 3);

-- e raised to the power of
select exp(1);

-- square root
select sqrt(25), sqrt(5), sqrt(-2);

-- natural logarithm, or for a given base
select ln(exp(1)), log(exp(1)), log(10, 100);

-- rounding
select round(5.75), round(5.75, 1), round(5.75, -1);

-- truncating
select truncate(5.75, 0), truncate(5.75, 1), truncate(5.75, -1);

-- check negative, zero, positive
select sign(-2.3), sign(0), sign(42);

-- 3.14
select pi();

-- sine(), cosine(), tangent(), ...
select sin(pi()/2), cos(0), tan(pi()/4);