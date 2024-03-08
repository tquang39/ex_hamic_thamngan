import java.util.Scanner;

public class smD {
    public static double calculate( int n, int k ) {
        if ( k == 0 ) {
            return 1;
        }
        else {
            return n * calculate(n -1,k -1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        input.close();
        System.out.println(calculate(n, k));
    }
}
