import java.util.ArrayList;

public class CellGrid {

//    should cell grid just be an grid, or should it be initialised with live and dead cells?

/*
TODO: 1. go back to constructor taking two separate values for row and col
2. work out how to pass the two separate values from the user input
 */

    private  Cell[][] cellGrid;
    private int rows;
    private int columns;


    public CellGrid(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
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


    public void setCellToAlive(ArrayList<Coordinates> coords){
        int[] coordinates = {};
        for(int index = 0; index < coords.size(); index++){
           coordinates = coords.get(index).getCoordinate();
        }
        this.cellGrid[coordinates[0]-1][coordinates[1]-1].changeState();
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
