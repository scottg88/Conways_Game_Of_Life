
import java.util.*;


public class UserInputManager {
    private static ArrayList<Coordinates> coordinates = new ArrayList<>();

    public static int[] turnUserInputIntoDimensions() throws IncorrectInputException{

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

    public static ArrayList<Coordinates> turnUserInputIntoCoordinates() throws IncorrectInputException{

        Scanner userInput = new Scanner(System.in);
        String[] splitIntoPairs = userInput.next().split("[| ]");
        if (splitIntoPairs.length >= 1) {
            try {
                for (String pair : splitIntoPairs) {
                    String[] splitPair = pair.split(",");
                    // validate pair?
                    coordinates.add(new Coordinates((Integer.parseInt(splitPair[0])), (Integer.parseInt(splitPair[1]))));
                }
            }
            catch(NumberFormatException e) {
                throw new IncorrectInputException("Input must be number,number|number,number: please try again", e);
            }
        }
        else {
            throw new IncorrectInputException("Input must be number,number|number,number: please try again");
        }
        return coordinates;

        }
    }



