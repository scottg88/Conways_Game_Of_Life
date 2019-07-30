import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class GameRulesTest {

//    cellgrid
//    rules of the game

//    @Test
//    public void whenCellIsAliveAndHasLessThanTwoLiveNeighboursCoordinatesAreNotAddedToNextGenerationArrayList(){
//        GameRules gameRules = new GameRules();
//        CellGrid cellGrid = new CellGrid(3, 3);
//
//        ArrayList<Coordinates> nextGenerationOfLiveCells = gameRules.decideCellFate(cellGrid);
//
//        assertFalse(nextGenerationOfLiveCells.contains);
//
//    }

//    @Test
//    public void whenCellIsAliveAndHasGreaterThanThreeLiveNeighboursCellDies(){
//        GameRules gameRules = new GameRules();
//        CellGrid cellGrid = new CellGrid(3, 3);
//
//        ArrayList<Coordinates> liveCells = new ArrayList<>();
//        liveCells.add(new Coordinates(1,2));
//        liveCells.add(new Coordinates(2,1));
//        liveCells.add(new Coordinates(2,2));
//        liveCells.add(new Coordinates(2,3));
//        liveCells.add(new Coordinates(3,2));
//        cellGrid.setCellState(liveCells);
//
//        gameRules.decideCellFate(cellGrid);
//        assertFalse(cellGrid.getCellIsAlive(1,1));
//    }
//
//    @Test
//    public void whenCellIsAliveAndHasTwoOrThreeLiveNeighboursCellLives(){
//        GameRules gameRules = new GameRules();
//        CellGrid cellGrid = new CellGrid(3, 3);
//
//        ArrayList<Coordinates> liveCells = new ArrayList<>();
//        liveCells.add(new Coordinates(1,2));
//        liveCells.add(new Coordinates(2,1));
//        liveCells.add(new Coordinates(2,2));
//        liveCells.add(new Coordinates(2,3));
//        cellGrid.setCellState(liveCells);
//
//
//        gameRules.decideCellFate(cellGrid);
//
//
//        assertTrue(cellGrid.getCellIsAlive(1,1));
//    }
//
//    @Test
//    public void whenCellIsDeadAndHasThreeLiveNeighboursCellBecomesAlive(){
//        GameRules gameRules = new GameRules();
//        CellGrid cellGrid = new CellGrid(3, 3);
//
//        ArrayList<Coordinates> liveCells = new ArrayList<>();
//        liveCells.add(new Coordinates(1,1));
//        liveCells.add(new Coordinates(2,2));
//        liveCells.add(new Coordinates(1,3));
//        cellGrid.setCellState(liveCells);
//
//
//        gameRules.decideCellFate(cellGrid);
//
//        assertTrue(cellGrid.getCellIsAlive(0,1));
//
//    }


}