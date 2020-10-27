package com.rubenskj.core.state;

import com.rubenskj.core.model.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento {

    private boolean discountIsApplied = false;

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if (this.discountIsApplied) {
            throw new RuntimeException("Desconto já aplicado!");
        }

        double valor = orcamento.getValor();

        orcamento.setValor(valor - (valor * 0.02));

        this.discountIsApplied = true;
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já foi aprovado!");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já foi reprovado!");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Finalizado());
    }
}
