package com.rubenskj.core.decorator;

import com.rubenskj.core.model.Orcamento;
import com.rubenskj.core.strategy.ICMS;
import com.rubenskj.core.strategy.Imposto;

public class TesteImpostoMuitoAlto {

    public static void main(String[] args) {
        Imposto impostoMuitoAlto = new ImpostoMuitoAlto(new ICMS());

        Orcamento orcamento = new Orcamento(500.0);

        double value = impostoMuitoAlto.calcula(orcamento);

        System.out.println(value);
    }
}
