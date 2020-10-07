package com.rubenskj.core.decorator.filter;

import com.rubenskj.core.chain.exercise.Conta;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroMenor100Reais extends Filtro {

    public FiltroMenor100Reais() {
    }

    public FiltroMenor100Reais(Filtro filtro) {
        super(filtro);
    }

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> contasFiltradas = contas.stream().filter(conta -> conta.getSaldo() > 100).collect(Collectors.toList());

        return executaFiltro(contasFiltradas);
    }
}
