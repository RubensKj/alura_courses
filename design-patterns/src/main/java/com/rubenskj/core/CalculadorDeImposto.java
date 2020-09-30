package com.rubenskj.core;

public class CalculadorDeImposto {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
        double impostoValue = imposto.calcula(orcamento);

        System.out.println(impostoValue);
    }
}
