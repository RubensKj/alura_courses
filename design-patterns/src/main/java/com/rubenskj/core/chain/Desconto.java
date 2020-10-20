package com.rubenskj.core.chain;

import com.rubenskj.core.model.Orcamento;

public interface Desconto {

    double desconta(Orcamento orcamento);

    void setProximo(Desconto desconto);
}
