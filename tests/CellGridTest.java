import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CellGridTest {

    @Test
    public void cellGridInitialisesWithSpecifiedNumberOfRowsOfCells(){

        CellGrid cellGrid = new CellGrid(6,6);

        int expectedRows = 6;
        int actualRows = cellGrid.getRows();

        assertEquals(expectedRows, actualRows);
    }

    @Test
    public void cellGridInitialisesWithSpecifiedNumberOfColumnsOfCells(){

        CellGrid cellGrid = new CellGrid(6,6);

        int expectedColumns = 6;
        int acutalColumns = cellGrid.getColumns();

        assertEquals(expectedColumns, acutalColumns);
    }

    @Test
    public void getCellIsDeadReturnsCurrentStateOfCellAtSpecifiedCoordinates(){
        CellGrid cellGrid = new CellGrid(6,6);
        boolean cellIsAlive = cellGrid.getCellIsAlive(2,2);
        assertFalse(cellIsAlive);
    }


}