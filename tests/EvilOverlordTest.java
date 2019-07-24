import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class EvilOverlordTest {

//    cellgrid
//    rules of the game

    @Test
    public void whenCellIsAliveAndHasLessThanTwoLiveNeighboursCellDies(){
        EvilOverlord evilOverlord = new EvilOverlord();
        CellGrid cellGrid = new CellGrid(3, 3);

        ArrayList<Coordinates> liveCells = new ArrayList<>();
        liveCells.add(new Coordinates(2,2));
        cellGrid.setCellToAlive(liveCells);

        evilOverlord.determineHowManyNeighboursAreAlive(cellGrid);
        assertFalse(cellGrid.getCellIsAlive(2,2));

    }

    @Test
    public void whenCellIsAliveAndHasGreaterThanThreeLiveNeighboursCellDies(){
        EvilOverlord evilOverlord = new EvilOverlord();
        CellGrid cellGrid = new CellGrid(3, 3);

        ArrayList<Coordinates> liveCells = new ArrayList<>();
        liveCells.add(new Coordinates(1,2));
        liveCells.add(new Coordinates(2,1));
        liveCells.add(new Coordinates(2,2));
        liveCells.add(new Coordinates(2,3));
        liveCells.add(new Coordinates(3,2));
        cellGrid.setCellToAlive(liveCells);

        evilOverlord.determineHowManyNeighboursAreAlive(cellGrid);
        assertFalse(cellGrid.getCellIsAlive(2,2));
    }

//    @Test
//    public void whenCellIsAliveAndHasTwoOrThreeLiveNeighboursCellLives(){
//        EvilOverlord evilOverlord = new EvilOverlord();
//        CellGrid cellGrid = new CellGrid(3, 3);
//
//        ArrayList<Coordinates> liveCells = new ArrayList<>();
//        liveCells.add(new Coordinates(1,2));
//        liveCells.add(new Coordinates(2,1));
//        liveCells.add(new Coordinates(2,2));
//        liveCells.add(new Coordinates(2,3));
//        cellGrid.setCellToAlive(liveCells);
//
//        evilOverlord.determineHowManyNeighboursAreAlive(cellGrid);
//
//        assertTrue(cellGrid.getCellIsAlive(2,2));
//    }
//
//    @Test
//    public void whenCellIsDeadAndHasThreeLiveNeighboursCellBecomesAlive(){
//        EvilOverlord evilOverlord = new EvilOverlord();
//        CellGrid cellGrid = new CellGrid(3, 3);
//
//        ArrayList<Coordinates> liveCells = new ArrayList<>();
//        liveCells.add(new Coordinates(1,2));
//        liveCells.add(new Coordinates(2,1));
//        liveCells.add(new Coordinates(3,2));
//        cellGrid.setCellToAlive(liveCells);
//
//        evilOverlord.determineHowManyNeighboursAreAlive(cellGrid);
//        assertTrue(cellGrid.getCellIsAlive(2,2));
//
//    }


}