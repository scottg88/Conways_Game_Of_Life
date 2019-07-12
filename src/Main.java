public class Main {

    public static void main(String[] args) {

        ConsolePrinter.enterDimensionsInstruction();

        try {
            int[] value = UserInputManager.getUserInput();
            CellGrid cellGrid = new CellGrid(value[0], value[1]);
            String[][] newCellGrid = CellGridTranslator.getCellGridAsStringArray(cellGrid);
            ConsolePrinter.printGridWithFormatting(newCellGrid);
        }
        catch (IncorrectInputException message){
            System.err.println(message.getMessage());

        }






    }
}
