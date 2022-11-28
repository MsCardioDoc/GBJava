package JavaStart;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class Lesson6 extends JFrame {

    private static Lesson6 gameWindow;
    private static long lastFrameTime;
    private static Image background;
    private static Image gameOver;
    private static float gameOverLeft = 280;
    private static float gameOverTop = 120;
    private static Image drop;
    private static float dropLeft = 200;
    private static float dropTop = -100;
    private static float dropV = 200;
    private static float dropH = 0;
    private static int score;

    public static void main(String[] args) throws IOException {
        background = ImageIO.read(Lesson6.class.getResourceAsStream("/Images/background.png"));
        drop = ImageIO.read(Lesson6.class.getResourceAsStream("/Images/drop.png"));
        gameOver = ImageIO.read(Lesson6.class.getResourceAsStream("/Images/game_over.png"));

        gameWindow = new Lesson6();
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.setLocation(200, 100);
        gameWindow.setSize(906, 478);
        gameWindow.setResizable(false);

        lastFrameTime = System.nanoTime();

        GameField gameField = new GameField();
        gameField.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                float dropRight = dropLeft + drop.getWidth(null);
                float dropBottom = dropTop + drop.getHeight(null);
                boolean isDrop = x >= dropLeft && x <= dropRight && y >= dropTop && y <= dropBottom;
                boolean isRestart = dropTop >= gameWindow.getHeight()
                        && x >= gameOverLeft
                        && x <= (gameOverLeft + gameOver.getWidth(null))
                        && y >= gameOverTop
                        && y <= (gameOverTop + gameOver.getHeight(null));
                if (isDrop || isRestart) {
                    dropTop = -100;
                    dropLeft = (int) (Math.random() * (gameField.getWidth() - drop.getWidth(null)));
                    if (isDrop) {
                        dropV += 20;
                        score++;
                    }
                    gameWindow.setTitle("Score: " + score);
                }
            }
        });

        gameWindow.add(gameField);
        gameWindow.setVisible(true);

    }

    private static void onRepaint(Graphics g) {
        g.drawImage(background, 0, 0, null);

        long current_time = System.nanoTime();
        if (dropTop < gameWindow.getHeight()) {
            float delta_time = (current_time - lastFrameTime) * 0.000000001f;
            dropTop = dropTop + dropV * delta_time;
            dropLeft = dropLeft + dropH * delta_time;
            g.drawImage(drop, (int) dropLeft, (int) dropTop, null);
        } else {
            g.drawImage(gameOver, (int) gameOverLeft, (int) gameOverTop, null);
            dropV = 200;
            score = 0;
        }
        lastFrameTime = current_time;
    }

    private static class GameField extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            onRepaint(g);
            repaint();
        }
    }
}
