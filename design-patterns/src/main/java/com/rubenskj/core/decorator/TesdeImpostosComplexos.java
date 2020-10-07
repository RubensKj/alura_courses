package com.rubenskj.core.decorator;

import com.rubenskj.core.model.Orcamento;
import com.rubenskj.core.strategy.ICMS;
import com.rubenskj.core.strategy.ISS;
import com.rubenskj.core.strategy.Imposto;

public class TesdeImpostosComplexos {

    public static void main(String[] args) {
        Imposto iss = new ISS(new ICMS());

        Orcamento orcamento = new Orcamento(500);

        double calcula = iss.calcula(orcamento);

        System.out.println(calcula);
    }
}
