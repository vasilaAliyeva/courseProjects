package practice.oca;

import java.nio.charset.Charset;
import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {

        int age = 9;
        //pooldan istifade ede bilsin deye immutabledi

        String s = "Test"; // literal, create and add to pool
//        s+="4"; // deyisen mutabledi ona gore deyise bilirik

        String s1 = "Test"; //check if exists use
        String s2 = new String("Test");
        String intern = s2.intern();

        System.out.println(s == s1); //true, reference check edir
        System.out.println(s.equals(s1));

        System.out.println(s2 == s1); //false

        System.out.println(s1 == intern);

        // System.out.println(s);

        //literalnan duzeldende pooldan tapir
        //METHODS OF STRING
        s1.intern(); //poldan elave yaratdigimiz deyisnei poola qaytarir

        System.out.println(s1.indexOf(65)); //String de Array kimi indexle isheyir, kodu 65 olan simvlun yerini gosterir
        System.out.println(s1.charAt(0)); //T
        System.out.println(s1.indexOf("Te"));
        System.out.println(s1.length());
        System.out.println(s1.replace('e', 'b'));
        System.out.println(s1);

        System.out.println(s1.getBytes());

        byte[] bytes = s1.getBytes(Charset.defaultCharset());
        System.out.println(Arrays.toString(bytes));

        //0 beraberdi deye , ASCII codelarini cixir, hemin valueni qaytarir
        System.out.println(s1.compareTo(s2)); //ilk ferqli chara catanda digerine baxmir


        System.out.println(s2 + " new String");
        System.out.println(s2.concat(" new String"));

        System.out.println(String.valueOf(1) + s2);
        System.out.println(1 + s2);

        System.out.println(s2.contains("T")); //boolean = umumiyyetle movcudlugunu yoxluyur
        System.out.println(s2.indexOf('T')); // indexini verir
        System.out.println(s2.indexOf("T") >= 0); //boolean

//        System.out.println(s1.contentEquals());  Stringbuilder ve ya bahsqa bir charsequence ile muqayise edir

        System.out.println("My name is: " + s2 + ", and my age is " + 9);
        System.out.println(String.format("My name is %s and my age is %d", s2, age));

        //indent, strip, stripTrailing -SEARCH


        //StringBuilder mutable elementdi - deyisende hashcode eynidi reference eyni qalir cunki
        StringBuilder builder = new StringBuilder("Test");
        StringBuilder builder2 = new StringBuilder("Test");
        // birbirine beraberliyini equals ile yoxlamaq olmur cunki stringde bu method override olunmusdu amm burda yox
        System.out.println(builder == builder2);
        System.out.println(builder.equals(builder2));

        builder.append(" Test");

        String s3 = "Test";
        s1.concat(" Test");

        //burda concat methodu yoxdur, onun yerine append methodu var


        StringBuilder b1 = new StringBuilder("Helllo");
        b1.append(" Test").append(" test");

        StringBuilder b2 = b1;
        b2.append(" new Test");
        //ferqli thread and stackler vasitesiler gonderilse thread safety problmi yaradilacaq
        // ve ardicilligi itirecy
        //bunu hell etmek ucun stringbufferden istifade edeceyik

        //eger 1 thread bashlayibsa buffer makes the other ones to wait

        StringBuffer buffer = new StringBuffer("Helo"); //THREAD SAFEDI VE MUTABLEDI
//thread meselen bir method yazmisiq login eyni anda 5 user login olmaq isteyir her bir bir threaddi
        //STRING DE THREAD SAFEDI AMMA O IMMUTABLE OLDUGU UCUN THREAD SAFEDI
        //PS. ARRAY DE MUTABLEDI

        // arrayde bir nece tipde massiv yaratmaq isteyirikse onda object arrayi yarada bilerik


    }
}
