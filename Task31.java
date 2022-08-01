//Sort the given names

import java.util.*;
class Task31 {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings :");
        int n = sc.nextInt();
        System.out.println("Enter the names : ");
        String a[] = new String[n];

        for (i = 0; i < n; i++)
        {
            a[i] = sc.next();
        }
        for (i = 0; i < n; i++)
        {
            for (j = i+1; j<n ; j++)
            {
                if (a[i].compareTo(a[j]) > 0) {
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
            }
            }
            }

            System.out.println("Order of these names are : ");
            for (j = 0; j < n; j++)
            System.out.println(a[j]);
    }
}
