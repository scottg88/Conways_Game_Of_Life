import java.util.ArrayList;

public class CellGrid {

    private  Cell[][] cellGrid;
    private boolean cellState;

    public CellGrid(int rows, int columns){
        this.cellGrid = new Cell[rows][columns];
        ArrayList<Coordinates> coordinates = new ArrayList<>();
        this.cellState = setCellState(coordinates);
        initialiseNewCellGrid();
    }

    public int getNumberOfRows(){

        return this.cellGrid.length;
    }

    public int getNumberOfColumns(){

        return this.cellGrid[0].length;
    }

    public Boolean getCellIsAlive(int x, int y){
        return this.cellGrid[x][y].getIsAlive();
    }

    public boolean setCellState(ArrayList<Coordinates> coordinates){
        boolean cellState = false;
        for(int index = 0; index < coordinates.size(); index++){
            Coordinates currentCoords = coordinates.get(index);
            int xIndex = currentCoords.getX() - 1;
            int yIndex = currentCoords.getY() - 1;
            cellState = this.cellGrid[xIndex][yIndex].setCellToAlive();
        }
        return cellState;
    }


    private void initialiseNewCellGrid(){
        for(int row = 0; row < this.cellGrid.length; row ++){
            for(int column = 0; column < this.cellGrid[row].length; column++){
                cellGrid[row][column] = new Cell(this.cellState);
            }
        }
    }





}

