import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto where you want to print Fibonacci series : ");
        int num = sc.nextInt();
        System.out.print("0 ");
        System.out.print("1 ");
        int i = 0, j=1;
        while(i + j <= num){
            int third = i+j;
            System.out.print(third+" ");
            i=j;
            j=third;
        }
    }
}