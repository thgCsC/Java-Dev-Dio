import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int A, B, PROD;

            A = sc.nextInt();
            B = sc.nextInt();

            PROD = A * B;
            System.out.println("PROD = " + PROD);
        }

    }
}
