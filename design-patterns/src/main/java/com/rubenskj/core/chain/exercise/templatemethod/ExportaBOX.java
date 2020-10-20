package com.rubenskj.core.chain.exercise.templatemethod;

import com.rubenskj.core.chain.exercise.Conta;
import com.rubenskj.core.chain.exercise.Exporta;
import com.rubenskj.core.chain.exercise.Formato;

/**
 * Another template to test the Template Method with Chain of Responsibility
 */
public class ExportaBOX extends TemplateExporta {
    protected ExportaBOX(Exporta exporta) {
        super(exporta);
    }

    @Override
    protected void exporta(Conta conta) {
        System.out.println("|---------------------|");
        System.out.println("| " + conta.getTitular() + " |");
        System.out.println("|---------------------|");
        System.out.println("| " + conta.getSaldo() + "               |");
        System.out.println("|---------------------|");
    }

    @Override
    protected Formato getFormato() {
        return Formato.BOX;
    }
}
