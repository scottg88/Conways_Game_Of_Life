//import org.junit.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.Assert.*;
//
//public class CellGridTest {
//
//    @Test
//    public void cellGridInitialisesWithSpecifiedNumberOfRowsAndColumnsOfCells(){
////        ArrayList<Integer> dimensions = new ArrayList<>();
////        dimensions.add(6);
////        dimensions.add(6);
////
////        int rows = dimensions.get(0);
////        int columns = dimensions.get(1);
//
//        CellGrid cellGrid = new CellGrid();
//
//        ArrayList<Integer> expectedRowsAndColumns = new ArrayList<>();
//        expectedRowsAndColumns.add(6);
//        expectedRowsAndColumns.add(6);
//
//        ArrayList<Integer> actualRowsAndColumns = new ArrayList<>();
//        actualRowsAndColumns.add(cellGrid.getRows());
//        actualRowsAndColumns.add(cellGrid.getColumns());
//
//        assertEquals(expectedRowsAndColumns, actualRowsAndColumns);
//    }
//
//    @Test
//    public void getCellIsDeadReturnsCurrentStateOfCellAtSpecifiedCoordinates(){
//        CellGrid cellGrid = new CellGrid();
//        boolean cellIsAlive = cellGrid.getCellIsAlive(2,2);
//        System.out.println(cellIsAlive);
//        assertFalse(cellIsAlive);
//    }
//
//
//}