package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
              Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int n = 40, firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series Upto " + n + ": ");

        while (firstTerm <= n) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }
}


