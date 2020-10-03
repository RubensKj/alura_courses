package com.rubenskj.core;

public class DescontoPorVendaCasada implements Desconto {
    private Desconto desconto;

    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.contemItemDeNome("LAPIS") && orcamento.contemItemDeNome("CANETA")) {
            return orcamento.getValor() * 0.05;
        }

        return desconto.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto desconto) {

        this.desconto = desconto;
    }
}
