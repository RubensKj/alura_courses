package com.rubenskj.core.chain.exercise;

public class GeraExportacao {

    public void exporta(RequisicaoExportacao exportacao, Conta conta) {
        Exporta xml = new ExportaXML();
        Exporta csv = new ExportaCSV();
        Exporta porcento = new ExportaPorcento();

        xml.setProxima(csv);
        csv.setProxima(porcento);

        xml.responde(exportacao, conta);
    }
}
