import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the number whose sum of digit you want: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        sumOfDigit(num);
        int i = sumOfDigit(num);
        System.out.println("Sum of the digits of given number: "+ i);
    }
    public static int sumOfDigit(int num) {
        int sum = 0;
        while(num>0){
           int a = num % 10;
            sum = sum + a;
            num = num/10;
        }
       return sum;
    }
}