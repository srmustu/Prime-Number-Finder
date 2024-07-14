import java.util.Scanner;

public class FindPrimeNumbersUpToTheEnteredNumber {
    public static void main(String[] args) {
        Scanner tyu = new Scanner(System.in);

        String m1, m2, m3;
        int num, calculator;
        boolean isPrime = true;

        m1 = "Which number do you what to find prime numbers up to : ";

        System.out.print(m1);
        num = tyu.nextInt();

        for (int i = 3; i < num; i++) {

            isPrime = true;

            for (int b = 2; b < i; b++) {

                if (i % b == 0) {
                    isPrime = false;

                }

            }
            if (isPrime) {
                System.out.print(i + ",");
            }
        }

    }

}
