
import java.util.StringJoiner;

public class ConsolePrinter {

    public static void printGridWithFormatting(String [][] grid){
        for(String[] row : grid){
            StringJoiner stringJoiner = new StringJoiner("  ");
            for(String column : row){
                stringJoiner.add(String.format("%s", column));
            }
            System.out.println(stringJoiner.toString());
        }
    }

    public static void enterDimensionsInstruction(){
        System.out.println("Please enter dimensions of grid; i.e. rows,columns");
    }

    public static void enterLiveCellCoordinates(){
        System.out.println("Please enter coordinates of live cells; i.e. x,y|x,y|x,y");
    }
}
