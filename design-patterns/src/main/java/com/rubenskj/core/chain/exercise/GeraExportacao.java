package com.rubenskj.core.chain.exercise;

public class GeraExportacao {

    public void exporta(RequisicaoExportacao exportacao, Conta conta) {
        Exporta porcento = new ExportaPorcento();
        Exporta csv = new ExportaCSV(porcento);
        Exporta xml = new ExportaXML(csv);

        xml.responde(exportacao, conta);
    }
}
