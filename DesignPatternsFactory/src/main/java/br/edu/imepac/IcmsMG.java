package br.edu.imepac;

import java.math.BigDecimal;

public class IcmsMG implements I.CalculoRegiao {
    public BigDecimal calculoRegiao(Orcamento orcamento){
return orcamento.getValorOrcamento().multiply(new BigDecimal("0.1"));

    }
}
