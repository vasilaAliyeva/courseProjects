public class ReqemCemiOn {

    public static void main(String[] args) {
        int num = 1;
        while (num < 1000) {
            int sum = 0, temp = num;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == 10) {
                System.out.println(num);
            }
            num++;
        }
    }
}
