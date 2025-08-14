import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num =0;
        int sum = 0;

        System.out.println("Ededleri daxil edin: ");
        num = sc.nextInt();
        while (num!=0){
            sum+=num;
            num = sc.nextInt();
        }

        System.out.println("Ededlerin cemi: " +sum);

    }
}
