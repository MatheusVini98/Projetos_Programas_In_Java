
package modelo;

public class Validacao extends absPropriedades
{
    
    public Validacao(String numero)
    {
        super(numero);
        this.validarNumero();
    }
    
    private void validarNumero()
    {
        this.setMensagem("");
        try
        {
            this.setNum(Integer.parseInt(this.getNumero()));
            if (this.getNum()<0)
                this.setMensagem("Digite apenas números positivos");
        }
        catch (Exception e)
        {
            this.setMensagem("Numero inválido");
        }
    }
    
}
