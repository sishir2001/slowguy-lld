package Adapter;

public class PegAdapter {

    public static void  main(String[] args) {
        SquarePeg squarePeg = new SquarePeg(11);
        RoundHole roundHole = new RoundHole(12);
        RoundPeg roundPeg = new RoundPeg(11);

        RoundPeg roundPeg1 = new SquarePegAdapter(squarePeg);
        System.out.println("fitting category:: " + roundHole.fits(roundPeg1));
    }
}
