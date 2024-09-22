package br.edu.imepac;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valorOrcamento;
    private String icmsRegiao;

    public Orcamento(BigDecimal valorOrcamento, String icmsRegiao){
        this.valorOrcamento = valorOrcamento;
        this.icmsRegiao = icmsRegiao;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public String getIcmsRegiao() {
        return icmsRegiao;
    }

    public void setIcmsRegiao(String icmsRegiao) {
        this.icmsRegiao = icmsRegiao;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }
}
