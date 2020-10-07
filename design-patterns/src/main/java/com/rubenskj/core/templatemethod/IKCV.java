package com.rubenskj.core.templatemethod;

import com.rubenskj.core.chain.Item;
import com.rubenskj.core.model.Orcamento;
import com.rubenskj.core.strategy.Imposto;

public class IKCV extends TemplateDeImpostoCondicional {

    public IKCV() {
    }

    public IKCV(Imposto outroImposto) {
        super(outroImposto);
    }

    private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if (item.getValor() > 100) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento);
    }
}
