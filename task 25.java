import java.util.Scanner;

public class cal_gross {
    public static void main(String[] args) {
        double bas_sal,HRA,TA,PF,DA,gross_sal,bonus;
        System.out.println("Enter Your Basic Salary: ");
        Scanner sc = new Scanner(System.in);
        bas_sal = sc.nextDouble();
        HRA = bas_sal*0.20;
        PF = bas_sal*0.10;
        DA = bas_sal*0.15;
        TA = bas_sal*0.10;
        System.out.println("HRA: "+HRA);
        System.out.println("PF is: "+PF);
        System.out.println("DA is: "+DA);
        System.out.println("TA is: "+TA);
        if(bas_sal>=20000 )
        {
            bonus = bas_sal*0.1;

        }
        else
        {
            bonus = bas_sal*0.2;

        }
        gross_sal = (bas_sal+DA+TA+HRA+bonus)-PF;
        System.out.println("Gross Salary of an Employee is: "+gross_sal);
    }
}