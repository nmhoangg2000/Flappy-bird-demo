package clonegame;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameWindow extends JFrame {
    private GamePanel panel = new GamePanel();
    private Bird bird = new Bird();
    public GameWindow(){
        setSize(800,600);
        setVisible(true);   //nhìn thấy màn hình
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // tắt hẳn màn
        setLocation(400,100);
        setTitle("Flappy Bird");
        setResizable(false);
        add(panel); //thêm đối tượng panel vào màn hình

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                bird.decreaseY();
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
//                super.mouseClicked(e);
                bird.decreaseY();
            }
        });
    }

    public static void main(String[] args){
        GameWindow window = new GameWindow();
    }
}
