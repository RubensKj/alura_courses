package com.rubenskj.core.decorator.filter;

import com.rubenskj.core.chain.exercise.Conta;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroMaior500MilReais extends Filtro {

    public FiltroMaior500MilReais() {
    }

    public FiltroMaior500MilReais(Filtro filtro) {
        super(filtro);
    }

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> contasFiltradas = contas.stream().filter(conta -> conta.getSaldo() < 500000).collect(Collectors.toList());

        return executaFiltro(contasFiltradas);
    }
}
