<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<?php
if (isset($_POST["nom"]) && isset($_POST["prenom"]) ) {
    if($_POST["nom"] != "" && $_POST["prenom"] !=""){
        if(isset($_GET["update"]) && $_GET["update"] != ""){
            $clientSOAP = new SoapClient("http://localhost:8585/EtudiantService?wsdl");
            $parameters = new stdClass();
            $parameters->id = $_GET["update"];
            $parameters->nom = $_POST["nom"];
            $parameters->prenom = $_POST["prenom"];
            $result = $clientSOAP->__soapCall("updateEtudiant", array($parameters));
            $_GET["update"] = "";
            header("Location: index.php");
        }
        else{
            $clientSOAP = new SoapClient("http://localhost:8585/EtudiantService?wsdl");
            $parameters = new stdClass();
            $parameters->prenom = $_POST['prenom'];
            $parameters->nom = $_POST["nom"];
            $result = $clientSOAP->__soapCall("addEtudiant", array($parameters));
            //Change the url to the new page
            header("Location: index.php");
        }
    }
    
}
?>
<div class="container center">
<div class="row">
    <div class="col-md-12">
        <div class="card">
            <div class="card-body">
                <h1 class="card-title text-uppercase mb-0">Ajouter/Modifier un etudiant :</h1>
                <form method="post">
                <div class="form-group">
                    <label for="prenom">Prenom</label>
                    <input type="text" class="form-control mb-2" name="prenom" placeholder="prenom" value="<?php if(isset($_GET['prenom'])) echo $_GET['prenom']?>">
                </div>
                <div class="form-group mb-2">
                    <label for="nom">Nom</label>
                    <input type="text" class="form-control" name="nom" placeholder="nom" value="<?php if(isset($_GET['nom'])) echo $_GET['nom']?>">
                </div>
                <button type="submit" class="btn btn-primary">Enregistrer</button>
                <? echo $result?>
                </form>
            </div>
        </div>
    </div>
</body>
</html>