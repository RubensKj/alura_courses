package com.rubenskj.core.decorator.filter;

import com.rubenskj.core.chain.exercise.Conta;

import java.util.List;

public abstract class Filtro {

    protected Filtro filtro;

    public Filtro() {
    }

    public Filtro(Filtro filtro) {
        this.filtro = filtro;
    }

    public abstract List<Conta> filtra(List<Conta> contas);

    protected List<Conta> executaFiltro(List<Conta> contas) {
        if (filtro != null) {
            return this.filtro.filtra(contas);
        }

        return contas;
    }
}
