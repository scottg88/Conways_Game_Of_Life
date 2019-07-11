public class CellGridTranslator {


    public static String[][] getCellGridAsStringArray(CellGrid cellGrid){
        String[][] stringCellGrid = new String[cellGrid.getRows()][cellGrid.getColumns()];

        for(int row = 0; row < cellGrid.getRows(); row++){
            for(int column = 0; column < cellGrid.getColumns(); column++){
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
