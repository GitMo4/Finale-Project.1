DROP TABLE IF EXISTS PRODUCT;
CREATE TABLE CITY (
    ID int NOT NULL,
    product_name varchar(255) NOT NULL,
    product_description varchar(255),
    product__price double
);

CREATE TABLE ORDER (
    id int NOT NULL,
    order_status varchar(255) NOT NULL,
    order_quantity int
    order_date double
);