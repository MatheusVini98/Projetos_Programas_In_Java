package threads;

import Apresentacao.frmPrincipal;
import Modelo.Estaticos;
import Modelo.Soma;
import Modelo.Subtracao;


public class Threads
{

    public static void main(String[] args)
    {
        Estaticos.n1 = 0.0;
        Estaticos.n2 = 0.0;
        
        Soma soma = new Soma();
        Subtracao sub = new Subtracao();
        
        Thread tSoma = new Thread(soma);   
        Thread tSub = new Thread(sub);   
        
        tSoma.start();
        tSub.start();
        
        frmPrincipal frmP = new frmPrincipal(null,true);
        frmP.setVisible(true);
    }
    
}
