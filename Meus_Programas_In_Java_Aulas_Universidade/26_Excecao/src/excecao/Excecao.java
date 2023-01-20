package excecao;

public class Excecao
{

    public static void main(String[] args) throws ErroNumeroCaracteres
    {
        String numero = "5";
        String texto ="qwerty";
        String mensagem = "";
        int num = 0;
        
        try
        {
            num = Integer.parseInt(numero);
            if (num == 7) throw new Exception();
            if (texto.length()<3);
        }
        catch (ErroNumeroCaracteres e)
        {
            mensagem=e.getMessage();
        }
        catch (NumberFormatException e)
        {
            mensagem = "Erro de conversão";
        }
        catch (Exception e)
        {
            mensagem = "erro";
        }
        finally
        {
            System.out.println("Entrou no Finally");
        }
        
        if (mensagem.equals("")) System.out.println(num);
        else System.out.println(mensagem);
    }
    
}
