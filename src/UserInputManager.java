
import java.util.Scanner;


public class UserInputManager {


    public static int[] getUserInput() throws IncorrectInputException{

        int[] inputValues = new int[2];

        Scanner userInput = new Scanner(System.in);
        String[] stringData = userInput.next().split(",");
        if(stringData.length == 2){
            inputValues[0] = Integer.parseInt(stringData[0]);
            inputValues[1] = Integer.parseInt(stringData[1]);
        }
        else {
            throw new IncorrectInputException("Wrong input, please try again");
        }
        return inputValues;
    }



    private static int convertInputToInt(String[] userInput){
        int data = 0;
        for(String input : userInput){
            data = Integer.parseInt(input);
        }
        return data;
    }

}
