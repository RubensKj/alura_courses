package com.rubenskj.core.strategy;

import com.rubenskj.core.model.Orcamento;

public class ISS implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
