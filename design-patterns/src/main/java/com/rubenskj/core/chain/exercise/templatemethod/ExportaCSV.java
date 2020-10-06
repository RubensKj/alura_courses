package com.rubenskj.core.chain.exercise.templatemethod;

import com.rubenskj.core.chain.exercise.Conta;
import com.rubenskj.core.chain.exercise.Exporta;
import com.rubenskj.core.chain.exercise.Formato;

public class ExportaCSV extends TemplateExporta {
    protected ExportaCSV(Exporta exporta) {
        super(exporta);
    }

    @Override
    protected void exporta(Conta conta) {
        String csv = String.format(
                "%s;%.1f",
                conta.getTitular(),
                conta.getSaldo()
        );

        System.out.println(csv);
    }

    @Override
    protected Formato getFormato() {
        return Formato.CSV;
    }
}
