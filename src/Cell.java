public class Cell {

    private boolean isAlive;

    public Cell(boolean isAlive){
        this.isAlive = isAlive;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public boolean setCellToAlive(){

        return this.isAlive = true;
    }

}
