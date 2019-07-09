public class Main {

    public static void main(String[] args) {

        CellGrid cellGrid = new CellGrid();
        ConsolePrinter consolePrinter = new ConsolePrinter();
        CellGridFormatter cellGridFormatter = new CellGridFormatter();

//        consolePrinter.printCellGrid(cellGrid.getCellGrid());

       String formattedGrid = cellGridFormatter.formatCellGrid(cellGrid.getCellGrid());

        consolePrinter.printFormattedBoard(formattedGrid);



    }
}
