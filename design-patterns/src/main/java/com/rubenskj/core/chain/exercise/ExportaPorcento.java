package com.rubenskj.core.chain.exercise;

public class ExportaPorcento implements Exporta {
    private Exporta exporta;

    @Override
    public void responde(RequisicaoExportacao requisicaoExportacao, Conta conta) {
        Formato formato = requisicaoExportacao.getFormato();

        if (formato.equals(Formato.PORCENTO)) {
            String porcento = String.format(
                    "%s%s%.1f",
                    conta.getTitular(),
                    "%",
                    conta.getSaldo()
            );

            System.out.println(porcento);
            return;
        }

        exporta.responde(requisicaoExportacao, conta);
    }

    @Override
    public void setProxima(Exporta exporta) {
        this.exporta = exporta;
    }
}
