public class Main {

    public static void main(String[] args) {

        Cell cell = new Cell();
        CellGrid cellGrid = new CellGrid(cell);
        ConsolePrinter consolePrinter = new ConsolePrinter();
        CellGridFormatter cellGridFormatter = new CellGridFormatter(cellGrid);

//        consolePrinter.printCellGrid(cellGrid.getCellGrid());


        consolePrinter.printFormattedBoard(cellGridFormatter.getFormattedGrid());



    }
}
