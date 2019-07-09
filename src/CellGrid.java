public class CellGrid {

    private String[][] cellGrid;


    public CellGrid(){
        int rows = 6;
        int columns = 6;
        this.cellGrid = new String[rows][columns];
        initialiseCellGrid();
    }


    public String[][] getCellGrid() {
        return cellGrid;
    }

    private void initialiseCellGrid(){
            for(int row = 0; row < this.cellGrid.length; row ++){
                for(int column = 0; column < this.cellGrid[row].length; column++){
                    cellGrid[row][column] = "x";
                }
            }
    }

}
