import java.util.*;
public class Task36MenuDriven {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static int[] insert(int[] arr, int ele, int ind) {
        int[] newarr = new int[arr.length + 1];
        newarr[ind] = ele;
        for (int i = 0; i < arr.length; i++) {
            if (i >= ind) {
                newarr[i + 1] = arr[i];
            } else {
                newarr[i] = arr[i];
            }

        }
        return newarr;
    }

    public static int[] delete(int[] arr, int ele) {
        Scanner sc = new Scanner(System.in);
        int[] newarr = new int[arr.length - 1];
        int count = 0;
        for (int j : arr) {
            if (ele == j) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Found more than one element similar : ");
            System.out.println("Please..select which position element you want to delete : ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            int pos = sc.nextInt();
            if (pos - 1 >= 0 && pos - 1 < arr.length) {

                if (arr[pos - 1] == ele) {
                    for (int i = 0; i < newarr.length; i++) {
                        if (i >= pos - 1) {
                            newarr[i] = arr[i + 1];
                        } else {
                            newarr[i] = arr[i];
                        }
                    }
                    return newarr;
                } else {
                    System.out.println("Sorry...You entered wrong position number...!!");
                    return arr;
                }
            } else {
                System.out.println("Sorry...You entered wrong position number...!!");
                return arr;
            }

        } else {
            int ind = 100;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == ele) {
                    ind = i;
                }
            }
            if (ind != 100) {
                for (int i = 0; i < newarr.length; i++) {
                    if (i >= ind) {
                        newarr[i] = arr[i + 1];
                    } else {
                        newarr[i] = arr[i];
                    }
                }
                return newarr;
            } else {
                System.out.println("Oops! Element not found...!!!");
                return arr;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\u001B[34m"+ "************* MENU DRIVEN *****************");

        Scanner sc = new Scanner(System.in);
        System.out.println("  \nEnter Size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        if (size >= 1) {

            System.out.println("Enter elements of array : ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            int[] store = new int[50];
            System.arraycopy(arr, 0, store, 0, arr.length);

            int choice;
            kkk:
            do {
                int[] current = new int[size];
                System.arraycopy(store, 0, current, 0, current.length);

                System.out.println("\u001B[33m"+ """
                        
                             1.Insert element in array.
                             2.Display current array elements.
                             3.Delete element from array.
                             4.Search element of array.
                             5.Maximum and minimum element from array.
                             6.Sort Array
                             7.Exit
                                
                        """);

                System.out.println("Select one of the above :"+ANSI_RESET);
                choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        size++;
                        int[] newarr;
                        System.out.println("current array is : ");
                        for (int j : current) {
                            System.out.print(j + " ");
                        }
                        System.out.println();
                        System.out.println("Enter element which you want to insert : ");
                        int ele = sc.nextInt();
                        System.out.println("Enter position where you want to insert element : ");
                        int ind = sc.nextInt() - 1;
                        if (ind >= 0 && ind <= current.length) {
                            newarr = insert(current, ele, ind);
                            System.out.println("Old array is : ");
                            for (int j : current) {
                                System.out.print(j + " ");
                            }
                            System.out.println();
                            System.out.println("New array is : ");
                            for (int j : newarr) {
                                System.out.print(j + " ");
                            }
                            System.out.println();
                            System.arraycopy(newarr, 0, store, 0, newarr.length);
                        } else {
                            size--;
                            System.out.println("Please enter correct position number...!!!");
                            System.out.println();
                        }
                    }

                    case 2 -> {
                        System.out.println("current array elements are : ");
                        for (int j : current) {
                            System.out.print(j + " ");
                        }
                        System.out.println();
                    }

                    case 3 -> {
                        if (current.length > 0) {
                            size--;
                            int[] newarr1;
                            System.out.println("current array is");
                            for (int j : current) {
                                System.out.print(j + " ");
                            }
                            System.out.println();
                            System.out.println("Enter element which you want to delete : ");
                            int ele = sc.nextInt();
                            newarr1 = delete(current, ele);
                            if (current == newarr1) {
                                size++;
                            }
                            System.out.println("Old array is");
                            for (int j : current) {
                                System.out.print(j + " ");
                            }
                            System.out.println();
                            System.out.println("New array is");
                            for (int j : newarr1) {
                                System.out.print(j + " ");
                            }
                            System.out.println();
                            System.arraycopy(newarr1, 0, store, 0, newarr1.length);
                        } else {
                            System.out.println("Array is empty");
                        }
                    }



                    case 4 -> {
                        System.out.println("Enter element which you want to search : ");
                        int search = sc.nextInt();
                        System.out.println("Search result is : ");
                        System.out.println();
                        int check = 0;
                        for (int i = 0; i < current.length; i++) {
                            if (search == current[i]) {
                                System.out.println("Element = " + search + " is at Position = " + (i + 1));
                                check++;
                            }

                        }
                        if (check == 0) {
                            System.out.println("Element not found....!!!");
                        }
                        System.out.println();
                    }



                    case 5->{
                        if(current.length==1){
                            System.out.println("There is only one element in array : "+current[0]);
                            System.out.println();
                        }else
                        if (current.length > 1) {
                            int[] newarr = new int[current.length];
                            System.arraycopy(current, 0, newarr, 0, current.length);
                            for (int i = 0; i < newarr.length - 1; i++) {
                                for (int j = i; j < newarr.length; j++) {
                                    if (newarr[i] > newarr[j]) {
                                        int temp = newarr[i];
                                        newarr[i] = newarr[j];
                                        newarr[j] = temp;
                                    }
                                }
                            }
                            System.out.println("Minimum element of array is : " + newarr[0]);
                            System.out.println("Maximum element of array is : " + newarr[newarr.length - 1]);

                            System.out.println();
                        } else {
                            System.out.println("Array is empty...!!!");
                            System.out.println();
                        }
                        System.out.println("current array is : ");
                        for (int j : current) {
                            System.out.print(j + " ");
                        }
                        System.out.println();
                    }
                    case 6-> {
                        if (current.length == 1) {
                            System.out.println("There is only one element in array :" + current[0]);
                            System.out.println();
                        } else if (current.length > 1) {
                            int[] newarr = new int[current.length];
                            System.arraycopy(current, 0, newarr, 0, current.length);
                            System.out.println("   Which type of sorting you want \n     1.Ascending order   2. Descending order ");
                            int type = sc.nextInt();
                            if (type == 1) {
                                for (int i = 0; i < newarr.length - 1; i++) {
                                    for (int j = i; j < newarr.length; j++) {
                                        if (newarr[i] > newarr[j]) {
                                            int temp = newarr[i];
                                            newarr[i] = newarr[j];
                                            newarr[j] = temp;
                                        }
                                    }
                                }
                                System.out.println("Ascending order of array is : ");
                                for (int j : newarr) {
                                    System.out.print(j + " ");
                                }
                                System.out.println();
                                System.out.println("current array is : ");
                                for (int j : newarr) {
                                    System.out.print(j + " ");
                                }
                                System.arraycopy(newarr, 0, store, 0, newarr.length);
                                System.out.println();
                            } else if (type == 2) {
                                for (int i = 0; i < newarr.length - 1; i++) {
                                    for (int j = i; j < newarr.length; j++) {
                                        if (newarr[i] < newarr[j]) {
                                            int temp = newarr[i];
                                            newarr[i] = newarr[j];
                                            newarr[j] = temp;
                                        }
                                    }
                                }
                                System.out.println("Descending order of array is : ");
                                for (int j : newarr) {
                                    System.out.print(j + " ");
                                }
                                System.out.println();
                                System.out.println("current array is : ");
                                for (int j : newarr) {
                                    System.out.print(j + " ");
                                }
                                System.arraycopy(newarr, 0, store, 0, newarr.length);

                                System.out.println();
                            }
                        }
                    }

                    case 7->{
                        System.out.println("Final array is : ");
                        for (int i : current){
                            System.out.print(i+" ");
                        }
                        break kkk;
                    }

                    default -> {
                        System.out.println("Please select correct choice option from given...!!!");
                        choice=1;
                    }
                }

            } while (choice <7);
        }else {
            System.out.println("Array size should be greater than 0...!!!");
        }
    }
}