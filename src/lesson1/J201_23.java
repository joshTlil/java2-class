import java.util.Objects;
import java.util.Scanner;

public class J201_23 {
    public static void main(String[] args) {
        String name = "";
        int age = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("what is your name");
            name = input.next();
            if(name.equals("-1")){
                break;
            }
            System.out.println("What is your age");
            age = input.nextInt();
        }while (age != -1);
    }
}
