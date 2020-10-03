package com.rubenskj.core.strategy;

import com.rubenskj.core.model.Orcamento;

public class CalculadorDeImposto {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
        double impostoValue = imposto.calcula(orcamento);

        System.out.println(impostoValue);
    }
}
