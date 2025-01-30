import java.util.Scanner;

public class shortHandOperator {
    public static void main(String[] args)
    {
        int a = 5;
        System.out.println("Enter a number which you want to add to A :");
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        //a = a+x1;     This can we written in a shot hand operator as shown in next line
        a += x1;
        System.out.println("Value of A : " + a);
    }
}
