-- begin CUSTOMCOMPONENTS_PRODUCT
create table CUSTOMCOMPONENTS_PRODUCT (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer not null,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    MIN_DISCOUNT double precision,
    MAX_DISCOUNT double precision,
    IN_STOCK integer,
    BUYER_RATING integer,
    --
    primary key (ID)
)^
-- end CUSTOMCOMPONENTS_PRODUCT
