package com.rubenskj.core.state.account;

import com.rubenskj.core.chain.exercise.Conta;

public interface EstadoConta {

    void saque(Conta conta, double valor);

    void deposita(Conta conta, double valor);
}
