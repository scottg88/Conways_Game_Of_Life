public class CellGrid {

//    should cell grid just be a grid, or should it be initialised with live and dead cells?

    private String[][] cellGrid;
    private Cell cell;


    public CellGrid(Cell cell){
        int rows = 6;
        int columns = 6;
        this.cellGrid = new String[rows][columns];
        this.cell = cell;
        initialiseCellGrid();
    }


    public String[][] getCellGrid() {
        return cellGrid;
    }

    private void initialiseCellGrid(){
            for(int row = 0; row < this.cellGrid.length; row ++){
                for(int column = 0; column < this.cellGrid[row].length; column++){
                    cellGrid[row][column] = ;
                }
            }
    }

}
