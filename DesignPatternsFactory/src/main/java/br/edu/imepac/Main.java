package br.edu.imepac;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new
                BigDecimal("1000"), "ICMS_MG");
        IcmsFactory icmsFactory = new IcmsFactory();
        BigDecimal resultado = icmsFactory.IcmsPorEstado(
                "ICMS_MG").calculoRegiao(orcamento);
        System.out.println("Icms = " + resultado);
    }
}

