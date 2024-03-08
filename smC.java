<<<<<<< HEAD
import java.util.Scanner;

public class smC {

    public static int factorial( int n) {
        if (n==0) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        System.out.println(factorial(n));
    }
}
=======
import java.util.Scanner;

public class smC {

    public static int factorial( int n) {
        if (n==0) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        System.out.println(factorial(n));
    }
}
>>>>>>> 07ab0b0baa19ddd6a7f2b8617090d4dc1809a64f
