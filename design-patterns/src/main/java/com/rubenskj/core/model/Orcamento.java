package com.rubenskj.core.model;

import com.rubenskj.core.chain.Item;
import com.rubenskj.core.state.EmAprovacao;
import com.rubenskj.core.state.EstadoDeUmOrcamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    protected double valor;
    private final List<Item> itens;

    protected EstadoDeUmOrcamento estadoAtual;

    public Orcamento(double valor) {
        this.valor = valor;
        itens = new ArrayList<>();
        estadoAtual = new EmAprovacao();
    }

    public double getValor() {
        return valor;
    }

    public void acidionaItem(Item item) {
        itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public EstadoDeUmOrcamento getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(EstadoDeUmOrcamento estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public boolean contemItemDeNome(String nomeDoItem) {
        for (Item item : itens) {
            if (item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }

    public void aplicaDescontoExtra() {
        this.estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprova() {
        this.estadoAtual.aprova(this);
    }

    public void reprova() {
        this.estadoAtual.reprova(this);
    }

    public void finaliza() {
        this.estadoAtual.finaliza(this);
    }
}
