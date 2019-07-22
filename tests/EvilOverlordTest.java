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

        evilOverlord.updateBoard(cellGrid);
        assertFalse(cellGrid.getCellIsAlive(2,2));

    }

    @Test
    public void whenCellIsAliveAndHasGreaterThanThreeLiveNeighboursCellDies(){

    }

    @Test
    public void whenCellIsAliveAndHasTwoOrThreeLiveNeighboursCellLives(){

    }

    @Test
    public void whenCellIsDeadAndHasThreeLiveNeighboursCellBecomesAlive(){

    }

}