package com.test.gameWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.test.constants.GameConstants.*;

public class GamePanel extends JPanel implements ActionListener {


    private float rectX, rectY ;
    private int xDirection, yDirection;
    private int rectWidth , rectHeight;
    private Timer timer;

    public GamePanel() {
        setPreferredSize(new Dimension(GAME_SCREEN_WIDTH, GAME_SCREEN_HEIGHT));
        rectHeight = 50;
        rectWidth = 50;
        xDirection = 1;
        yDirection = 1;
        Timer timer = new Timer(5, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect((int) rectX, (int) rectY, rectWidth, rectHeight);


        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if( rectX < 0 || (rectX + rectWidth) > GAME_SCREEN_WIDTH) {
            xDirection *= -1;
        }

        if( rectY < 0 || (rectY + rectHeight) > GAME_SCREEN_HEIGHT) {
            yDirection *= -1;
        }
        rectX+=xDirection;
        rectY+=yDirection;

        repaint();
    }
}
