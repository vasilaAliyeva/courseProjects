public class AmericanFlag {



    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("* * * * * * =======================================");
            } else {
                System.out.println(" * * * * *  =======================================");
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("===================================================");
        }
    }
}
