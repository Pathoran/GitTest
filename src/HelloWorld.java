import java.util.Scanner;
/**
 * Created by WilliamBeckler on 1/4/2016.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first;
        int second;
        String str1 = "0";
        String str2 = "0";

        System.out.println("Please input a number: ");
        first = scan.nextInt();
        System.out.println("You entered the number: " + first);
        System.out.println("Please input another number: ");
        second = scan.nextInt();
        System.out.println("You entered the number: " + second);
        System.out.println("Your total is: " + sum(first,second));
    }

    public static int sum(int a, int b){
        return a+b;
    }
}
