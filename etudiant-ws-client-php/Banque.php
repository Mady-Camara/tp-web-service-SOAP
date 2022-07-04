<?php
$montant = 0;
if (isset($_POST["action"])) {
    $action = $_POST['action'];
    if ($action == "OK") {

        if (isset($_POST['montant'])) {
            $montant = $_POST['montant'];
            $clientSOAP = new SoapClient("http://localhost:8585/BanqueService?wsdl");
            $parameters = new stdClass();
            $parameters->montant = $montant;
            $converted = $clientSOAP->__soapCall("Conversion_EUR_XOF", array($parameters));
        }
    }elseif($action=="Comptes"){
        $clientSOAP = new SoapClient("http://localhost:8585/BanqueService?wsdl");
        $comptes=$clientSOAP->__soapCall("listeComptes",array());
    }
}

?>
<html>

<body>
    <form action="Banque.php" method="post">
        <input type="number" name="montant" id="montant" value="<?= $montant ?>">
        <input type="submit" name="action" id="comptes" value="OK">
        <button type="submit" name="action" value="Comptes">Lister comptes</button>
    </form>
    <?php if (isset($converted)) { ?>
        <?= $montant ?> EUR = <?= $converted->return ?> XOF
    <?php } ?>
    <?php if (isset($comptes)) { ?>
        <table border="1">
            <tr>
                <th>CODE</th>
                <th>Solde</th>
            </tr>
            <?php
            foreach ($comptes->return as $cp) {
            ?>
                <tr>
                    <td><?php echo ($cp->code) ?></td>
                    <td><?php echo ($cp->solde) ?></td>
                </tr>
            <?php } ?>
        </table>
    <?php } ?>
</body>

</html>