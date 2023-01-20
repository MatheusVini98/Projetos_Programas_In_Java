package polimorfismo;

import javax.swing.JOptionPane;

public class Polimorfismo
{
    public static void main(String[] args)
    {
        Soma soma = new Soma();
        
        String texto = soma.toString();
        
        JOptionPane.showMessageDialog(null, texto);
    }
    
}
