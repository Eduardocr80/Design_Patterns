package model;

import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento {

    private BigDecimal descontoOrcamemto;
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getDescontoOrcamemto() {
        if (descontoOrcamemto == null) {
            this.descontoOrcamemto = orcamento.getDescontoOrcamemto();
        }
        return descontoOrcamemto;
    }

    @Override
    public void setDescontoOrcamemto(BigDecimal descontoOrcamemto) {
        this.descontoOrcamemto = descontoOrcamemto;
    }
}

