package AIcodes;//Make complex Sudoku game in Java with code with advance gui using button as a input with rich feature in option and also have an option of multiplayer gaming.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sudukoo extends JFrame implements ActionListener {
    private JButton[][] buttons;
    private int[][] board;
    private int[][] solution;
    private int size;
    private boolean multiplayer;
    private int player;
    private int turn;
    private int score;
    private JLabel scoreLabel;
    private JLabel turnLabel;
    private JLabel playerLabel;
    private JButton resetButton;
    private JButton checkButton;
    private JButton multiplayerButton;
    private JButton singleplayerButton;
    private JButton quitButton;

    public Sudukoo(int size, boolean multiplayer) {
        this.size = size;
        this.multiplayer = multiplayer;
        this.player = 1;
        this.turn = 1;
        this.score = 0;
        this.board = new int[size][size];
        this.solution = new int[size][size];
        this.buttons = new JButton[size][size];
        this.scoreLabel = new JLabel("Score: " + this.score);
        this.turnLabel = new JLabel("Turn: " + this.turn);
        this.playerLabel = new JLabel("Player: " + this.player);
        this.resetButton = new JButton("Reset");
        this.checkButton = new JButton("Check");
        this.multiplayerButton = new JButton("Multiplayer");
        this.singleplayerButton = new JButton("Singleplayer");
        this.quitButton = new JButton("Quit");

        // Set up the frame
        this.setTitle("Sudoku");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // Set up the board
        JPanel boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(size, size));
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                JButton button = new JButton();
                button.addActionListener(this);
                boardPanel.add(button);
                buttons[i][j] = button;
            }
        }
        this.add(boardPanel, BorderLayout.CENTER);

        // Set up the control panel
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3, 3));
        controlPanel.add(scoreLabel);
        controlPanel.add(turnLabel);
        controlPanel.add(playerLabel);
        controlPanel.add(resetButton);
        controlPanel.add(checkButton);
        controlPanel.add(multiplayerButton);
        controlPanel.add(singleplayerButton);
        controlPanel.add(quitButton);
        this.add(controlPanel, BorderLayout.SOUTH);

        // Set up the action listeners
        resetButton.addActionListener(this);
        checkButton.addActionListener(this);
        multiplayerButton.addActionListener(this);
        singleplayerButton.addActionListener(this);
        quitButton.addActionListener(this);

        // Generate the board
        generateBoard();
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == resetButton) {
            resetGame();
        } else if (source == checkButton) {
            checkSolution();
        } else if (source == multiplayerButton) {
            setMultiplayer(true);
        } else if (source == singleplayerButton) {
            setMultiplayer(false);
        } else if (source == quitButton) {
            System.exit(0);
        } else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (source == buttons[i][j]) {
                        if (multiplayer) {
                            if (player == 1) {
                                board[i][j] = 1;
                                buttons[i][j].setText("X");
                                player = 2;
                                playerLabel.setText("Player: " + player);
                            } else {
                                board[i][j] = 2;
                                buttons[i][j].setText("O");
                                player = 1;
                                playerLabel.setText("Player: " + player);
                            }
                        } else {
                            board[i][j] = turn;
                            buttons[i][j].setText(String.valueOf(turn));
                            turn++;
                            turnLabel.setText("Turn: " + turn);
                        }
                    }
                }
            }
        }
    }

    private void generateBoard() {
        // Generate the board
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = 0;
                solution[i][j] = (int) (Math.random() * size + 1);
            }
        }
    }

    private void resetGame() {
        // Reset the board
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = 0;
                buttons[i][j].setText("");
            }
        }
        // Reset the score
        score = 0;
        scoreLabel.setText("Score: " + score);
        // Reset the turn
        turn = 1;
        turnLabel.setText("Turn: " + turn);
        // Reset the player
        player = 1;
        playerLabel.setText("Player: " + player);
    }

    private void checkSolution() {
        int correct = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == solution[i][j]) {
                    correct++;
                }
            }
        }
        score += correct;
        scoreLabel.setText("Score: " + score);
    }

    private void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
        if (multiplayer) {
            playerLabel.setText("Player: " + player);
        } else {
            turnLabel.setText("Turn: " + turn);
        }
    }

    public static void main(String[] args) {
        Sudukoo game = new Sudukoo(9, false);
        game.setVisible(true);
    }
}