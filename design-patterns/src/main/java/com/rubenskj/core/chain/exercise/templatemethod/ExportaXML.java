package com.rubenskj.core.chain.exercise.templatemethod;

import com.rubenskj.core.chain.exercise.Conta;
import com.rubenskj.core.chain.exercise.Exporta;
import com.rubenskj.core.chain.exercise.Formato;

public class ExportaXML extends TemplateExporta {
    protected ExportaXML(Exporta exporta) {
        super(exporta);
    }

    @Override
    protected void exporta(Conta conta) {
        String xml = String.format(
                "<conta><titular>%s</titular><saldo>%.1f</saldo></conta>",
                conta.getTitular(),
                conta.getSaldo()
        );

        System.out.println(xml);
    }

    @Override
    protected Formato getFormato() {
        return Formato.XML;
    }
}
