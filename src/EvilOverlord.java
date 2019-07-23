import java.util.ArrayList;

public class EvilOverlord {

    private ArrayList<Boolean> neighbouringCellStates = new ArrayList<>();


    public void updateBoard(CellGrid cellGrid) {
        // loop over every cell

        for(int cellRow = 0; cellRow < cellGrid.getNumberOfRows(); cellRow++){
            for(int cellCol = 0; cellCol < cellGrid.getNumberOfColumns(); cellCol++){

                boolean currentState = cellGrid.getCellIsAlive(cellRow, cellCol);
               ArrayList<Boolean> neighbouringCells = getNeighbouringCellStates(cellGrid);
               int totalLiveNeighbours = getTotalLiveNeighbours(neighbouringCells);


                decideCellFate(cellGrid, currentState, totalLiveNeighbours, cellRow, cellCol);

            }
        }

    }

    private void decideCellFate(CellGrid cellGrid, boolean currentCellState, int totalLiveNeighbours, int x, int y){
            if(currentCellState && totalLiveNeighbours < 2){
                cellGrid.killCell(x, y);
            }
            if(currentCellState && totalLiveNeighbours >3 ){
                cellGrid.killCell(x, y);
            }
            if(currentCellState && totalLiveNeighbours == 2 || currentCellState && totalLiveNeighbours ==3){
                cellGrid.getCellIsAlive(x,y);
            }
            if (!currentCellState && totalLiveNeighbours == 3){
                cellGrid.resurrectCell(x,y);
            }
    }

    private int getTotalLiveNeighbours(ArrayList<Boolean> neighbouringCellStates){
        int totalLiveCells = 0;
        for(Boolean alive : neighbouringCellStates){
            if(alive){
              totalLiveCells += 1;
            }
        }
        return totalLiveCells;
    }

    private ArrayList<Boolean> getNeighbouringCellStates(CellGrid cellGrid){
        for(int cellRow = 0; cellRow < cellGrid.getNumberOfRows(); cellRow++) {
            for (int cellCol = 0; cellCol < cellGrid.getNumberOfColumns(); cellCol++) {
                neighbouringCellStates.add(getStateOfNeighbourAbove(cellGrid, cellRow, cellCol));
                neighbouringCellStates.add(getStateOfNeighbourToTheTopRightCorner(cellGrid, cellRow, cellCol));
                neighbouringCellStates.add(getStateOfNeighbourToTheRight(cellGrid, cellRow, cellCol));
                neighbouringCellStates.add(getStateOfNeighbourToTheBottomRightCorner(cellGrid, cellRow, cellCol));
                neighbouringCellStates.add(getStateOfNeighbourBelow(cellGrid, cellRow, cellCol));
                neighbouringCellStates.add(getStateOfNeighbourToTheBottomLeftCorner(cellGrid, cellRow, cellCol));
                neighbouringCellStates.add(getStateOfNeighbourToTheLeft(cellGrid, cellRow, cellCol));
                neighbouringCellStates.add(getStateOfNeighbourToTheTopLeftCorner(cellGrid, cellRow, cellCol));
            }
        }
        return neighbouringCellStates;
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
