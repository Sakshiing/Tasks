//21 Ternary operator taskFind greater between 4 numbers using ternary operators

import java.util.Scanner;

public class Ternary {
    public static void main(String args[])
    {

        int num1,num2,num3,num4,maxnum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any four numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();

        maxnum = (num1 > num2 && num1 > num3 && num1 > num4) ?
                    num1 : ((num2 > num3 && num2 > num4) ?
                    num2 : (num3 > num4 ? num3 : num4));


        System.out.println("Largest number among " + num1 + ", " + num2 + ", "+ num3 + " and " + num4 + " is " + maxnum + ". " );
        }
    }

