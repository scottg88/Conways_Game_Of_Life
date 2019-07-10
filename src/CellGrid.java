public class CellGrid {

//    should cell grid just be an grid, or should it be initialised with live and dead cells?

    private  Cell[][] cellGrid;
//    private Cell cell;


    public CellGrid(){
        int rows = 6;
        int columns = 6;
        this.cellGrid = new Cell[rows][columns];
        initialiseCellGrid();
//        this.cell = cell;
//        initialiseCellGrid();
    }

    public int getRows(){
        return this.cellGrid.length;
    }

    public int getColumns(){
        return this.cellGrid[0].length;
    }

    public Boolean getCellIsDead(int x, int y){
        return this.cellGrid[x][y].getIsDead();
    }

//    public Cell[][] getCellGrid() {
//        return cellGrid;
//    }

    private void initialiseCellGrid(){
        for(int row = 0; row < this.cellGrid.length; row ++){
            for(int column = 0; column < this.cellGrid[row].length; column++){
                cellGrid[row][column] = new Cell();
            }
        }
    }



}
