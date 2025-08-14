package practice.course2;

public class User {
    private static int counter;
    private int id;
    private String name;
    private int age;

    static {
        counter = 0;
    }

    {
        id = ++counter;
        System.out.println("User created with id: " + id);
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {
        User user = new User("Ali", 21);
        User user1 = new User("Vasila", 21);
        User user3 = new User("Samira", 22);
    }


}
