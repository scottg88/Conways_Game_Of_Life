import java.util.ArrayList;

public class CellGrid {

    private  Cell[][] cellGrid;

    public CellGrid(int rows, int columns){
        this.cellGrid = new Cell[rows][columns];
        initialiseNewCellGrid();
    }

    private void initialiseNewCellGrid(){
        for(int row = 0; row < this.cellGrid.length; row ++){
            for(int column = 0; column < this.cellGrid[row].length; column++){
                cellGrid[row][column] = new Cell(false);
            }
        }
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

    public void setCellState(ArrayList<Coordinates> coordinates){
        for(int index = 0; index < coordinates.size(); index++){
            Coordinates currentCoords = coordinates.get(index);
            int xIndex = currentCoords.getX();
            int yIndex = currentCoords.getY();
            this.cellGrid[xIndex][yIndex].setCellToAlive();
        }
    }

}

