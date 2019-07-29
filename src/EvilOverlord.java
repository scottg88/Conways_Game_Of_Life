import java.util.ArrayList;

public class EvilOverlord {


    public CellGrid updateCells(CellGrid cellGrid){
        ArrayList<Coordinates> nextGenCells = decideCellFate(cellGrid);
        cellGrid = new CellGrid(cellGrid.getNumberOfRows(), cellGrid.getNumberOfColumns());
        cellGrid.setCellState(nextGenCells);
        return cellGrid;
    }

    private ArrayList<Coordinates> decideCellFate(CellGrid cellGrid){
        ArrayList<Coordinates> nextGenerationOfLiveCells = new ArrayList<>();
        for(int cellRow = 0; cellRow < cellGrid.getNumberOfRows()-1; cellRow++) {
            for (int cellCol = 0; cellCol < cellGrid.getNumberOfColumns()-1; cellCol++) {
                boolean cellIsAlive = cellGrid.getCellIsAlive(cellRow, cellCol);

                int numberOfLiveNeighbours = determineNumberOfLiveNeighbours(cellGrid, cellRow, cellCol);

                if (!cellIsAlive && numberOfLiveNeighbours == 3) {
                    nextGenerationOfLiveCells.add(new Coordinates(cellRow+1, cellCol+1));
                    continue;
                }
                if((cellIsAlive && numberOfLiveNeighbours == 2) || (cellIsAlive && numberOfLiveNeighbours == 3) ) {
                    nextGenerationOfLiveCells.add(new Coordinates(cellRow+1, cellCol+1));
                }
            }
        }
        return nextGenerationOfLiveCells;
    }

    private int determineNumberOfLiveNeighbours(CellGrid cellGrid, int cellRow, int cellCol) {
        ArrayList<Boolean> neighbourStates = new ArrayList<>();
        int totalLiveNeighbours = 0;
                neighbourStates.add(getStateOfNeighbourAbove(cellGrid, cellRow, cellCol));
                neighbourStates.add(getStateOfNeighbourToTheTopRightCorner(cellGrid, cellRow, cellCol));
                neighbourStates.add(getStateOfNeighbourToTheRight(cellGrid, cellRow, cellCol));
                neighbourStates.add(getStateOfNeighbourToTheBottomRightCorner(cellGrid, cellRow, cellCol));
                neighbourStates.add(getStateOfNeighbourBelow(cellGrid, cellRow, cellCol));
                neighbourStates.add(getStateOfNeighbourToTheBottomLeftCorner(cellGrid, cellRow, cellCol));
                neighbourStates.add(getStateOfNeighbourToTheLeft(cellGrid, cellRow, cellCol));
                neighbourStates.add(getStateOfNeighbourToTheTopLeftCorner(cellGrid, cellRow, cellCol));

        for(Boolean state : neighbourStates){
            if(state){
                totalLiveNeighbours += 1;
            }
        }
        return totalLiveNeighbours;
    }

    private boolean getStateOfNeighbourAbove(CellGrid cellGrid, int cellRow, int cellCol){
        if(cellRow > 0){
           return cellGrid.getCellIsAlive(cellRow-1, cellCol);
        }
        return cellGrid.getCellIsAlive(cellGrid.getNumberOfRows()-1, cellCol);
    }

    private boolean getStateOfNeighbourToTheTopRightCorner(CellGrid cellGrid, int cellRow, int cellCol){
//        top LH corner and top edge
        if((cellRow == 0) && (cellCol < cellGrid.getNumberOfColumns()-1)){
            return cellGrid.getCellIsAlive(cellGrid.getNumberOfRows()-1, cellCol+1);
        }
//        top RH corner
        if((cellRow == 0) && (cellCol == cellGrid.getNumberOfColumns()-1)){
            return cellGrid.getCellIsAlive(cellGrid.getNumberOfRows()-1, 0);
        }
//        RH edge and bottom RH corner
        if((cellRow > 0) && (cellCol == cellGrid.getNumberOfColumns()-1)){
            return cellGrid.getCellIsAlive(cellRow -1, 0);
        }
        return cellGrid.getCellIsAlive(cellRow-1, cellCol +1);
    }

