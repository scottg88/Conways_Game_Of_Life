public class Cell {

//    should cell have a default dead state, and a switch to bring it to life, or, should cell be passed a state when instantiated

    private boolean isAlive;

    public Cell (){
        this.isAlive = false;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void changeState(){
//        if (!this.isAlive){
//            this.isAlive = true;
//        }
//        else {
//            this.isAlive = false;
//        }

        this.isAlive = !(this.isAlive);
    }



}
