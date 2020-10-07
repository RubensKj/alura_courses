package com.rubenskj.core.templatemethod;

import com.rubenskj.core.model.Orcamento;
import com.rubenskj.core.strategy.Imposto;

public abstract class TemplateDeImpostoCondicional extends Imposto {

    public TemplateDeImpostoCondicional() {
    }

    public TemplateDeImpostoCondicional(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public final double calcula(Orcamento orcamento) {
        if (deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento) + calculaDoOutroImposto(orcamento);
        }

        return minimaTaxacao(orcamento) + calculaDoOutroImposto(orcamento);
    }

    protected abstract double minimaTaxacao(Orcamento orcamento);

    protected abstract double maximaTaxacao(Orcamento orcamento);

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
