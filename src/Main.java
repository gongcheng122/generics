import static print.Print.P;
import static print.Print.Pln;

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
        Pln(int_array1);

        char[] char_array1 = new char[] {'a','b','c','d','e','f','a'};
        Pln(char_array1);
    }
}
