package com.rubenskj.core.chain.exercise.templatemethod;

import com.rubenskj.core.chain.exercise.Conta;
import com.rubenskj.core.chain.exercise.Formato;
import com.rubenskj.core.chain.exercise.RequisicaoExportacao;

public class TemplateMethodExportacao {
    public static void main(String[] args) {
        GeraExportacaoTemplate geraExportacao = new GeraExportacaoTemplate();

        RequisicaoExportacao requisicaoExportacao = new RequisicaoExportacao(Formato.BOX);

        Conta conta = new Conta("Rubens Klesinchmidt", 500.0);

        geraExportacao.exporta(requisicaoExportacao, conta);
    }
}
