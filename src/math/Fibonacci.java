package math; //done

public class Fibonacci {

         /*
          Write 40 Fibonacci numbers with java.
         */

        public static void main(String[] args) {
            int prev = 0;
            int next = 1;

            for (int i = 0; i < 40; i++) {
                System.out.println(prev);
                prev = next - prev;
                next = next +prev;
            }
    }

    public static int arrayFibo(int[] fab) {
        ;return 0;
    }
}
