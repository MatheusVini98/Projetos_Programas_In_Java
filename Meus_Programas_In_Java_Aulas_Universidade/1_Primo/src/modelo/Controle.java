
package modelo;


public class Controle extends absPropriedades
{
    
    public Controle(String numero)
    {
        super(numero);
        executar();
    }
    
    
    private void executar()
    {
        this.setMensagem("");
        Validacao validacao = new Validacao(this.getNumero());
        if(validacao.getMensagem().equals(""))
        {
          Primo primo = new Primo(validacao.getNum());
          this.setMensagem(primo.getMensagem());
        }
        else
        {
            this.setMensagem(validacao.getMensagem());
        }
    }
}
