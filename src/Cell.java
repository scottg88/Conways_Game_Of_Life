public class Cell {

    private boolean isAlive;
    private String cell;

    public Cell (){
        this.isAlive = false;
        this.cell = initialiseCell();
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public String getCell() {
        return cell;
    }

    private String initialiseCell(){
        if(!this.isAlive){
            cell = "x";
        }
        else {
            cell = "o";
        }
        return cell;
    }




}
