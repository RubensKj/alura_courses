package com.rubenskj.core.chain;

import com.rubenskj.core.model.Orcamento;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

    private Desconto desconto;

    public double desconta(Orcamento orcamento) {
        if (orcamento.getValor() > 500.0) {
            return orcamento.getValor() * 0.07;
        }

        return desconto.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto desconto) {
        this.desconto = desconto;
    }
}
