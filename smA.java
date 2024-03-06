

import java.util.Scanner;



public class smA {

    public static String decimalToOctal( int n ) {
        if ( n == 0) {
            return "";
        }
        else {
            return decimalToOctal(n/8) + n%8;
        }

        
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        System.out.println(decimalToOctal(n));
    }
}
