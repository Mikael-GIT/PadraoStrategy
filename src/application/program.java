package application;

import java.math.BigDecimal;

import enums.TipoImposto;
import imposto.Imposto;
import orcamento.Orcamento;

public class program {
    
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));

        Imposto imposto = new Imposto();
        System.out.println(imposto.calcular(orcamento, TipoImposto.ICMS));
    }
}