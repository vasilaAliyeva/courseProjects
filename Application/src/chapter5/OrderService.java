package chapter5;

@FunctionalInterface
public interface OrderService {

    //public abstract - methdolar
    // public static final- fieldler


    String name(String name);

    default void name1() {
        //tesir elemir
        //override elemek olur bunu da amma elemesek de olar
        //eger eyni adli iki default methoddan varsa onda subclass override elemelidi
    }

    static void name2() {
        //functional olmasina tesir elemir
        //implement eliyen classda  static yazmadan yaza bilerik,
        // inherit ede bilmirik, subclass terefinden accesible deyol
        //bu ancaq interfaceye aiddi, OrderService
        System.out.println("vasila");
    }

}
