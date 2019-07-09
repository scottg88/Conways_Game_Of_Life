public class CellGridFormatter {


    public String formatCellGrid(String[][] cellGrid){
        String formattedGrid = "";
        for(int row = 0; row < cellGrid.length; row++){
            formattedGrid = formattedGrid.concat("\n");
            for(int column = 0; column < cellGrid[row].length; column++){
                formattedGrid = formattedGrid.concat(cellGrid[row][column] + " ");
//
            }
        }
        return formattedGrid;
    }

}
