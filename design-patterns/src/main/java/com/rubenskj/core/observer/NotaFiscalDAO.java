package com.rubenskj.core.observer;

import com.rubenskj.core.builder.NotaFiscal;

public class NotaFiscalDAO implements Observer {

    @Override
    public void execute(NotaFiscal notaFiscal) {
        System.out.println("Salvo no Banco");
    }
}
