import java.util.Arrays;
import java.util.StringJoiner;

public class ConsolePrinter {




    public void printCellGrid(String[][] cellGrid){
        for(String[] row : cellGrid){
            System.out.println(Arrays.toString(row));
        }
    }

    public void printCellGridWithFormatting(String [][] cellGrid){
        for(String[] row : cellGrid){
            StringJoiner stringJoiner = new StringJoiner(" | ");
            for(String column : row){
                stringJoiner.add(String.format("%s", column));
            }
            System.out.println(stringJoiner.toString());
        }
    }

    public void

//    public void printFormattedBoard(String formattedCellGrid){
//        System.out.println(formattedCellGrid);
//    }
}
