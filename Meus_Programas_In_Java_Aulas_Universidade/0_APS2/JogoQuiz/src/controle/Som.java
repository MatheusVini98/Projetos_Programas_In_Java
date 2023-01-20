package controle;

import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import sun.applet.Main;


public class Som
{
    public static Clip clip;
    public static synchronized void playSound()
    {
        try
        {
            clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(Main.class.getResourceAsStream("/recursos/sound/A-Different-World.wav"));
            clip.open(inputStream);
        }
        catch (IOException | LineUnavailableException | UnsupportedAudioFileException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
