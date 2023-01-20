package Modelo;


public class Validacao extends absPropriedades implements intMetodos
{

    public Validacao(String numero)
    {
        super(numero);
        this.executar();
    }
    
    @Override
    public void executar()
    {
        Estaticos.mensagem = "";
        try
        {
            this.num = Integer.parseInt(this.numero);
        }
        catch (Exception e)
        {
            Estaticos.mensagem = "Erro de conversão";
        }
    }
    
}
