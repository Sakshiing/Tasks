//Odd Even

import java.util.*;
public class Task34 {
        public static void main(String []args)
        {
            Scanner sc=new Scanner(System.in);
            int n;
            System.out.println("Enter the size of the array");
            n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the array");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            int m=0,n1=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]%2==0)
                    m++;
                else
                    n1++;
            }
            int even[]=new int[m];
            int odd[]=new int[n1];

            int k=0,t=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]%2==0)
                {
                    even[k]=arr[i];
                    k++;
                }
                else
                {
                    odd[t]=arr[i];
                    t++;
                }
            }

            System.out.println("The array with even elements...");
            for(int i=0;i<m;i++)
            {
                System.out.print(even[i]+" ");
            }
            System.out.println("");
            System.out.println("The array with odd elements...");
            for(int i=0;i<n1;i++)
            {
                System.out.print(odd[i]+" ");
            }

        }
    }

