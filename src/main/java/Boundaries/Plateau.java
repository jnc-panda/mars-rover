package Boundaries;

public class Plateau {

    private int xLength;
    private int yLength;

    public Plateau(int xLength, int yLength) {
        this.xLength = xLength;
        this.yLength = yLength;
    }

    public int get_xLength() {
        return xLength;
    }

    public void set_xLength(int xLength) {
        this.xLength = xLength;
    }

    public int get_yLength() {
        return yLength;
    }

    public void set_yLength(int yLength) {
        this.yLength = yLength;
    }
}
