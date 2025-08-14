package practice.oca;

//import explicit eliyirikse yeni birbasha birinci onu goturecek

// global deyisenler primitive ya reference olmasindan asili olmayaraq heapde saxliinr
// localdisa - deyisen data type yeni stackde saxlinir
public class BloklarVeConstructor {

    //static contents ilk ishe dusen
    //sonra instance initialization blocklar
    // en sonda constructor


    // garbage collection -referencesiz qalan lazimsizlari topluyur
    //reference

    public int version; //instance or non-static classa aid deyil, instance aiddi
    public String name;



    public static String securityKey = getSecurityKey();


    //instance initializator block - her teze instance yaradilanda ishleyir
    {
        //her instance ucun ayri icra olunur

        securityKey = "first instance key ";
        version = 9;
        name = "default name";
        System.out.println("Instance initialization block for version " + version);
    }

    static {
        //instance deyisenler istifade ede bilmirik
        //her class ucun 1 defe icra olunur
        securityKey = " static Key324";
        System.out.println("Static block calls for app key: " + securityKey);
    }

    public BloklarVeConstructor(String name) {

        //classin name = constructor icindeki name
        this.name = name;
    }

    public BloklarVeConstructor() {
//        this(1);
    }

    public BloklarVeConstructor(int version) {

        //constructor chain
        this(version, "version: " + version); // diger constructor cagirriq ve mutleq ilk linede olmalidi

        this.version = version; // instance yaradanda onun versionu
    }

    public BloklarVeConstructor(int version, String name) {
        this.version = version;
        this.name = name;
    }

    {
        securityKey = "second instance 80";
        version = 90;
        name = "last name";
        System.out.println("Instance initialization block for version " + version);
    }


    public static void main(String[] args) {


        BloklarVeConstructor app = new BloklarVeConstructor(); //1st instance
        System.out.println(app.version);
        System.out.println(app.name);
        System.out.println("---------------");


//        Application app2 = new Application(2);
//        System.out.println(app2.version);
//        System.out.println(app2.name);
//        System.out.println("----------------");

//        Application app3 = new Application(3, "new app");
//        System.out.println(app3.version);
//        System.out.println(app3.name);
//        System.out.println("-----------------");

        System.out.println(app.securityKey);
    }

    public static String getSecurityKey() {
        System.out.println("method call");
        return "getsecurity 999";
    }
}
