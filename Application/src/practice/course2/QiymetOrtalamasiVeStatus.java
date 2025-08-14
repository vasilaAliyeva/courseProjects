package practice.course2;

public class QiymetOrtalamasiVeStatus {


    public static void main(String[] args) {

        int[] grade = {44, 66, 77, 55, 99};
        System.out.println(avrg(grade));

        if (avrg(grade) > 60) {
            System.out.println("kecdi");

            if (avrg(grade) > 90) {
                System.out.println("ferqlenme");
            } else if (avrg(grade) > 70) {
                System.out.println("yaxsi");
            } else if (avrg(grade) > 60) {
                System.out.println("kafi");
            }
        } else
            System.out.println("kesildi");

    }

    public static int avrg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }


}
