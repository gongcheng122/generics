package com.company;

import static com.company.print.Print.P;
import static com.company.print.Print.Pln;

public class Main {

    public static void main(String[] args) {


        Pln();
        Pln("ABC");
        Pln("ABC",123,'b');

        P();
        P("ABC");
        P("ABC",123,'b');

        Pln();
        Boolean b = true;
        Pln(b,"是对还是错 ：");
        P(b,"是对还是错 ：");
        Pln();

        int[] int_array1 = new int[] {1,2,3,4,5,6,7,8,9,0};
        /*
        Pln(int_array1);
        只能调用：public static void Pln(int[] ary){...}方法
        而不能调用：public static <T extends Comparable> void Pln(T... t){}
        因为：int_array1为基本类型数组
         */
        Pln(int_array1);
        //P(int_array1);


        Integer[] Integers_array1 = new Integer[] {1,2,3,4,5,6,7,8,9,0};
        Pln(Integers_array1);//调用：public static <T extends Comparable> void Pln(T... t){}

        char[] char_array1 = new char[] {'a','b','c','d','e','f','a'};
        Pln(char_array1);
        //P(char_array1);

        Character[] Character_array2 = new Character[] {'a','b','c','d','e','f','a'};
        Pln(Character_array2);//调用：public static <T extends Comparable> void Pln(T... t){}


    }
}
