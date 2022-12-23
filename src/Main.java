import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write any number you want to see reversed");
            String num1 = scanner.next();
            int numm1 = Integer.parseInt(num1);
            int y = Integer.parseInt(new StringBuilder(String.valueOf(numm1)).reverse().toString());
        System.out.println("Your reversed number is :" + y);
        }
    }