
CREATE TABLE bike (
  id char(36) NOT NULL,
  name varchar(50) NOT NULL,
  description varchar(250),
  price numeric,
  manufacturer varchar(50),
  creation_date TIMESTAMP default now() NOT NULL,
  modification_date TIMESTAMP,
  PRIMARY KEY (id)
);


CREATE TABLE item (
  id char(36) NOT NULL,
  bike_id char(36),
  model varchar(50) NOT NULL,
  type varchar(100) NOT NULL,
  description varchar(250),
  creation_date TIMESTAMP default now() NOT NULL,
  modification_date TIMESTAMP,
  PRIMARY KEY (id),
  FOREIGN KEY (bike_id)
        REFERENCES bike(id)
        ON DELETE cascade
);
