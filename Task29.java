//Write a Java program to print following alphabet pattern
//        A B C D E
//        B C D E
//        C D E
//        D E
//        E

import java.util.*;

class Task29
{
    public static void main(String args[])
    {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of lines");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println("");
        }
    }
}