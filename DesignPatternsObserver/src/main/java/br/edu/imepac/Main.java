package br.edu.imepac;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal valorInicial = new BigDecimal("1500.0");
        BigDecimal desconto = new BigDecimal("10.0");
        Gerente gerente = new Gerente("Eduardo");
        Estoque estoque = new Estoque("Camiseta", valorInicial, desconto);
        estoque.attach(gerente);
        estoque.setValor(valorInicial);
    }
}
