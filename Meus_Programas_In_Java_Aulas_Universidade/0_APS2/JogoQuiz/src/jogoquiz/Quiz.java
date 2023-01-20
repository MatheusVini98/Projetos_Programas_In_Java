package jogoquiz;

import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import javax.swing.*;
import sun.applet.Main;

public class Quiz extends JFrame implements ActionListener {
	
	String[] questoes = 	{
								"O que causa o efeito estufa ?",
								"O que causa a chuva ácida ?",
								"O que acontece ao jogar lixo em locais inapropriados ? ",
								"O que acontece ao poluir rios ? ",
								"Qual a importancia dos lençóis freáticos ?",
								"Por que devemos cuidar do meio ambiente ?",
								"O que é a mudança climática ? ",
								"Quais as consequências do empobrecimento do solo ? ",
								"O que causa o fenômeno das ilhas de calor ?",
								"Das Opções abaixo, cite a que representa impacto ambiental : "
							};
	String[][] opcoes = 	{
								{"Queima de combustiveis fósseis,CFCs,Desmatamento","Descarte correto de lixo ","Cuidar do meio ambiente","Todas as alternativas"},
								{"É consequência da poluição atmosférica com óxidos ácidos que reagem a água da chuva" ,"Poluição sonora " ,"Esgoto poluidos","Poluição visual"},
								{"Poluir as ruas e o meio ambiente causa o efeito estufa","Lixo disposto em vias públicas causa problemas Infraestruturais e alagamentos","Poluir as ruas é um ato sábio e legal","Poluição causa maremotos nas praias"},
								{"Alimenta a fauna marinha com plastico","Os céus ficam poluidos por conta da evaporação da agua suja","Provoca desequilíbrio ambiental, representando uma grande ameaça à vida aquática","Esgota a água potável"},
								{"São importantes apenas para poços em terrenos privados","Controlar a emissão de Raios U.V","Serve para prejudicar o meio ambiente contribuindo com a poluição de oceanos e lagos ","Os lençóis freáticos são importantes,pois são capazes de alimentar rios,lagos e oceanos"},
								{"Porque devemos derrubar mais árvores","Preservar o meio ambiente é fundamental para manter a saúde do planeta e dos seres vivos","Não é bom cuidar, ele que tem que cuidar de nós","Ajuda a contribuir com as queimadas"},
								{"Mudanças climáticas incluem aquecimento global e todos os “efeitos colaterais” que ele causa","Quando muda a estação do ano","Mudanças climáticas pelos seres vivos da terra","Surgimento de Calotas Polares"},
								{"Facilita a plantação local pois sem nutrientes a árvore cresce mais rápido","Improdutividade e infertilidade do solo e a provável perda da fauna local","Torna o solo fértil e propício à plantação de fungos e cogumelos","Torna possível a cultivação de gado pois assim o solo não produz matos e parasitas"},
								{"A diminuição da densidade demográfica dos centros urbanos","Ao aumento das inversão térmica das cidades","Ao aumento das queimadas nas zonas rurais","Aos microclimas periféricos que afetam diretamente as cidades"},
								{"Chuva Ácida","Assoreamento dos Rios","Desertificação","Mobilidade urbana"}
							};
	char[] respostas = 		{
								'A',
								'A',
								'B',
								'C',
								'D',
								'B',
								'A',
								'B',
								'C',
								'D',
							};
	char suposicoes;
	char resposta;
	int indice;
	int corretas_suposicoes =0;
	int total_questoes = questoes.length;
	int resultado;
	int segundos=100;
	
	JFrame frame = new JFrame();
	JTextField campodetexto  = new JTextField();
	JTextArea areadetexto = new JTextArea();
	JButton botaoA = new JButton();
	JButton botaoB = new JButton();
	JButton botaoC = new JButton();
	JButton botaoD = new JButton();
	JLabel resposta_labelA = new JLabel();
	JLabel resposta_labelB = new JLabel();
	JLabel resposta_labelC = new JLabel();
	JLabel resposta_labelD = new JLabel();
	JLabel tempo_label = new JLabel();
	JLabel segundos_passados = new JLabel(); 
	JTextField alternativas_certas = new JTextField(); 
	JTextField porcentagem = new JTextField(); 
	
