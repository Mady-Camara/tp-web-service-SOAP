CREATE DATABASE IF NOT EXISTS mglsi_news;
USE mglsi_news;
DROP TABLE Etudiants;
CREATE TABLE Etudiants(
    id int primary key auto_increment NOT NULL,
    nom VARCHAR(255) NOT NULL,
    prenom VARCHAR(255) NOT NULL,
    CONSTRAINT pk_Etudiants PRIMARY KEY (id)
)

CREATE USER mglsi_user@ IDENTIFIED BY 'passer';M%%