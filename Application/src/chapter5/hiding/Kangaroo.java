package chapter5.hiding;

public class Kangaroo extends Marsupial {
    //paramater hiding parent cagiranda o oaunkun, child cagiranda da ozunkunkun
    //return edir

    public static boolean isBiped() {
        System.out.println("child");
        return true;
    }
    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: " + isBiped());
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();

        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
}
