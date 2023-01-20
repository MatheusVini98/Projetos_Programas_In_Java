package excecao;

public class ErroNumeroCaracteres extends Exception
{

    @Override
    public String getMessage()
    {
        return super.getMessage(); 
    }
    
    @Override
    public String toString()
    {
        return "Texto deve ter mais de 3 caracteres";
    }
}
