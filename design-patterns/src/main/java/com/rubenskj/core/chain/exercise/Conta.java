package com.rubenskj.core.chain.exercise;

import java.time.LocalDateTime;

public class Conta {

    private String titular;
    private double saldo;
    private LocalDateTime dateCreated;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
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

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
