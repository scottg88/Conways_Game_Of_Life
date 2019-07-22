import java.util.ArrayList;

public class CellGrid {

    private  Cell[][] cellGrid;

    public CellGrid(int rows, int columns){
        this.cellGrid = new Cell[rows][columns];
        initialiseCellGrid();
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

    public void setCellToAlive(ArrayList<Coordinates> coords){
        for(int index = 0; index < coords.size(); index++){
            Coordinates currentCoords = coords.get(index);
            int xIndex = currentCoords.getX() - 1;
            int yIndex = currentCoords.getY() - 1;
            this.cellGrid[xIndex][yIndex].changeState();
        }
    }

    private void initialiseCellGrid(){
        for(int row = 0; row < this.cellGrid.length; row ++){
            for(int column = 0; column < this.cellGrid[row].length; column++){
                cellGrid[row][column] = new Cell();
            }
        }
    }





}

