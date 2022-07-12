//19 Armstong NumberJAVA program to check given number is Armstrong or not.

import java.util.Scanner;
class Armstrong
{
    public static void main(String[] args) {
        int number,remainder,result = 0;
        System.out.println("User! Please enter any number:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int origno = number;
        while(origno != 0)
        {
            remainder = origno %10;
            result += Math.pow(remainder,3);
            origno = origno/10;
        }
        if(result == number)
        {
            System.out.println("Given number is Armstrong: "+number);
        }
        else
        {
            System.out.println("Given number is not Armstrong: "+number);
        }
    }
}