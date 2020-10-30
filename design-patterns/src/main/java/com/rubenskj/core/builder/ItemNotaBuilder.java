package com.rubenskj.core.builder;

public class ItemNotaBuilder {

    private String nome;
    private Double valor;

    public ItemNotaBuilder nome(String nome) {
        this.nome = nome;

        return this;
    }

    public ItemNotaBuilder valor(Double valor) {
        this.valor = valor;

        return this;
    }

    public ItemNota build() {
        return new ItemNota(
                this.nome,
                this.valor
        );
    }
}
