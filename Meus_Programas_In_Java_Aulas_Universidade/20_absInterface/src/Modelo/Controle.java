package Modelo;

public class Controle 
{
    protected String mensagem;
    protected String resposta;

    public void verificarTriangulos(String l1, String l2, String l3)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        this.mensagem = validacao.validarTresNumeros(l1, l2, l3);
        if (this.mensagem.equals(""))
        {
            this.mensagem = validacao.validarTriangulo(validacao.numero, validacao.numero1, validacao.numero2);
            if (this.mensagem.equals(""))
            {
                absPropriedades triangulos = new Triangulos(validacao.numero, validacao.numero1, validacao.numero2);
                this.resposta = triangulos.toString();
            }
        } 
    }
    
    public void calcularCalculadora(String num1, String num2, String operacao)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        this.mensagem = validacao.validarDoisNumeros(num1, num2);
        if (this.mensagem.equals(""))
        {
           this.mensagem = validacao.validarDivisao(validacao.numero1, operacao);
           if (this.mensagem.equals(""))
           {
               Calcular calcular = new Calcular(validacao.numero, validacao.numero1, operacao);
               this.resposta = calcular.toString();               
           }
        }
    }   
            
    public void calcularPrimo(String num)
    {
        this.mensagem ="";
        Validacao validacao = new Validacao();
        this.mensagem = validacao.validarNumeroInteiroPositivo(num);
        if (this.mensagem.equals(""))
        {
           Primo primo = new Primo(validacao.numeroIntPos);
           this.resposta = primo.toString();
        }
    }
    
    public void CalcularFatorial(String num)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        this.mensagem = validacao.validarNumeroInteiroPositivo(num);
        if (this.mensagem.equals(""))
        {
            Fatorial fatorial = new Fatorial(validacao.numeroIntPos);
            this.resposta = fatorial.toString();
        }    
    }
    public void converterTemperatura(String tipo, String temp)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        this.mensagem = validacao.validarNumero(temp);
        if (this.mensagem.equals(""))
        {
            Conversao conversao = new Conversao(tipo, validacao.numero);
            this.resposta = conversao.toString();
        }
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public String getResposta()
    {
        return resposta;
    }
    
    
    
}