    private boolean getStateOfNeighbourToTheRight(CellGrid cellGrid, int cellRow, int cellCol){

        if (cellCol < cellGrid.getNumberOfColumns()-1){
            return cellGrid.getCellIsAlive(cellRow, cellCol+1);
        }

        return cellGrid.getCellIsAlive(cellRow,0);

    }

    private boolean getStateOfNeighbourToTheBottomRightCorner(CellGrid cellGrid, int cellRow, int cellCol){
//        top RH corner and RH edge
        if((cellRow < cellGrid.getNumberOfRows()-1) && (cellCol == cellGrid.getNumberOfColumns()-1)){
            return cellGrid.getCellIsAlive(cellRow + 1, 0);
        }
//        bottom RH corner
        if((cellRow == cellGrid.getNumberOfRows()-1) && (cellCol == cellGrid.getNumberOfColumns()-1)){
            return cellGrid.getCellIsAlive(0, 0);
        }
//        bottom LH corner and bottom edge
        if((cellRow == cellGrid.getNumberOfRows()-1) && (cellCol < cellGrid.getNumberOfColumns()-1)){
            return cellGrid.getCellIsAlive(0, cellCol + 1);
        }
        return cellGrid.getCellIsAlive(cellRow +1, cellCol +1);
    }

    private boolean getStateOfNeighbourBelow(CellGrid cellGrid, int cellRow, int cellCol){
        if(cellRow < cellGrid.getNumberOfColumns()-1){
            return cellGrid.getCellIsAlive(cellRow+1, cellCol);
        }
            return cellGrid.getCellIsAlive(0, cellCol);
    }

    private boolean getStateOfNeighbourToTheBottomLeftCorner(CellGrid cellGrid, int cellRow, int cellCol){
        if((cellRow < cellGrid.getNumberOfRows()-1) && (cellCol == 0)){
            return cellGrid.getCellIsAlive(cellRow + 1, cellGrid.getNumberOfColumns()-1);
        }
        if((cellRow == cellGrid.getNumberOfRows()-1) && (cellCol == 0)){
            return cellGrid.getCellIsAlive(0, cellGrid.getNumberOfColumns()-1);
        }
        if((cellRow == cellGrid.getNumberOfRows()-1) && (cellCol > 0)){
            return cellGrid.getCellIsAlive(0, cellCol -1);
        }
        return cellGrid.getCellIsAlive(cellRow + 1, cellCol -1);
    }

    private boolean getStateOfNeighbourToTheLeft(CellGrid cellGrid, int cellRow, int cellCol){
        if (cellCol > 0){
            return cellGrid.getCellIsAlive(cellRow, cellCol-1);
        }
            return cellGrid.getCellIsAlive(cellRow, cellGrid.getNumberOfColumns()-1);
    }

    private boolean getStateOfNeighbourToTheTopLeftCorner(CellGrid cellGrid, int cellRow, int cellCol) {
        //        top RH corner and top edge
        if ((cellRow == 0) && (cellCol > 0)) {
            return cellGrid.getCellIsAlive(cellGrid.getNumberOfRows()-1, cellCol - 1);
        }
        //        top LH corner
        if ((cellRow == 0) && (cellCol == 0)) {
            return cellGrid.getCellIsAlive(cellGrid.getNumberOfRows()-1, cellGrid.getNumberOfColumns()-1);
        }
        //        LH edge and bottom LH corner
        if ((cellRow > 0) && (cellCol == 0)) {
            return cellGrid.getCellIsAlive(cellRow - 1, cellGrid.getNumberOfColumns()-1);
        }
        return cellGrid.getCellIsAlive(cellRow - 1, cellCol - 1);
    }


}
