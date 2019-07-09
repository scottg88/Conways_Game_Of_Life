public class CellGridFormatter {

    private CellGrid cellGrid;
    private String formattedGrid;

    public CellGridFormatter(CellGrid cellGrid){
        this.cellGrid = cellGrid;
        this.formattedGrid = formatCellGrid();
    }

    public String getFormattedGrid() {
        return formattedGrid;
    }

    private String formatCellGrid(){
        String formattedGrid = "";
        for(int row = 0; row < this.cellGrid.getCellGrid().length; row++){
            formattedGrid = formattedGrid.concat("\n");
            for(int column = 0; column < this.cellGrid.getCellGrid()[row].length; column++){
                formattedGrid = formattedGrid.concat(this.cellGrid.getCellGrid()[row][column] + " ");
//
            }
        }
        return formattedGrid;
    }

}
