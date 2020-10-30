package com.rubenskj.core.builder;

import java.util.ArrayList;
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

    public NotaFiscalBuilder empresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;

        return this;
    }

    public NotaFiscalBuilder cnpj(String cnpj) {
        this.cnpj = cnpj;

        return this;
    }

    public NotaFiscalBuilder itens(ItemNota itemNota) {
        this.itens.add(itemNota);
        this.valorBruto += itemNota.getValor();
        this.impostos += itemNota.getValor() * 0.05;

        return this;
    }

    public NotaFiscalBuilder observacoes(String observacoes) {
        this.observacoes = observacoes;

        return this;
    }

    public NotaFiscalBuilder dataEmissao() {
        this.dataEmissao = Calendar.getInstance();

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
