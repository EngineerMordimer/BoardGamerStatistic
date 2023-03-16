create table t_user
(
    id serial PRIMARY KEY,
    bg_username varchar (50) unique not null
);

insert into t_user (bg_username) values ('engineer_mordimer');