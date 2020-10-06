package com.rubenskj.core.chain.exercise.templatemethod;

import com.rubenskj.core.chain.exercise.Conta;
import com.rubenskj.core.chain.exercise.Exporta;
import com.rubenskj.core.chain.exercise.Formato;

public class ExportaPorcento extends TemplateExporta {
    public ExportaPorcento(Exporta exporta) {
        super(exporta);
    }

    @Override
    protected void exporta(Conta conta) {
        String porcento = String.format(
                "%s%s%.1f",
                conta.getTitular(),
                "%",
                conta.getSaldo()
        );

        System.out.println(porcento);
    }

    @Override
    protected Formato getFormato() {
        return Formato.PORCENTO;
    }
}
