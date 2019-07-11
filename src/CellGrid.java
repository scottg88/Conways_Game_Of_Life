import java.util.ArrayList;

public class CellGrid {

//    should cell grid just be an grid, or should it be initialised with live and dead cells?

    private  Cell[][] cellGrid;


    public CellGrid(ArrayList<Integer> dimensions){
        int rows = dimensions.get(0);
        int columns = dimensions.get(1);
        this.cellGrid = new Cell[rows][columns];
        initialiseCellGrid();
    }

    public int getRows(){
        return this.cellGrid.length;
    }

    public int getColumns(){
        return this.cellGrid[0].length;
    }

    public Boolean getCellIsAlive(int x, int y){
        return this.cellGrid[x][y].getIsAlive();
    }


    public void setCellToAlive(int x, int y){
        this.cellGrid[x][y].changeState();
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
