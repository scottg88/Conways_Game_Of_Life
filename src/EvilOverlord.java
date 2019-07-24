import java.util.ArrayList;

public class EvilOverlord {


    public void decideCellFate(CellGrid cellGrid){
        ArrayList<Integer> totalLiveNeighbours = determineNumberOfLiveNeighbours(cellGrid);

        for(int cellRow = 0; cellRow < cellGrid.getNumberOfRows(); cellRow++) {
            for (int cellCol = 0; cellCol < cellGrid.getNumberOfColumns(); cellCol++) {
                boolean cellIsAlive = cellGrid.getCellIsAlive(cellRow, cellCol);
                if ((cellIsAlive && totalLiveNeighbours.get(cellCol) < 2) ||
                        (cellIsAlive && totalLiveNeighbours.get(cellCol) > 3)) {
                    cellGrid.killCell(cellRow, cellCol);
                }
                if (!cellIsAlive && totalLiveNeighbours.get(cellCol) == 3) {
                    cellGrid.resurrectCell(cellRow, cellCol);
                }
                if((cellIsAlive && totalLiveNeighbours.get(cellCol) == 2) ||
                        (cellIsAlive && totalLiveNeighbours.get(cellCol) ==3) ) {
                    cellGrid.keepCellAlive(cellRow, cellCol);
                }
            }
        }
    }

    private ArrayList<Integer> determineNumberOfLiveNeighbours(CellGrid cellGrid) {
        ArrayList<Integer> totalLiveNeighbours = new ArrayList<>();
        int runningTotal = 0;
        for(int cellRow = 0; cellRow < cellGrid.getNumberOfRows(); cellRow++) {
            for (int cellCol = 0; cellCol < cellGrid.getNumberOfColumns(); cellCol++) {
                if(getStateOfNeighbourAbove(cellGrid, cellRow, cellCol)){
                    runningTotal += 1;
                }
                else {
                    runningTotal = 0;
                }
                if(getStateOfNeighbourToTheTopRightCorner(cellGrid, cellRow, cellCol)){
                    runningTotal += 1;
                }
                else {
                    runningTotal = 0;
                }
                if(getStateOfNeighbourToTheRight(cellGrid, cellRow, cellCol)){
                    runningTotal += 1;
                }
                else {
                    runningTotal = 0;
                }
                if(getStateOfNeighbourToTheBottomRightCorner(cellGrid, cellRow, cellCol)){
                    runningTotal += 1;
                }
                else {
                    runningTotal = 0;
                }
                if(getStateOfNeighbourBelow(cellGrid, cellRow, cellCol)){
                    runningTotal += 1;
                }
                else {
                    runningTotal = 0;
                }
                if(getStateOfNeighbourToTheBottomLeftCorner(cellGrid, cellRow, cellCol)){
                    runningTotal += 1;
                }
                else {
                    runningTotal = 0;
                }
                if(getStateOfNeighbourToTheLeft(cellGrid, cellRow, cellCol)){
                    runningTotal += 1;
                }
                else {
                    runningTotal = 0;
                }
                if(getStateOfNeighbourToTheTopLeftCorner(cellGrid, cellRow, cellCol)){
                    runningTotal += 1;
                }
                else {
                    runningTotal = 0;
                }

                totalLiveNeighbours.add(runningTotal);

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
