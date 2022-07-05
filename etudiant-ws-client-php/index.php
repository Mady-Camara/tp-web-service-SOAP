<?php

    $clientSOAP = new SoapClient("http://localhost:8681/EtudiantService?wsdl");
    $prenom = "";
    $nom = "";
    //declare array object
    $results = $clientSOAP->__soapCall("getAllEtudiant", array());
    var_dump($results);
    echo "<table border='1'>";
    echo "<tr>";
    echo "<th>Prenom</th>";
    echo "<th>Nom</th>";
    echo "</tr>";
    foreach ($results as $etudiant) {
        echo "<tr>";
        echo "<td>".$etudiant->prenom."</td>";
        echo "<td>".$etudiant->nom."</td>";
        echo "</tr>";
    }
?>
<html>

<body>
    <form action="Banque.php" method="post">
        <input type="number" name="montant" id="montant" value="<?= $montant ?>">
        <input type="submit" name="action" id="comptes" value="OK">
        <button type="submit" name="action" value="Comptes">Lister comptes</button>
    </form>
    
</body>

</html>