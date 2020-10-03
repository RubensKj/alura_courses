package com.rubenskj.core;

public interface Desconto {

    double desconta(Orcamento orcamento);

    void setProximo(Desconto desconto);
}
