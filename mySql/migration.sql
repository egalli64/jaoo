-- source this script from mySQL

use me;

-- utility procedure for dropping a foreign key - if it exists
drop procedure if exists drop_fk_if_exists;

DELIMITER //

create procedure drop_fk_if_exists(my_table varchar(64), my_fk varchar(64))
begin
	if exists(
		select enforced
        from information_schema.table_constraints
		where table_schema = schema() and table_name = my_table and constraint_name = my_fk and constraint_type = 'FOREIGN KEY')
	then
		set @query = concat('ALTER TABLE ', my_table, ' DROP FOREIGN KEY ', my_fk, ';');
 		prepare stmt from @query;
		execute stmt;
		deallocate prepare stmt;
 	end if;
end;
    
// DELIMITER ;

-- main tables cleanup
drop table if exists job_history;
call drop_fk_if_exists('departments', 'departments_manager_fk');
drop table if exists employees;
drop table if exists departments;
drop table if exists locations;
drop table if exists countries;
drop table if exists regions;
drop table if exists jobs;

create table regions(
	region_id integer primary key auto_increment,
	region_name varchar(25)
);

insert into regions (region_id, region_name) values ('1','Europe');
insert into regions (region_id, region_name) values ('2','Americas');
insert into regions (region_id, region_name) values ('3','Asia');
insert into regions (region_id, region_name) values ('4','Middle East and Africa');

create table countries(
	country_id char(2) primary key,
	country_name varchar(40),
	region_id integer,

    constraint countries_region_fk foreign key(region_id) references regions(region_id)
);

insert into countries (country_id,country_name,region_id) values ('AR','Argentina','2');
insert into countries (country_id,country_name,region_id) values ('AU','Australia','3');
insert into countries (country_id,country_name,region_id) values ('BE','Belgium','1');
insert into countries (country_id,country_name,region_id) values ('BR','Brazil','2');
insert into countries (country_id,country_name,region_id) values ('CA','Canada','2');
insert into countries (country_id,country_name,region_id) values ('CH','Switzerland','1');
insert into countries (country_id,country_name,region_id) values ('CN','China','3');
insert into countries (country_id,country_name,region_id) values ('DE','Germany','1');
insert into countries (country_id,country_name,region_id) values ('DK','Denmark','1');
insert into countries (country_id,country_name,region_id) values ('EG','Egypt','4');
insert into countries (country_id,country_name,region_id) values ('FR','France','1');
insert into countries (country_id,country_name,region_id) values ('IL','Israel','4');
insert into countries (country_id,country_name,region_id) values ('IN','India','3');
insert into countries (country_id,country_name,region_id) values ('IT','Italy','1');
insert into countries (country_id,country_name,region_id) values ('JP','Japan','3');
insert into countries (country_id,country_name,region_id) values ('KW','Kuwait','4');
insert into countries (country_id,country_name,region_id) values ('ML','Malaysia','3');
insert into countries (country_id,country_name,region_id) values ('MX','Mexico','2');
insert into countries (country_id,country_name,region_id) values ('NG','Nigeria','4');
insert into countries (country_id,country_name,region_id) values ('NL','Netherlands','1');
insert into countries (country_id,country_name,region_id) values ('SG','Singapore','3');
insert into countries (country_id,country_name,region_id) values ('UK','United Kingdom','1');
insert into countries (country_id,country_name,region_id) values ('US','United States of America','2');
insert into countries (country_id,country_name,region_id) values ('ZM','Zambia','4');
insert into countries (country_id,country_name,region_id) values ('ZW','Zimbabwe','4');

create table jobs(
	job_id varchar(10) primary key,
	job_title varchar(35) not null,
	min_salary decimal(6,0),
	max_salary decimal(6,0)
);

