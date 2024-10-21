CREATE TABLE users
(
    id        BIGINT AUTO_INCREMENT PRIMARY KEY,
    name      VARCHAR(255) NOT NULL,
    stock     BIGINT NUll,
    user_role VARCHAR(255) NOT NULL
);


insert into users(name, stock, user_role)
values ('jame', 10, 'GOLD');
insert into users(name, stock, user_role)
values ('jame', 10, 'BRONZE');

