package br.edu.imepac;

import java.math.BigDecimal;

public class Gerente implements Observer {
    private String nome;

    public Gerente() {
    }

    public Gerente(String nome) {
        this.nome = nome;

    }

    public void update(Estoque estoque) {
        BigDecimal valor = estoque.getValor();
        BigDecimal limite = new BigDecimal("1200.0");
        if (valor.compareTo(limite) > 0) {
            System.out.println("Gerente " + nome + ": Valor do produto " + estoque.getProduto() + " é maior que 1200. ");

            }
        }
    }
