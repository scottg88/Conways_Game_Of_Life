import java.util.ArrayList;

public class EvilOverlord {


    public void determineHowManyNeighboursAreAlive(CellGrid cellGrid) {
        int totalLiveNeighbours = 0;
        for(int cellRow = 0; cellRow < cellGrid.getNumberOfRows(); cellRow++) {
            for (int cellCol = 0; cellCol < cellGrid.getNumberOfColumns(); cellCol++) {
               boolean above = getStateOfNeighbourAbove(cellGrid, cellRow, cellCol);
               boolean topRightCorner = getStateOfNeighbourToTheTopRightCorner(cellGrid, cellRow, cellCol);
               boolean right = getStateOfNeighbourToTheRight(cellGrid, cellRow, cellCol);
               boolean bottomRightCorner = getStateOfNeighbourToTheBottomRightCorner(cellGrid, cellRow, cellCol);
               boolean below = getStateOfNeighbourBelow(cellGrid, cellRow, cellCol);
               boolean bottomLeftCorner = getStateOfNeighbourToTheBottomLeftCorner(cellGrid, cellRow, cellCol);
               boolean left = getStateOfNeighbourToTheLeft(cellGrid, cellRow, cellCol);
               boolean topLeftCorner = getStateOfNeighbourToTheTopLeftCorner(cellGrid, cellRow, cellCol);

            }
        }
        decideCellFate(cellGrid, totalLiveNeighbours);
    }

    private void decideCellFate(CellGrid cellGrid, int totalLiveNeighbours){
        for(int cellRow = 0; cellRow < cellGrid.getNumberOfRows(); cellRow++) {
            for (int cellCol = 0; cellCol < cellGrid.getNumberOfColumns(); cellCol++) {
                if ((cellGrid.getCellIsAlive(cellRow, cellCol) && totalLiveNeighbours < 2) || (cellGrid.getCellIsAlive(cellRow, cellCol) && totalLiveNeighbours > 3)) {
                    cellGrid.killCell(cellRow, cellCol);
                }
                if (!cellGrid.getCellIsAlive(cellRow, cellCol) && totalLiveNeighbours == 3) {
                    cellGrid.resurrectCell(cellRow, cellCol);
                }
                if((cellGrid.getCellIsAlive(cellRow, cellCol) && totalLiveNeighbours == 2) || (cellGrid.getCellIsAlive(cellRow, cellCol) && totalLiveNeighbours ==3) ) {
                    cellGrid.getCellIsAlive(cellRow, cellCol);
                }
            }
        }
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
