import java.util.ArrayList;

public class GameRules {


    public ArrayList<Coordinates> decideCellFate(CellGrid cellGrid){
        ArrayList<Coordinates> nextGenerationOfLiveCells = new ArrayList<>();
        for(int cellRow = 0; cellRow < cellGrid.getNumberOfRows()-1; cellRow++) {
            for (int cellCol = 0; cellCol < cellGrid.getNumberOfColumns()-1; cellCol++) {
                boolean cellIsAlive = cellGrid.getCellIsAlive(cellRow, cellCol);
                int numberOfLiveNeighbours = NeighbourChecker.determineNumberOfLiveNeighbours(cellGrid, cellRow, cellCol);

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

}
