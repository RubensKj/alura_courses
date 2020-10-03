package com.rubenskj.core.chain.exercise;

public class TestaExportacao {

    public static void main(String[] args) {

        GeraExportacao geraExportacao = new GeraExportacao();

        RequisicaoExportacao requisicaoExportacao = new RequisicaoExportacao(Formato.XML);

        Conta conta = new Conta("Rubens Klesinchmidt", 500.0);

        geraExportacao.exporta(requisicaoExportacao, conta);
    }
}
