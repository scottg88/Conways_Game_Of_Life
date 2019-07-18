import java.util.ArrayList;

public class CellGrid {

    private  Cell[][] cellGrid;

    public CellGrid(int rows, int columns){
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

    public void updateGrid() {
        // loop over every cell

            for(int cellRow = 0; cellRow < this.cellGrid.length; cellRow++){
                for(int cellCol = 0; cellCol < this.cellGrid[cellRow].length; cellCol++){

//                   checkCellToTheLeft(cellRow, cellCol);
//                   checkCellToTheRight(cellRow, cellCol);
//                   checkCellAbove(cellRow, cellCol);
//                    checkCellBelow(cellRow, cellCol);

                }
            }

    }

    private void checkCellToTheRight(int cellRow, int cellCol){
        if (cellCol < cellGrid[cellRow].length-1){
            System.out.println(getCellIsAlive(cellRow, cellCol+1));
        }
        if (cellCol == cellGrid[cellRow].length-1){
            System.out.println(getCellIsAlive(cellRow,0));
        }
    }

    private void checkCellToTheLeft(int cellRow, int cellCol){
        if (cellCol > 0){
            System.out.println(getCellIsAlive(cellRow, cellCol-1));
        }
        if (cellCol == 0){
            System.out.println(getCellIsAlive(cellRow,cellGrid[cellRow].length-1));
        }
    }

    private void checkCellAbove(int cellRow, int cellCol){
        if(cellRow > 0){
            System.out.println(getCellIsAlive(cellRow-1, cellCol));
        }
        if(cellRow == 0){
            System.out.println(getCellIsAlive(cellGrid.length-1, cellCol));
        }
    }

    private void checkCellBelow(int cellRow, int cellCol){
        if(cellRow < cellGrid[cellRow].length-1){
            System.out.println(getCellIsAlive(cellRow+1, cellCol));
        }
        if(cellRow == cellGrid[cellRow].length-1){
            System.out.println(getCellIsAlive(0, cellCol));
        }
    }

}

