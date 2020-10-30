package com.rubenskj.core.observer;

import com.rubenskj.core.builder.NotaFiscal;

public class Impressora implements Observer {

    @Override
    public void execute(NotaFiscal notaFiscal) {
        System.out.println(notaFiscal);
    }
}
