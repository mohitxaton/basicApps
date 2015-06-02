package com.HackerRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by mohit on 31-05-2015.
 */
public class AngryProfessor {

    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            int inputCount = Integer.parseInt(br.readLine());
            int totalStudentArrived = 0;

            for(int i = 0; i < inputCount ; i++ ){

                String line1 = br.readLine();
                String [] line1array = line1.split(" ");
                int totalStudent = Integer.parseInt(line1array[0]);
                int thStudent = Integer.parseInt(line1array[1]);


                String line2 = br.readLine();
                String [] line2array = line2.split(" ");

                for(String data : line2array){
                    if(Integer.parseInt(data) <= 0){
                        totalStudentArrived ++;
                    }
                }

                if(totalStudentArrived >= thStudent){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
                totalStudentArrived = 0;


            }


        }catch (Exception e){


        }




    }

}
