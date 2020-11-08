import java.util.Arrays;

public class Place {
    private double x, y;
    double [] paths;
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Place(double x, double y, double[] paths) {
        this.x = x;
        this.y = y;
        this.paths = paths;
    }
    double pathLength(Place other){
        return Math.sqrt((x-other.x)*(x-other.x) + (y-other.y)*(y-other.y));
    }

    public Place createPlace(double x, double y, int size){
        return new Place(x, y, new double[size]);
    }

    @Override
    public String toString() {
        return "Place{" +
                "x=" + x +
                ", y=" + y +
                ", paths=" + Arrays.toString(paths) +
                ", capacity=" + capacity +
                '}';
    }
}
