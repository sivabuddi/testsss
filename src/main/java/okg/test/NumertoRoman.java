package okg.test;

import java.util.Scanner;



public class NumertoRoman {

    public static String convert(int num, int [] values, String[] string){
        //int index=0;
        String result="";
        StringBuilder sb  = new StringBuilder();
        for(int index=0;index<values.length;index++) {
            while (num >=values[index]) {
                    num -= values[index];
                    sb.append(string[index]);
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {

        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        System.out.println("Enter the input");
        int value = new Scanner(System.in).nextInt();
        String result =convert(value,values,romanLetters);
        System.out.println(value + " ------->" + result);

    }
}
