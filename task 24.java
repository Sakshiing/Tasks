import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        char m_status;

        Scanner sc = new Scanner(System.in);
        System.out.println("Are You Married? (Y/N): ");
        m_status = sc.next().charAt(0);
        if(m_status=='Y')
        {
            System.out.println("The Driver is Insured. \n");
        }
        else
        {
            System.out.println("Enter the gender? (M/F): ");
            char gender = sc.next().charAt(0);
            System.out.println("Enter Your Age: ");
            int age = sc.nextInt();

            if(gender == 'M' && age >30 || gender == 'F' && age >= 25)
            {
                System.out.println("The Driver is Insured. \n");
            }
            else
            {
                System.out.println("The Driver not Insured. \n");
            }
        }

    }
}

