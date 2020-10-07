package com.rubenskj.core.decorator.filter;

import com.rubenskj.core.chain.exercise.Conta;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroContaAbertaNoMesCorrente extends Filtro {

    public FiltroContaAbertaNoMesCorrente() {
    }

    public FiltroContaAbertaNoMesCorrente(Filtro filtro) {
        super(filtro);
    }

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> contasFiltradas = contas.stream().filter(conta -> conta.getDateCreated() == null || conta.getDateCreated().isBefore(LocalDateTime.now())).collect(Collectors.toList());

        return executaFiltro(contasFiltradas);
    }
}
