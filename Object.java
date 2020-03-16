package clonegame;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Object extends JPanel {
    private static int x1 = 500,x2=x1+140,x3=x2+140,x4=x3+140;
    private static int h1,h2,h3,h4;
    private static boolean bl1 =false;
    private static boolean bl2 =false;
    private static boolean bl3 =false;
    private static boolean bl4 =false;

    public static int getH1() {
        return h1;
    }

    public static int getH2() {
        return h2;
    }

    public static int getH3() {
        return h3;
    }

    public static int getH4() {
        return h4;
    }

    public static int getX1() {
            return x1;
    }

    public static int getX2() {
        return x2;
    }

    public static int getX3() {
        return x3;
    }

    public static int getX4() {
        return x4;
    }

    public void randomly(){
        Random rd = new Random();

        if(bl1==false) {
            h1 = rd.nextInt(200); //h1 bằng 1 số ngẫu nhiên từ 0 đến 199
            bl1 = true;
        }
        if(bl2==false){
            h2 = rd.nextInt(200); //h1 bằng 1 số ngẫu nhiên từ 0 đến 199
            bl2 = true;
        }
        if(bl3==false) {
            h3 = rd.nextInt(200); //h1 bằng 1 số ngẫu nhiên từ 0 đến 199
            bl3 = true;
        }
        if(bl4==false) {
            h4 = rd.nextInt(200); //h1 bằng 1 số ngẫu nhiên từ 0 đến 199
            bl4 = true;
        }
    }


    public void paint(Graphics g){
        randomly();

        g.setColor(Color.GREEN);
        g.fillRect(x1,0,65,h1);
        g.setColor(Color.GREEN);
        g.fillRect(x1,h1+100,65,500);

        g.setColor(Color.GREEN);
        g.fillRect(x2,0,65,h2);
        g.setColor(Color.GREEN);
        g.fillRect(x2,h2+100,65,500);

        g.setColor(Color.GREEN);
        g.fillRect(x3,0,65,h3);
        g.setColor(Color.GREEN);
        g.fillRect(x3,h3+100,65,500);

        g.setColor(Color.GREEN);
        g.fillRect(x4,0,65,h4);
        g.setColor(Color.GREEN);
        g.fillRect(x4,h4+100,65,500);
    }

    public void giamX(){
        x1--;
        x2--;
        x3--;
        x4--;
    }
    public void lapX(){
        if(x1==-65){
            x1 = 500;
            bl1 = false;
        }
        if(x2==-65){
            x2 = 500;
            bl2 = false;
        }
        if(x3==-65){
            x3 = 500;
            bl3=false;
        }
        if(x4==-65){
            x4 = 500;
            bl4=false;
        }
    }
}
