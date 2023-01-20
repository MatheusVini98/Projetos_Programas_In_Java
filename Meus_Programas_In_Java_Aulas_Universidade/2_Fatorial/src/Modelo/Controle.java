package Modelo;

public class Controle extends absPropriedades implements intMetodos
{

    public Controle(String numero)
    {
        super(numero);
        this.executar();
    }

    @Override
    public void executar()
    {
        Validacao validacao = new Validacao(this.numero);
        if (Estaticos.mensagem.equals(""))
        {
            Fatorial fatorial = new Fatorial(validacao.getNum());   
            this.num = fatorial.num;
        }
    }
    
}
