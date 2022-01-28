package com.atguigu.java;

import com.atguige.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

public class Templates {
//    prsf
    private static final Customer cust = new Customer();

//    psf
    public static final int NUM = 1;
//    psfi
    public static final int NUM2 = 2;
    public static final String NATION = "China";


//    psvm
    public static void main(String[] args) {
//        sout
        System.out.println("hello");
//        soutp m v
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Templates.main");
        int numb1=10;
        int numb2 = 20;
        System.out.println("numb1 = " + numb1);
        System.out.println(numb2);

//        fori
        String[] arr = new String[]{"aa","bb","cc"};
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
//        iter
        for (String s : arr) {
            System.out.println(s);
        }
//        itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }
//        list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(231);
        list.add(453);

        for (Object o : list) {

        }

//        list.fori
        for (int i = 0; i < list.size(); i++) {

        }

//        list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

//        ifn
        if (list == null) {

        }
//        inn
        if (list != null) {

        }

//        xxx.nn/ xxx.null
        if (list != null) {

        }
        if (list == null) {

        }


    }



}
