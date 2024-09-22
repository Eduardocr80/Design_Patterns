package org.example;

import model.Orcamento;
import model.OrcamentoProxy;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), new BigDecimal(10));
        System.out.println("Valor do orçamento = " + orcamento.getDescontoOrcamento());
        System.out.println("Tempo para ver o desconto = " + orcamento.getDescontoOrcamento());

        OrcamentoProxy proxy = new OrcamentoProxy(orcamento);
        System.out.println("Valor com proxy = " + proxy.getDescontoOrcamento());

    }
}