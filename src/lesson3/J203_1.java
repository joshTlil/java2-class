package lesson3;

import java.util.Scanner;

public class J203_1 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers");
     int num = input.nextInt();
     int num2 = input.nextInt();
        divideMethod(num, num2);

    }

    static double divideMethod(int num, int num2){
       try{
        return num / num2;
       }catch (Exception ex){
           System.out.println("You can't divide " + num + " by " + num2);
       }finally {
           System.out.println("This program still is running");
       }
       return 0.0;
    }
}
