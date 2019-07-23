package de.ralfGraef.tictactoe;
import java.awt.BorderLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GameWindow extends JFrame {
	
	public GameWindow(int width, int height){
		
		setTitle("TicTacToe by Ralf Gräf");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(0, 0, width, height);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new BorderLayout());
		
		GamePanel gamePanel = new Gamepanel();
		getContentPane().add(gamePanel, BorderLayout.CENTER);
		
		setVisible(true);
	}
}
