package com.rubenskj.core.strategy;

import com.rubenskj.core.model.Orcamento;

public class ICMS extends Imposto {

    public ICMS() {
    }

    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1 + calculaDoOutroImposto(orcamento);
    }
}
