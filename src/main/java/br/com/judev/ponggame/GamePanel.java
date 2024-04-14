package br.com.judev.ponggame;

import javafx.scene.input.KeyEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.util.Random;

public class GamePanel extends JPanel implements Runnable{

    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int)(GAME_WIDTH * (0.5555));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH,GAME_HEIGHT);
    static final int BALL_DIAMETER = 20;
    static final int PADDLE_WIDTH = 25;
    static final int PADDLE_HEIGHT = 100;
    Thread gameThread;
    Image image;
    Graphics graphics;
    Random random;
    Paddle paddle;
    Paddle paddle2;
    Ball ball;
    Score score;

    GamePanel(){

    }

    public void newBall(){

    }

    public void newPaddles(){

    }
    public  void paint(Graphics g){

    }
    public void draw(Graphics g){

    }
    public void move(){

    }
    public void ccheckColission(){


    }
    public void run(){


    }
    public class AL extends KeyAdapter{
        public void keyPressed(KeyEvent e){

        }
        public void keyRealesed(KeyEvent e){

        }
    }


}