insert into jobs (job_id,job_title,min_salary,max_salary) values ('AD_PRES','President','20080','40000');
insert into jobs (job_id,job_title,min_salary,max_salary) values ('AD_VP','Administration Vice President','15000','30000');
insert into jobs (job_id,job_title,min_salary,max_salary) values ('AD_ASST','Administration Assistant','3000','6000');
insert into jobs (job_id,job_title,min_salary,max_salary) values ('FI_MGR','Finance Manager','8200','16000');
insert into jobs (job_id,job_title,min_salary,max_salary) values ('FI_ACCOUNT','Accountant','4200','9000');
insert into jobs (job_id,job_title,min_salary,max_salary) values ('AC_MGR','Accounting Manager','8200','16000');
insert into jobs (job_id,job_title,min_salary,max_salary) values ('AC_ACCOUNT','Public Accountant','4200','9000');
insert into jobs (job_id,job_title,min_salary,max_salary) values ('SA_MAN','Sales Manager','10000','20080');
insert into jobs (job_id,job_title,min_salary,max_salary) values ('SA_REP','Sales Representative','6000','12008');
insert into jobs (job_id,job_title,min_salary,max_salary) values ('PU_MAN','Purchasing Manager','8000','15000');
insert into jobs (job_id,job_title,min_salary,max_salary) values ('PU_CLERK','Purchasing Clerk','2500','5500');
insert into jobs (job_id,job_title,min_salary,max_salary) values ('ST_MAN','Stock Manager','5500','8500');
insert into jobs (job_id,job_title,min_salary,max_salary) values ('ST_CLERK','Stock Clerk','2008','5000');
insert into jobs (job_id,job_title,min_salary,max_salary) values ('SH_CLERK','Shipping Clerk','2500','5500');
insert into jobs (job_id,job_title,min_salary,max_salary) values ('IT_PROG','Programmer','4000','10000');
insert into jobs (job_id,job_title,min_salary,max_salary) values ('MK_MAN','Marketing Manager','9000','15000');
insert into jobs (job_id,job_title,min_salary,max_salary) values ('MK_REP','Marketing Representative','4000','9000');
insert into jobs (job_id,job_title,min_salary,max_salary) values ('HR_REP','Human Resources Representative','4000','9000');
insert into jobs (job_id,job_title,min_salary,max_salary) values ('PR_REP','Public Relations Representative','4500','10500');

create table locations(
	location_id integer primary key,
	street_address varchar(40),
	postal_code varchar(12),
	city varchar(30) not null,
	state_province varchar(25),
	country_id char(2),

    constraint locations_country_fk foreign key(country_id) references countries(country_id)
);

insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('1000','1297 Via Cola di Rienzo','00989','Roma',null,'IT');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('1100','93091 Calle della Testa','10934','Venice',null,'IT');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('1200','2017 Shinjuku-ku','1689','Tokyo','Tokyo Prefecture','JP');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('1300','9450 Kamiya-cho','6823','Hiroshima',null,'JP');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('1400','2014 Jabberwocky Rd','26192','Southlake','Texas','US');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('1500','2011 Interiors Blvd','99236','South San Francisco','California','US');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('1600','2007 Zagora St','50090','South Brunswick','New Jersey','US');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('1700','2004 Charade Rd','98199','Seattle','Washington','US');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('1800','147 Spadina Ave','M5V 2L7','Toronto','Ontario','CA');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('1900','6092 Boxwood St','YSW 9T2','Whitehorse','Yukon','CA');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('2000','40-5-12 Laogianggen','190518','Beijing',null,'CN');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('2100','1298 Vileparle (E)','490231','Bombay','Maharashtra','IN');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('2200','12-98 Victoria Street','2901','Sydney','New South Wales','AU');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('2300','198 Clementi North','540198','Singapore',null,'SG');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('2400','8204 Arthur St',null,'London',null,'UK');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('2500','Magdalen Centre, The Oxford Science Park','OX9 9ZB','Oxford','Oxford','UK');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('2600','9702 Chester Road','09629850293','Stretford','Manchester','UK');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('2700','Schwanthalerstr. 7031','80925','Munich','Bavaria','DE');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('2800','Rua Frei Caneca 1360 ','01307-002','Sao Paulo','Sao Paulo','BR');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('2900','20 Rue des Corps-Saints','1730','Geneva','Geneve','CH');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('3000','Murtenstrasse 921','3095','Bern','BE','CH');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('3100','Pieter Breughelstraat 837','3029SK','Utrecht','Utrecht','NL');
insert into locations (location_id,street_address,postal_code,city,state_province,country_id) values ('3200','Mariano Escobedo 9991','11932','Mexico City','Distrito Federal,','MX');

