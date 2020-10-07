package com.rubenskj.core.strategy;

import com.rubenskj.core.model.Orcamento;

public class ISS extends Imposto {

    public ISS() {
    }

    public ISS(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06 + calculaDoOutroImposto(orcamento);
    }
}
