package com.rubenskj.core.state;

import com.rubenskj.core.model.Orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento {

    private boolean discountIsApplied = false;

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if (this.discountIsApplied) {
            throw new RuntimeException("Desconto já aplicado!");
        }

        double valor = orcamento.getValor();

        orcamento.setValor(valor - (valor * 0.05));

        this.discountIsApplied = true;
    }

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Aprovado());
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Reprovado());
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Não pode finalizar sendo que esta em aprovação");
    }
}
