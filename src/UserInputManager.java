
import java.util.Scanner;


public class UserInputManager {


    public static int[] getUserInput() throws IncorrectInputException{

        int[] inputValues = new int[2];

        Scanner userInput = new Scanner(System.in);
        String[] stringData = userInput.next().split(",");
        if(stringData.length == 2){
            try {
                inputValues[0] = Integer.parseInt(stringData[0]);
                inputValues[1] = Integer.parseInt(stringData[1]);
            }
            catch (NumberFormatException e){
                throw new IncorrectInputException("Input must be number,number: please try again", e);
            }
        }
        else {
            throw new IncorrectInputException("Input must be number,number: please try again");
        }
        return inputValues;
    }

}
