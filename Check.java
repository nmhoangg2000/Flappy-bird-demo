package clonegame;

public class Check {
    private Bird birdcheck = new Bird();
    private Object objectcheck = new Object();
    public boolean die(){

        //khi chim chạm đất
        if(birdcheck.getY()+45 >= 400){
            return true;
        }
        //khi chạm cột
        if(birdcheck.getY()<=objectcheck.getH1()&&(((birdcheck.getX()+45)>=objectcheck.getX1()))&& birdcheck.getX()<=(objectcheck.getX1()+65)){
            return true;
        }
        if((birdcheck.getY()+45) >= (objectcheck.getH1()+100)&&((birdcheck.getX()+45)>= objectcheck.getX1() && birdcheck.getX()<=(objectcheck.getX1()+65))){
            return true;
        }

        if(birdcheck.getY()<=objectcheck.getH2()&&(((birdcheck.getX()+45)>=objectcheck.getX2()))&& birdcheck.getX()<=(objectcheck.getX2()+65)){
            return true;
        }
        if((birdcheck.getY()+45) >= (objectcheck.getH2()+100)&&((birdcheck.getX()+45)>= objectcheck.getX2() && birdcheck.getX()<=(objectcheck.getX2()+65))){
            return true;
        }
        if(birdcheck.getY()<=objectcheck.getH3()&&(((birdcheck.getX()+45)>=objectcheck.getX3()))&& birdcheck.getX()<=(objectcheck.getX3()+65)){
            return true;
        }
        if((birdcheck.getY()+45) >= (objectcheck.getH3()+100)&&((birdcheck.getX()+45)>= objectcheck.getX3() && birdcheck.getX()<=(objectcheck.getX3()+65))){
            return true;
        }
        if(birdcheck.getY()<=objectcheck.getH4()&&(((birdcheck.getX()+45)>=objectcheck.getX4()))&& birdcheck.getX()<=(objectcheck.getX4()+65)){
            return true;
        }
        if((birdcheck.getY()+45) >= (objectcheck.getH4()+100)&&((birdcheck.getX()+45)>= objectcheck.getX4() && birdcheck.getX()<=(objectcheck.getX4()+65))){
            return true;
        }


        return false;


    }
}
