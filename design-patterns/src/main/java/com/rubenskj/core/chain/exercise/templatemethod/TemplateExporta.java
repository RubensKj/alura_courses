package com.rubenskj.core.chain.exercise.templatemethod;

import com.rubenskj.core.chain.exercise.Conta;
import com.rubenskj.core.chain.exercise.Exporta;
import com.rubenskj.core.chain.exercise.Formato;
import com.rubenskj.core.chain.exercise.RequisicaoExportacao;

public abstract class TemplateExporta implements Exporta {

    private Exporta exporta;

    protected TemplateExporta(Exporta exporta) {
        this.exporta = exporta;
    }

    @Override
    public void responde(RequisicaoExportacao requisicaoExportacao, Conta conta) {
        Formato formato = requisicaoExportacao.getFormato();

        if (formato.equals(getFormato())) {
            exporta(conta);
            return;
        }

        if (exporta != null) {
            exporta.responde(requisicaoExportacao, conta);
        }
    }

    protected abstract void exporta(Conta conta);

    protected abstract Formato getFormato();
}
