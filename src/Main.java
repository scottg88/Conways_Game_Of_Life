public class Main {

    public static void main(String[] args) {

        ConsolePrinter.enterDimensionsInstruction();

        int[] value;
        try {
            value = UserInputManager.getUserInput();
        }
        catch (IncorrectInputException message){
            System.err.println(message.getMessage());
            return;
        }

        CellGrid cellGrid = new CellGrid(value[0], value[1]);
        String[][] newCellGrid = CellGridTranslator.getCellGridAsStringArray(cellGrid);
        ConsolePrinter.printGridWithFormatting(newCellGrid);







    }
}
