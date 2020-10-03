package com.rubenskj.core.chain.exercise;

public interface Exporta {

    void responde(RequisicaoExportacao requisicaoExportacao, Conta conta);

    void setProxima(Exporta resposta);
}
