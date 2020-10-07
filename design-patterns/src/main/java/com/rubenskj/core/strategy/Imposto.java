package com.rubenskj.core.strategy;

import com.rubenskj.core.model.Orcamento;

public abstract class Imposto {

    protected Imposto outroImposto;

    public Imposto() {
    }

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public abstract double calcula(Orcamento orcamento);

    protected double calculaDoOutroImposto(Orcamento orcamento) {
        if (outroImposto != null) {
            return outroImposto.calcula(orcamento);
        }

        return 0;
    }
}
