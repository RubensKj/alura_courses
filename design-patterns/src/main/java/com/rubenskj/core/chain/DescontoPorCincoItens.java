package com.rubenskj.core.chain;

import com.rubenskj.core.model.Orcamento;

public class DescontoPorCincoItens implements Desconto {

    private Desconto desconto;

    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.1;
        }

        return desconto.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto desconto) {
        this.desconto = desconto;
    }
}
