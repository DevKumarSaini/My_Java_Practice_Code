package AIcodes;//Make complex Sudoku game in Java with code with gui

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SudokuGame extends JFrame implements ActionListener {

    //Declare all the variables
    private JPanel panel;
    private JTextField[][] textFields;
    private JButton checkButton;
    private JLabel messageLabel;
    private int[][] board;

    public SudokuGame() {
        //Set the title of the window
        super("Sudoku Game");

        //Create the board
        board = new int[9][9];

        //Create the panel
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        //Create the text fields
        textFields = new JTextField[9][9];
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(9, 9));
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                textFields[row][col] = new JTextField();
                textFields[row][col].setHorizontalAlignment(JTextField.CENTER);
                textFields[row][col].setFont(new Font("SansSerif", Font.BOLD, 20));
                textFields[row][col].setPreferredSize(new Dimension(35, 35));
                textFields[row][col].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                textPanel.add(textFields[row][col]);
            }
        }

        //Create the check button
        checkButton = new JButton("Check");
        checkButton.addActionListener(this);

        //Create the message label
        messageLabel = new JLabel("Good luck!");
        messageLabel.setFont(new Font("SansSerif", Font.BOLD, 16));

        //Add the components to the panel
        panel.add(textPanel, BorderLayout.CENTER);
        panel.add(checkButton, BorderLayout.SOUTH);
        panel.add(messageLabel, BorderLayout.NORTH);

        //Add the panel to the frame
        add(panel);

        //Generate the puzzle
        generatePuzzle();

        //Set the size, location and visibility of the frame
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void generatePuzzle() {
        //Create a random number generator
        Random random = new Random();

        //Generate a random puzzle
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                board[row][col] = random.nextInt(9) + 1;
                textFields[row][col].setText(String.valueOf(board[row][col]));
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        //Check if the button was pressed
        if (e.getSource() == checkButton) {
            //Check if the puzzle is solved
            if (isSolved()) {
                messageLabel.setText("Congratulations! You solved the puzzle!");
            } else {
                messageLabel.setText("Sorry, that is not the correct solution.");
            }
        }
    }

    public boolean isSolved() {
        //Check if the puzzle is solved
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                //Get the value from the text field
                int value = Integer.parseInt(textFields[row][col].getText());

                //Check if the value is correct
                if (value != board[row][col]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        new SudokuGame();
    }

}