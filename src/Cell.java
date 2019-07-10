public class Cell {

//    should cell have a default dead state, and a switch to bring it to life, or, should cell be passed a state when instantiated

    private boolean isDead;

    public Cell (){
        this.isDead = true;
    }

    public boolean getIsDead() {
        return isDead;
    }

    public void changeState(){
        if (isDead){
            isDead = false;
        }
        else {
            isDead = true;
        }

//        this.isDead = !(this.isDead);
    }



}