	Timer tempo = new Timer(5500, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			segundos--;
			segundos_passados.setText(String.valueOf(segundos));
			if(segundos<=0) {
				displayResposta();
			}
			}
		});
	
	public Quiz() throws IOException {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1366,768);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(null);
		frame.setResizable(false);             
                frame.setLayout(new BorderLayout());
                frame.setContentPane(new JLabel(new ImageIcon(Main.class.getResource("/recursos/imagens/Background1.png"))));
                frame.setVisible(true);
                                              
		campodetexto.setBounds(0,0,1360,50);
		campodetexto.setBackground(new Color(25,25,25));
		campodetexto.setForeground(new Color(25,255,0));
		campodetexto.setFont(new Font("Forte",Font.BOLD,30));
		campodetexto.setBorder(BorderFactory.createBevelBorder(1));
		campodetexto.setHorizontalAlignment(JTextField.CENTER);
		campodetexto.setEditable(false);
		
		areadetexto.setBounds(0,50,1360,50);
		areadetexto.setLineWrap(true);
		areadetexto.setWrapStyleWord(true);
		areadetexto.setBackground(new Color(25,25,25));
		areadetexto.setForeground(new Color(25,255,0));
		areadetexto.setFont(new Font("Forte",Font.BOLD,30));
		areadetexto.setBorder(BorderFactory.createBevelBorder(1));
		areadetexto.setEditable(false);
		
		botaoA.setBounds(0,200,100,100);
		botaoA.setFont(new Font("Forte",Font.BOLD,35));
		botaoA.setFocusable(false);
		botaoA.addActionListener(this);
		botaoA.setText("A");
		
		botaoB.setBounds(0,300,100,100);
		botaoB.setFont(new Font("Forte",Font.BOLD,35));
		botaoB.setFocusable(false);
		botaoB.addActionListener(this);
		botaoB.setText("B");
		
		botaoC.setBounds(0,400,100,100);
		botaoC.setFont(new Font("Forte",Font.BOLD,35));
		botaoC.setFocusable(false);
		botaoC.addActionListener(this);
		botaoC.setText("C");
		
		botaoD.setBounds(0,500,100,100);
		botaoD.setFont(new Font("Forte",Font.BOLD,35));
		botaoD.setFocusable(false);
		botaoD.addActionListener(this);
		botaoD.setText("D");
		
		resposta_labelA.setBounds(125,200,1360,100);
		resposta_labelA.setBackground(new Color(50,50,50));
		resposta_labelA.setForeground(new Color(0,0,255));
		resposta_labelA.setFont(new Font("MV Boli",Font.BOLD,25));
		
		resposta_labelB.setBounds(125,300,1360,100);
		resposta_labelB.setBackground(new Color(50,50,50));
		resposta_labelB.setForeground(new Color(0,0,255));
		resposta_labelB.setFont(new Font("MV Boli",Font.BOLD,25));
		
		resposta_labelC.setBounds(125,400,1360,100);
		resposta_labelC.setBackground(new Color(50,50,50));
		resposta_labelC.setForeground(new Color(0,0,255));
		resposta_labelC.setFont(new Font("MV Boli",Font.BOLD,25));
		
		resposta_labelD.setBounds(125,500,1360,100);
		resposta_labelD.setBackground(new Color(50,50,50));
		resposta_labelD.setForeground(new Color(0,0,255));
		resposta_labelD.setFont(new Font("MV Boli",Font.BOLD,25));
		
		segundos_passados.setBounds(1200,600,125,100);
		segundos_passados.setBackground(new Color(25,25,25));
		segundos_passados.setForeground(new Color(25,255,0));
		segundos_passados.setFont(new Font("Ink Free",Font.BOLD,60));
		segundos_passados.setBorder(BorderFactory.createBevelBorder(1));
		segundos_passados.setOpaque(true);
		segundos_passados.setHorizontalAlignment(JTextField.CENTER);
		segundos_passados.setText(String.valueOf(segundos));
		
		tempo_label.setBounds(900,900,300,250);
		tempo_label.setBackground(new Color(50,50,50));
		tempo_label.setForeground(new Color(255,0,0));
		tempo_label.setFont(new Font("MV Boli",Font.PLAIN,16));
		tempo_label.setHorizontalAlignment(JTextField.CENTER);
		tempo_label.setText("Tempo");
		
		alternativas_certas.setBounds(575,250,200,100);
		alternativas_certas.setBackground(new Color(25,25,25));
		alternativas_certas.setForeground(new Color(25,255,0));
		alternativas_certas.setFont(new Font("Ink Free",Font.BOLD,50));
		alternativas_certas.setBorder(BorderFactory.createBevelBorder(1));
		alternativas_certas.setHorizontalAlignment(JTextField.CENTER);
		alternativas_certas.setEditable(false);
		
		porcentagem.setBounds(575,350,200,100);
		porcentagem.setBackground(new Color(25,25,25));
		porcentagem.setForeground(new Color(25,255,0));
		porcentagem.setFont(new Font("Ink Free",Font.BOLD,50));
		porcentagem.setBorder(BorderFactory.createBevelBorder(1));
		porcentagem.setHorizontalAlignment(JTextField.CENTER);
		porcentagem.setEditable(false);
		
		frame.add(tempo_label);
		frame.add(segundos_passados);
		frame.add(resposta_labelA);
		frame.add(resposta_labelB);
		frame.add(resposta_labelC);
		frame.add(resposta_labelD);
		frame.add(botaoA);
		frame.add(botaoB);
		frame.add(botaoC);
		frame.add(botaoD);
		frame.add(areadetexto);
		frame.add(campodetexto);
		frame.setVisible(true);
                
		
		proximaQuestao();
	}
	public void proximaQuestao() {
		
		if(indice>=total_questoes) {
			resultados();
		}
		else {
			campodetexto.setText("Questão "+(indice+1));
			areadetexto.setText(questoes[indice]);                        
			resposta_labelA.setText(opcoes[indice][0]);
			resposta_labelB.setText(opcoes[indice][1]);
			resposta_labelC.setText(opcoes[indice][2]);
			resposta_labelD.setText(opcoes[indice][3]);
			tempo.start();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
			botaoA.setEnabled(false);
			botaoB.setEnabled(false);
			botaoC.setEnabled(false);
			botaoD.setEnabled(false);
			
			if(e.getSource()==botaoA) {
				resposta= 'A';
				if(resposta == respostas[indice]) {
					corretas_suposicoes++;
				}
			}
			if(e.getSource()==botaoB) {
				resposta= 'B';
				if(resposta == respostas[indice]) {
					corretas_suposicoes++;
				}
			}
			if(e.getSource()==botaoC) {
				resposta= 'C';
				if(resposta == respostas[indice]) {
					corretas_suposicoes++;
				}
			}
			if(e.getSource()==botaoD) {
				resposta= 'D';
				if(resposta == respostas[indice]) {
					corretas_suposicoes++;
				}
			}
			displayResposta();
	}
	public void displayResposta() {
		
		tempo.stop();
		
		botaoA.setEnabled(false);
		botaoB.setEnabled(false);
		botaoC.setEnabled(false);
		botaoD.setEnabled(false);
		
		if(respostas[indice] != 'A')
			resposta_labelA.setForeground(new Color(255,0,0));
		if(respostas[indice] != 'B')
			resposta_labelB.setForeground(new Color(255,0,0));
		if(respostas[indice] != 'C')
			resposta_labelC.setForeground(new Color(255,0,0));
		if(respostas[indice] != 'D')
			resposta_labelD.setForeground(new Color(255,0,0));
		
		Timer pause = new Timer(2000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				resposta_labelA.setForeground(new Color(0,0,255));
				resposta_labelB.setForeground(new Color(0,0,255));
				resposta_labelC.setForeground(new Color(0,0,255));
				resposta_labelD.setForeground(new Color(0,0,255));
				
				resposta = ' ';
				segundos=25;
				segundos_passados.setText(String.valueOf(segundos));
				botaoA.setEnabled(true);
				botaoB.setEnabled(true);
				botaoC.setEnabled(true);
				botaoD.setEnabled(true);
				indice++;
				proximaQuestao();
			}
		});
		pause.setRepeats(false);
		pause.start();
	}
	public void resultados(){
		
		botaoA.setEnabled(false);
		botaoB.setEnabled(false);
		botaoC.setEnabled(false);
		botaoD.setEnabled(false);
		
		resultado = (int)((corretas_suposicoes/(double)total_questoes)*100);
		
		campodetexto.setText("RESULTADOS!");
		areadetexto.setText("");
		resposta_labelA.setText("");
		resposta_labelB.setText("");
		resposta_labelC.setText("");
		resposta_labelD.setText("");
		
		alternativas_certas.setText("("+corretas_suposicoes+"/"+total_questoes+")");
		porcentagem.setText(resultado+"%");
		
		frame.add(alternativas_certas);
		frame.add(porcentagem);
		
	}
}