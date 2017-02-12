package Board;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author Oliver Chang created on 2/11/17
 *
 * @version 1 
 * 
 * This the board class. It generates the game board 8x8 tile board.
 */
public class Board {
	
	//JFrame where main game will take place
	private JFrame board;
	private JPanel boardPanel;
	private GridLayout layout;
	//For now use JButton to see if it works, then replace with Tiles
	private JButton[][]boardLayout = new JButton[8][8];
	
	public Board(){
		board = new JFrame("Ollie's Chess");
		
		//layout = new GridLayout(8,8);
		
		boardPanel = new JPanel();
		boardPanel.setLayout(null);
		
		for(int i = 0; i < boardLayout.length; i++){
			for(int k = 0; i < boardLayout[0].length; i++){
				boardLayout[i][k] = new JButton();
				boardLayout[i][k].setSize(50,50);
				board.add(boardLayout[i][k]);
			}
		}
		
		board.setVisible(true);
		board.setSize(800, 800);
		board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
