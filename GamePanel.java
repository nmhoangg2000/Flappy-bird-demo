package clonegame;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    private Bird bird = new Bird();
    private Object object = new Object();
    private Check check = new Check();
    Thread threadpanel;
    private Score score = new Score();

    public GamePanel(){
        Thread threadpanel = new Thread(this);
        threadpanel.start();


    }
    public void paint(Graphics g){
        g.setColor(Color.cyan);
        g.fillRect(0, 0,getWidth(),getHeight());
        object.paint(g);
        g.setColor(Color.GREEN);
        g.fillRect(0,400,getWidth(),getHeight());
        g.setColor(Color.ORANGE);
        g.fillRect(0,410,getWidth(),getHeight());
        bird.paint(g);

    }

    @Override
    public void run() {
        //vòng lặp k bap giờ dừng
        while (true){
            repaint(); //gọi lại hàm paint
            object.giamX();//gọi lại phương thức giamX của class object
            try {
                Thread.sleep(5); //chuong trinh dung lai 5 mm/s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            object.lapX();//goi den phuong thuc .. của class object

            bird.increaseY();

            if(check.die()==true){
                threadpanel.stop();
            }
            score.congdiem();
        }
    }
}
