package br.com.judev.ponggame;

import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle{
    Random random;
    int xVelocity;
    int yVelocity;

    Ball(int x, int y, int width, int height){
      super(x,y,width,height);
      random = new Random();
      int randomXDirection = random.nextInt(2);
        if(randomXDirection == 0)
            randomXDirection--;
    }
    public void setXDirection(int xDirection){


    }
    public void setYDirection(int yDirection){

    }
    public void move(){

    }
    public void draw(Graphics g){

    }

}
