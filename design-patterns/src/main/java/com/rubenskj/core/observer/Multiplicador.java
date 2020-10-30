package com.rubenskj.core.observer;

import com.rubenskj.core.builder.NotaFiscal;

public class Multiplicador implements Observer {

    private double fator;

    public Multiplicador(double fator) {
        this.fator = fator;
    }

    @Override
    public void execute(NotaFiscal notaFiscal) {
        System.out.println(notaFiscal.getValorBruto() * this.fator);
    }
}
