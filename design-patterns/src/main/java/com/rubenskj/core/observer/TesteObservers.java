package com.rubenskj.core.observer;

import com.rubenskj.core.builder.ItemNota;
import com.rubenskj.core.builder.NotaFiscal;
import com.rubenskj.core.builder.NotaFiscalBuilder;

import java.util.Calendar;

public class TesteObservers {

    public static void main(String[] args) {
        NotaFiscalBuilder builder = new NotaFiscalBuilder();

        builder.addObservers(
                new EnviadorEmail(),
                new NotaFiscalDAO(),
                new EnviadorSMS(),
                new Impressora(),
                new Multiplicador(2),
                new Multiplicador(3),
                new Multiplicador(5.5)
        );

        NotaFiscal nf = builder.empresa("Caelum")
                .cnpj("123")
                .itens(new ItemNota("nome", 100.0))
                .observacoes("Observacao")
                .dataEmissao(Calendar.getInstance())
                .build();

        System.out.println(nf.getValorBruto());
    }
}
