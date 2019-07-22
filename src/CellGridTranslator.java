public class CellGridTranslator {


    public static String[][] getCellGridAsStringArray(CellGrid cellGrid){
        String[][] stringCellGrid = new String[cellGrid.getNumberOfRows()][cellGrid.getNumberOfColumns()];

        for(int row = 0; row < cellGrid.getNumberOfRows(); row++){
            for(int column = 0; column < cellGrid.getNumberOfColumns(); column++){
                if(cellGrid.getCellIsAlive(row, column)){
                    stringCellGrid[row][column] = "o";
                }
                else{
                    stringCellGrid[row][column] = "x";
                }
            }
        }
        return stringCellGrid;
    }

}
