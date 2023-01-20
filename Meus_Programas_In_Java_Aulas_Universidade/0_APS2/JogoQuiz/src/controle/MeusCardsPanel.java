package controle;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
/**
 *
 * @author Usuario
 */
public class MeusCardsPanel extends JPanel 
{

@Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        try {
            Graphics2D grafico2d = (Graphics2D) g;
            URL imageInputStream = getClass().getResource("/recursos/imagens/CARDDEFINITIVO.png");
            BufferedImage bufferedImage = ImageIO.read(imageInputStream);
            Image CardRedimensionada = bufferedImage.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT);
            grafico2d.drawImage(CardRedimensionada, 0, 0, this);
        } catch (Exception e) {
            System.err.println("Card não encontrado!");
        }
    }

}