package Adapter;


// extending interface of RoundPeg is better in java
public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg squarePeg;

    SquarePegAdapter(SquarePeg squarePeg) {
        super(1);
        this.squarePeg = squarePeg;
    }

    @Override
    public int getRadius() {
        return squarePeg.getWidth();
    }
}
