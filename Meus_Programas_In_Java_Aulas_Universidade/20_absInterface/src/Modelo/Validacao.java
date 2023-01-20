package Modelo;


public class Validacao  
{
    private String mensagem;
    protected Double numero;
    protected Double numero1;
    protected Double numero2;
    protected Integer numeroIntPos;
    
    public String validarNumeroInteiroPositivo(String num)
    {
        this.mensagem = "";
        try
        {
            this.numeroIntPos = Integer.parseInt(num);    
            if (numeroIntPos <0)
                this.mensagem = "Número deve ser Positivo";
        }
        catch (Exception e)
        {
            this.mensagem = "Número Inválido";
        }
        return mensagem;
    }
    
        public String validarNumero(String num)
    {
        this.mensagem = "";
        try
        {
            this.numero = Double.parseDouble(num);
        }
        catch (Exception e)
        {
            this.mensagem = "Número Inválido";
        }
        return mensagem;
    }
        
    public String validarDoisNumeros(String num1, String num2)
    {
        this.mensagem = "";
        try
        {
            this.numero = Double.parseDouble (num1);
            this.numero1 = Double.parseDouble (num2);
        }
        catch (Exception e)
        {   
            this.mensagem = "Número Inválido";
            
        }
        return mensagem;
    }
    
    public String validarTresNumeros(String num1, String num2, String num3)
    {
        this.mensagem = "";
        try
        {
            this.numero = Double.parseDouble (num1);
            this.numero1 = Double.parseDouble (num2);
            this.numero2 = Double.parseDouble (num3);
        }
        catch (Exception e)
        {   
            this.mensagem = "Número Inválido";
            
        }
        return mensagem;
    }
    
    public String validarDivisao(Double numero2 , String operacao)
    {
        if(numero2.equals(0.0) && operacao.equals("/"))
            return "Divisão por zero";
        else
            return "";
    }
    
    public String validarTriangulo(Double l1, Double l2, Double l3)
    {
        if (l1 + l2 > l3 &&
            l1+  l3 > l2 &&
            l2+  l3 > l1)
                return "";
            else
                return "Isto não é um triângulo";      
    }
}
