package application;

import java.math.BigDecimal;

import enums.TipoImposto;
import imposto.CalculaImposto;
import imposto.ICMS;
import imposto.ICSS;
import imposto.Imposto;
import orcamento.Orcamento;

public class program {
    
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculaImposto calculaImposto = new CalculaImposto();
        System.out.println(calculaImposto.calcular(orcamento, new ICSS()));
    }
}