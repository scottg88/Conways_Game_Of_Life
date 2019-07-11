import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ConsolePrinter.enterDimensionsInstruction();
         ArrayList<Integer> dimensions = UserInputManager.getGridDimensions();

        CellGrid cellGrid = new CellGrid(dimensions);


        String[][] newCellGrid = CellGridTranslator.getCellGridAsStringArray(cellGrid);


        ConsolePrinter.printGridWithFormatting(newCellGrid);


    }
}
