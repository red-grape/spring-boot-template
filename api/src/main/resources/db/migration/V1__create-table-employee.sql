CREATE TABLE IF not exists common_datas (
  id bigint NOT NULL AUTO_INCREMENT primary key,
  fixId bigint not null,
  tag varchar(20),
  caption varchar(255)
 );