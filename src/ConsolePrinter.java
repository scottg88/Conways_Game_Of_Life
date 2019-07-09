public class ConsolePrinter {



    public void printCellGrid(String [][] cellGrid){
        for(int row = 0; row < cellGrid.length; row ++) {
            for (int column = 0; column < cellGrid[row].length; column++) {
                System.out.println(cellGrid[row][column]);
            }
        }
    }

    public void printFormattedBoard(String formattedCellGrid){
        System.out.println(formattedCellGrid);
    }
}
