import java.util.Arrays;
import java.util.StringJoiner;

public class CellAndGridFormatter {

//    private Cell cell = new Cell();

    public static String[][] getCellGridAsStringArray(CellGrid cellGrid){
        String[][] stringCellGrid = new String[cellGrid.getRows()][cellGrid.getColumns()];

        for(int row = 0; row < cellGrid.getRows(); row++){
            for(int column = 0; column < cellGrid.getColumns(); column++){
                if(cellGrid.getCellIsDead(row, column)){
                    stringCellGrid[row][column] = "x";
                }
                else{
                    stringCellGrid[row][column] = "o";
                }
            }
        }
        return stringCellGrid;
    }

//    public String[][] placeCellsOnGrid(String[][] cellGrid){
//        for(int row = 0; row < cellGrid.length; row++){
//            for(int column = 0; column < cellGrid[row].length; column++){
//                cellGrid[row][column] = formatCell();
//            }
//        }
//        return cellGrid;
//    }

//    private String formatCell(){
//        String formattedCell = "";
//        if(this.cell.getIsDead()){
//            formattedCell = formattedCell.concat("x");
//        }
//        else {
//            formattedCell = formattedCell.concat("o");
//        }
//        return formattedCell;
//    }

}
