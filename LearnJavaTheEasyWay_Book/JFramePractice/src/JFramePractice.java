import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFramePractice extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final JLabel directionsLabel = new JLabel("Enter your name in the box:");
    private static final JLabel outputLabel = new JLabel();
    private static final JTextField nameBox = new JTextField(25);
    private static final JButton nameButton = new JButton("Click me!");

    public static void main(String[] args) {

        JFramePractice window = new JFramePractice();
        window.setSize(500, 500);
        window.setVisible(true);
        window.setTitle("Dylan's Frame!");

        // window.setLayout(new FlowLayout());
        window.setLayout(new GridLayout(3, 2)); // Rows, Columns

        window.getContentPane().setBackground(new Color(200, 0, 200));
        nameBox.setForeground(new Color(100, 0, 100));

        directionsLabel.setFont(new Font("Calibre", Font.ITALIC, 18));

        window.getContentPane().add(directionsLabel);
        window.getContentPane().add(nameBox);
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(nameButton);
        window.getContentPane().add(outputLabel);

        // Add an action listener
        // Function that handles the event
        nameButton.addActionListener(JFramePractice::buttonClick);

        // add swing objects here
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void buttonClick(ActionEvent e) {
        // Put code in here to respond to the button
        // JOptionPane.showMessageDialog(null, "Button Works!", 
        // "Hi!", JOptionPane.INFORMATION_MESSAGE);

        /*
         * 1. Strip from the screen objects
         * 2. Do something with the dat from the screen
         * 3. Output the something
         */


        String yourName = nameBox.getText();
        String outputMessage = "Hello there, " + yourName;
        outputLabel.setText(outputMessage);
    }

}
