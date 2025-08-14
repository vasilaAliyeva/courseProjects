public class ArmstrongNums {

    public static void main(String[] args) {

        int n = 100;

        while (n <= 999) {
            int sum = 0;
            int temp = n;

            while (temp > 0) {
                int reqem = temp % 10;
                sum += reqem * reqem * reqem;
                temp /= 10;
            }

            if (sum == n) {
                System.out.println(n);
            }
            n++;
        }


    }


}
