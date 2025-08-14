package chapter4.encapsulation;

public class User {

    private  String name;
    private String password;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {

        if (name == null || name.equals(" ") || name.startsWith("Z")) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }
}
