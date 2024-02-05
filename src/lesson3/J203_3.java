package lesson3;

import java.util.Scanner;

public class J203_3 {
    public static void main(String[] args) {
        String name = "";
        int age = 0;

        while(!name.equals("-1")){
            Scanner input = new Scanner(System.in);

            int num = 0;
            System.out.println("Enter name");
            name = input.next();

            if(isNumber(name)){
             throw new NumberFormatException("Please enter a name");
            }

            if(name.equals("-1")){
                break;
            }
            System.out.println("Enter age");
            age = input.nextInt();
            if(age == -1){
                break;
            }
            System.out.println(age);
//            num = Integer.parseInt(name);
            System.out.println("Please enter a name not number");

        }
    }


        static boolean isNumber(String name){
        try {
              Integer.parseInt(name);
              return true;
        }catch(NumberFormatException ex){

            return false;
        }
    }
}


