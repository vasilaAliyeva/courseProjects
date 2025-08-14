package exceptionPractice;

public class Test {
    public void setPriceForProduct() throws CustomException {
        Product product = new Product();
        product.setPrice(-1);
    }
}
