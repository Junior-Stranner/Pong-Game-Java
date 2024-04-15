package br.com.judev.ponggame;

import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle {
    Random random; // Objeto para gerar números aleatórios
    int xVelocity; // Velocidade na direção horizontal
    int yVelocity; // Velocidade na direção vertical
    int initialSpeed = 2;

    // Construtor da bola
    Ball(int x, int y, int width, int height) {
        super(x, y, width, height); // Inicializa a bola com posição e tamanho
        random = new Random(); // Inicializa o gerador de números aleatórios

        // Define uma direção aleatória para a velocidade horizontal (esquerda ou direita)
        int randomXDirection = random.nextInt(2);
        if (randomXDirection == 0)
            randomXDirection--; // Se o resultado for 0, define a direção para a esquerda (-1)
        // Define a direção horizontal multiplicada pela velocidade inicial
        setXDirection(randomXDirection * initialSpeed);

        // Define uma direção aleatória para a velocidade vertical (cima ou baixo)
        int randomYDirection = random.nextInt(2);
        if (randomYDirection == 0)
            randomYDirection--; // Se o resultado for 0, define a direção para cima (-1)
        // Define a direção vertical multiplicada pela velocidade inicial
        setYDirection(randomYDirection * initialSpeed);
    }


    // Define a direção horizontal da bola
    public void setXDirection(int randomXDirection) {
        xVelocity = randomXDirection; // Define a velocidade horizontal
    }

    // Define a direção vertical da bola
    public void setYDirection(int randomYDirection) {
        yVelocity = randomYDirection; // Define a velocidade vertical
    }

    // Move a bola de acordo com as velocidades horizontal e vertical
    public void move() {
        x += xVelocity; // Move na direção horizontal
        y += yVelocity; // Move na direção vertical
    }

    // Desenha a bola na tela
    public void draw(Graphics g) {
        g.setColor(Color.white); // Define a cor da bola como branco
        g.setFont(new Font("Consolas",Font.PLAIN,60)); // Desenha a bola como um círculo preenchido
    }
}
