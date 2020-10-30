package com.rubenskj.core.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;
    private Calendar dataEmissao;
    private double valorBruto;
    private double impostos;
    private List<ItemNota> itens = new ArrayList<>();
    private String observacoes;

    public NotaFiscalBuilder() {
        this.dataEmissao = Calendar.getInstance();
    }

    public NotaFiscalBuilder empresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;

        return this;
    }

    public NotaFiscalBuilder cnpj(String cnpj) {
        this.cnpj = cnpj;

        return this;
    }

    public NotaFiscalBuilder itens(ItemNota... itensArray) {
        List<ItemNota> itemNotas = Arrays.asList(itensArray);

        this.itens.addAll(itemNotas);

        itemNotas.forEach(itemNota -> {
            this.valorBruto += itemNota.getValor();
            this.impostos += itemNota.getValor() * 0.05;
        });

        return this;
    }

    public NotaFiscalBuilder observacoes(String observacoes) {
        this.observacoes = observacoes;

        return this;
    }

    public NotaFiscalBuilder dataEmissao(Calendar novaData) {
        this.dataEmissao = novaData;

        return this;
    }

    public NotaFiscal build() {
        return new NotaFiscal(
                razaoSocial,
                cnpj,
                dataEmissao,
                valorBruto,
                impostos,
                itens,
                observacoes
        );
    }
}
