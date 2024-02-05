package lesson3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J203_4 {
            public static void main(String[] args) throws Exception {
        String name = "";
        int age = 0;
        while(!name.equals("-1")) {
            try {
                Scanner input = new Scanner(System.in);

                int num = 0;
                System.out.println("Enter name");
                name = input.next();
                if(name.equals("-1")){
                    break;
                }
                System.out.println("Enter age");
                age = input.nextInt();
                overHundred(age);
                if(age == -1){
                    break;
                }
//                System.out.println(age);
//                throw new InputMismatchException("Please enter a number");

            } catch (NumberFormatException ex) {
                System.out.println("Please enter a number");
            }catch(InputMismatchException ex){
                System.out.println("Must be a number");
            }catch (IllegalAccessException ex){
                System.out.println("Age has to be less than 100");
            }
            finally {
                System.out.println("Sequence is complete");
            }
        }

    }
        static boolean isNumber(String name) throws NumberFormatException{
        try {
              Integer.parseInt(name);
              return true;
        }catch(NumberFormatException ex){

            return false;

        }

    }

    static void overHundred(int num) throws IllegalAccessException{
                if(num > 100){
                    throw new IllegalAccessException("Please work");
                }
    }


}
