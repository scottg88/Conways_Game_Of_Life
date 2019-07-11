import java.util.ArrayList;
import java.util.Scanner;


public class UserInputManager {

    public static void getGridDimensions(){
        ArrayList<Integer> dimensions = new ArrayList<>();
        int rows;
        int columns;
        Scanner userInput = new Scanner(System.in);
        String[] enteredDimensions = userInput.next().split(",");
        for(String dimension : enteredDimensions){
            int value = Integer.parseInt(dimension);
            dimensions.add(value);
        }
        rows = dimensions.get(0);
        columns = dimensions.get(1);
    }

}
