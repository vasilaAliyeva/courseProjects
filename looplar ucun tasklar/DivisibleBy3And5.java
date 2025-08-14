public class DivisibleBy3And5 {



    public static void main(String[] args) {


        System.out.println("3e bolunen ededler:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }


        System.out.println("\n----------------------------------------------");


        System.out.println("5e bolunen ededler:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n----------------------------------------------");


        System.out.println("Hem 3e, hem 5e bolunen ededler: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
