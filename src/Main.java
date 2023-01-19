import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int size = 10 ;
        int [] array = new int [size];

        Scanner scan = new Scanner(System.in);
        System.out.println(" enter the first number");
        int firstNumber = scan.nextInt();
        System.out.println(" enter the second number");
        int SecondNumber = scan.nextInt();
        System.out.println(" enter 1 to add the two numbers \n 2 to subtract two numbers \n 3 to multiply the two numbers");
        int choice = scan.nextInt();
       if(choice==1)
            System.out.println(firstNumber+SecondNumber);
        else if (choice==2)
            System.out.println(firstNumber-SecondNumber);
        else if (choice==3)
            System.out.println(firstNumber*SecondNumber);
        else
            System.out.println("error the operation is wrong");

//        switch (choice)
//        {
//            case 1:
//                System.out.println(firstNumber+SecondNumber);
//                break;
//            case 2:
//                System.out.println(firstNumber-SecondNumber);
//                break;
//            case 3:
//                System.out.println(firstNumber*SecondNumber);
//                break;
//            default:
//                System.out.println("error the operation is wrong");
//                break;
//
//        }

    }
}