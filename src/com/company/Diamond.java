package com.company;

/**
 * Created by mohit on 14-03-2015.
 */

/*
         *
        ***
       *****
      *******
     *********
      *******
       *****
        ***
         *
*/

public class Diamond {





    public static void main(String[] args) {


        System.out.println("Program for displaying pattern of *.");
        System.out.print("Enter the maximum number of *: ");
        int n = 1000/2;

        System.out.println("\nHere is the Diamond of Stars\n");

        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < (n - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int k = 1; k < i; k++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--)
        {
            for (int j = 0; j < (n - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int k = 1; k < i; k++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println();
    }


        public static  void printMoreStars (int n)
        {
            int rowsPrime= 0;

            for (int i = n+1; i > 0; i--)
            {
                for (int j = 0; j < (2*i)-1; j++)
                {
                    System.out.print(" ");
                }
                for (int d = 0; d < (2*rowsPrime)-1; d++)
                {
                    System.out.print("*" + " ");
                }
                System.out.println();   //new line character

                rowsPrime +=1;
                System.out.println(" ");
            }

            rowsPrime -= 2; // <- middle line is already printed, so skip that

            //bottom triangle
            for (int i = 1; i < n+1; i++)
            {
                for (int j = 0; j < (2*i)+1; j++)
                {
                    System.out.print(" ");
                }
                for (int d = 0; d < (2*rowsPrime) - 1; d++) // <- changed condition to be the same as above
                {
                    System.out.print("*" + " ");
                }
                System.out.println();   //new line character

                rowsPrime--; // <- you have to decrease rowPrime by one.
                System.out.println(" ");
            }
        }

    class MiniDiamond{

        class List{

        }

        public MiniDiamond(){
            System.out.println("miinidim");
        }

    }


}
