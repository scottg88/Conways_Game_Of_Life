//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class CellGridTranslatorTest {
//
//    @Test
//    public void whenGivenA2dArrayOfCellsReturnsA2dArrayOfStrings(){
//        CellGrid cellGrid = new CellGrid();
//
//        String[][] expectedOutput = {{"x", "x", "x"}, {"x", "x", "x"}, {"x", "x", "x"}};
//        String[][] actualOutput = CellGridTranslator.getCellGridAsStringArray(cellGrid);
//
//        assertArrayEquals(expectedOutput, actualOutput);
//
//    }
//
//    @Test
//    public void whenACellsIsAliveStringIsSetToAnO(){
//        CellGrid cellGrid = new CellGrid();
//
//        cellGrid.setCellToAlive(1,1);
//
//        String[][] expectedOutput = {{"x", "x", "x"}, {"x", "o", "x"}, {"x", "x", "x"}};
//        String[][] actualOutput = CellGridTranslator.getCellGridAsStringArray(cellGrid);
//
//        assertArrayEquals(expectedOutput, actualOutput);
//
//
//    }
//
//    @Test
//    public void whenACellIsDeadStringIsSetToAnX(){
//        CellGrid cellGrid = new CellGrid();
//
//        cellGrid.setCellToAlive(0,0);
//        cellGrid.setCellToAlive(0,1);
//        cellGrid.setCellToAlive(0,2);
//        cellGrid.setCellToAlive(1,0);
//        cellGrid.setCellToAlive(1,1);
//        cellGrid.setCellToAlive(1,2);
//        cellGrid.setCellToAlive(2,0);
//        cellGrid.setCellToAlive(2,1);
//
//        String[][] expectedOutput = {{"o", "o", "o"}, {"o", "o", "o"}, {"o", "o", "x"}};
//        String[][] actualOutput = CellGridTranslator.getCellGridAsStringArray(cellGrid);
//
//        assertArrayEquals(expectedOutput, actualOutput);
//
//    }
//
//}