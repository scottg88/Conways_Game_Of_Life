public class Coordinates {

    private int x;
    private int y;
    private int[] coordinate = new int[2];

    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
        this.coordinate[0] = this.x;
        this.coordinate[1] = this.y;
    }

    public int[] getCoordinate() {
        return coordinate;
    }
}
