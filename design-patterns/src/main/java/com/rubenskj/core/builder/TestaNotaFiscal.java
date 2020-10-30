package com.rubenskj.core.builder;

public class TestaNotaFiscal {

    public static void main(String[] args) {

        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        ItemNotaBuilder itemBuilder = new ItemNotaBuilder();

        ItemNota item1 = itemBuilder
                .nome("Item 1")
                .valor(200.0)
                .build();

        builder.empresa("Carlum Ensino e Inovação")
        .cnpj("12.345.678/0001-12")
        .itens(item1)
        .itens(new ItemNota("Item 2", 300.0))
        .itens(new ItemNota("Item 3", 400.0))
        .observacoes("Observacoes")
        .dataEmissao();

        NotaFiscal nf = builder.build();

        System.out.println(nf.getValorBruto());
    }
}
