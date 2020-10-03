package com.rubenskj.core.chain;

import com.rubenskj.core.model.Orcamento;

public class SemDesconto implements Desconto {
    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto desconto) {

    }
}
