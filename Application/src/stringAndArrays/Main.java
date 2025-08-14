package stringAndArrays;

public class Main {

    public static void main(String[] args) {
        User user = new User();

        System.out.println(user); // yaddasda tutdugu yer yeni address cixdi
        System.out.println(user.hashCode());
        user.setName("Vasila");
        user.setAge(21);

        System.out.println(user.hashCode());
        System.out.println(user);
    }
}
