package clonegame;

import javax.swing.*;
import java.awt.*;

public class Bird extends JPanel {
    private static int y=200;
    private static int x =100;
    //lấy gtri y
    public int getY(){

        return y;
    }
    //lấy gtri X
    public int getX(){
        return x;
    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(x,y,45,45);
    }
    //con chim rơi xuống
    public void increaseY(){
        y++;
    }
    //con chim bay lên
    public void decreaseY(){
        y-=30;
    }
}
