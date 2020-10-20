package com.rubenskj.core.chain.exercise.templatemethod;


import com.rubenskj.core.chain.exercise.Conta;
import com.rubenskj.core.chain.exercise.Exporta;
import com.rubenskj.core.chain.exercise.RequisicaoExportacao;

public class GeraExportacaoTemplate {

    public void exporta(RequisicaoExportacao exportacao, Conta conta) {
        ExportaBOX exportaBOX = new ExportaBOX(null);
        Exporta porcento = new ExportaPorcento(exportaBOX);
        Exporta csv = new ExportaCSV(porcento);
        Exporta xml = new ExportaXML(csv);

        xml.responde(exportacao, conta);
    }
}
