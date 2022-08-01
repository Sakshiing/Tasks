//JAVA program to find the second largest element in an array.

import java.util.*;
public class Task33GreatestNo {
    static void SecLarge(int arr[],
                         int arr_size)
    {
        int i, first, second;

        if (arr_size < 2)
        {
            System.out.printf(" Invalid Input ");
            return;
        }

        Arrays.sort(arr);

        for (i = arr_size - 2; i >= 0; i--)
        {
            if (arr[i] != arr[arr_size - 1])
            {
                System.out.printf("The second largest " +
                        "element is %d\n", arr[i]);
                return;
            }
        }

        System.out.printf("There is no second " +
                "largest element\n");
    }



    public static void main(String[] args) {
        int num, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter all the elements:");
        for (i = 0; i < num; i++) {
            arr[i] = sc.nextInt();

        }
        int len = arr.length;
        SecLarge(arr,len);
    }
}