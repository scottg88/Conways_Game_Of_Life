import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NeighbourChecker {

//    public static int determineNumberOfLiveNeighbours(CellGrid cellGrid, int cellRow, int cellCol) {
//        ArrayList<Boolean> neighbourStates = new ArrayList<>();
//        int totalLiveNeighbours = 0;
//        neighbourStates.add(getStateOfNeighbourAbove(cellGrid, cellRow, cellCol));
//        neighbourStates.add(getStateOfNeighbourToTheTopRightCorner(cellGrid, cellRow, cellCol));
//        neighbourStates.add(getStateOfNeighbourToTheRight(cellGrid, cellRow, cellCol));
//        neighbourStates.add(getStateOfNeighbourToTheBottomRightCorner(cellGrid, cellRow, cellCol));
//        neighbourStates.add(getStateOfNeighbourBelow(cellGrid, cellRow, cellCol));
//        neighbourStates.add(getStateOfNeighbourToTheBottomLeftCorner(cellGrid, cellRow, cellCol));
//        neighbourStates.add(getStateOfNeighbourToTheLeft(cellGrid, cellRow, cellCol));
//        neighbourStates.add(getStateOfNeighbourToTheTopLeftCorner(cellGrid, cellRow, cellCol));
//
//        for(Boolean state : neighbourStates){
//            if(state){
//                totalLiveNeighbours += 1;
//            }
//        }
//        return totalLiveNeighbours;
//    }

    public static int determineNumberOfLiveNeighbours(CellGrid cellGrid, int cellRow, int cellCol) {

        int totalLiveNeighbours = 0;

        List<Boolean> neighbourStates = getStateOfSurroundingNeighbours(cellGrid, cellRow, cellCol);

        for(Boolean state : neighbourStates){
            if(state){
                totalLiveNeighbours += 1;
            }
        }
        return totalLiveNeighbours;
    }

    private static List<Boolean> getStateOfSurroundingNeighbours(CellGrid cellGrid, int x, int y){

        boolean above = cellGrid.getCellIsAlive(x -1, y);
        boolean topRightCorner = cellGrid.getCellIsAlive(x-1, y+1);
        boolean toTheRight = cellGrid.getCellIsAlive(x, y+1);
        boolean bottomRightCorner = cellGrid.getCellIsAlive(x+1, y+1 );
        boolean below = cellGrid.getCellIsAlive(x+1, y);
        boolean bottomLeftCorner = cellGrid.getCellIsAlive(x + 1, y - 1);
        boolean toTheLeft = cellGrid.getCellIsAlive(x, y-1);
        boolean topLeftCorner = cellGrid.getCellIsAlive(x -1, y-1);

        return Arrays.asList(above, topRightCorner, toTheRight, bottomRightCorner, below, bottomLeftCorner, toTheLeft, topLeftCorner);
    }

    public static Coordinates convertToWrappedCoordinates(CellGrid cellGrid, Coordinates coords) {
        if(coords.getX() == 0-1){
            return new Coordinates(cellGrid.getNumberOfRows()-1, coords.getY());
        }
        else if(coords.getX() == (cellGrid.getNumberOfRows()-1)+1){
            return new Coordinates(0, coords.getY());
        }
        else if(coords.getY() == 0-1){
            return new Coordinates(coords.getX(), cellGrid.getNumberOfColumns()-1);
        }
        else if(coords.getY() == (cellGrid.getNumberOfColumns()-1)+1){
            return new Coordinates(coords.getX(), 0);
        }
        else {
            return new Coordinates(coords.getX(), coords.getY());
        }
    }

//    private static boolean getStateOfNeighbourAbove(CellGrid cellGrid, int cellRow, int cellCol){
//        if(cellRow > 0){
//            return cellGrid.getCellIsAlive(cellRow-1, cellCol);
//        }
//        return cellGrid.getCellIsAlive(cellGrid.getNumberOfRows()-1, cellCol);
//    }
//
//    private static boolean getStateOfNeighbourToTheTopRightCorner(CellGrid cellGrid, int cellRow, int cellCol){
////        top LH corner and top edge
//        if((cellRow == 0) && (cellCol < cellGrid.getNumberOfColumns()-1)){
//            return cellGrid.getCellIsAlive(cellGrid.getNumberOfRows()-1, cellCol+1);
//        }
////        top RH corner
//        if((cellRow == 0) && (cellCol == cellGrid.getNumberOfColumns()-1)){
//            return cellGrid.getCellIsAlive(cellGrid.getNumberOfRows()-1, 0);
//        }
////        RH edge and bottom RH corner
//        if((cellRow > 0) && (cellCol == cellGrid.getNumberOfColumns()-1)){
//            return cellGrid.getCellIsAlive(cellRow -1, 0);
//        }
//        return cellGrid.getCellIsAlive(cellRow-1, cellCol +1);
//    }
//
//    private static boolean getStateOfNeighbourToTheRight(CellGrid cellGrid, int cellRow, int cellCol){
//
//        if (cellCol < cellGrid.getNumberOfColumns()-1){
//            return cellGrid.getCellIsAlive(cellRow, cellCol+1);
//        }
//
//        return cellGrid.getCellIsAlive(cellRow,0);
//
//    }
//
//    private static boolean getStateOfNeighbourToTheBottomRightCorner(CellGrid cellGrid, int cellRow, int cellCol){
////        top RH corner and RH edge
//        if((cellRow < cellGrid.getNumberOfRows()-1) && (cellCol == cellGrid.getNumberOfColumns()-1)){
//            return cellGrid.getCellIsAlive(cellRow + 1, 0);
//        }
////        bottom RH corner
//        if((cellRow == cellGrid.getNumberOfRows()-1) && (cellCol == cellGrid.getNumberOfColumns()-1)){
//            return cellGrid.getCellIsAlive(0, 0);
//        }
////        bottom LH corner and bottom edge
//        if((cellRow == cellGrid.getNumberOfRows()-1) && (cellCol < cellGrid.getNumberOfColumns()-1)){
//            return cellGrid.getCellIsAlive(0, cellCol + 1);
//        }
//        return cellGrid.getCellIsAlive(cellRow +1, cellCol +1);
//    }
//
//    private static boolean getStateOfNeighbourBelow(CellGrid cellGrid, int cellRow, int cellCol){
//        if(cellRow < cellGrid.getNumberOfColumns()-1){
//            return cellGrid.getCellIsAlive(cellRow+1, cellCol);
//        }
//        return cellGrid.getCellIsAlive(0, cellCol);
//    }
//
//    private static boolean getStateOfNeighbourToTheBottomLeftCorner(CellGrid cellGrid, int cellRow, int cellCol){
//        if((cellRow < cellGrid.getNumberOfRows()-1) && (cellCol == 0)){
//            return cellGrid.getCellIsAlive(cellRow + 1, cellGrid.getNumberOfColumns()-1);
//        }
//        if((cellRow == cellGrid.getNumberOfRows()-1) && (cellCol == 0)){
//            return cellGrid.getCellIsAlive(0, cellGrid.getNumberOfColumns()-1);
//        }
//        if((cellRow == cellGrid.getNumberOfRows()-1) && (cellCol > 0)){
//            return cellGrid.getCellIsAlive(0, cellCol -1);
//        }
//        return cellGrid.getCellIsAlive(cellRow + 1, cellCol -1);
//    }
//
//    private static boolean getStateOfNeighbourToTheLeft(CellGrid cellGrid, int cellRow, int cellCol){
//        if (cellCol > 0){
//            return cellGrid.getCellIsAlive(cellRow, cellCol-1);
//        }
//        return cellGrid.getCellIsAlive(cellRow, cellGrid.getNumberOfColumns()-1);
//    }
//
//    private static boolean getStateOfNeighbourToTheTopLeftCorner(CellGrid cellGrid, int cellRow, int cellCol) {
//        //        top RH corner and top edge
//        if ((cellRow == 0) && (cellCol > 0)) {
//            return cellGrid.getCellIsAlive(cellGrid.getNumberOfRows()-1, cellCol - 1);
//        }
//        //        top LH corner
//        if ((cellRow == 0) && (cellCol == 0)) {
//            return cellGrid.getCellIsAlive(cellGrid.getNumberOfRows()-1, cellGrid.getNumberOfColumns()-1);
//        }
//        //        LH edge and bottom LH corner
//        if ((cellRow > 0) && (cellCol == 0)) {
//            return cellGrid.getCellIsAlive(cellRow - 1, cellGrid.getNumberOfColumns()-1);
//        }
//        return cellGrid.getCellIsAlive(cellRow - 1, cellCol - 1);
//    }
}
