package com.rubenskj.core.decorator;

import com.rubenskj.core.model.Orcamento;
import com.rubenskj.core.strategy.Imposto;

public class ImpostoMuitoAlto extends Imposto {

    public ImpostoMuitoAlto() {
    }

    public ImpostoMuitoAlto(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.20 + calculaDoOutroImposto(orcamento);
    }
}
