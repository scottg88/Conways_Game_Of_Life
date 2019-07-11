public class Main {

    public static void main(String[] args) {

        CellGrid cellGrid = new CellGrid(6, 6);

        String[][] newCellGrid = CellAndGridFormatter.getCellGridAsStringArray(cellGrid);

        ConsolePrinter.printGridWithFormatting(newCellGrid);

    }
}
