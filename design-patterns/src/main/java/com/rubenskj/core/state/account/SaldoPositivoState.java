package com.rubenskj.core.state.account;

import com.rubenskj.core.chain.exercise.Conta;

public class SaldoPositivoState implements EstadoConta {
    @Override
    public void saque(Conta conta, double valor) {
        conta.setSaldo((conta.getSaldo() - valor));

        if (conta.getSaldo() < 0) {
            conta.setEstadoConta(new SaldoNegativoState());
        }
    }

    @Override
    public void deposita(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + (valor * 0.98));
    }

    @Override
    public String toString() {
        return "Salvo positivo";
    }
}
