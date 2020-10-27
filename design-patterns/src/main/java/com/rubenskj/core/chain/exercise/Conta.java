package com.rubenskj.core.chain.exercise;

import com.rubenskj.core.state.account.EstadoConta;
import com.rubenskj.core.state.account.SaldoNegativoState;
import com.rubenskj.core.state.account.SaldoPositivoState;

import java.time.LocalDateTime;

public class Conta {

    private String titular;
    private double saldo;
    private LocalDateTime dateCreated;

    protected EstadoConta estadoConta;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;

        if (saldo > 0) {
            this.estadoConta = new SaldoPositivoState();
        } else {
            this.estadoConta = new SaldoNegativoState();
        }
    }

    public Conta(String titular, double saldo, LocalDateTime dateCreated) {
        this.titular = titular;
        this.saldo = saldo;
        this.dateCreated = dateCreated;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public EstadoConta getEstadoConta() {
        return estadoConta;
    }

    public void setEstadoConta(EstadoConta estadoConta) {
        this.estadoConta = estadoConta;
    }

    public void saque(double valor) {
        this.estadoConta.saque(this, valor);
    }

    public void deposita(double valor) {
        this.estadoConta.deposita(this, valor);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
