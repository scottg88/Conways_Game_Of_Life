
public class PrintToConsole {

//    naming - especially printCellGrid
//    rename class to outputManage?



    public static void enterDimensionsInstruction(){
        System.out.println("Please enter dimensions of grid; i.e. rows,columns");
    }

    public static void enterLiveCellCoordinates(){
        System.out.println("Please enter coordinates of live cells; i.e. x,y|x,y|x,y");
    }

    public static void printCellGrid(String cellGridAsString){
        System.out.println(cellGridAsString);
        System.out.flush();
    }
}
