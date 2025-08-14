public class Palindrom {

    public static void main(String[] args) {
        int num = 100;
        while (num <= 999) {
            int ilk = num / 100;
            int son = num % 10;
            if (ilk == son) {
                System.out.println(num);
            }
            num++;
        }
    }
}
