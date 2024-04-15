package br.com.judev.ponggame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Paddle extends Rectangle {

    int id; // Identificador do paddle
    int yVelocity; // Velocidade de movimento do paddle
    int speed = 10; // Velocidade padrão do paddle

    // Construtor da classe Paddle
    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT); // Inicializa o Rectangle com posição e tamanho
        this.id = id; // Define o identificador do paddle
    }

    // Método chamado quando uma tecla é pressionada
    public void keyPressed(KeyEvent e) {
        switch (id) {
            case 1:
                // Se a tecla pressionada for W, move o paddle para cima
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(-speed); // Define a direção para cima
                    move(); // Move o paddle
                }
                // Se a tecla pressionada for S, move o paddle para baixo
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(speed); // Define a direção para baixo
                    move(); // Move o paddle
                }
                break;
            case 2:
                // Se a tecla pressionada for UP, move o paddle para cima
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(-speed); // Define a direção para cima
                    move(); // Move o paddle
                }
                // Se a tecla pressionada for DOWN, move o paddle para baixo
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(speed); // Define a direção para baixo
                    move(); // Move o paddle
                }
                break;
        }
    }

    // Método chamado quando uma tecla é solta
    public void keyReleased(KeyEvent e) {
        switch (id) {
            case 1:
                // Se a tecla solta for W ou S, para o movimento vertical do paddle
                if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(0); // Define a velocidade vertical como 0
                    move(); // Move o paddle
                }
                break;
            case 2:
                // Se a tecla solta for UP ou DOWN, para o movimento vertical do paddle
                if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(0); // Define a velocidade vertical como 0
                    move(); // Move o paddle
                }
                break;
        }
    }

    // Define a direção vertical do paddle
    public void setYDirection(int yDirection) {
        yVelocity = yDirection; // Define a velocidade vertical do paddle
    }

    // Move o paddle de acordo com a velocidade definida
    public void move() {
        y += yVelocity; // Move o paddle verticalmente
    }

    // Desenha o paddle na tela
    public void draw(Graphics g) {
        // Define a cor do paddle com base no seu identificador
        if (id == 1)
            g.setColor(Color.blue); // Paddle do jogador 1 (azul)
        else
            g.setColor(Color.red); // Paddle do jogador 2 (vermelho)
        // Desenha o paddle como um retângulo preenchido
        g.fillRect(x, y, width, height);
    }
}
