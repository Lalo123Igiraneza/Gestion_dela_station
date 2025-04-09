DROP TABLE IF EXISTS client ;
 CREATE TABLE client (id-client_client INT(11) AUTO_INCREMENT NOT NULL,
  nom-cl_client VARCHAR(45), prenom-cl_client VARCHAR(45), 
  id-station_client INT(11),
   PRIMARY KEY (id-client_client)) ENGINE=InnoDB; 


    DROP TABLE IF EXISTS transaction ;
     CREATE TABLE transaction (id-trans_transaction INT(11) AUTO_INCREMENT NOT NULL, 
     date-trans_transaction VARCHAR(45),
      montant_transaction VARCHAR(45),
      id-client_transaction INT(11),
       id-pompe_transaction INT(11), 
      id-produit_transaction INT(11),
       pompe_id-pompe_pompe INT(11),
       facture_id-facture_facture INT(11),
        produit_id-produit_produit INT(11),
         id-client_client **NOT FOUND**(11),
     PRIMARY KEY (id-trans_transaction)) ENGINE=InnoDB;

 DROP TABLE IF EXISTS station ;
  CREATE TABLE station (id-station_station INT(11) AUTO_INCREMENT NOT NULL,
   nom-station_station VARCHAR(45),
    adresse-station_station VARCHAR(45),
  PRIMARY KEY (id-station_station)) ENGINE=InnoDB;

   DROP TABLE IF EXISTS pompe ;
    CREATE TABLE pompe (id-pompe_pompe INT(11) AUTO_INCREMENT NOT NULL,
     type_pompe VARCHAR(45), id-produit_pompe INT(11), 
     id-station_pompe INT(11), id-station_station **NOT FOUND**(11),
      transaction_id-trans_transaction INT(11),
    PRIMARY KEY (id-pompe_pompe)) ENGINE=InnoDB;

     DROP TABLE IF EXISTS produit ;
      CREATE TABLE produit (id-produit_produit INT(11) AUTO_INCREMENT NOT NULL, 
      nom-produit_produit VARCHAR(45),
       type-produit_produit VARCHAR(45), 
       transaction_id-trans_transaction INT(11), 
     PRIMARY KEY (id-produit_produit)) ENGINE=InnoDB;


      DROP TABLE IF EXISTS facture ;
       CREATE TABLE facture (id-facture_facture INT(11) AUTO_INCREMENT NOT NULL, 
       montant_facture VARCHAR(45),
        date-emission_facture VARCHAR(45),
         id-transaction_facture VARCHAR(45),
       transaction_id-trans_transaction INT(11),
       PRIMARY KEY (id-facture_facture)) ENGINE=InnoDB;


        DROP TABLE IF EXISTS associer ;
         CREATE TABLE associer (id-client_client **NOT FOUND**(11) AUTO_INCREMENT NOT NULL, 
        id-station_station **NOT FOUND**(11) NOT NULL, PRIMARY KEY (id-client_client,  id-station_station)) ENGINE=InnoDB; 
        

         
         ALTER TABLE transaction ADD CONSTRAINT FK_transaction_pompe_id-pompe_pompe FOREIGN KEY (pompe_id-pompe_pompe) REFERENCES pompe (id-pompe_pompe);
         ALTER TABLE transaction ADD CONSTRAINT FK_transaction_facture_id-facture_facture FOREIGN KEY (facture_id-facture_facture) REFERENCES facture (id-facture_facture); 
         ALTER TABLE transaction ADD CONSTRAINT FK_transaction_produit_id-produit_produit FOREIGN KEY (produit_id-produit_produit) REFERENCES produit (id-produit_produit); 
         ALTER TABLE transaction ADD CONSTRAINT FK_transaction_id-client_client FOREIGN KEY (id-client_client) REFERENCES client (id-client_client);
         ALTER TABLE pompe ADD CONSTRAINT FK_pompe_id-station_station FOREIGN KEY (id-station_station) REFERENCES station (id-station_station); 
         ALTER TABLE pompe ADD CONSTRAINT FK_pompe_transaction_id-trans_transaction FOREIGN KEY (transaction_id-trans_transaction) REFERENCES transaction (id-trans_transaction);
         ALTER TABLE produit ADD CONSTRAINT FK_produit_transaction_id-trans_transaction FOREIGN KEY (transaction_id-trans_transaction) REFERENCES transaction (id-trans_transaction); 
         ALTER TABLE facture ADD CONSTRAINT FK_facture_transaction_id-trans_transaction FOREIGN KEY (transaction_id-trans_transaction) REFERENCES transaction (id-trans_transaction); 
         ALTER TABLE associer ADD CONSTRAINT FK_associer_id-client_client FOREIGN KEY (id-client_client) REFERENCES client (id-client_client); 
         ALTER TABLE associer ADD CONSTRAINT FK_associer_id-station_station FOREIGN KEY (id-station_station) REFERENCES station (id-station_station); 