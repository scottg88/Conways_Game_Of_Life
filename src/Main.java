public class Main {

    public static void main(String[] args) {

        CellGrid cellGrid = new CellGrid(6, 6);

        String[][] newCellGrid = CellGridTranslator.getCellGridAsStringArray(cellGrid);

        ConsolePrinter.printGridWithFormatting(newCellGrid);

        System.out.println(cellGrid.getCellIsAlive(2,2));

    }
}
