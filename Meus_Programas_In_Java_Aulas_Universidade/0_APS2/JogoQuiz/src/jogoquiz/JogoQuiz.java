package jogoquiz;

import controle.Som;
import controle.Janela;
import java.io.IOException;


public class JogoQuiz extends Som
{

    public static void main(String[] args) throws IOException 
    {
        Som.playSound();
        Som.clip.loop(0);
        Quiz quiz = new Quiz();
        Janela cards = new Janela();
    }
}
    

