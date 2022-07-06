<html>
<head>
    <title>Etudiant</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" />
</head>
<body>
<div class="container center">
<div class="row">
    <div class="col-md-12">
        <div class="card">
            <div class="card-body">
                <h1 class="card-title text-uppercase mb-0">Liste Etudiants</h1>
            </div>
            <div class="table-responsive">
                <table class="table no-wrap user-table mb-0">
                  <thead>
                    <tr>
                      <th scope="col" class="border-0 text-uppercase font-medium pl-4">ID</th>
                      <th scope="col" class="border-0 text-uppercase font-medium">PRENOM</th>
                      <th scope="col" class="border-0 text-uppercase font-medium">NOM</th>
                      <th scope="col" class="border-0 text-uppercase font-medium">ACTION</th>
                    </tr>
                  </thead>
                  <tbody>
                  <?php 
                        $clientSOAP = new SoapClient("http://localhost:8585/EtudiantService?wsdl");
                        $ID = 1;
                        $prenom = "";
                        $nom = "";
                        $etudiants = new stdClass();
                        $etudiants->ID = $ID;
                        $etudiants->nom = $nom;
                        $etudiants->prenom = $prenom;
                        //declare array object
                        $results = $clientSOAP->__soapCall("getAllEtudiant", array($etudiants));
                        foreach ($results->return as $etudiant) { 
                            if(isset($etudiant->ID) && isset($etudiant->nom) && isset($etudiant->prenom)){
                ?>
                    <tr>
                      <td class="pl-4"><?php echo $etudiant->ID ?></td>
                      <td>
                          <h5 class="font-medium mb-0"><?php echo $etudiant->prenom ?></h5>
                      </td>
                      <td>
                          <?php echo $etudiant->nom ?>
                      </td>
                      <td>
                      <a href="index.php?id=<?php echo $etudiant->ID ?>"><button name="trash" type="button" class="btn btn-outline-info btn-circle btn-lg btn-circle ml-2"><i class="fa fa-trash"></i> </button></a>
                        <a href="ajouter.php?update=<?php echo $etudiant->ID ?>&prenom=<?php echo $etudiant->prenom ?>&nom=<?php echo $etudiant->nom ?>"><button type="button" class="btn btn-outline-info btn-circle btn-lg btn-circle ml-2"><i class="fa fa-edit"></i> </button></a>
                      </td>
                    </tr>
                    <?php }} 
                    if(isset($_GET["id"]) && $_GET["id"] != ""){
                        $clientSOAP = new SoapClient("http://localhost:8585/EtudiantService?wsdl");
                        $parameters = new stdClass();
                        $parameters->id = $_GET["id"];
                        $result = $clientSOAP->__soapCall("deleteEtudiant", array($parameters));
                        $_GET["id"] = "";
                        $_GET["id"] = null;
                        header("Location: index.php");
                    }
                    ?>
                  </tbody>
                </table>
                <!-- Bouton ajouter-->
                <a href="ajouter.php"><button type="button" class="btn btn-outline-info btn-circle btn-lg btn-circle ml-2">Ajouter un nouveau etudiant <i class="fa fa-plus"></i> </button></a>
            </div>
        </div>
    </div>
</div>
</div>
</body>

</html>