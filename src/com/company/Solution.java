package com.company;

/**
 * Created by mohit on 13-03-2015.
 */
public class Solution {

    private static Solution o;


    public static void main (String args[]){

        int gates = 100;
        int employee = 100;

        int openGates = 0;

        int employeeId = 1;


        // person 1

        for(int emp=1; emp <= 100; emp++){
            for(int gate=1; gate <= 100; gate++){
                if(emp == 1){
                    openGates++;
                }

                if(isPrimeNumber(emp)){

                }

                if(emp == 2){
                    if(emp%2 == 0){
                        openGates--;
                    }
                }

                if(emp >= 3){
                    if(gate%2 == 0){
                        openGates++;
                    }else{
                        openGates--;
                    }
                }


            }
        }



        // person 2
        for(int i=1; i <= gates; i++){
            if(i%2 == 0){
                openGates--;
            }
        }

        // person 3
        for(int i=1; i <= gates; i++){
            if(i%3 == 0){
                if(i%2 == 0){
                    openGates++;
                }else{
                    openGates--;
                }
            }

        }

        System.out.println("open gates "+openGates);
        System.out.println("close gates "+(100 - openGates));

    }

    public static boolean isPrimeNumber(int number){

        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

}
