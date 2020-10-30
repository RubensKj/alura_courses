package com.rubenskj.core.observer;

import com.rubenskj.core.builder.ItemNota;
import com.rubenskj.core.builder.NotaFiscal;
import com.rubenskj.core.builder.NotaFiscalBuilder;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteObservers {

    public static void main(String[] args) {
        List<Observer> defaultObservers = createDefaultObservers();

        NotaFiscalBuilder builder = new NotaFiscalBuilder(defaultObservers);

        NotaFiscal nf = builder.empresa("Caelum")
                .cnpj("123")
                .itens(new ItemNota("nome", 100.0))
                .observacoes("Observacao")
                .dataEmissao(Calendar.getInstance())
                .build();

        System.out.println(nf.getValorBruto());
    }

    private static List<Observer> createDefaultObservers() {
        return Arrays.asList(
                new EnviadorEmail(),
                new NotaFiscalDAO(),
                new EnviadorSMS(),
                new Impressora(),
                new Multiplicador(2),
                new Multiplicador(3),
                new Multiplicador(5.5)
        );
    }
}
