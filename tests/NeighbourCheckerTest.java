import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NeighbourCheckerTest {

@Test
    public void whenCellHasNoLiveNeighboursDetermineNumberOfLiveNeighboursReturnsZero(){
    CellGrid cellGrid = new CellGrid(3,3);

    int expectedLiveNeighbours = 0;
    int actualLiveNeighbours = NeighbourChecker.determineNumberOfLiveNeighbours(cellGrid, 1,1);

    assertEquals(expectedLiveNeighbours, actualLiveNeighbours);

}

@Test
    public void whenCellHasTwoLiveNeighboursDetermineNumberOfLiveNeighboursReturnsTwo(){
    CellGrid cellGrid = new CellGrid(3,3);

    ArrayList<Coordinates> liveCells = new ArrayList<>();
    liveCells.add(new Coordinates(1,2));
    liveCells.add(new Coordinates(2,1));
    liveCells.add(new Coordinates(2,2));
    liveCells.add(new Coordinates(2,3));
    cellGrid.setCellState(liveCells);

    int expectedLiveNeighbours = 3;
    int actualLiveNeighbours = NeighbourChecker.determineNumberOfLiveNeighbours(cellGrid, 1,1);

    assertEquals(expectedLiveNeighbours, actualLiveNeighbours);

}

}