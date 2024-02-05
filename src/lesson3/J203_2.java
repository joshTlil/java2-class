package lesson3;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class J203_2 {
    public static void main(String[] args) {
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
                if(age == -1){
                    break;
                }
                System.out.println(age);
                num = Integer.parseInt(name);
                System.out.println("Please enter a name not number");
            } catch (NumberFormatException ex) {
                System.out.println("Continue");
            }catch(InputMismatchException ex){
                System.out.println("Needs to be a number");
            }finally {
                System.out.println("Sequence is complete");
            }
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
