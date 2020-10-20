package com.rubenskj.core.templatemethod;

import com.rubenskj.core.chain.Item;
import com.rubenskj.core.model.Orcamento;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateDeImpostoCondicional {
    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        List<String> noOrcamento = new ArrayList<String>();

        for (Item item : orcamento.getItens()) {
            if (noOrcamento.contains(item.getNome())) {
                return true;
            }

            noOrcamento.add(item.getNome());
        }

        return false;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.13 + 100;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * (orcamento.getItens().size() * 0.01);
    }
}
