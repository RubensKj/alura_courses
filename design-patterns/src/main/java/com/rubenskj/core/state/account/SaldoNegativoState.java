package com.rubenskj.core.state.account;

import com.rubenskj.core.chain.exercise.Conta;

public class SaldoNegativoState implements EstadoConta {
    @Override
    public void saque(Conta conta, double valor) {
        throw new RuntimeException("Não é possivel sacar em uma conta com o saldo negativo.");
    }

    @Override
    public void deposita(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + (valor * 0.95));

        if (conta.getSaldo() > 0) {
            conta.setEstadoConta(new SaldoPositivoState());
        }
    }

    @Override
    public String toString() {
        return "Saldo Negativo";
    }
}
