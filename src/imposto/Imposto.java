package imposto;

import java.math.BigDecimal;

import enums.TipoImposto;
import orcamento.Orcamento;

public class Imposto {
    
    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto){
        switch(tipoImposto){
        case ICMS: 
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        case ICSS: 
            return orcamento.getValor().multiply(new BigDecimal("0.06"));
        default: 
            return BigDecimal.ZERO;
        }
    }
}