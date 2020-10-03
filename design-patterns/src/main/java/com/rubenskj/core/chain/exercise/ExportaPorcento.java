package com.rubenskj.core.chain.exercise;

public class ExportaPorcento implements Exporta {
    private Exporta exporta;

    public ExportaPorcento() {
    }

    public ExportaPorcento(Exporta exporta) {
        this.exporta = exporta;
    }

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

        if (exporta == null) {
            throw new IllegalStateException("Nao foi possivel encontrar o Formato desejado.");
        }

        exporta.responde(requisicaoExportacao, conta);
    }
}
