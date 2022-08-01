import java.util.*;

class Task32_UniqueNumber {
    static int countUnique(int arr[], int n) {
        int ans = 1;
        for (int i = 1; i < n; i++) {
            int j = 0;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
            if (i == j)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of elements in array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int count = 0;
        if (size > 0) {
            System.out.println("Enter elements of array ; ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(countUnique(arr, size));
        }
    }
}