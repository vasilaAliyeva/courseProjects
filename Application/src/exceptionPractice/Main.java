package exceptionPractice;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("alma");
        try {
            product.setPrice(-5);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("process succeed!");

        //try with resources closable classlarlayaziriq finally yazmaq lazim deyil cunki ozu bbagliya biler
    }
}