create table departments(
	department_id integer primary key,
	department_name varchar(30) not null,
	manager_id integer,
	location_id integer,

    constraint departments_location_fk foreign key(location_id) references locations(location_id)
);

insert into departments (department_id,department_name,manager_id,location_id) values ('10','Administration','200','1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('20','Marketing','201','1800');
insert into departments (department_id,department_name,manager_id,location_id) values ('30','Purchasing','114','1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('40','Human Resources','203','2400');
insert into departments (department_id,department_name,manager_id,location_id) values ('50','Shipping','121','1500');
insert into departments (department_id,department_name,manager_id,location_id) values ('60','IT','103','1400');
insert into departments (department_id,department_name,manager_id,location_id) values ('70','Public Relations','204','2700');
insert into departments (department_id,department_name,manager_id,location_id) values ('80','Sales','145','2500');
insert into departments (department_id,department_name,manager_id,location_id) values ('90','Executive','100','1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('100','Finance','108','1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('110','Accounting','205','1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('120','Treasury',null,'1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('130','Corporate Tax',null,'1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('140','Control And Credit',null,'1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('150','Shareholder Services',null,'1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('160','Benefits',null,'1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('170','Manufacturing',null,'1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('180','Construction',null,'1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('190','Contracting',null,'1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('200','Operations',null,'1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('210','IT Support',null,'1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('220','NOC',null,'1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('230','IT Helpdesk',null,'1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('240','Government Sales',null,'1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('250','Retail Sales',null,'1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('260','Recruiting',null,'1700');
insert into departments (department_id,department_name,manager_id,location_id) values ('270','Payroll',null,'1700');

create table employees(
	employee_id integer primary key auto_increment,
	first_name varchar(20),
	last_name varchar(25) not null,
	email varchar(25) unique not null,
	phone_number varchar(20),
	hire_date date not null,
	job_id varchar(10) not null,
	salary decimal(8,2),
	commission_pct decimal(2,2),
	manager_id integer,
	department_id integer,

	constraint emp_salary_min check (salary > 0),
    constraint employees_job_fk foreign key(job_id) references jobs(job_id),
    constraint employees_department_fk foreign key(department_id) references departments(department_id)
);

insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('198','Donald','OConnell','DOCONNEL','650.507.9833', str_to_date('21-JUN-07','%d-%b-%y'),'SH_CLERK','2600',null,'124','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('199','Douglas','Grant','DGRANT','650.507.9844', str_to_date('13-JAN-08','%d-%b-%y'),'SH_CLERK','2600',null,'124','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('200','Jennifer','Whalen','JWHALEN','515.123.4444', str_to_date('17-SEP-03','%d-%b-%y'),'AD_ASST','4400',null,'101','10');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('201','Michael','Hartstein','MHARTSTE','515.123.5555', str_to_date('17-FEB-04','%d-%b-%y'),'MK_MAN','13000',null,'100','20');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('202','Pat','Fay','PFAY','603.123.6666', str_to_date('17-AUG-05','%d-%b-%y'),'MK_REP','6000',null,'201','20');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('203','Susan','Mavris','SMAVRIS','515.123.7777', str_to_date('07-JUN-02','%d-%b-%y'),'HR_REP','6500',null,'101','40');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('204','Hermann','Baer','HBAER','515.123.8888', str_to_date('07-JUN-02','%d-%b-%y'),'PR_REP','10000',null,'101','70');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('205','Shelley','Higgins','SHIGGINS','515.123.8080', str_to_date('07-JUN-02','%d-%b-%y'),'AC_MGR','12008',null,'101','110');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('206','William','Gietz','WGIETZ','515.123.8181', str_to_date('07-JUN-02','%d-%b-%y'),'AC_ACCOUNT','8300',null,'205','110');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('100','Steven','King','SKING','515.123.4567', str_to_date('17-JUN-03','%d-%b-%y'),'AD_PRES','24000',null,null,'90');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('101','Neena','Kochhar','NKOCHHAR','515.123.4568', str_to_date('21-SEP-05','%d-%b-%y'),'AD_VP','17000',null,'100','90');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('102','Lex','De Haan','LDEHAAN','515.123.4569', str_to_date('13-JAN-01','%d-%b-%y'),'AD_VP','17000',null,'100','90');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('103','Alexander','Hunold','AHUNOLD','590.423.4567', str_to_date('03-JAN-06','%d-%b-%y'),'IT_PROG','9000',null,'102','60');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('104','Bruce','Ernst','BERNST','590.423.4568', str_to_date('21-MAY-07','%d-%b-%y'),'IT_PROG','6000',null,'103','60');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('105','David','Austin','DAUSTIN','590.423.4569', str_to_date('25-JUN-05','%d-%b-%y'),'IT_PROG','4800',null,'103','60');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('106','Valli','Pataballa','VPATABAL','590.423.4560', str_to_date('05-FEB-06','%d-%b-%y'),'IT_PROG','4800',null,'103','60');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('107','Diana','Lorentz','DLORENTZ','590.423.5567', str_to_date('07-FEB-07','%d-%b-%y'),'IT_PROG','4200',null,'103','60');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('108','Nancy','Greenberg','NGREENBE','515.124.4569', str_to_date('17-AUG-02','%d-%b-%y'),'FI_MGR','12008',null,'101','100');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('109','Daniel','Faviet','DFAVIET','515.124.4169', str_to_date('16-AUG-02','%d-%b-%y'),'FI_ACCOUNT','9000',null,'108','100');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('110','John','Chen','JCHEN','515.124.4269', str_to_date('28-SEP-05','%d-%b-%y'),'FI_ACCOUNT','8200',null,'108','100');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('111','Ismael','Sciarra','ISCIARRA','515.124.4369', str_to_date('30-SEP-05','%d-%b-%y'),'FI_ACCOUNT','7700',null,'108','100');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('112','Jose Manuel','Urman','JMURMAN','515.124.4469', str_to_date('07-MAR-06','%d-%b-%y'),'FI_ACCOUNT','7800',null,'108','100');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('113','Luis','Popp','LPOPP','515.124.4567', str_to_date('07-DEC-07','%d-%b-%y'),'FI_ACCOUNT','6900',null,'108','100');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('114','Den','Raphaely','DRAPHEAL','515.127.4561', str_to_date('07-DEC-02','%d-%b-%y'),'PU_MAN','11000',null,'100','30');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('115','Alexander','Khoo','AKHOO','515.127.4562', str_to_date('18-MAY-03','%d-%b-%y'),'PU_CLERK','3100',null,'114','30');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('116','Shelli','Baida','SBAIDA','515.127.4563', str_to_date('24-DEC-05','%d-%b-%y'),'PU_CLERK','2900',null,'114','30');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('117','Sigal','Tobias','STOBIAS','515.127.4564', str_to_date('24-JUL-05','%d-%b-%y'),'PU_CLERK','2800',null,'114','30');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('118','Guy','Himuro','GHIMURO','515.127.4565', str_to_date('15-NOV-06','%d-%b-%y'),'PU_CLERK','2600',null,'114','30');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('119','Karen','Colmenares','KCOLMENA','515.127.4566', str_to_date('10-AUG-07','%d-%b-%y'),'PU_CLERK','2500',null,'114','30');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('120','Matthew','Weiss','MWEISS','650.123.1234', str_to_date('18-JUL-04','%d-%b-%y'),'ST_MAN','8000',null,'100','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('121','Adam','Fripp','AFRIPP','650.123.2234', str_to_date('10-APR-05','%d-%b-%y'),'ST_MAN','8200',null,'100','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('122','Payam','Kaufling','PKAUFLIN','650.123.3234', str_to_date('01-MAY-03','%d-%b-%y'),'ST_MAN','7900',null,'100','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('123','Shanta','Vollman','SVOLLMAN','650.123.4234', str_to_date('10-OCT-05','%d-%b-%y'),'ST_MAN','6500',null,'100','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('124','Kevin','Mourgos','KMOURGOS','650.123.5234', str_to_date('16-NOV-07','%d-%b-%y'),'ST_MAN','5800',null,'100','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('125','Julia','Nayer','JNAYER','650.124.1214', str_to_date('16-JUL-05','%d-%b-%y'),'ST_CLERK','3200',null,'120','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('126','Irene','Mikkilineni','IMIKKILI','650.124.1224', str_to_date('28-SEP-06','%d-%b-%y'),'ST_CLERK','2700',null,'120','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('127','James','Landry','JLANDRY','650.124.1334', str_to_date('14-JAN-07','%d-%b-%y'),'ST_CLERK','2400',null,'120','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('128','Steven','Markle','SMARKLE','650.124.1434', str_to_date('08-MAR-08','%d-%b-%y'),'ST_CLERK','2200',null,'120','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('129','Laura','Bissot','LBISSOT','650.124.5234', str_to_date('20-AUG-05','%d-%b-%y'),'ST_CLERK','3300',null,'121','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('130','Mozhe','Atkinson','MATKINSO','650.124.6234', str_to_date('30-OCT-05','%d-%b-%y'),'ST_CLERK','2800',null,'121','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('131','James','Marlow','JAMRLOW','650.124.7234', str_to_date('16-FEB-05','%d-%b-%y'),'ST_CLERK','2500',null,'121','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('132','TJ','Olson','TJOLSON','650.124.8234', str_to_date('10-APR-07','%d-%b-%y'),'ST_CLERK','2100',null,'121','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('133','Jason','Mallin','JMALLIN','650.127.1934', str_to_date('14-JUN-04','%d-%b-%y'),'ST_CLERK','3300',null,'122','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('134','Michael','Rogers','MROGERS','650.127.1834', str_to_date('26-AUG-06','%d-%b-%y'),'ST_CLERK','2900',null,'122','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('135','Ki','Gee','KGEE','650.127.1734', str_to_date('12-DEC-07','%d-%b-%y'),'ST_CLERK','2400',null,'122','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('136','Hazel','Philtanker','HPHILTAN','650.127.1634', str_to_date('06-FEB-08','%d-%b-%y'),'ST_CLERK','2200',null,'122','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('137','Renske','Ladwig','RLADWIG','650.121.1234', str_to_date('14-JUL-03','%d-%b-%y'),'ST_CLERK','3600',null,'123','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('138','Stephen','Stiles','SSTILES','650.121.2034', str_to_date('26-OCT-05','%d-%b-%y'),'ST_CLERK','3200',null,'123','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('139','John','Seo','JSEO','650.121.2019', str_to_date('12-FEB-06','%d-%b-%y'),'ST_CLERK','2700',null,'123','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('140','Joshua','Patel','JPATEL','650.121.1834', str_to_date('06-APR-06','%d-%b-%y'),'ST_CLERK','2500',null,'123','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('141','Trenna','Rajs','TRAJS','650.121.8009', str_to_date('17-OCT-03','%d-%b-%y'),'ST_CLERK','3500',null,'124','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('142','Curtis','Davies','CDAVIES','650.121.2994', str_to_date('29-JAN-05','%d-%b-%y'),'ST_CLERK','3100',null,'124','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('143','Randall','Matos','RMATOS','650.121.2874', str_to_date('15-MAR-06','%d-%b-%y'),'ST_CLERK','2600',null,'124','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('144','Peter','Vargas','PVARGAS','650.121.2004', str_to_date('09-JUL-06','%d-%b-%y'),'ST_CLERK','2500',null,'124','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('145','John','Russell','JRUSSEL','011.44.1344.429268', str_to_date('01-OCT-04','%d-%b-%y'),'SA_MAN','14000','0.4','100','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('146','Karen','Partners','KPARTNER','011.44.1344.467268', str_to_date('05-JAN-05','%d-%b-%y'),'SA_MAN','13500','0.3','100','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('147','Alberto','Errazuriz','AERRAZUR','011.44.1344.429278', str_to_date('10-MAR-05','%d-%b-%y'),'SA_MAN','12000','0.3','100','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('148','Gerald','Cambrault','GCAMBRAU','011.44.1344.619268', str_to_date('15-OCT-07','%d-%b-%y'),'SA_MAN','11000','0.3','100','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('149','Eleni','Zlotkey','EZLOTKEY','011.44.1344.429018', str_to_date('29-JAN-08','%d-%b-%y'),'SA_MAN','10500','0.2','100','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('150','Peter','Tucker','PTUCKER','011.44.1344.129268', str_to_date('30-JAN-05','%d-%b-%y'),'SA_REP','10000','0.3','145','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('151','David','Bernstein','DBERNSTE','011.44.1344.345268', str_to_date('24-MAR-05','%d-%b-%y'),'SA_REP','9500','0.25','145','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('152','Peter','Hall','PHALL','011.44.1344.478968', str_to_date('20-AUG-05','%d-%b-%y'),'SA_REP','9000','0.25','145','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('153','Christopher','Olsen','COLSEN','011.44.1344.498718', str_to_date('30-MAR-06','%d-%b-%y'),'SA_REP','8000','0.2','145','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('154','Nanette','Cambrault','NCAMBRAU','011.44.1344.987668', str_to_date('09-DEC-06','%d-%b-%y'),'SA_REP','7500','0.2','145','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('155','Oliver','Tuvault','OTUVAULT','011.44.1344.486508', str_to_date('23-NOV-07','%d-%b-%y'),'SA_REP','7000','0.15','145','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('156','Janette','King','JKING','011.44.1345.429268', str_to_date('30-JAN-04','%d-%b-%y'),'SA_REP','10000','0.35','146','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('157','Patrick','Sully','PSULLY','011.44.1345.929268', str_to_date('04-MAR-04','%d-%b-%y'),'SA_REP','9500','0.35','146','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('158','Allan','McEwen','AMCEWEN','011.44.1345.829268', str_to_date('01-AUG-04','%d-%b-%y'),'SA_REP','9000','0.35','146','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('159','Lindsey','Smith','LSMITH','011.44.1345.729268', str_to_date('10-MAR-05','%d-%b-%y'),'SA_REP','8000','0.3','146','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('160','Louise','Doran','LDORAN','011.44.1345.629268', str_to_date('15-DEC-05','%d-%b-%y'),'SA_REP','7500','0.3','146','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('161','Sarath','Sewall','SSEWALL','011.44.1345.529268', str_to_date('03-NOV-06','%d-%b-%y'),'SA_REP','7000','0.25','146','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('162','Clara','Vishney','CVISHNEY','011.44.1346.129268', str_to_date('11-NOV-05','%d-%b-%y'),'SA_REP','10500','0.25','147','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('163','Danielle','Greene','DGREENE','011.44.1346.229268', str_to_date('19-MAR-07','%d-%b-%y'),'SA_REP','9500','0.15','147','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('164','Mattea','Marvins','MMARVINS','011.44.1346.329268', str_to_date('24-JAN-08','%d-%b-%y'),'SA_REP','7200','0.1','147','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('165','David','Lee','DLEE','011.44.1346.529268', str_to_date('23-FEB-08','%d-%b-%y'),'SA_REP','6800','0.1','147','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('166','Sundar','Ande','SANDE','011.44.1346.629268', str_to_date('24-MAR-08','%d-%b-%y'),'SA_REP','6400','0.1','147','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('167','Amit','Banda','ABANDA','011.44.1346.729268', str_to_date('21-APR-08','%d-%b-%y'),'SA_REP','6200','0.1','147','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('168','Lisa','Ozer','LOZER','011.44.1343.929268', str_to_date('11-MAR-05','%d-%b-%y'),'SA_REP','11500','0.25','148','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('169','Harrison','Bloom','HBLOOM','011.44.1343.829268', str_to_date('23-MAR-06','%d-%b-%y'),'SA_REP','10000','0.2','148','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('170','Tayler','Fox','TFOX','011.44.1343.729268', str_to_date('24-JAN-06','%d-%b-%y'),'SA_REP','9600','0.2','148','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('171','William','Smith','WSMITH','011.44.1343.629268', str_to_date('23-FEB-07','%d-%b-%y'),'SA_REP','7400','0.15','148','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('172','Elizabeth','Bates','EBATES','011.44.1343.529268', str_to_date('24-MAR-07','%d-%b-%y'),'SA_REP','7300','0.15','148','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('173','Sundita','Kumar','SKUMAR','011.44.1343.329268', str_to_date('21-APR-08','%d-%b-%y'),'SA_REP','6100','0.1','148','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('174','Ellen','Abel','EABEL','011.44.1644.429267', str_to_date('11-MAY-04','%d-%b-%y'),'SA_REP','11000','0.3','149','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('175','Alyssa','Hutton','AHUTTON','011.44.1644.429266', str_to_date('19-MAR-05','%d-%b-%y'),'SA_REP','8800','0.25','149','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('176','Jonathon','Taylor','JTAYLOR','011.44.1644.429265', str_to_date('24-MAR-06','%d-%b-%y'),'SA_REP','8600','0.2','149','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('177','Jack','Livingston','JLIVINGS','011.44.1644.429264', str_to_date('23-APR-06','%d-%b-%y'),'SA_REP','8400','0.2','149','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('178','Kimberely','Grant','KGRANT','011.44.1644.429263', str_to_date('24-MAY-07','%d-%b-%y'),'SA_REP','7000','0.15','149',null);
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('179','Charles','Johnson','CJOHNSON','011.44.1644.429262', str_to_date('04-JAN-08','%d-%b-%y'),'SA_REP','6200','0.1','149','80');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('180','Winston','Taylor','WTAYLOR','650.507.9876', str_to_date('24-JAN-06','%d-%b-%y'),'SH_CLERK','3200',null,'120','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('181','Jean','Fleaur','JFLEAUR','650.507.9877', str_to_date('23-FEB-06','%d-%b-%y'),'SH_CLERK','3100',null,'120','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('182','Martha','Sullivan','MSULLIVA','650.507.9878', str_to_date('21-JUN-07','%d-%b-%y'),'SH_CLERK','2500',null,'120','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('183','Girard','Geoni','GGEONI','650.507.9879', str_to_date('03-FEB-08','%d-%b-%y'),'SH_CLERK','2800',null,'120','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('184','Nandita','Sarchand','NSARCHAN','650.509.1876', str_to_date('27-JAN-04','%d-%b-%y'),'SH_CLERK','4200',null,'121','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('185','Alexis','Bull','ABULL','650.509.2876', str_to_date('20-FEB-05','%d-%b-%y'),'SH_CLERK','4100',null,'121','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('186','Julia','Dellinger','JDELLING','650.509.3876', str_to_date('24-JUN-06','%d-%b-%y'),'SH_CLERK','3400',null,'121','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('187','Anthony','Cabrio','ACABRIO','650.509.4876', str_to_date('07-FEB-07','%d-%b-%y'),'SH_CLERK','3000',null,'121','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('188','Kelly','Chung','KCHUNG','650.505.1876', str_to_date('14-JUN-05','%d-%b-%y'),'SH_CLERK','3800',null,'122','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('189','Jennifer','Dilly','JDILLY','650.505.2876', str_to_date('13-AUG-05','%d-%b-%y'),'SH_CLERK','3600',null,'122','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('190','Timothy','Gates','TGATES','650.505.3876', str_to_date('11-JUL-06','%d-%b-%y'),'SH_CLERK','2900',null,'122','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('191','Randall','Perkins','RPERKINS','650.505.4876', str_to_date('19-DEC-07','%d-%b-%y'),'SH_CLERK','2500',null,'122','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('192','Sarah','Bell','SBELL','650.501.1876', str_to_date('04-FEB-04','%d-%b-%y'),'SH_CLERK','4000',null,'123','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('193','Britney','Everett','BEVERETT','650.501.2876', str_to_date('03-MAR-05','%d-%b-%y'),'SH_CLERK','3900',null,'123','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('194','Samuel','McCain','SMCCAIN','650.501.3876', str_to_date('01-JUL-06','%d-%b-%y'),'SH_CLERK','3200',null,'123','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('195','Vance','Jones','VJONES','650.501.4876', str_to_date('17-MAR-07','%d-%b-%y'),'SH_CLERK','2800',null,'123','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('196','Alana','Walsh','AWALSH','650.507.9811', str_to_date('24-APR-06','%d-%b-%y'),'SH_CLERK','3100',null,'124','50');
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values ('197','Kevin','Feeney','KFEENEY','650.507.9822', str_to_date('23-MAY-06','%d-%b-%y'),'SH_CLERK','3000',null,'124','50');

alter table departments add constraint departments_manager_fk foreign key(manager_id) references employees(employee_id);
alter table employees add constraint employees_manager_fk foreign key(manager_id) references employees(employee_id);

create table job_history(
	employee_id integer not null,
	start_date date not null,
	end_date date not null,
	job_id varchar(10) not null,
	department_id integer,

	constraint jhistory_pk primary key(employee_id, start_date),
	constraint jhistory_date_interval check (end_date > start_date),
    constraint jhistory_employee_fk foreign key(employee_id) references employees(employee_id),
    constraint jhistory_job_fk foreign key(job_id) references jobs(job_id),
    constraint jhistory_department_fk foreign key(department_id) references departments(department_id)
);

insert into job_history (employee_id,start_date,end_date,job_id,department_id) values ('102',str_to_date('13-JAN-01','%d-%b-%y'),str_to_date('24-JUL-06','%d-%b-%y'),'IT_PROG','60');
insert into job_history (employee_id,start_date,end_date,job_id,department_id) values ('101',str_to_date('21-SEP-97','%d-%b-%y'),str_to_date('27-OCT-01','%d-%b-%y'),'AC_ACCOUNT','110');
insert into job_history (employee_id,start_date,end_date,job_id,department_id) values ('101',str_to_date('28-OCT-01','%d-%b-%y'),str_to_date('15-MAR-05','%d-%b-%y'),'AC_MGR','110');
insert into job_history (employee_id,start_date,end_date,job_id,department_id) values ('201',str_to_date('17-FEB-04','%d-%b-%y'),str_to_date('19-DEC-07','%d-%b-%y'),'MK_REP','20');
insert into job_history (employee_id,start_date,end_date,job_id,department_id) values ('114',str_to_date('24-MAR-06','%d-%b-%y'),str_to_date('31-DEC-07','%d-%b-%y'),'ST_CLERK','50');
insert into job_history (employee_id,start_date,end_date,job_id,department_id) values ('122',str_to_date('01-JAN-07','%d-%b-%y'),str_to_date('31-DEC-07','%d-%b-%y'),'ST_CLERK','50');
insert into job_history (employee_id,start_date,end_date,job_id,department_id) values ('200',str_to_date('17-SEP-95','%d-%b-%y'),str_to_date('17-JUN-01','%d-%b-%y'),'AD_ASST','90');
insert into job_history (employee_id,start_date,end_date,job_id,department_id) values ('176',str_to_date('24-MAR-06','%d-%b-%y'),str_to_date('31-DEC-06','%d-%b-%y'),'SA_REP','80');
insert into job_history (employee_id,start_date,end_date,job_id,department_id) values ('176',str_to_date('01-JAN-07','%d-%b-%y'),str_to_date('31-DEC-07','%d-%b-%y'),'SA_MAN','80');
insert into job_history (employee_id,start_date,end_date,job_id,department_id) values ('200',str_to_date('01-JUL-02','%d-%b-%y'),str_to_date('31-DEC-06','%d-%b-%y'),'AC_ACCOUNT','90');

-- extra playground
drop table if exists team_coder;
drop table if exists teams;
drop table if exists coders;

create table coders
as
    select employee_id as coder_id, first_name, last_name, hire_date, salary
    from employees
    where department_id = 60;

alter table coders modify coder_id int primary key auto_increment;
alter table coders add constraint coders_name_uq unique(first_name, last_name);

insert into coders(first_name, last_name, hire_date, salary)
values('Tim', 'Ice', curdate(), 5760);

-- a procedure on coders

drop procedure if exists get_coder_salary;

DELIMITER //

CREATE PROCEDURE get_coder_salary(
	in p_coder_id integer,
    out p_salary decimal(8, 2)
)
begin
	select salary
	into p_salary
	from coders
	where coder_id = p_coder_id;
end;

// DELIMITER ;

create table teams(
	team_id integer primary key auto_increment,
	name varchar(25),
    leader_id integer unique,

    constraint teams_leader_fk foreign key(leader_id) references coders(coder_id)
);

insert into teams(name, leader_id) values('red', 103);
insert into teams(name, leader_id) values('blue', 107);
insert into teams(name, leader_id) values('green', 105);

create table team_coder(
	team_id integer,
    coder_id integer,

	constraint team_coder_pk primary key(team_id, coder_id),
    constraint team_coder_fk foreign key(team_id) references teams(team_id),
    constraint coder_team_fk foreign key(coder_id) references coders(coder_id)
);

insert into team_coder values(1, 104);
insert into team_coder values(1, 106);
insert into team_coder values(1, 108);
insert into team_coder values(2, 105);
insert into team_coder values(2, 106);
insert into team_coder values(2, 107);
insert into team_coder values(3, 105);
insert into team_coder values(3, 106);
insert into team_coder values(3, 103);

commit;