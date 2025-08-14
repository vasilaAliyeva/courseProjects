package exceptionPractice;

public class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws CustomException {
        if (price < 0) {
            throw new CustomException("PRICE CANNOT BE NEGATIVE");
//            System.out.println("salam");
        }
        this.price = price;
    }
}
