package com.rubenskj.core.templatemethod;

import com.rubenskj.core.chain.exercise.Conta;

import java.util.List;

public class RelatorioSimples extends Relatorio {
    @Override
    protected void cabecalho() {
        System.out.println("Banco Template Method");
    }

    @Override
    protected void rodape() {
        System.out.println("(11) 2184-3205");
    }

    @Override
    protected void corpo(List<Conta> contas) {
        contas.forEach(conta -> System.out.println(conta.getTitular() + " - " + conta.getSaldo()));
    }
}
