package com.rubenskj.core.templatemethod;

import com.rubenskj.core.chain.exercise.Conta;

import java.util.Calendar;
import java.util.List;

public class RelatorioComplexo extends Relatorio {
    @Override
    protected void cabecalho() {
        System.out.println("Banco Template Method");
        System.out.println("Avenida Paulista, 1234");
        System.out.println("(11) 2184-3205");
    }

    @Override
    protected void rodape() {
        System.out.println("banco@xyz.com.br");
        System.out.println(Calendar.getInstance().getTime());
    }

    @Override
    protected void corpo(List<Conta> contas) {
        contas.forEach(conta -> System.out.println(conta.getTitular() + " - " + conta.getSaldo()));
    }
}
