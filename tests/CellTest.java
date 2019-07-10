import org.junit.Test;

import static org.junit.Assert.*;

public class CellTest {

    @Test
    public void newCellIsDeadByDefault(){
        Cell cell = new Cell();

        assertFalse(cell.getIsAlive());
    }

    @Test
    public void whenCellIsDeadChangeStateMakesCellAlive(){
        Cell cell = new Cell();
        cell.changeState();

        assertTrue(cell.getIsAlive());
    }

    @Test
    public void whenCellIsAliveChangeStateMakesCellDead(){
        Cell cell = new Cell();
        cell.changeState();
        cell.changeState();

        assertFalse(cell.getIsAlive());
    }


}