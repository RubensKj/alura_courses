package com.rubenskj.core.decorator.filter;

import com.rubenskj.core.chain.exercise.Conta;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class TesteFiltro {

    public static void main(String[] args) {
        FiltroMenor100Reais filtro = new FiltroMenor100Reais(new FiltroMaior500MilReais(new FiltroContaAbertaNoMesCorrente()));

        List<Conta> contas = Arrays.asList(
                new Conta("Titular1", 200.0),
                new Conta("Titular2", 299.0),
                new Conta("Titular4", 500001),
                new Conta("Titular5", 99.0),
                new Conta("Titular8", 500.0, LocalDateTime.of(2021, 2, 1, 12, 53))
        );

        List<Conta> contasFiltradas = filtro.filtra(contas);

        System.out.println(contasFiltradas);
    }
}
