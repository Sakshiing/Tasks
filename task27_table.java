import java.util.* ;
class task27_table {
    public static void mul_table(int N, int i)
    {
        if (i > 10)
            return ;
        System.out.println(N + " * " + i + " = " + N * i);
        mul_table(N, i + 1);
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int N = sc.nextInt();


        mul_table(N, 1);
    }
}


