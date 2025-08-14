package chapter5;

public class OrderServiceImplement implements OrderService {
    @Override
    public String name(String name) {
        return "Menim adim "+ name;
    }
}
