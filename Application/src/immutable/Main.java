package immutable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] points = {1, 2, 3};
        String name = "vasila";
        int age = 21;

        User user = new User(age, name, points);

        System.out.println(Arrays.toString(user.getPoints()));
        points[0] = 14;
        System.out.println(Arrays.toString(user.getPoints()));
        int[] newPoints =user.getPoints();
        newPoints[0] =0;
        System.out.println(user.getPoints().hashCode());
        System.out.println(newPoints.hashCode());
        user.print();
    }
}
