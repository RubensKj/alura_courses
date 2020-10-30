package com.rubenskj.core.observer;

import com.rubenskj.core.builder.NotaFiscal;

public class EnviadorSMS implements Observer {

    @Override
    public void execute(NotaFiscal notaFiscal) {
        System.out.println("SMS Enviado");
    }
}
