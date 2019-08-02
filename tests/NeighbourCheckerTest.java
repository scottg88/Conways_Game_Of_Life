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

//@Test
//    public void whenCellHasTwoLiveNeighboursDetermineNumberOfLiveNeighboursReturnsTwo(){
//    CellGrid cellGrid = new CellGrid(3,3);
//
//    ArrayList<Coordinates> liveCells = new ArrayList<>();
//    liveCells.add(new Coordinates(1,2));
//    liveCells.add(new Coordinates(2,1));
//    liveCells.add(new Coordinates(2,2));
//    liveCells.add(new Coordinates(2,3));
//    cellGrid.setCellState(liveCells);
//
//    int expectedLiveNeighbours = 3;
//    int actualLiveNeighbours = NeighbourChecker.determineNumberOfLiveNeighbours(cellGrid, 1,1);
//
//    assertEquals(expectedLiveNeighbours, actualLiveNeighbours);
//
//}

    @Test
    public void whenCoordinatesDontNeedWrappingConvertToWrappedCoordinatesReturnsOriginalCoordinates(){
        CellGrid cellGrid = new CellGrid(3,3);
        Coordinates coordinates = new Coordinates(1, 1);
        Coordinates expectedResult = new Coordinates(1,1);

        Coordinates actualResult = NeighbourChecker.convertToWrappedCoordinates(cellGrid, coordinates);

        assertEquals(expectedResult.getX(), actualResult.getX());
        assertEquals(expectedResult.getY(), actualResult.getY());
    }

    @Test
    public void whenXCoordinateIsFirstRowMinusOneConvertToWrappedCoordinatesWrapsToTheLastRow(){
        CellGrid cellGrid = new CellGrid(3,3);
        Coordinates coordinates = new Coordinates(0-1, 1);
        Coordinates expectedResult = new Coordinates(2,1);

        Coordinates actualResult = NeighbourChecker.convertToWrappedCoordinates(cellGrid, coordinates);

        assertEquals(expectedResult.getX(), actualResult.getX());
    }

    @Test
    public void whenYCoordinateIsFirstColumnMinusOneWrapsToLastColumn(){
        CellGrid cellGrid = new CellGrid(3,3);
        Coordinates coordinates = new Coordinates(1, 0-1);
        Coordinates expectedResult = new Coordinates(1,2);

        Coordinates actualResult = NeighbourChecker.convertToWrappedCoordinates(cellGrid, coordinates);

        assertEquals(expectedResult.getY(), actualResult.getY());
    }

    @Test
    public void whenXCoordinateIsLastRowPlusOneWrapsToFirstRow(){
        CellGrid cellGrid = new CellGrid(3,3);
        Coordinates coordinates = new Coordinates((cellGrid.getNumberOfRows()-1)+1, 1);
        Coordinates expectedResult = new Coordinates(0,1);

        Coordinates actualResult = NeighbourChecker.convertToWrappedCoordinates(cellGrid, coordinates);

        assertEquals(expectedResult.getX(), actualResult.getX());
    }

    @Test
    public void whenYCoordinateIsLastColumnPlusOneWrapsToFirstColumn(){
        CellGrid cellGrid = new CellGrid(3,3);
        Coordinates coordinates = new Coordinates(1, 2+1);
        Coordinates expectedResult = new Coordinates(2,0);

        Coordinates actualResult = NeighbourChecker.convertToWrappedCoordinates(cellGrid, coordinates);

        assertEquals(expectedResult.getY(), actualResult.getY());
    }

}