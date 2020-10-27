package com.rubenskj.core.state;

import com.rubenskj.core.model.Orcamento;

public interface EstadoDeUmOrcamento {

    void aplicaDescontoExtra(Orcamento orcamento);

    void aprova(Orcamento orcamento);

    void reprova(Orcamento orcamento);

    void finaliza(Orcamento orcamento);
}
