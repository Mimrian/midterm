package math.problems;

import java.util.Scanner;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        int i, j, input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        input = sc.nextInt();
        System.out.println("The pyramid star pattern : ");
        for (i=0; i<input; i++){
            for (j=input-i; j>1; j--){
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


