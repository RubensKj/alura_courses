package com.rubenskj.core.templatemethod;

import com.rubenskj.core.chain.exercise.Conta;

import java.util.Arrays;
import java.util.List;

public class TesteRelatorio {

    public static void main(String[] args) {
        Relatorio relatorioComplexo = new RelatorioComplexo();
        Relatorio relatorioSimples = new RelatorioSimples();

        List<Conta> contas = Arrays.asList(
                new Conta("Titular1", 200.0),
                new Conta("Titular2", 299.0),
                new Conta("Titular3", 500.0)
        );

        relatorioComplexo.imprime(contas);

        System.out.println("\n------------------------\n");

        relatorioSimples.imprime(contas);
    }
}
