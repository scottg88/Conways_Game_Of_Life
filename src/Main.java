public class Main {

    public static void main(String[] args) {

        CellGrid cellGrid = new CellGrid();
        ConsolePrinter consolePrinter = new ConsolePrinter();
        CellGridFormatter cellGridFormatter = new CellGridFormatter(cellGrid);

//        consolePrinter.printCellGrid(cellGrid.getCellGrid());


        consolePrinter.printFormattedBoard(cellGridFormatter.getFormattedGrid());



    }
}
