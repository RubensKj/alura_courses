package com.rubenskj.core.state.account;

import com.rubenskj.core.chain.exercise.Conta;

public class TesteSaqueeDepositoDeConta {

    public static void main(String[] args) {
        Conta conta = new Conta("Rubens Kleinschmidt", 500.0);

        conta.saque(650.0);

        System.out.println(conta.getSaldo());
        System.out.println(conta.getEstadoConta().toString());

        conta.deposita(150.0);

        System.out.println(conta.getSaldo());
        System.out.println(conta.getEstadoConta().toString());

        conta.deposita(8.0);

        System.out.println(conta.getSaldo());
        System.out.println(conta.getEstadoConta().toString());

        conta.deposita(100.0);

        System.out.println(conta.getSaldo());
        System.out.println(conta.getEstadoConta().toString());
    }
}
