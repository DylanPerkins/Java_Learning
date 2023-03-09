import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuessingGame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTextField userGuessField;
	private JLabel outputLabel;
	private int theNumber;
	
	public void checkGuess() {
		String guessText = userGuessField.getText();
		String message = "";
		int guess = Integer.parseInt(guessText);
		
		if (guess < theNumber)
			message = guess + " is too low! Please try again.";
		else if (guess > theNumber)
			message = guess + " is too high! Please try again.";
		else
			message = guess + " is correct! You've won!";
		outputLabel.setText(message);
	}
	
	public void newGame() {
		theNumber = (int)(Math.random() * 100 + 1);
	}
	
	public GuessingGame() {
		setTitle("Dylan's Hi-Lo Guessing Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel titleLabel = new JLabel("Dylan's Hi-Lo Guessing Game");
		titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(0, 38, 434, 20);
		getContentPane().add(titleLabel);
		
		JLabel makeGuessLabel = new JLabel("Guess a number between 1 and 100:");
		makeGuessLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		makeGuessLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		makeGuessLabel.setBounds(33, 96, 214, 14);
		getContentPane().add(makeGuessLabel);
		
		userGuessField = new JTextField();
		userGuessField.setHorizontalAlignment(SwingConstants.LEFT);
		userGuessField.setBounds(257, 94, 120, 20);
		getContentPane().add(userGuessField);
		userGuessField.setColumns(10);
		
		JButton guessButton = new JButton("Guess!");
		guessButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		guessButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		guessButton.setBounds(165, 148, 90, 23);
		getContentPane().add(guessButton);
		
		outputLabel = new JLabel("Enter a number above, then click \"Guess!\"");
		outputLabel.setHorizontalAlignment(SwingConstants.CENTER);
		outputLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		outputLabel.setBounds(89, 209, 242, 14);
		getContentPane().add(outputLabel);
	}

	public static void main(String[] args) {
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(450,300));
		theGame.setVisible(true);
	}
}
