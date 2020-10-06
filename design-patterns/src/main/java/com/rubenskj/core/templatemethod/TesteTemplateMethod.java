package com.rubenskj.core.templatemethod;

import com.rubenskj.core.model.Orcamento;
import com.rubenskj.core.strategy.CalculadorDeImposto;
import com.rubenskj.core.strategy.Imposto;

public class TesteTemplateMethod {

    public static void main(String[] args) {
        Imposto icpp = new ICPP();
        Imposto ikcv = new IKCV();

        Orcamento orcamento = new Orcamento(500.0);

        CalculadorDeImposto calculador = new CalculadorDeImposto();

        calculador.realizaCalculo(orcamento, icpp);
        calculador.realizaCalculo(orcamento, ikcv);
    }
}
