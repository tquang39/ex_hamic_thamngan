import java.util.Scanner;

public class smB {


    public static int calculate( int k, int n) {
        if (k == 0 || k == n) {
            return 1;
        }
        else {
            return calculate(k -1 , n - 1) + calculate(k, n-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        input.close();
        System.out.println(calculate(k, n));
    }
}


// Gọi calculate(2, 4):

// Vì (k != 0 && k != n), nên chúng ta đi vào phần else.
// Trong phần else:

// Ta gọi đệ quy calculate(1, 3) và calculate(2, 3).
// Đối với calculate(1, 3):

// Ta đi vào phần else vì (k != 0 && k != n).
// Ta gọi tiếp đệ quy calculate(0, 2) và calculate(1, 2).
// Đối với calculate(0, 2):

// Vì k == 0, nên trả về 1.
// Đối với calculate(1, 2):

// Vì (k != 0 && k != n), nên ta đi vào phần else.
// Ta gọi tiếp đệ quy calculate(0, 1) và calculate(1, 1).
// Đối với calculate(0, 1) và calculate(1, 1), cả hai đều sẽ trả về 1.

// Quay lại calculate(1, 2):

// Kết quả là tổng của calculate(0, 1) và calculate(1, 1), tức là 1 + 1 = 2.
// Quay lại calculate(1, 3):

// Kết quả của calculate(1, 3) là tổng của calculate(0, 2) và calculate(1, 2), tức là 1 + 2 = 3.
// Quay lại calculate(2, 4):

// Kết quả của calculate(2, 4) là tổng của calculate(1, 3) và calculate(2, 3), tức là 3 + 3 = 6.