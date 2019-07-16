import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ConsolePrinter.enterDimensionsInstruction();


        int[] value;

        try {
            value = UserInputManager.turnUserInputIntoDimensions();
        }
        catch (IncorrectInputException message){
            System.err.println(message.getMessage());
            return;
        }

        ConsolePrinter.enterLiveCellCoordinates();

        CellGrid cellGrid = new CellGrid(value[0], value[1]);

        try {
            ArrayList<Coordinates> coords = UserInputManager.turnUserInputIntoCoordinates();
            cellGrid.setCellToAlive(coords);
        }
        catch (IncorrectInputException message){
            System.err.println(message.getMessage());
            return;
        }
        String[][] newCellGrid;



        for(int turns = 0; turns < 10; turns++){
//          print
            newCellGrid = CellGridTranslator.getCellGridAsStringArray(cellGrid);
            ConsolePrinter.printGridWithFormatting(newCellGrid);
            System.out.println("\n");
//          prompt for input / wait
            Thread.sleep(1000);
//          act on input

        }



    }
}
