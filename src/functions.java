import java.util.Scanner;

public class functions {


    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter the first number");
        int firstNumber = scan.nextInt();
        System.out.println(" enter the second number");
        int SecondNumber = scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println(" enter the third number");
        int thirdNumber = scan.nextInt();
        Scanner scan3 = new Scanner(System.in);
        System.out.println(" enter 1 to add the three numbers \n 2 to calculate average of three numbers ");
        int choice = scan.nextInt();
        if (choice==1)
            sum(firstNumber,SecondNumber,thirdNumber);
        if (choice==2)
            average(firstNumber,SecondNumber,thirdNumber);

    }

    // define
    public static void sum (int numb1, int numb2,int numb3)
    {
       int resultSum = numb1+numb2+numb3;
       //return result;
        System.out.println(resultSum);
    }
    public static void average (int numb1, int numb2,int numb3)
    {
        int resultAvg = (numb1+numb2+numb3)/3;
        //return result;
        System.out.println(resultAvg);
    }

}
