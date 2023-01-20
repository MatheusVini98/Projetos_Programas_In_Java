/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;


public class Janela extends JFrame 
{  
    
    
    private MeusCardsPanel jpnComImagem;
    
    public Janela(){
        super();
        this.configurarFrame(); 
        this.configurarJpanelcomImagem();
        this.add(this.jpnComImagem);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    private void configurarFrame()
    {
            this.setTitle("Cards do Jogo");
            this.setSize(new Dimension(1360, 772));
            this.setLayout(new FlowLayout());
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
    }
    private void configurarJpanelcomImagem()
    {
        this.jpnComImagem = new MeusCardsPanel();
        this.jpnComImagem.setPreferredSize(this.getSize());
    }


}
