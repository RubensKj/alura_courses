package com.rubenskj.core.chain.exercise;

public class ExportaXML implements Exporta {
    private Exporta exporta;

    @Override
    public void responde(RequisicaoExportacao requisicaoExportacao, Conta conta) {
        Formato formato = requisicaoExportacao.getFormato();

        if (formato.equals(Formato.XML)) {
            String xml = String.format(
                    "<conta><titular>%s</titular><saldo>%.1f</saldo></conta>",
                    conta.getTitular(),
                    conta.getSaldo()
            );

            System.out.println(xml);
            return;
        }

        exporta.responde(requisicaoExportacao, conta);
    }

    @Override
    public void setProxima(Exporta exporta) {
        this.exporta = exporta;
    }
}
