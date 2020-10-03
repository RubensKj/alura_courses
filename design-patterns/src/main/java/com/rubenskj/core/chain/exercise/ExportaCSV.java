package com.rubenskj.core.chain.exercise;

public class ExportaCSV implements Exporta {
    private Exporta exporta;

    @Override
    public void responde(RequisicaoExportacao requisicaoExportacao, Conta conta) {
        Formato formato = requisicaoExportacao.getFormato();

        if (formato.equals(Formato.CSV)) {
            String csv = String.format(
                    "%s;%.1f",
                    conta.getTitular(),
                    conta.getSaldo()
            );

            System.out.println(csv);
            return;
        }

        exporta.responde(requisicaoExportacao, conta);
    }

    @Override
    public void setProxima(Exporta exporta) {
        this.exporta = exporta;
    }
}
