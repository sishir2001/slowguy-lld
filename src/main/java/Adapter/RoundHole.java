package Adapter;

public class RoundHole {

    private int radius;
    RoundHole(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public boolean fits(RoundPeg roundPeg) {
        return  this.radius >= roundPeg.getRadius();
    }
}
