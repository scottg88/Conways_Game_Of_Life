import java.util.Arrays;
import java.util.StringJoiner;

public class ConsolePrinter {




//    public void printCellGrid(String[][] cellGrid){
//        for(String[] row : cellGrid){
//            System.out.println(Arrays.toString(row));
//        }
//    }

    public static void printGridWithFormatting(String [][] grid){
        for(String[] row : grid){
            StringJoiner stringJoiner = new StringJoiner(" | ");
            for(String column : row){
                stringJoiner.add(String.format("%s", column));
            }
            System.out.println(stringJoiner.toString());
        }
    }

    public static void enterDimensionsInstruction(){
        System.out.println("Please enter dimensions of grid; i.e. 6,6");
    }

    public static void enterLiveCellCoordinates(){
        System.out.println("Please enter coordinates of live cells; i.e. 2,2|3,2|1,6");
    }
}
