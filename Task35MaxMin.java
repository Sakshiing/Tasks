import java.util.*;
public class Task35MaxMin
{
    static int getMin(int arr[], int len)
    {
        int res = arr[0];
        for (int i = 1; i < len; i++)
            res = Math.min(res, arr[i]);
        return res;
    }

    static int getMax(int arr[], int len)
    {
        int res = arr[0];
        for (int i = 1; i < len; i++)
            res = Math.max(res, arr[i]);
        return res;
    }
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int len = arr.length;
        System.out.println("Minimum element of array: " + getMin(arr, len));
        System.out.println("Maximum element of array: " + getMax(arr, len));
    }
}

