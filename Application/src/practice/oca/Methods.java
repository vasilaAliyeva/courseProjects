package practice.oca;

public class Methods {

    public static void main(String[] args) {

        Methods methods = new Methods(); //eger static olmasa
        methods.print();

        System.out.println(9+1);

    }

    // static- objecte yox, classa aiddir main methodda cagira bilmek ucun yaziriq

    // access modifier, static/ non-static, retun type, method name,
    public static void print() {
        System.out.println("Print something");
    }

    public static short sum(short a, short b) {

        return (short) (a + b + 1);
        // sum hemise int uzerinden gedir

        // string kimi qaytarmaq ucun + "" yaz ve umumini moterizeye al
    }
}
