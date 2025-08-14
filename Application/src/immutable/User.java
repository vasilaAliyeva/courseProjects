package immutable;

import java.util.Arrays;

public final class User {
    private final int age;
    private final String name;
    private final int[] points;

    public User(int age, String name, int[] points) {
        this.age = age;
        this.name = name;
        this.points = points.clone();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;

    }

    public int[] getPoints() {
        return Arrays.copyOf(points, points.length);

        //stringbuilder olanda return new StringBuilder(name);
    }

    public void print() {
        for (int point : points) {
            System.out.print(point + " ");
        }
    }
}
