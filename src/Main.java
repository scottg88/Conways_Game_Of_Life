import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ConsolePrinter.enterDimensionsInstruction();


        int[] value;

        try {
            value = UserInputManager.parseUserInput();
        }
        catch (IncorrectInputException message){
            System.err.println(message.getMessage());
            return;
        }

        ConsolePrinter.enterLiveCellCoordinates();

        CellGrid cellGrid = new CellGrid(value[0], value[1]);


        try {
            ArrayList<Integer> getCoordinates = UserInputManager.turnUserInputIntoCoordinates();
            Iterator<Integer> iterator = getCoordinates.iterator();
            while (iterator.hasNext()){
                cellGrid.setCellToAlive(iterator.next(), iterator.next());
            }
        }
        catch (IncorrectInputException message){
            System.err.println(message.getMessage());
            return;
        }


        String[][] newCellGrid = CellGridTranslator.getCellGridAsStringArray(cellGrid);
        ConsolePrinter.printGridWithFormatting(newCellGrid);


    }
}
