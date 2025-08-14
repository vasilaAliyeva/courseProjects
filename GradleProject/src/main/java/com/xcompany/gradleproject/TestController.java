package com.xcompany.gradleproject;

import org.springframework.boot.convert.PeriodUnit;
import org.springframework.web.bind.annotation.*;
//requiredargs constructor = all inpt cons
//rest nedir? - http methodlarin duzgun yerine yetirilmesidi

//controller -sorgulari qebul eden hisse
@RestController //@Service - ISH GORE , @Component, @Repository - HAMSI EYNIDI SADECE KIMIN NE ISH GORDUYUNE BAXMAQ UCUN
//bu annotationlar cagirilan kimi bean kimi ioc de yaranir
@RequestMapping("/api/test") //class endpoint
//bir dene rescontrollerimiz var ve onun endpointi mapping etdiyimiz kimi
public class TestController {

    @GetMapping("/test1")
    public String test() {
        testCall(90);
        return "Hello, World from gradle test1 !";
    }
    // BEAN YARADILIR HER BIRI UCUN EGER EYNI ENDPOINT ILE YALNIZ 1 METHOD YAZA BILERIK
    // ioc- inversion of control - containerdi -
    //bean - ioc nin ozunun cagirdigi obyektler

    @PostMapping("/test1")
    public String test3() {
        testCall(90);
        return "Hello, World from gradle test1 POST!";
    }

    @GetMapping("/test2")
    public String test2() {
        testCall(90);
        return "Hello, World from gradle test 2 GET!";
    }

//    @PutMapping"/test1")
//    public String test4() {
//        testCall(90);
//        return "Hello, World from gradle test PUT MAPPING !";
//    }// BEAN YARADILIR HER BIRI UCUN EGER EYNI ENDPOINT ILE YALNIZ 1 METHOD YAZA BILERIK

    private void testCall(int a) {
        System.out.println(a);
    }
}

//HTTP methodlar -  GET, POST, PUT, PATCH, DELETE, OPTION, HEADER
//SAFE, IDONPOTENT VE YA HECBIRI OLA BILERLER
//PATCH KICIK BIR HISSENI UPDATE TEST EDILMESI- BIR USERIN SADECE 1 PAREMETRINI UPDATE ELEMEK - STATUSU DEYISMEK
//GET METHODU SAFE METHODDU
// PUT - RESORSU 1 DEFE UPDATE EDE BILER 1 RESORSU -IDEMPOTENT METHOD
// DELETE - RESORSU 1 DEFE DELETE EDE BILER 1 RESORSU -IDEMPOTENT METHOD
//OPTION TEST EDEN METHOD


//POSTMAN - BUNUNLA HER SEYI GONDERE BILECIK BROUZERDE ANCAQ GET ELIYE BILERIK

//mvc - model view controller - model burda bazadi , view burda bizim saytda gorduyumuz hissedi, controller - PI SORGULARIN ISHLEYI HISSE

//PATH VARIABLE -
//REQUEST PARAM - PATH ICERISINE GEDEN VALUE
//REQUEST BODY - PATH GIZLIDE