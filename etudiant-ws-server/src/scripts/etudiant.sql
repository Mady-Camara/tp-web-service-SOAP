CREATE DATABASE IF NOT EXISTS mglsi_news;
USE mglsi_news;
DROP TABLE Etudiants;
CREATE TABLE Etudiants(
    id int  auto_increment NOT NULL,
    nom VARCHAR(255) NOT NULL,
    prenom VARCHAR(255) NOT NULL,
    CONSTRAINT pk_Etudiants PRIMARY KEY (id)
);

CREATE USER 'etudiant'@'%' IDENTIFIED BY 'etudiant';
GRANT ALL PRIVILEGES on mglsi_news.Etudiants to'etudiant'@'%';