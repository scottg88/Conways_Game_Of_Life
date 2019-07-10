public class Main {

    public static void main(String[] args) {

        Cell cell = new Cell();
        CellGrid cellGrid = new CellGrid(cell);
        ConsolePrinter consolePrinter = new ConsolePrinter();
        CellAndGridFormatter cellAndGridFormatter = new CellAndGridFormatter();



//        consolePrinter.printCellGrid(cellGrid.getCellGrid());

        consolePrinter.printCellGridWithFormatting(cellGrid.getCellGrid());







    }
}
