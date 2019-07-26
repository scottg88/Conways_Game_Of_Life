public class Cell {

    private boolean isAlive;

    public Cell (){
        this.isAlive = false;
    }

    public boolean getIsAlive() {

        return isAlive;
    }

    public void setCellToAlive(){
        
        this.isAlive = true;
    }

}
