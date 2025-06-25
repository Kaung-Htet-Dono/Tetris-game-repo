package com.test.gameWindow;

import javax.swing.*;

public class GameFrame {

    private JFrame frame;

    public GameFrame(GamePanel gamePanel) {
        JFrame frame = new JFrame();
        frame.setTitle("Tetris Game");
        frame.add(gamePanel);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
