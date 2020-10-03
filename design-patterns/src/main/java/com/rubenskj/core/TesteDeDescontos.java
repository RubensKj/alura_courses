package com.rubenskj.core;

public class TesteDeDescontos {

    public static void main(String[] args) {
        CalculadorDeDesconto descontos = new CalculadorDeDesconto();

        Orcamento orcamento = new Orcamento(500.0);
        orcamento.acidionaItem(new Item("CANETA", 250.0));
        orcamento.acidionaItem(new Item("LAPIS", 250.0));

        double descontoFinal = descontos.calcula(orcamento);

        System.out.println(descontoFinal);
    }
}
