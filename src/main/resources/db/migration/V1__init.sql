
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



INSERT INTO bike (id, name, description, price, manufacturer) values ('d3dd4029-44f3-4dfb-bcbd-a2d39b46caa9', 'name_1', 'long description', 1500.5,'manufacturer1');
INSERT INTO bike (id, name, description, price, manufacturer) values ('8e39bb81-d2f3-4b08-ae7b-427efa25af79', 'name_3', 'long description', 1500.5,'manufacturer3');
INSERT INTO bike (id, name, description, price, manufacturer) values ('05e52a2a-d1a3-41ef-a5a5-89df86117477', 'name_2', 'long description', 1500.5,'manufacturer2');


INSERT INTO item (id, bike_id, model, type, description) values ('143b6849-1827-4b4d-bd61-15430457af4f', 'd3dd4029-44f3-4dfb-bcbd-a2d39b46caa9', 'model1', 'cuadro', 'description1');
INSERT INTO item (id, bike_id, model, type, description) values ('3486cb15-e822-4105-9bef-927744075508', 'd3dd4029-44f3-4dfb-bcbd-a2d39b46caa9', 'model2', 'manillar', 'description2');
INSERT INTO item (id, bike_id, model, type, description) values ('b0638fc6-d063-42db-9bee-3fff952bee6f', 'd3dd4029-44f3-4dfb-bcbd-a2d39b46caa9', 'model3', 'pedales', 'description3');

INSERT INTO item (id, bike_id, model, type, description) values ('7b6374bb-a6de-4877-b3c9-249f637e6b67', '05e52a2a-d1a3-41ef-a5a5-89df86117477', 'model2', 'sillín', 'description4');
INSERT INTO item (id, bike_id, model, type, description) values ('c96629f9-40a7-4fec-a182-4c7887b52760', '05e52a2a-d1a3-41ef-a5a5-89df86117477', 'model3', 'cuadro', 'description5');


INSERT INTO item (id, bike_id, model, type, description) values ('0de7f1a0-8e2d-4700-a69e-a55079619d34', '8e39bb81-d2f3-4b08-ae7b-427efa25af79', 'model5', 'ruedas', 'description6');
