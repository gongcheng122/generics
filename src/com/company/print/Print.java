package com.company.print;

import java.util.ArrayList;
import java.util.Arrays;

public class Print {
    public static void Pln(){
        System.out.println();
    }

    public static void P(Object obj){
        System.out.print(obj);
    }

    public static void Pln(int[] ary){
        for(int x:ary){
            System.out.print(x+" ");
        }
        Pln();
    }

    public static void P(int[] ary){
        for(int x:ary){
            System.out.print(x+" ");
        }
    }

    public static void Pln(char[] ary){
        for(char x:ary){
            System.out.print(x+" ");
        }
        Pln();
    }

    public static void P(char[] ary){
        for(char x:ary){
            System.out.print(x+" ");
        }
    }

    public static <T extends Comparable> void Pln(T... t){
        /*
        public static <T extends Comparable> void Pln(T... t){}
        等效于：
        public static <T extends Comparable> void Pln(T[] t) {}
         */
        for(T x: t){
            System.out.print(x+" ");
        }
        Pln();
    }

    public static <T extends Comparable> void P(T... t){
        for(T x: t){
            System.out.print(x+" ");
        }
    }

    public static <T extends Comparable> void Pln(Boolean b,T... t){
        for(T x: t){
            System.out.print(x+" ");
        }
        P(b);
        Pln();
    }

    public static <T extends Comparable> void P(Boolean b,T... t){
        for(T x: t){
            System.out.print(x+" ");
        }
        P(b);
    }
}
