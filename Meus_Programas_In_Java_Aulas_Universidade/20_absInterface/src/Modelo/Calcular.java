package Modelo;

import java.text.DecimalFormat;

public class Calcular extends absPropriedades
{
    private String resposta ;
    
    public Calcular(Double numero1, Double numero2, String operacao)
    {
        super(numero1, numero2, operacao);
    }

    
    @Override
    public void executar()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        
        if (operacao.equals("+"))
            resposta = df.format(numero1 + numero2);
        if (operacao.equals("-"))
            resposta = df.format(numero1 - numero2);
        if (operacao.equals("*"))
            resposta = df.format(numero1 * numero2);
        if (operacao.equals("/"))
            resposta = df.format(numero1 / numero2);
    }

    @Override
    public String toString()
    {
        return resposta ;
    }
    
    
}
