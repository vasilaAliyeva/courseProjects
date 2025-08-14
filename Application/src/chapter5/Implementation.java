package chapter5;

public class Implementation {


    public static void main(String[] args) {
//        OrderService orderService = new OrderService() {
//            @Override
//            public String name() {
//                return "Vasila";
//            }
//        };

        OrderService orderService2 = (String name) -> "sizin adiniz " + name;


//        orderService.name();
        System.out.println(orderService2.name("VASILA"));
        System.out.println(new OrderServiceImplement().name("VASILA"));
    }
}
