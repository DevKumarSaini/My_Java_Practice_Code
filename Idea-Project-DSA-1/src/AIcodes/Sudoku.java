package AIcodes;//Make complex Sudoku game in Java with code with advance gui.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sudoku extends JFrame implements ActionListener {
    private JTextField[][] tfCells = new JTextField[9][9];
    private int[][] puzzle =
            {{5, 3, 0, 0, 7, 0, 0, 0, 0},
                    {6, 0, 0, 1, 9, 5, 0, 0, 0},
                    {0, 9, 8, 0, 0, 0, 0, 6, 0},
                    {8, 0, 0, 0, 6, 0, 0, 0, 3},
                    {4, 0, 0, 8, 0, 3, 0, 0, 1},
                    {7, 0, 0, 0, 2, 0, 0, 0, 6},
                    {0, 6, 0, 0, 0, 0, 2, 8, 0},
                    {0, 0, 0, 4, 1, 9, 0, 0, 5},
                    {0, 0, 0, 0, 8, 0, 0, 7, 9}};

    public Sudoku() {
        // set frame properties
        super("Sudoku");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new GridLayout(9, 9));

        // create 9x9 text fields and add to frame
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                tfCells[row][col] = new JTextField();
                add(tfCells[row][col]);
            }
        }

        // set the initial values from the puzzle
        setValues();

        // create menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // create menu
        JMenu menu = new JMenu("Game");
        menuBar.add(menu);

        // create menu items
        JMenuItem miNew = new JMenuItem("New");
        JMenuItem miExit = new JMenuItem("Exit");

        // add menu items to menu
        menu.add(miNew);
        menu.addSeparator();
        menu.add(miExit);

        // add action listener
        miNew.addActionListener(this);
        miExit.addActionListener(this);

        // set frame visible
        setVisible(true);
    }

    // set the initial values from the puzzle
    private void setValues() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                tfCells[row][col].setText(puzzle[row][col] == 0 ? "" : String.valueOf(puzzle[row][col]));
            }
        }
    }

    // check if the puzzle is solved
    private boolean isSolved() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (puzzle[row][col] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // check if the value is valid
    private boolean isValid(int row, int col, int value) {
        // check if the value is already used in the row
        for (int c = 0; c < 9; c++) {
            if (puzzle[row][c] == value) {
                return false;
            }
        }

        // check if the value is already used in the column
        for (int r = 0; r < 9; r++) {
            if (puzzle[r][col] == value) {
                return false;
            }
        }

        // check if the value is already used in the 3x3 box
        int boxRow = row - row % 3;
        int boxCol = col - col % 3;

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (puzzle[boxRow + r][boxCol + c] == value) {
                    return false;
                }
            }
        }

        // all checks passed, the value is valid
        return true;
    }

    // solve the puzzle
    private boolean solve() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                // check if cell is empty
                if (puzzle[row][col] == 0) {
                    // try possible numbers
                    for (int value = 1; value <= 9; value++) {
                        // check if valid
                        if (isValid(row, col, value)) {
                            // update puzzle
                            puzzle[row][col] = value;

                            // update text field
                            tfCells[row][col].setText(String.valueOf(value));

                            // solve remaining part of the puzzle
                            if (solve()) {
                                return true;
                            } else {
                                // backtrack
                                puzzle[row][col] = 0;
                            }
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    // action performed
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("New")) {
            // clear text fields
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    tfCells[row][col].setText("");
                }
            }

            // clear puzzle
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    puzzle[row][col] = 0;
                }
            }
        } else if (cmd.equals("Exit")) {
            System.exit(0);
        }
    }

    // main method
    public static void main(String[] args) {
        new Sudoku();
    }
}