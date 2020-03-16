package clonegame;

public class Score {
    private int diem = 0;
    private Bird bridscore = new Bird();
    private Object objectscore = new Object();
    public void congdiem(){
        if(bridscore.getX() > objectscore.getX1() +65){
            diem++;
        }
    }
}
