--! qt:dataset:src
set hive.fetch.task.conversion=more;

DESCRIBE FUNCTION to_unix_timestamp;
DESCRIBE FUNCTION EXTENDED to_unix_timestamp;

create table oneline_n0(key int, value string);
load data local inpath '../../data/files/things.txt' into table oneline_n0;

SELECT
  '2009-03-20 11:30:01',
  to_unix_timestamp('2009-03-20 11:30:01')
FROM oneline_n0;

SELECT
  '2009-03-20',
  to_unix_timestamp('2009-03-20', 'yyyy-MM-dd')
FROM oneline_n0;

SELECT
  '2009 Mar 20 11:30:01 am',
  to_unix_timestamp('2009 Mar 20 11:30:01 am', 'yyyy MMM dd h:mm:ss a')
FROM oneline_n0;

SELECT
  'random_string',
  to_unix_timestamp('random_string')
FROM oneline_n0;

-- PPD
explain select * from (select * from src) a where to_unix_timestamp(a.key) > 10;
explain select * from (select * from src) a where to_unix_timestamp(a.key) > 10;
