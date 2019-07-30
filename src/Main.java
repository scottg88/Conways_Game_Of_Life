import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        EvilOverlord evilOverlord = new EvilOverlord();

        PrintToConsole.enterDimensionsInstruction();


        int[] value;

        try {
            value = UserInputManager.getCellGridDimensions();
        }
        catch (IncorrectInputException message){
            System.err.println(message.getMessage());
            return;
        }

        PrintToConsole.enterLiveCellCoordinates();

        CellGrid cellGrid = new CellGrid(value[0], value[1]);

        try {
            ArrayList<Coordinates> coords = UserInputManager.getCoordinatesOfLiveCells();
            cellGrid.setCellState(coords);
        }
        catch (IncorrectInputException message){
            System.err.println(message.getMessage());
            return;
        }
        String[][] newCellGrid;



        for(int turns = 0; turns < 4; turns++){

            System.out.println("\n");
            newCellGrid = CellGridTranslator.getCellGridAsStringArray(cellGrid);
            cellGrid = evilOverlord.updateCells(cellGrid);
            PrintToConsole.printCellGrid(CellGridTranslator.formatStringGridAsSingleString(newCellGrid));

            Thread.sleep(1000);


        }



    }
}
